package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class EnginerJuniorWindow extends JFrame implements ActionListener {
	JLabel lblcedula;
	JLabel lblnombre;
	JLabel lblapellidos;
	JLabel lblgenero;
	JLabel lbltelefono;
	JLabel lblcorreo;
	JLabel lbldireccion;
	JLabel lblaño;
	JLabel lblsalario;
	JLabel lblclientes;
	JLabel lblnventas;
	JLabel lblnivel;
	
	JTextField txtcedula;
	JTextField txtnombre;
	JTextField txtapellidos;
	JCheckBox chechgenero;
	JTextField txttelefono;
	JTextField txtcorreo;
	JTextField txtdireccion;
	JTextField txtaño;
	JTextField txtsalario;
	JTextField txtclientes;
	JTextField txtnventas;
	JTextField txtnivel;
	
	JButton agregar;
	
	public EnginerJuniorWindow() {
		 
		setTitle("");
		setSize(600,1200);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new GridLayout(13,2));
		
		
		lblcedula = new JLabel("Cedula");
		lblcedula.setBounds(100,100,50,50);
		getContentPane().add(lblcedula);
		
		txtcedula = new JTextField();
		txtcedula.setBounds(200,100,100,50);
		getContentPane().add(txtcedula);
		
		lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(100,175,50,50);
		getContentPane().add(lblnombre);

		txtnombre = new JTextField();
		txtnombre.setBounds(200,175,300,50);
		getContentPane().add(txtnombre);
		
		lblapellidos = new JLabel("Apellidos");
		lblapellidos.setBounds(100,225,70,50);
		getContentPane().add(lblapellidos);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(200,225,300,50);
		getContentPane().add(txtapellidos);
		
		lblgenero = new JLabel("Genero");
		lblgenero.setBounds(100,275,50,50);
		getContentPane().add(lblgenero);
		
		chechgenero = new JCheckBox();
		chechgenero.setBounds(200,275,300,50);
		getContentPane().add(chechgenero);
		
		lblcorreo = new JLabel("Telefono");
		lblcorreo.setBounds(100,375,50,50);
		getContentPane().add(lblcorreo);
		
		txtcorreo = new JTextField();
		txtnombre.setBounds(200,375,300,50);
		getContentPane().add(txtcorreo);
		
		lbldireccion = new JLabel("Direccion");
		lbldireccion.setBounds(100,425,70,50);
		getContentPane().add(lbldireccion);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(200,425,300,50);
		getContentPane().add(txtdireccion);
		
		lblaño = new JLabel("Año");
		lblaño.setBounds(100,475,50,50);
		getContentPane().add(lblaño);
		
		txtaño = new JTextField();
		txtaño.setBounds(200,475,300,50);
		getContentPane().add(txtaño);
		
		lblsalario = new JLabel("Salario");
		lblsalario.setBounds(100,525,50,50);
		getContentPane().add(lblsalario);
		
		txtsalario = new JTextField();
		txtsalario.setBounds(200,525,300,50);
		getContentPane().add(txtsalario);
		
		lblclientes = new JLabel("Numero de clientes");
		lblclientes.setBounds(100,525,90,50);
		getContentPane().add(lblclientes);
		
		txtclientes = new JTextField();
		txtclientes.setBounds(200,525,300,50);
		getContentPane().add(txtclientes);
		
		lblnventas = new JLabel("Numero de ventas");
		lblnventas.setBounds(100,525,90,50);
		getContentPane().add(lblnventas);
		
		txtnventas = new JTextField();
		txtnventas.setBounds(200,525,300,50);
		getContentPane().add(txtnventas);
		
		lblnivel = new JLabel("Nivel");
		lblnivel.setBounds(100,525,90,50);
		getContentPane().add(lblnivel);
		
		txtnivel = new JTextField();
		txtnivel.setBounds(200,525,300,50);
		getContentPane().add(txtnivel);
		
		
		
		agregar = new  JButton("AGREGAR");
		agregar.setBounds(250,1000,100,100);
		getContentPane().add(agregar);
		agregar.addActionListener(this);
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		EnginerJuniorWindow v = new EnginerJuniorWindow();
		v.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
