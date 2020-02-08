package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EditPersonal extends JFrame {
	private JLabel lblcedula;
	private JLabel lblnombre;
	private JLabel lblapellido;
	private JLabel lblgenero;
	private JLabel lbltelefono;
	private JLabel lblcorreo;
	private JLabel lbldireccion;
	private JLabel lblanio;
	private JTextField txtnombre;
	private JTextField txtcedula;
	private JTextField txtapellido;
	private JTextField txtcorreo;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JButton editar;
	private JButton menu;
	private JComboBox<Character> comboGenero;
	private JComboBox<Integer> comboAnio;

	public EditPersonal(MainWindow principal) {
		setSize(600,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		addWindowListener(principal);

		lblcedula = new JLabel("Cedula");
		lblcedula.setBounds(45,15,155,25);
		add(lblcedula);

		txtcedula = new JTextField();
		txtcedula.setBounds(290,15,285,25);
		add(txtcedula);

		lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(45,50,170,25);
		add(lblnombre);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(290, 50, 285, 25);
		add(txtnombre);

		lblapellido = new JLabel("Apellidos");
		lblapellido.setBounds(45,90,170,25);
		add(lblapellido);

		txtapellido = new JTextField();
		txtapellido.setBounds(290,90,285,25);
		add(txtapellido);

		lblgenero = new JLabel("Genero");
		lblgenero.setBounds(45,130,155,25);
		add(lblgenero);

		comboGenero = new JComboBox<Character>();
		comboGenero.addItem('H');
		comboGenero.addItem('M');
		comboGenero.setBounds(290, 130, 285, 22);
		add(comboGenero);

		lblcorreo = new JLabel("Correo");
		lblcorreo.setBounds(45,160,110,20);
		add(lblcorreo);

		txtcorreo = new JTextField();
		txtcorreo.setBounds(290, 160, 285, 20);
		add(txtcorreo);

		lbldireccion = new JLabel("Direccion");
		lbldireccion.setBounds(45,190,110,20);
		add(lbldireccion);

		txtdireccion = new JTextField();
		txtdireccion.setBounds(290,190,285,20);
		add(txtdireccion);

		lblanio = new JLabel("Anio");
		lblanio.setBounds(45,226,110,19);
		add(lblanio);

		editar = new  JButton("CONFIRMAR");
		editar.setBounds(25,400,200,60);
		editar.setActionCommand("editar");
		add(editar);
		
		menu = new JButton("Menu");
		menu.addActionListener(principal);
		menu.setBounds(355, 400, 200, 60);
		add(menu);

		lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(45, 278, 285, 20);
		add(lbltelefono);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(290, 278, 285, 20);
		add(txttelefono);

		comboAnio = new JComboBox<Integer>();
		for (int i = 2020; i >=1970; i--) 
		{
			comboAnio.addItem(i);
		}
		comboAnio.setBounds(290, 225, 285, 20);
		add(comboAnio);
		editar.addActionListener(principal);
	}
		public JTextField getTxtnombre() {
			return txtnombre;
		}
		public void setTxtnombre(JTextField txtnombre) {
			this.txtnombre = txtnombre;
		}
		public JTextField getTxtcedula() {
			return txtcedula;
		}
		public void setTxtcedula(JTextField txtcedula) {
			this.txtcedula = txtcedula;
		}
		public JTextField getTxtapellido() {
			return txtapellido;
		}
		public void setTxtapellido(JTextField txtapellido) {
			this.txtapellido = txtapellido;
		}
		public JTextField getTxtcorreo() {
			return txtcorreo;
		}
		public void setTxtcorreo(JTextField txtcorreo) {
			this.txtcorreo = txtcorreo;
		}
		public JTextField getTxttelefono() {
			return txttelefono;
		}
		public void setTxttelefono(JTextField txttelefono) {
			this.txttelefono = txttelefono;
		}
		public JTextField getTxtdireccion() {
			return txtdireccion;
		}
		public void setTxtdireccion(JTextField txtdireccion) {
			this.txtdireccion = txtdireccion;
		}
		public JComboBox<Character> getComboGenero() {
			return comboGenero;
		}
		public void setComboGenero(JComboBox<Character> comboGenero) {
			this.comboGenero = comboGenero;
		}
		public JComboBox<Integer> getComboAnio() {
			return comboAnio;
		}
		public void setComboAnio(JComboBox<Integer> comboAnio) {
			this.comboAnio = comboAnio;
		}
}
