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
	JLabel lblanio;
	JLabel lblsalario;
	JLabel lblclientes;
	JLabel lblnivel;

	JTextField txtcedula;
	JTextField txtnombre;
	JTextField txtapellidos;
	JTextField txttelefono;
	JTextField txtcorreo;
	JTextField txtdireccion;
	JTextField txtanio;
	JTextField txtsalario;
	JTextField txtclientes;


	JButton agregar;

	JComboBox<String> comboGenero;
	JComboBox<Integer> comboNivel;

	public EnginerJuniorWindow() {

		setTitle("Engineer");
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
		
		txtnombre = new JTextField();
		txtnombre.setBounds(290,50,285,25);
		getContentPane().add(txtnombre);

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
		getContentPane().add(comboGenero);

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

		lblanio = new JLabel("A�o");
		lblanio.setBounds(45,226,110,19);
		getContentPane().add(lblanio);

		lblsalario = new JLabel("Salario");
		lblsalario.setBounds(45,260,110,25);
		getContentPane().add(lblsalario);

		txtsalario = new JTextField();
		txtsalario.setBounds(290,260,285,25);
		getContentPane().add(txtsalario);

		lblclientes = new JLabel("Numero de clientes");
		lblclientes.setBounds(45,300,110,20);
		getContentPane().add(lblclientes);

		txtclientes = new JTextField();
		txtclientes.setBounds(290,300,285,25);
		getContentPane().add(txtclientes);

		lblnivel = new JLabel("Nivel");
		lblnivel.setBounds(45,330,110,25);
		getContentPane().add(lblnivel);

		agregar = new  JButton("AGREGAR");
		agregar.setBounds(125,400,290,60);
		getContentPane().add(agregar);



		JComboBox<Integer> comboAnio = new JComboBox<Integer>();
		int aux=2020;
		for (int i = 0; i < 50; i++) 
		{
			comboAnio.addItem(aux);
			aux--;
		}
		comboAnio.setBounds(290, 225, 285, 20);
		getContentPane().add(comboAnio);



		comboNivel = new JComboBox<Integer>();
		comboNivel.setBounds(290, 330, 285, 22);
		comboNivel.addItem(1);
		comboNivel.addItem(2);
		comboNivel.addItem(3);
		comboNivel.addItem(4);
		comboNivel.addItem(5);
		getContentPane().add(comboNivel);
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
