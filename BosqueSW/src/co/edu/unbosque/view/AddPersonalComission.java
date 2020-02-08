package co.edu.unbosque.view;
import java.awt.Color;
import javax.swing.JButton;
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
	private JLabel lblcorreo;
	private JLabel lbldireccion;
	private JLabel lblanio;
	private JLabel lblventa;
	private JLabel lbltelefono;
	private JTextField txtcedula;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtcorreo;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JComboBox<Integer> comboAnio;
	private JButton agregar, menu;
	private JComboBox<Character> comboGenero;
	private JTextField txtventa;
	/**
	 * es el metodo constructor de la clase donde se inicializan los atributos
	 */

	public AddPersonalComission(MainWindow principal) {

		setTitle("Nuevo Personal de comision");
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
		txtdireccion.setBounds(290,190,285,20);
		add(txtdireccion);

		lblanio = new JLabel("Anio");
		lblanio.setBounds(45,226,110,19);
		add(lblanio);
		lblventa = new JLabel("Ingreso por venta");
		lblventa.setBounds(45,330,110,25);
		add(lblventa);

		agregar = new  JButton("AGREGAR");
		agregar.setBounds(25,400,200,60);
		agregar.setActionCommand("agregar Comission");
		add(agregar);

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

		txtventa = new JTextField();
		txtventa.setBounds(290, 330, 285, 22);
		add(txtventa);
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
		public JComboBox<Integer> getComboAnio() {
			return comboAnio;
		}
		public JComboBox<Character> getComboGenero() {
			return comboGenero;
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