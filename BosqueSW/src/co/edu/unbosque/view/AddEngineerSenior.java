package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddEngineerSenior extends JFrame {

	private JLabel lblcedula;
	private JLabel lblnombre;
	private JLabel lblapellido;
	private JLabel lblgenero;
	private JLabel lbltelefono;
	private JLabel lblcorreo;
	private JLabel lbldireccion;
	private JLabel lblanio;
	private JLabel lblnventas;
	private JTextField txtnombre;
	private JTextField txtcedula;
	private JTextField txtapellido;
	private JTextField txtcorreo;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JTextField txtnventas;
	private JButton agregar;	
	private JComboBox<Character> comboGenero;
	private JComboBox<Integer> comboAnio;
	private JTextField textField;

	public AddEngineerSenior(MainWindow principal) {
		setTitle("Nuevo Ingeniero Senior");
		setSize(600,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		lblcedula = new JLabel("Cedula");
		lblcedula.setBounds(45,15,155,25);
		add(lblcedula);

		txtcedula = new JTextField();
		txtcedula.setBounds(290,15,285,25);
		add(txtcedula);

		lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(45,50,170,25);
		add(lblnombre);

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

		lblcorreo = new JLabel("Telefono");
		lblcorreo.setBounds(45,160,110,20);
		add(lblcorreo);

		txtcorreo = new JTextField();
		txtcorreo.setBounds(290, 160, 285, 20);
		add(txtcorreo);

		lbldireccion = new JLabel("Direccion");
		lbldireccion.setBounds(45,190,110,20);
		add(lbldireccion);

		txtdireccion = new JTextField();
		txtdireccion.setBounds(290,192,285,20);
		add(txtdireccion);

		lblanio = new JLabel("Anio");
		lblanio.setBounds(45,226,110,19);
		add(lblanio);

		lblnventas = new JLabel("Numero de ventas");
		lblnventas.setBounds(45,330,150,25);
		add(lblnventas);

		txtnventas = new JTextField();
		txtnventas.setBounds(290,331,285,25);
		add(txtnventas);

		agregar = new  JButton("AGREGAR");
		agregar.setBounds(125,400,290,60);
		agregar.setActionCommand("agregar Senior");
		add(agregar);

		textField = new JTextField();
		textField.setBounds(290, 50, 285, 25);
		add(textField);
		
		txttelefono = new JTextField();
		add(txttelefono);

		comboAnio = new JComboBox<Integer>();
		for (int i = 2020; i >=1970; i--) 
		{
			comboAnio.addItem(i);
		}
		comboAnio.setBounds(290, 225, 285, 20);
		add(comboAnio);
		agregar.addActionListener(principal);
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
	public void setTxtapellidos(JTextField txtapellido) {
		this.txtapellido = txtapellido;
	}
	public JTextField getTxtcorreo() {
		return txtcorreo;
	}
	public void setTxtcorreo(JTextField txtcorreo) {
		this.txtcorreo = txtcorreo;
	}
	public JTextField getTxtdireccion() {
		return txtdireccion;
	}
	public void setTxtdireccion(JTextField txtdireccion) {
		this.txtdireccion = txtdireccion;
	}
	public JTextField getTxtnventas() {
		return txtnventas;
	}
	public void setTxtnventas(JTextField txtnventas) {
		this.txtnventas = txtnventas;
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
	public JTextField getTxttelefono() {
		return txttelefono;
	}
	public void setTxttelefono(JTextField txttelefono) {
		this.txttelefono = txttelefono;
	}
}