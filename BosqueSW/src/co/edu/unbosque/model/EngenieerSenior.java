package co.edu.unbosque.model;
import java.io.Serializable;

/*
 * Es la clase encargada de crear un ingeniero senier la cual tiene las mismas caracteristicas de una persona 
 * de sueldo fijo y ademas de tener una caracteristica adicional del nivel de este
 * @author	Juan David Quintero
 * @author  Sergio Ortiz
 * @author  Gabriel Alejandro Ortega
 * @author  Juan Diego Fajardo
 */

public class EngenieerSenior extends PersonalSalary implements Serializable {
	private int nVentas;
	/**
	 * Es el constructor de la clase EngenieerSenior el cual inicializa los componentes de la clase
	 * <b>pre</b> Heredar la clase PersonalSalary
	 * <b>post</b> Se crea un nuevo objeto EngenieerSenior
	 * @param cedula Recibe la cedula del empleado y esta no puede incluir letras, cedula!= " " && cedula!= null
	 * @param nombre Recibe el nombre del empleado y este no puede incluir numeros, nombre != " " && nombre != null
	 * @param apellido Recibe el apellido del empleado y este no puede incluir numeros, apellido != " " && apellido != null
	 * @param genero Recibe el genero del empleado y este no puede contener numeros, char != " " && char!= null
	 * @param telefono Recibe el telefono del empleado y este no puede contener letras,telefono!=" " && telefono!= null
	 * @param salarioBase Recibe el salario del empleado y este no puede contner letras,salario!=null && salario != 0
	 * @param correo Recibe el correo del empleado y permite el caracter especial "@", correo!=null
	 * @param direccion Recibe la direccion del empleado, direccion!= null
	 * @param anio Recibe el anio de ingreso del  empleado y no puede contener el, anio!=0 && anio != null
	 * @param nVentas Recibe el numero de ventas realizadas por el empleado, nVentas!=0
	 */
	public EngenieerSenior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio,int nVentas) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		// TODO Auto-generated constructor stub
		this.nVentas = nVentas;
		calcularSalario();
	}
	/**
	 * El metodo permite calcular el salario de los EngenieerSenior tomando un salario base 
	 * <b>pre</b>  Se tiene que crear un EngenieerSenior
	 * <b>post</b> Se define el Salario del EngenieerSenioren base a su numero de ventas
	 * @return getSalarioBase
	 */
	@Override
	public double calcularSalario() {
		setSalarioBase(3500000);
		if(calcularAntiguedad()>=2 && calcularAntiguedad()<4) {
			setSalarioBase(getSalarioBase() * 5 / 100);
		}
		if(calcularAntiguedad()>=4 && calcularAntiguedad()<8) {
			setSalarioBase(getSalarioBase() * 10 / 100);
		}
		if(calcularAntiguedad()>=8 && calcularAntiguedad()<16) {
			setSalarioBase(getSalarioBase() * 15 / 100);
		}
		if(calcularAntiguedad()>15) {
			setSalarioBase(getSalarioBase() * 20 / 100);
		}
		if(nVentas>0 && nVentas<=5) {
			setSalarioBase(getSalarioBase() * 10 / 100);
		}
		if(nVentas>5 && nVentas<=10) {
			setSalarioBase(getSalarioBase() * 10 / 100);
		}
		if(nVentas>10 && nVentas<=20) {
			setSalarioBase(getSalarioBase() * 20 / 100);
		}
		if(nVentas>20) {
			setSalarioBase(getSalarioBase() * 30 / 100);
		}
		return getSalarioBase();
	}
	public int getnVentas() {
		return nVentas;
	}
	public void setnVentas(int nVentas) {
		this.nVentas = nVentas;
	}
}