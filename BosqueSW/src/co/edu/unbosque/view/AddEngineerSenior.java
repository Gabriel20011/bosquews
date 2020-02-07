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

public class AddEngineerSenior extends JFrame implements ActionListener {
	
	private JLabel lblcedula;
	private JLabel lblnombre;
	private JLabel lblapellidos;
	private JLabel lblgenero;
	private JLabel lbltelefono;
	private JLabel lblcorreo;
	private JLabel lbldireccion;
	private JLabel lblanio;
	private JLabel lblsalario;
	private JLabel lblclientes;
	private JLabel lblnventas;
	
	private JTextField txtcedula;
	private JTextField txtapellidos;
	private JTextField txtcorreo;
	private JTextField txtdireccion;
	private JTextField txtsalario;
	private JTextField txtclientes;
	private JTextField txtnventas;
	
	JButton agregar;
	
	private JComboBox<String> comboGenero;
	private JTextField textField;
	
	public AddEngineerSenior() {
		setTitle("Nuevo Ingeniero Senior");
		setSize(600,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		
		lblcedula = new JLabel("Cedula");
		lblcedula.setBounds(45,15,155,25);
		getContentPane().add(lblcedula);
		
		txtcedula = new JTextField();
		txtcedula.setBounds(290,15,285,25);
		getContentPane().add(txtcedula);
		
		lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(45,50,170,25);
		getContentPane().add(lblnombre);
		
		lblapellidos = new JLabel("Apellidos");
		lblapellidos.setBounds(45,90,170,25);
		getContentPane().add(lblapellidos);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(290,90,285,25);
		getContentPane().add(txtapellidos);
		
		lblgenero = new JLabel("Genero");
		lblgenero.setBounds(45,130,155,25);
		getContentPane().add(lblgenero);
		
		comboGenero = new JComboBox<String>();
		comboGenero.addItem("Hombre");
		comboGenero.addItem("Mujer");
		comboGenero.setBounds(290, 130, 285, 22);
		add(comboGenero);
		
		lblcorreo = new JLabel("Telefono");
		lblcorreo.setBounds(45,160,110,20);
		getContentPane().add(lblcorreo);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(290, 160, 285, 20);
		getContentPane().add(txtcorreo);
		
		lbldireccion = new JLabel("Direccion");
		lbldireccion.setBounds(45,190,110,20);
		getContentPane().add(lbldireccion);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(290,192,285,20);
		getContentPane().add(txtdireccion);
		
		lblanio = new JLabel("Anio");
		lblanio.setBounds(45,226,110,19);
		getContentPane().add(lblanio);
		
		lblsalario = new JLabel("Salario");
		lblsalario.setBounds(45,260,110,25);
		getContentPane().add(lblsalario);
		
		txtsalario = new JTextField();
		txtsalario.setBounds(290,260,285,25);
		getContentPane().add(txtsalario);
		
		lblclientes = new JLabel("Numero de clientes");
		lblclientes.setBounds(45,300,150,20);
		getContentPane().add(lblclientes);
		
		txtclientes = new JTextField();
		txtclientes.setBounds(290,300,285,25);
		getContentPane().add(txtclientes);
		
		lblnventas = new JLabel("Numero de ventas");
		lblnventas.setBounds(45,330,150,25);
		getContentPane().add(lblnventas);
		
		txtnventas = new JTextField();
		txtnventas.setBounds(290,331,285,25);
		getContentPane().add(txtnventas);
		
		agregar = new  JButton("AGREGAR");
		agregar.setBounds(125,400,290,60);
		getContentPane().add(agregar);
		
		textField = new JTextField();
		textField.setBounds(290, 50, 285, 25);
		getContentPane().add(textField);
		
		JComboBox<Integer> comboAnio = new JComboBox<Integer>();
		int aux=2020;
		for (int i = 0; i < 50; i++) 
		{
			comboAnio.addItem(aux);
			aux--;
		}
		comboAnio.setBounds(290, 225, 285, 20);
		
		getContentPane().add(comboAnio);
		agregar.addActionListener(this);
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		AddEngineerSenior v = new AddEngineerSenior();
		v.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


