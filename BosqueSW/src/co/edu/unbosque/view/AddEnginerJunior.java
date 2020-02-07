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

public class AddEnginerJunior extends JFrame implements ActionListener {
	
	private JLabel lblcedula;
	private JLabel lblnombre;
	private JLabel lblapellidos;
	private JLabel lblgenero;
	private JLabel lblcorreo;
	private JLabel lbldireccion;
	private JLabel lblanio;
	private JLabel lblsalario;
	private JLabel lblclientes;
	private JLabel lblnivel;

	private JTextField txtcedula;
	private JTextField txtnombre;
	private JTextField txtapellidos;
	private JTextField txtcorreo;
	private JTextField txtdireccion;
	private JTextField txtsalario;
	private JTextField txtclientes;
	
	private JComboBox<Integer> comboAnio;


	private JButton agregar;

	private JComboBox<String> comboGenero;
	private JComboBox<Integer> comboNivel;

	public AddEnginerJunior() {

		setTitle("Nuevo Ingeniero Junior");
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
		add(lblgenero);
		
		comboGenero = new JComboBox<String>();
		comboGenero.addItem("Hombre");
		comboGenero.addItem("Mujer");
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

		lblanio = new JLabel("A�o");
		lblanio.setBounds(45,226,110,19);
		add(lblanio);

		lblsalario = new JLabel("Salario");
		lblsalario.setBounds(45,260,150,25);
		add(lblsalario);

		txtsalario = new JTextField();
		txtsalario.setBounds(290,260,285,25);
		add(txtsalario);

		lblclientes = new JLabel("Numero de clientes");
		lblclientes.setBounds(45,300,150,20);
		add(lblclientes);

		txtclientes = new JTextField();
		txtclientes.setBounds(290,300,285,25);
		add(txtclientes);

		lblnivel = new JLabel("Nivel");
		lblnivel.setBounds(45,330,110,25);
		add(lblnivel);

		agregar = new  JButton("AGREGAR");
		agregar.setBounds(125,400,290,60);
		add(agregar);



		comboAnio = new JComboBox<Integer>();
		int aux=2020;
		for (int i = 0; i < 50; i++) 
		{
			comboAnio.addItem(aux);
			aux--;
		}
		comboAnio.setBounds(290, 225, 285, 20);
		add(comboAnio);



		comboNivel = new JComboBox<Integer>();
		comboNivel.setBounds(290, 330, 285, 22);
		comboNivel.addItem(1);
		comboNivel.addItem(2);
		comboNivel.addItem(3);
		comboNivel.addItem(4);
		comboNivel.addItem(5);
		add(comboNivel);
		agregar.addActionListener(this);







	}
	public static void main(String[] args) {
		AddEnginerJunior v = new AddEnginerJunior();
		v.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
