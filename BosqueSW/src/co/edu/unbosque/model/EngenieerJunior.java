package co.edu.unbosque.model;

import java.io.Serializable;

public class EngenieerJunior extends PersonalSalary implements Serializable {
	
	/**
	 * Esta clase representa las caracteristicas de un Ingeniero Junior
	 * 
	 * Esta clase esta heredada de la clase personal con salario 
	 */

	private int level;
	/**
	 * Este el constructro de la clase la cual definira los atributos generales de cualquier atributo
	 * <b>post<b/> se habra rellendado los datos basicos de cualquier una persona ingeniera Junior de la empresa BosqueSW  
	 * @param cedula referencia a la cedula personal del empleado
	 * @param nombre referencia al nombre del empleado
	 * @param apellido referencia al apellido del personal
	 * @param genero un char que identifica el sexo del personal
	 * @param telefono numero telefonico de contacto del personal
	 * @param salarioBase salario inicial que poseera el 
	 * @param correo correo electronico del personal
	 * @param direccion referencia a la direccion fisica del personal
	 * @param anio año de entrada a la empresa
	 * @param level es el nivel del ingeniero
	 */
	public EngenieerJunior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, int level) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		this.level = level;
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * Este metodo permite calcular el salario de un ingeniero Junior
	 * <b>post</b> este metodo permite calcular el salario de un ingeniero Junior
	 * @return el salario de cada ingeniero Junior
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
		if(level>1 && level<=3) {
			setSalarioBase(getSalarioBase() * 5 / 100);
		}
		if(level>3 && level<=5) {
			setSalarioBase(getSalarioBase() * 8 / 100);
		}
		return getSalarioBase();		
	} 
	/**
	 * metodo para obtener el nivel del ingeniero
	 * <b>post</b> obtener el valor del nivel del ingeniero
	 * @return level retornar el nivel del ingeniero
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * metodo para actualizar el nivel
	 * <b> post </b> actualizar el nivel del ingeniero
	 * @param level es un variable entero donde se da el nivel
	 */
	public void setLevel(int level) {
		this.level = level;
	}
}
