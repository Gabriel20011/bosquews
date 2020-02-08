package co.edu.unbosque.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.*;
import co.edu.unbosque.view.MainWindow;

/**
 * Es la clase que maneja los metodos que controlan a el programa y relaciona la vusta con la logica
 * @author    Juan David Quintero
 * @author  Sergio Ortiz
 * @author  Gabriel Alejandro Ortega
 * @author  Juan Diego Fajardo
 */

public class Controller {

	
	private Mundo m;
	private MainWindow ventana;

	/**
     * Es el controlador de la clase mundo el cual premite inicializar la ventana principal y el mundo
     */
	
	public Controller() {
		m = new Mundo();
		clasificar();
		ventana = new MainWindow(this);
		ventana.setVisible(true);

	}
	/**
     * Es el metodo que agraga  Empleados de tipo PersonalComission a la arespuectiva arraylist
     * <b>pre</b> Requiere que se haya incializado la respectiva arraylist en la clase mundo
     * <b>post</b> Se ha añadido un nuevo empleado a la arraylista de pComission
     * @param cedula Es la cedula del empleado que se va a añadir, cedula!=null && cedula != " "
     * @param nombre Es el nombre del neuvo empleado que se va a crear, nombre !=null && nombre != " "
     * @param apellido Es el apellido del nuevo empleado que se va a crear, apellido != null && apellido != " "
     * @param genero Es el genero del nuevo empleado,genero!= null && genero != " "
     * @param telefono Es el numero de telefono del nuevo empleado, telefono != null && telefono != " " 
     * @param salarioBase Es el salario del nuevo empleado, salario != null && salario !=0
     * @param correo Es el correo del nuevo empleado que se esta agragando, correo!= null && correo != " "
     * @param direccion Es la direccion del nuevo empleado que se esta agregando, direccion != null && direccion != " "
     * @param anio Es el año en el cual el empleado entro a la empresa, anio != null && anio != 0
     * @param venta    Es el numero de ventas que ha realizado el nuevo empleado, ventas != null && ventas!=0
     */
	public boolean agregarComission(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, double venta) {
		PersonalComission pc = new PersonalComission(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio, venta);
		if(buscar(cedula)==null) {
			m.getpComission().add(pc);
			JOptionPane.showMessageDialog(null, "PERSONAL AGREGADO CON EXITO");
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "UN USUARIO CON LA MISMA CEDULA YA EXISTE!!");
			return false;
		}
	}
	/**
     * Es el metodo que agrega empleados del tipo EngineerSenior a su respectiva arraylist
     * <b>pre</b> Requiere que se haya incializado su respectiva arraylist en la clase mundo
     * <b>post</b> Se ha añadido un nuevo empleado a la arraylista de eSenior
     * @param cedula Es la cedula del empleado que se va a añadir, cedula!=null && cedula != " "
     * @param nombre Es el nombre del neuvo empleado que se va a crear, nombre !=null && nombre != " "
     * @param apellido Es el apellido del nuevo empleado que se va a crear, apellido != null && apellido != " "
     * @param genero Es el genero del nuevo empleado,genero!= null && genero != " "
     * @param telefono Es el numero de telefono del nuevo empleado, telefono != null && telefono != " " 
     * @param salarioBase Es el salario del nuevo empleado, salario != null && salario !=0
     * @param correo Es el correo del nuevo empleado que se esta agragando, correo!= null && correo != " "
     * @param direccion Es la direccion del nuevo empleado que se esta agregando, direccion != null && direccion != " "
     * @param anio Es el año en el cual el empleado entro a la empresa, anio != null && anio != 0
     * @param nventas Es el numero de ventas que ha realizado el nuevo empleado, ventas != null && ventas!=0
     */
	public boolean agregarSenior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, int nventas) {
		EngenieerSenior es = new EngenieerSenior(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio, nventas);
		if(buscar(cedula)==null) {
			m.geteSenior().add(es);
			JOptionPane.showMessageDialog(null, "PERSONAL AGREGADO CON EXITO");
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "UN USUARIO CON LA MISMA CEDULA YA EXISTE!!");
			return false;
		}
	}
	/**
     * Es el metodo que se encarga de agregar  un nuevo empleado de tipo EngenieerJunior al programa
     * <b>pre</b> Requiere que se haya incializado su respectiva arraylist en la clase mundo
     * <b>post</b> Se ha añadido un nuevo empleado a la arraylista de eJunior
     * @param cedula Es la cedula del empleado que se va a añadir, cedula!=null && cedula != " "
     * @param nombre Es el nombre del neuvo empleado que se va a crear, nombre !=null && nombre != " "
     * @param apellido Es el apellido del nuevo empleado que se va a crear, apellido != null && apellido != " "
     * @param genero Es el genero del nuevo empleado,genero!= null && genero != " "
     * @param telefono Es el numero de telefono del nuevo empleado, telefono != null && telefono != " " 
     * @param salarioBase Es el salario del nuevo empleado, salario != null && salario !=0
     * @param correo Es el correo del nuevo empleado que se esta agragando, correo!= null && correo != " "
     * @param direccion Es la direccion del nuevo empleado que se esta agregando, direccion != null && direccion != " "
     * @param anio Es el año en el cual el empleado entro a la empresa, anio != null && anio != 0
     * @param level Es el nivel del nuevo empleado que se va a agregar, level!= null & level != 0
     */
	public boolean agregarJunior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, int level) {
		EngenieerJunior ej = new EngenieerJunior(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio, level);
		if(buscar(cedula)==null) {
			m.geteJunior().add(ej);
			JOptionPane.showMessageDialog(null, "PERSONAL AGREGADO CON EXITO");
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "UN USUARIO CON LA MISMA CEDULA YA EXISTE!!");
			return false;
		}
	}
	/**
     * Es el metodo que se encarga de modificar a los  respectivos empleados  meadiante buscar la cedula
     * <b>pre</b> Requiere que existan las arraylists de los empleados y que exista la cedula que se busca
     * <b>post</b> Se cambian los respectivos datos del empleado encontrado
     * @param cedula Es la cedula mediante la cual se va a buscar al empleado deseado 
     * @param nombre es el nuevo nombre que se le va a definir al empleado
     * @param apellido es el nuevo apellido que se le va a definir al empleado
     * @param telefono es el nuevo telefono que se le va  a definir al empleado 
     * @param correo es el nuevo correo que se le va a generar al empleado
     * @param direccion es la nueva direccion que se le va a definir a el empleado
     */
	public boolean modificar(String cedula, String nombre, String apellido, String telefono, String correo, String direccion, String anio) {
		boolean retorno = false;
		Personal per = buscar(cedula); 
		if (per != null) {
			retorno = true;
			per.setNombre(nombre);
			per.setApellido(apellido);
			per.setTelefono(telefono);
			per.setDireccion(direccion);
			per.setCorreo(correo);		
			per.setAnio(Integer.parseInt(anio));
		}
		
		return retorno;
	}

	/**
     * Es el metodo que permite buscar un mepleado por su cedula y mediante eso eliminarlo
     * <b>pre</b> Requiere que existan las arraylists de los empleados y que exista la cedula que se busca
     * <b>post</b> Se elimina el empleado que se busco
     * @param cedula  del empleado que se va a eliminar, cedula !=" " && cedula != null
     */
	
	public boolean eliminar(String cedula) {
		Personal per = buscar(cedula);
		boolean a = false;
		if(per!=null && per instanceof PersonalComission) {
			m.getpComission().remove(per);
			a = true;
		}	
		if(per!=null && per instanceof EngenieerSenior) {
			m.geteSenior().remove(per);
			a = true;
		}
		if(per!=null && per instanceof EngenieerJunior) {
			m.geteJunior().remove(per);
			a = true;
		}
		return a;
	}
	/**
     * Es el metodo que permite buscar a un empleado para mostrar sus datos
     * <b>pre</b> Requiere que existan las arraylists de los empleados y que exista la cedula que se busca
     * <b>post</b> Se exponen los datos del empleado que se busco
     * @param cedula es la cedula del empleado que se desea buscar
     * @return
     */
	public Personal buscar(String cedula ) {
		Personal per = null;
		for (int i = 0; i < m.geteJunior().size(); i++) {
			if(m.geteJunior().get(i).getCedula().equals(cedula)) {
				per = m.geteJunior().get(i);
			}
		}
		for (int i = 0; i < m.geteSenior().size(); i++) {
			if(m.geteSenior().get(i).getCedula().equals(cedula)) {
				per = m.geteSenior().get(i);
			}
		}
		for (int i = 0; i < m.getpComission().size(); i++) {
			if(m.getpComission().get(i).getCedula().equals(cedula)) {
				per = m.getpComission().get(i);
			}
		}
		return per;
	}
	/**
     * Es el metodo que permite buscar a un empleado para mostrar sus datos
     * <b>pre</b> Requiere que existan las arraylists de los empleados y que exista la cedula que se busca
     * <b>post</b> Se exponen los datos del empleado que se busco
     * @param cedula es la cedula del empleado que se desea buscar
     * @return
     */
	public void clasificar() {
		for (int i = 0; i < m.getPersonal().size(); i++) {
			if(m.getPersonal().get(i) instanceof PersonalComission) {
				m.getpComission().add((PersonalComission) m.getPersonal().get(i));
			}if(m.getPersonal().get(i) instanceof EngenieerJunior) {
				m.geteJunior().add((EngenieerJunior) m.getPersonal().get(i));
			}if(m.getPersonal().get(i) instanceof EngenieerSenior) {
				m.geteSenior().add((EngenieerSenior) m.getPersonal().get(i));
			}
		}
	}
	/**
     * Es el metodo que se encarga de convertir las arraylist a tipo Personal y guardarlas
     * <b>pre</b> Requiere que existan las arraylists de los empleados 
     * <b>post</b> Se guardan todas las arraylist en la de tipo Personal
     */
	public void converger() {
		m.setPersonal(new ArrayList<Personal>());
		for (int i = 0; i < m.getpComission().size(); i++) {
			m.getPersonal().add(m.getpComission().get(i));
		}
		for (int i = 0; i < m.geteJunior().size(); i++) {
			m.getPersonal().add(m.geteJunior().get(i));
		}
		for (int i = 0; i < m.geteSenior().size(); i++) {
			m.getPersonal().add(m.geteSenior().get(i));
		}
	}
	/**
     * Es el metodo que se encarga de verificar los valores del correo del usuario
     * <b>pre</b> Requiere que existan el empleado con su respectivo correo
     * <b>post</b> Se agrega el correo con las especificaciones deseadas
     * @param correo es el correo que se desea agregar o editar
     */
	public boolean verificarCorreo(String correo) {
		char[] a = correo.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if(a[i]=='@') {
				return true;
			}
		}
		return false;
	}
	
	public Mundo getM() {
		return m;
	}

	public void setM(Mundo m) {
		this.m = m;
	}
}
