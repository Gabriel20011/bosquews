package co.edu.unbosque.model;

import java.io.Serializable;
/*
 * Es la clase encargada de crear un ingeniero junior el cual tiene las mismas caracteristicas de una persona de 
 * sueldo fijo y ademas de tener una caracteristica adicional del nivel de este
 * @author	Juan David Quintero
 * @author  Sergio Ortiz
 * @author  Gabriel Alejandro Ortega
 * @author  Juan Diego Fajardo
 */
public class EngenieerJunior extends PersonalSalary implements Serializable {
	
	
	private int level;
/**
 * Es el cosntructor de la clase EngenieerJUnior el cual inicializa los componentes de la clase
 * <b>pre</b> Heredar la clase PersonalSalary
 * <b>post</b> Se crea un nuevo objeto EngenieerJunior
 * @param cedula Recibe la cedula del empleado y esta no puede incluir letras, cedula!= " " && cedula!= null
 * @param nombre Recibe el nombre del empleado y este no puede incluir numeros, nombre != " " && nombre != null
 * @param apellido Recibe el apellido del empleado y este no puede incluir numeros, apellido != " " && apellido != null
 * @param genero Recibe el genero del empleado y este no puede contener numeros, char != " " && char!= null
 * @param telefono Recibe el telefono del empleado y este no puede contener letras,telefono!=" " && telefono!= null
 * @param salarioBase Recibe el salario del empleado y este no puede contner letras,salario!=null && salario != 0
 * @param correo Recibe el correo del empleado y permite el caracter especial "@", correo!=null
 * @param direccion Recibe la direccion del empleado, direccion!= null
 * @param anio Recibe el anio de ingreso del  empleado y no puede contener el, anio!=0 && anio != null
 * @param level	 Recibe el nivel en el que se encuentra el empleado junior, level!= 0 && level!= null
 */
	public EngenieerJunior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, int level) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		this.level = level;
		calcularSalario();

	}
	
	/**
	 * El metodo permite calcular el salario de los EngenieerJunior tomando un salario base 
	 * <b>pre</b>  Se tiene que crear un EngenieerJunior 
	 * <b>post</b> Se define el Salario del EngenieerJunior en base a su nivel
	 * @return getSalarioBase
	 */
	@Override
	public double calcularSalario() {
		setSalarioBase(3500000);
		if(calcularAntiguedad()>=2 && calcularAntiguedad()<4) {
			setSalarioBase(getSalarioBase() + (getSalarioBase() * 5 / 100));
		}
		if(calcularAntiguedad()>=4 && calcularAntiguedad()<8) {
			setSalarioBase(getSalarioBase() + (getSalarioBase() * 10 / 100));
		}
		if(calcularAntiguedad()>=8 && calcularAntiguedad()<16) {
			setSalarioBase(getSalarioBase() + (getSalarioBase() * 15 / 100));
		}
		if(calcularAntiguedad()>15) {
			setSalarioBase(getSalarioBase() + (getSalarioBase() * 20 / 100));
		}
		if(level>1 && level<=3) {
			setSalarioBase(getSalarioBase() + (getSalarioBase() * 5 / 100));
		}
		if(level>3 && level<=5) {
			setSalarioBase(getSalarioBase() + (getSalarioBase() * 8 / 100));
		}
		return getSalarioBase();		
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
