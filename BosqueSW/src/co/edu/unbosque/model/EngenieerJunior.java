package co.edu.unbosque.model;

import java.io.Serializable;

public class EngenieerJunior extends PersonalSalary implements Serializable {
	
	/**
	 * 
	 */

	private int level;

	public EngenieerJunior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, int level) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		this.level = level;
		// TODO Auto-generated constructor stub
	}
	

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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
