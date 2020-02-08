package co.edu.unbosque.model;
import java.io.Serializable;

import java.util.Calendar;
public abstract class PersonalSalary extends Personal implements Serializable{



	/**
	 * Esta clase representa al personal a los que un salario es asignado de acuerdo a su categoria y valores especificos
	 * 
	 *  Debido a que la clase es abstracta, entonces no habra instancias de esta clase, pero otras clases heredaran
	 * estas caracteristicas.
	 * 
	 * <b>pre<b/> Sera nesesario que se herede a la clase personal para tener sus atributos basicos
	 * <b>post<b/> Esa clase sera la clase padre para otras 
	 * 
	 */
	
	/**
	 * El constructor de este metodo se usara para que las clases hijas de esta recogan las caracteristicas de personalSalary
	 * 
	 * 
	 * <b>pre<b/> se requerira que esta clase herede de la clase personal
	 * <b>post<b/> se habra pasado los datos basicos de 
	 *
	 * @param cedula referencia a la cedula personal del empleado
	 * @param nombre referencia al nombre del empleado
	 * @param apellido referencia al apellido del personal
	 * @param genero un char que identifica el sexo del personal
	 * @param telefono numero telefonico de contacto del personal
	 * @param salarioBase salario inicial que poseera el 
	 * @param correo correo electronico del personal
	 * @param direccion referencia a la direccion fisica del personal
	 * @param anio año de entrada a la empresa 
	 */

	public PersonalSalary(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Este metodo cacula la antiguedad de un empleado con salario definido y retorna este valor
	 * 
	 * <b>pre<b/> Se requiere que el valor de antiguedad tenga un valor por ende...
	 * <b>pre<b/> Una instancia de las calses que heredan de personal con salario tiene que estar instanciado
	 * 
	 * 
	 * @return el tiempo que un personal con slario ha estado en la empresa
	 */
	public int calcularAntiguedad() {
		Calendar cal= Calendar.getInstance();
		int antiguedad = cal.get(Calendar.YEAR);
		antiguedad -= getAnio();
		return antiguedad;
	}
	/**
	 * Este metodo es abstracto y sera implemetnado por las clases que sean heredadas de esta
	 * 
	 * @return el salario actualizado de el personal con un salario definido
	 */
	@Override
	public abstract double calcularSalario();
}
