package co.edu.unbosque.model;

import java.io.Serializable;

public class PersonalComission extends Personal implements Serializable{
	
	private double venta;
	
	public PersonalComission(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, double venta) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		this.venta = venta;
		// TODO Auto-generated constructor stub
	}

	public double calcularSalario() {
		setSalarioBase(1100000);
		if(venta>=800000) {
			setSalarioBase(getSalarioBase() + venta);
		}
		return getSalarioBase();
	}
	public double getVenta() {
		return venta;
	}
	public void setVenta(double venta) {
		this.venta = venta;
	}
}
