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

	private JButton btnAgregar, btnModificar, btnMostrar, btnEliminar, btnMenu;
	private JList<String> listaNombres;
	private JScrollPane scrollNombres;
	private ArrayList<String> nombres;
	private MainWindow principal;

	public ListaPersonal(MainWindow principal) {
		this.principal = principal;
		setSize(600,550);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(new Color(240,235,190));
		setLayout(null);
		nombres = new ArrayList<String>();

	}

	public void iniciarBotones(String tipoPersonal) {
		setTitle("Lista de Ingenieros " + tipoPersonal);

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
			btnModificar.setActionCommand("ModificarSenior");
			btnEliminar.setActionCommand("EliminarSenior");
			btnModificar.setActionCommand("ModificarSenior");
		}
		if (tipoPersonal.equals("Junior")) {
			btnAgregar.setActionCommand("AgregarJunior");
			btnModificar.setActionCommand("ModificarJunior");
			btnEliminar.setActionCommand("EliminarJunior");
			btnModificar.setActionCommand("ModificarJunior");
		}
		if (tipoPersonal.equals("Comission")) {
			btnAgregar.setActionCommand("AgregarComission");
			btnModificar.setActionCommand("ModificarComission");
			btnEliminar.setActionCommand("EliminarComission");
			btnModificar.setActionCommand("ModificarComission");
		}

		iniciarLista(tipoPersonal);

	}
	private void iniciarLista(String tipoPersonal) {
		cargarNombres(tipoPersonal);
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		for (int i = 0 ; i < nombres.size() ; i++ ) {
			modelo.addElement(nombres.get(i));
		}

		listaNombres = new JList<String>(modelo);
		scrollNombres = new JScrollPane(listaNombres);
		scrollNombres.setBounds(10, 10, 250, 500);
		add(scrollNombres);


	}
	private void cargarNombres(String tipoPersonal) {
		if (tipoPersonal.equals("Senior")) {
			for (int i = 0 ; i < principal.getControlador().getM().geteSenior().size() ; i++) {
				nombres.add(principal.getControlador().getM().geteSenior().get(i).getNombre());
			}

		}
		if (tipoPersonal.equals("Junior")) {
			for (int i = 0 ; i < principal.getControlador().getM().geteJunior().size() ; i++) {
				nombres.add(principal.getControlador().getM().geteJunior().get(i).getNombre());
			}

		}
		if (tipoPersonal.equals("Comission")) {
			for (int i = 0 ; i < principal.getControlador().getM().getpComission().size() ; i++) {
				nombres.add(principal.getControlador().getM().getpComission().get(i).getNombre());
			}
		}
	}
}
