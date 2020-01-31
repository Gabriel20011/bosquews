package co.edu.unbosque.model;

public abstract class PersonalSalary extends Personal {

	public PersonalSalary(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		// TODO Auto-generated constructor stub
	}
	
	public int  calcularAntiguedad() {
		return 0;
		
	}
	public double calcularSalario() {
		return 0.0;
	}
	

}
