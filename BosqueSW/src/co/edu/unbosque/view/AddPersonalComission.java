package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddPersonalComission extends JFrame {
	private JLabel lblcedula;
	private JLabel lblnombre;
	private JLabel lblapellido;
	private JLabel lblgenero;
	private JLabel lbltelefono;
	private JLabel lblcorreo;
	private JLabel lbldireccion;
	private JLabel lblanio;
	private JTextField txtcedula;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txttelefono;
	private JTextField txtcorreo;
	private JTextField txtventa;
	private JTextField txtdireccion;
	private JComboBox<Character> comboGenero;
	private JComboBox<Integer> comboAnio;
	JButton agregar;
	
	public AddPersonalComission(MainWindow principal) {
		setTitle("");
		setSize(600,1200);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new GridLayout(11,2));
		
		
		lblcedula = new JLabel("Cedula");
		lblcedula.setBounds(100,100,50,50);
		add(lblcedula);
		
		txtcedula = new JTextField();
		txtcedula.setBounds(200,100,100,50);
		add(txtcedula);
		
		lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(100,175,50,50);
		add(lblnombre);

		txtnombre = new JTextField();
		txtnombre.setBounds(200,175,300,50);
		add(txtnombre);
		
		lblapellido = new JLabel("Apellidos");
		lblapellido.setBounds(100,225,70,50);
		add(lblapellido);
		
		txtapellido = new JTextField();
		txtapellido.setBounds(200,225,300,50);
		add(txtapellido);
		
		lblgenero = new JLabel("Genero");
		lblgenero.setBounds(100,275,50,50);
		add(lblgenero);
	
		lblcorreo = new JLabel("Telefono");
		lblcorreo.setBounds(100,375,50,50);
		add(lblcorreo);
		
		txtcorreo = new JTextField();
		txtnombre.setBounds(200,375,300,50);
		add(txtcorreo);
		
		lbldireccion = new JLabel("Direccion");
		lbldireccion.setBounds(100,425,70,50);
		add(lbldireccion);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(200,425,300,50);
		add(txtdireccion);
		
		lblanio = new JLabel("Anio");
		lblanio.setBounds(100,475,50,50);
		add(lblanio);
		
		comboAnio = new JComboBox<Integer>();
		for (int i = 2020; i >=1970; i--) 
		{
			comboAnio.addItem(i);
		}
		comboAnio.setBounds(290, 225, 285, 20);
		add(comboAnio);
		
		agregar = new  JButton("AGREGAR");
		agregar.setBounds(250,1000,100,100);
		agregar.setActionCommand("agregar Comission");
		add(agregar);
		agregar.addActionListener(principal);
		
		txttelefono = new JTextField();
		add(txttelefono);
		
		comboGenero = new JComboBox<Character>();
		comboGenero.addItem('H');
		comboGenero.addItem('M');
		comboGenero.setBounds(290, 130, 285, 22);
		add(comboGenero);
		
		txtventa = new JTextField();
		add(txtventa);
	}
	public JTextField getTxtcedula() {
		return txtcedula;
	}
	public void setTxtcedula(JTextField txtcedula) {
		this.txtcedula = txtcedula;
	}
	public JTextField getTxtnombre() {
		return txtnombre;
	}
	public void setTxtnombre(JTextField txtnombre) {
		this.txtnombre = txtnombre;
	}
	public JTextField getTxttelefono() {
		return txttelefono;
	}
	public void setTxttelefono(JTextField txttelefono) {
		this.txttelefono = txttelefono;
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
	public JLabel getLbltelefono() {
		return lbltelefono;
	}
	public void setLbltelefono(JLabel lbltelefono) {
		this.lbltelefono = lbltelefono;
	}
	public JTextField getTxtapellido() {
		return txtapellido;
	}
	public void setTxtapellido(JTextField txtapellido) {
		this.txtapellido = txtapellido;
	}
	public JTextField getTxtventa() {
		return txtventa;
	}
	public void setTxtventa(JTextField txtventa) {
		this.txtventa = txtventa;
	}
}