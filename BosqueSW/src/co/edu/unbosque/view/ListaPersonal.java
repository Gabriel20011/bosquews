package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListaPersonal extends JFrame {
	/**
	 * Ventana en la cual se puede implementar el metodo CRUD
	 */
	private JButton btnAgregar, btnModificar, btnMostrar, btnEliminar, btnMenu;
	private JList<String> listaCedula;
	private JScrollPane scrollCedula;
	private ArrayList<String> cedulas;
	private MainWindow principal;
	private String tipoPersonal;
	/**
	 * metodo constructor para inicializar caracteristicas de la vista
	 */
	
	public ListaPersonal(MainWindow principal) {
		this.principal = principal;
		setSize(600,550);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(new Color(240,235,190));
		setLayout(null);
		addWindowListener(principal);

	}
	/**
	 * Metodo en el cual se iniciliazan los botones
	 */
	public void iniciarBotones(String tipoPersonal) {
		this.tipoPersonal = tipoPersonal;
		setTitle("Lista de Ingenieros " + tipoPersonal);
		cedulas = new ArrayList<String>();

		btnAgregar = new JButton("Agregar");
		btnAgregar.setForeground(new Color(240,235,190));
		btnAgregar.setBackground(new Color(50, 30, 24));
		btnAgregar.setBounds(370,30,200,50);
		btnAgregar.setFont(new Font("Lucida Calligraphy", Font.TRUETYPE_FONT,14));
		add(btnAgregar);
		btnAgregar.addActionListener(principal);

		btnModificar = new JButton("Modificar");
		btnModificar.setForeground(new Color(240,235,190));
		btnModificar.setBackground(new Color(50, 30, 24));
		btnModificar.setBounds(370,130,200,50);
		btnModificar.setFont(new Font("Lucida Calligraphy", Font.TRUETYPE_FONT,14));
		add(btnModificar);
		btnModificar.addActionListener(principal);

		btnMostrar = new JButton("Mostrar");
		btnMostrar.setForeground(new Color(240,235,190));
		btnMostrar.setBackground(new Color(50, 30, 24));
		btnMostrar.setBounds(370,230,200,50);
		btnMostrar.setFont(new Font("Lucida Calligraphy", Font.TRUETYPE_FONT,14));
		add(btnMostrar);
		btnMostrar.addActionListener(principal);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(new Color(240,235,190));
		btnEliminar.setBackground(new Color(50, 30, 24));
		btnEliminar.setBounds(370,330,200,50);
		btnEliminar.setFont(new Font("Lucida Calligraphy", Font.TRUETYPE_FONT,14));
		add(btnEliminar);
		btnEliminar.addActionListener(principal);

		btnMenu = new JButton("Volver al menu");
		btnMenu.setActionCommand("Menu");
		btnMenu.setBackground(new Color(240,235,190));
		btnMenu.setForeground(new Color(50, 30, 24));
		btnMenu.setBounds(370,430,200,50);
		btnMenu.setFont(new Font("Lucida Calligraphy", Font.TRUETYPE_FONT,14));
		add(btnMenu);
		btnMenu.addActionListener(principal);

		if (tipoPersonal.equals("Senior")) {
			btnAgregar.setActionCommand("AgregarSenior");
			btnEliminar.setActionCommand("EliminarSenior");
		}
		if (tipoPersonal.equals("Junior")) {
			btnAgregar.setActionCommand("AgregarJunior");
			btnEliminar.setActionCommand("EliminarJunior");
		}
		if (tipoPersonal.equals("Comission")) {
			btnAgregar.setActionCommand("AgregarComission");
			btnEliminar.setActionCommand("EliminarComission");
		}
		btnModificar.setActionCommand("Modificar");

		iniciarLista(tipoPersonal);

	}
	/**
	 * Metodo en el cual inicializamos la lista y le ingresamos datos
	 * <b> post </b> inicializar la lista
	 */
	private void iniciarLista(String tipoPersonal) {
		cargarNombres(tipoPersonal);
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		for (int i = 0 ; i < cedulas.size() ; i++ ) {
			modelo.addElement(cedulas.get(i));
		}

		listaCedula = new JList<String>(modelo);
		scrollCedula = new JScrollPane(listaCedula);
		scrollCedula.setBounds(10, 10, 250, 500);
		add(scrollCedula);

	}
	/**
	 * Metodo en el cual se cargan que tipo de Ingeniero es
	 * <b> post </b> mirar de que valor van a ser
	 */
	private void cargarNombres(String tipoPersonal) {
		if (tipoPersonal.equals("Senior")) {
			for (int i = 0 ; i < principal.getControlador().getM().geteSenior().size() ; i++) {
				cedulas.add(principal.getControlador().getM().geteSenior().get(i).getCedula());
			}

		}
		if (tipoPersonal.equals("Junior")) {
			for (int i = 0 ; i < principal.getControlador().getM().geteJunior().size() ; i++) {
				cedulas.add(principal.getControlador().getM().geteJunior().get(i).getCedula());
			}

		}
		if (tipoPersonal.equals("Comission")) {
			for (int i = 0 ; i < principal.getControlador().getM().getpComission().size() ; i++) {
				cedulas.add(principal.getControlador().getM().getpComission().get(i).getCedula());
			}
		}
	}
	public JList<String> getListaCedula() {
		return listaCedula;
	}

	public String getTipoPersonal() {
		return tipoPersonal;
	}

}
