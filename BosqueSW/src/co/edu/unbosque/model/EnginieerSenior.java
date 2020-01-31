package co.edu.unbosque.model;

public class EnginieerSenior extends PersonalSalary{
	
	private int nVentas;

	public EnginieerSenior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, int nVentas) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		this.nVentas = nVentas;
		// TODO Auto-generated constructor stub
	}
	
	

}
