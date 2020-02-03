package co.edu.unbosque.model;

import java.io.Serializable;

public abstract class Personal implements Serializable {
	
	private String cedula;
	private String nombre;
	private String apellido;
	private char genero;
	private String telefono;
	private double salarioBase;
	private String correo;
	private String direccion;
	private int anio;
	
	public Personal(String cedula, String nombre, String apellido, char genero, String telefono, double salarioBase,
			String correo, String direccion, int anio) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.telefono = telefono;
		this.salarioBase = salarioBase;
		this.correo = correo;
		this.direccion = direccion;
		this.anio = anio;
	}

	public abstract double calcularSalario();
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getAnio() {
		return anio;
	}
}
