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
/**
 * Clase para agregar un ingeniero Junior
 *
 *
 */
public class AddEnginerJunior extends JFrame  {

	private JLabel lblcedula;
	private JLabel lblnombre;
	private JLabel lblapellido;
	private JLabel lblgenero;
	private JLabel lblcorreo;
	private JLabel lbldireccion;
	private JLabel lblanio;
	private JLabel lblnivel;
	
	private JTextField txtcedula;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtcorreo;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JComboBox<Integer> comboAnio;
	private JButton agregar, menu;
	private JComboBox<Character> comboGenero;
	private JComboBox<Integer> comboNivel;
	/**
	 * Es el metodo constructor para icializar todos los atributos
	 */
	public AddEnginerJunior(MainWindow principal) {

		setTitle("Nuevo Ingeniero Junior");
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

		txtnombre = new JTextField();
		txtnombre.setBounds(290,50,285,25);
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
		
		menu = new JButton("Menu");
		menu.addActionListener(principal);
		menu.setBounds(355, 400, 200, 60);
		add(menu);

		txtdireccion = new JTextField();
		txtdireccion.setBounds(290,192,285,20);
		add(txtdireccion);

		lblanio = new JLabel("Anio");
		lblanio.setBounds(45,226,110,19);
		add(lblanio);

		lblnivel = new JLabel("Nivel");
		lblnivel.setBounds(45,330,110,25);
		add(lblnivel);

		agregar = new  JButton("AGREGAR");
		agregar.setBounds(25,400,200,60);
		agregar.setActionCommand("agregar Junior");
		add(agregar);
		
		lbl
		
		txttelefono = new JTextField();
		add(txttelefono);

		comboAnio = new JComboBox<Integer>();
		for (int i = 2020; i >=1970; i--) 
		{
			comboAnio.addItem(i);
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
		agregar.addActionListener(principal);
	}
	/**
	 * metodo para obtner el campo de la cedula
	 * <b> post </b> obtener lo del campo de la cedula
	 * @return txtcedula es el capo de la cedula
	 */
	public JTextField getTxtcedula() {
		return txtcedula;
	}
	/**
	 * metodo para actualizar el campo de la cedula
	 * <b> post </b> actualizar el valor de la cedula
	 * @param txtcedula es el campo de la cedula
	 */
	public void setTxtcedula(JTextField txtcedula) {
		this.txtcedula = txtcedula;
	}
	/**
	 * metodo para obtner el campo del nombre
	 * <b> post </b> obtener lo del campo del nombre
	 * @return txtnombre es el campo del nombre
	 */
	public JTextField getTxtnombre() {
		return txtnombre;
	}
	/**
	 * metodo para actualizar el campo del nombre
	 * <b> post </b> actualizar el valor del nombre
	 * @param txtnombre es el campo del nombre
	 */
	public void setTxtnombre(JTextField txtnombre) {
		this.txtnombre = txtnombre;
	}
	/**
	 * metodo para obtner el campo del apellido
	 * <b> post </b> obtener lo del campo del apellido
	 * @return txtapellido es el campo del apellido
	 */
	public JTextField getTxtapellido() {
		return txtapellido;
	}
	/**
	 * metodo para actualizar el campo del apellido
	 * <b> post </b> actualizar el valor del apellido
	 * @param txtapellido es el campo del apellido
	 */
	public void setTxtapellido(JTextField txtapellido) {
		this.txtapellido = txtapellido;
	}
	/**
	 * metodo para obtner el campo del correo
	 * <b> post </b> obtener lo del campo del correo
	 * @return txtcorreo es el campo del correo
	 */
	public JTextField getTxtcorreo() {
		return txtcorreo;
	}
	/**
	 * metodo para actualizar el campo del correo
	 * <b> post </b> actualizar el valor del correo
	 * @param txtcorreo es el campo del correo
	 */
	public void setTxtcorreo(JTextField txtcorreo) {
		this.txtcorreo = txtcorreo;
	}
	/**
	 * metodo para obtener el campo de la direccion
	 * <b> post </b> obtener lo del campo de la direccion
	 * @return txtdireccion es el campo de la direccion
	 */
	public JTextField getTxtdireccion() {
		return txtdireccion;
	}
	/**
	 * metodo para actualizar el campo de la direccion
	 * <b> post </b> actualizar el valor de la direccion
	 * @param txtcedula es el campo de la direccion
	 */
	public void setTxtdireccion(JTextField txtdireccion) {
		this.txtdireccion = txtdireccion;
	}
	/**
	 * metodo para obtener el año
	 * <b> post </b> obtener el año
	 * @return comboanio es el año que va a retornar
	 */
	public JComboBox<Integer> getComboAnio() {
		return comboAnio;
	}
	/**
	 * metoto para actualizar el año
	 * <b> post </b> actualizar el año
	 * @return comboAnio es el año que se va a actualizar
	 */
	public void setComboAnio(JComboBox<Integer> comboAnio) {
		this.comboAnio = comboAnio;
	}
	/**
	 * metodo para obtener el genero
	 * <b> post </b> obtener el genero
	 * @return comboGenero es el genero que va a retornar
	 */
	public JComboBox<Character> getComboGenero() {
		return comboGenero;
	}
	/**
	 * metoto para actualizar el genero
	 * <b> post </b> actualizar el genero
	 * @return comboGenero es el genero que se va a actualizar
	 */
	public void setComboGenero(JComboBox<Character> comboGenero) {
		this.comboGenero = comboGenero;
	}
	/**
	 * metodo para obtener el nivel
	 * <b> post </b> obtener el nivel del ingeniero
	 * @return comboNivel es el nivel que va a retornar
	 */
	public JComboBox<Integer> getComboNivel() {
		return comboNivel;
	}
	/**
	 * metoto para actualizar el nivel
	 * <b> post </b> actualizar el nivel del ingeniero
	 * @return comboNivel es el nivel que se va a actualizar
	 */
	public void setComboNivel(JComboBox<Integer> comboNivel) {
		this.comboNivel = comboNivel;
	}
	/**
	 * metodo para obtner el campo del telefono
	 * <b> post </b> obtener lo del campo del telefono
	 * @return txttelefono es el campo del telefono
	 */
	public JTextField getTxttelefono() {
		return txttelefono;
	}
	/**
	 * metodo para actualizar el campo del telefono
	 * <b> post </b> actualizar el valor del telefono
	 * @param txtcedula es el campo del Telefono
	 */
	public void setTxttelefono(JTextField txttelefono) {
		this.txttelefono = txttelefono;
	}
}