package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import co.edu.unbosque.model.Personal;

public class ShowPersonal extends JFrame {

	private JLabel lblcedula;
	private JLabel lblnombre;
	private JLabel lblapellido;
	private JLabel lblgenero;
	private JLabel lbltelefono;
	private JLabel lblcorreo;
	private JLabel lbldireccion;
	private JLabel lblanio;

	private JLabel lblSalario;



	private JLabel txtnombre;
	private JLabel txtgenero;
	private JLabel txtcedula;
	private JLabel txtapellido;
	private JLabel txtcorreo;
	private JLabel txttelefono;
	private JLabel txtdireccion;

	private JLabel txtanio;	
	private JLabel txtSalario;
	private JButton menu;

	private MainWindow principal;
	private Personal personal;

	public ShowPersonal(MainWindow principal) {
		this.principal = principal;
		setSize(600,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		addWindowListener(principal);

	}

	public void cargarInformacion(Personal personal) {
		this.personal = personal;

		lblcedula = new JLabel("Cedula");
		lblcedula.setBounds(45,15,155,25);
		add(lblcedula);

		txtcedula = new JLabel(personal.getCedula());
		txtcedula.setBounds(290,15,285,25);
		add(txtcedula);

		lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(45,50,170,25);
		add(lblnombre);

		txtnombre = new JLabel(personal.getNombre());
		txtnombre.setBounds(290,50,285,25);
		add(txtnombre);

		lblapellido = new JLabel("Apellidos");
		lblapellido.setBounds(45,90,170,25);
		add(lblapellido);

		txtapellido = new JLabel(personal.getApellido());
		txtapellido.setBounds(290,90,285,25);
		add(txtapellido);

		lblgenero = new JLabel("Genero");
		lblgenero.setBounds(45,130,155,25);
		add(lblgenero);

		if (personal.getGenero() == 'H' || personal.getGenero() == 'h') {
			txtgenero = new JLabel("Masculino");
		}
		else {
			txtgenero = new JLabel("Femenino");
		}

		txtgenero.setBounds(290, 130, 285, 20);
		add(txtgenero);

		lblcorreo = new JLabel("Correo");
		lblcorreo.setBounds(45,160,110,20);
		add(lblcorreo);

		txtcorreo = new JLabel(personal.getCorreo());
		txtcorreo.setBounds(290, 160, 285, 20);
		add(txtcorreo);

		lbldireccion = new JLabel("Direccion");
		lbldireccion.setBounds(45,190,110,20);
		add(lbldireccion);

		txtdireccion = new JLabel(personal.getDireccion());
		txtdireccion.setBounds(290, 190, 285, 20);
		add(txtdireccion);

		lblanio = new JLabel("Anio");
		lblanio.setBounds(45,230,110,19);
		add(lblanio);

		txtanio = new JLabel(Integer.toString(personal.getAnio()));
		txtanio.setBounds(290,220,110,19);
		add(txtanio);

		lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(45, 260, 285, 20);
		add(lbltelefono);

		txttelefono = new JLabel(personal.getTelefono());
		txttelefono.setBounds(290, 260, 285, 20);
		add(txttelefono);

		lblSalario = new JLabel("Salario");
		lblSalario.setBounds(45, 300, 285, 20);
		add(lblSalario);

		txtSalario = new JLabel(Double.toString(personal.getSalarioBase()));
		txtSalario.setBounds(290, 300, 285, 20);
		add(txtSalario);

		menu = new JButton("Menu");
		menu.addActionListener(principal);
		menu.setBounds(355, 400, 200, 60);
		add(menu);


		lblanio = new JLabel("Anio");
		lblanio.setBounds(45,226,110,19);
		add(lblanio);
		
		txtanio = new JLabel(Integer.toString(personal.getAnio()));
		txtanio.setBounds(290,226,110,19);
		add(txtanio);
	

	}

	public JLabel getTxtnombre() {
		return txtnombre;
	}

	public JLabel getTxtgenero() {
		return txtgenero;
	}

	public JLabel getTxtcedula() {
		return txtcedula;
	}

	public JLabel getTxtapellido() {
		return txtapellido;
	}

	public JLabel getTxtcorreo() {
		return txtcorreo;
	}

	public JLabel getTxttelefono() {
		return txttelefono;
	}

	public JLabel getTxtdireccion() {
		return txtdireccion;
	}

	public JLabel getTxtanio() {
		return txtanio;
	}

	public JLabel getTxtSalario() {
		return txtSalario;
	}
}
