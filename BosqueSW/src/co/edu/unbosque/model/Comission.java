package co.edu.unbosque.model;

public class Comission extends Personal {
	
	private int nCliente;

	public Comission(String cedula, String nombre, String apellido, char genero, String telefono, double salarioBase,
			String correo, String direccion, int anio) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		return 0;
		// TODO Auto-generated method stub
		
	}

}
