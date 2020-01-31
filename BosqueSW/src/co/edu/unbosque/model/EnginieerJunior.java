package co.edu.unbosque.model;

public class EnginieerJunior extends PersonalSalary{

	private int level;
	
	public EnginieerJunior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, int level) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		this.level = level;
		// TODO Auto-generated constructor stub
	}

}
