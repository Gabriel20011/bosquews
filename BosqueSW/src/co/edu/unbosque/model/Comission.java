package co.edu.unbosque.model;

public class Comission extends Personal {
	
	private int nCliente;

	public Comission(String cedula, String nombre, String apellido, char genero, String telefono, double salarioBase,
			String correo, String direccion, int año) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, año);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		
	}

}
