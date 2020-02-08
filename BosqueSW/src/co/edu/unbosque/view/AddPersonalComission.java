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
/**
 * Clase para agregar un ingeniero con comision
 *
 */
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
	private JButton agregar;
	/**
	 * es el metodo constructor de la clase donde se inicializan los atributos
	 */
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
	 * metodo para obtener la venta 
	 * <b> post </b> obtener la venta que se hizo
	 * @return txtventa es el numero de venta
	 */
	public JTextField getTxtventa() {
		return txtventa;
	}
	/**
	 * metodo para actualizar la venta
	 * <b> post </b> actualizar la venta
	 * @param txtventa es la venta
	 */
	public void setTxtventa(JTextField txtventa) {
		this.txtventa = txtventa;
	}
}