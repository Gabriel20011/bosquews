package co.edu.unbosque.model;

import java.io.Serializable;

public class EngenieerSenior extends PersonalSalary implements Serializable {

	public EngenieerSenior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		// TODO Auto-generated constructor stub
	}
	private int nVentas;

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
