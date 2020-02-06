package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaAgregar extends JFrame implements ActionListener {
	//C�dula de Ciudadan�a, nombre, apellidos, g�nero, tel�fono, correo
	//electr�nico (debe contener como m�nimo el caracter �@� para que sea v�lido), direcci�n
	//domiciliaria y a�o de ingreso.//
	JLabel lblcedula;
	JLabel lblnombre;
	JLabel lblapellidos;
	JLabel lblgenero;
	JLabel lbltelefono;
	JLabel lblcorreo;
	JLabel lbldireccion;
	JLabel lbla�o;
	JLabel lblsalario;
	JTextField txtcedula;
	JTextField txtnombre;
	JTextField txtapellidos;
	JCheckBox chechgenero;
	JTextField txttelefono;
	JTextField txtcorreo;
	JTextField txtdireccion;
	JTextField txta�o;
	JTextField txtsalario;
	
	JButton agregar;
	
	public VentanaAgregar() {
		setTitle("");
		setSize(600,1200);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new GridLayout(11,2));
		
		
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
		
		lbla�o = new JLabel("A�o");
		lbla�o.setBounds(100,475,50,50);
		getContentPane().add(lbla�o);
		
		txta�o = new JTextField();
		txta�o.setBounds(200,475,300,50);
		getContentPane().add(txta�o);
		
		lblsalario = new JLabel("Salario");
		lblsalario.setBounds(100,525,50,50);
		getContentPane().add(lblsalario);
		
		txtsalario = new JTextField();
		txtsalario.setBounds(200,525,300,50);
		getContentPane().add(txtsalario);
		
		agregar = new  JButton("AGREGAR");
		agregar.setBounds(250,1000,100,100);
		getContentPane().add(agregar);
		agregar.addActionListener(this);
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		VentanaAgregar v = new VentanaAgregar();
		v.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
