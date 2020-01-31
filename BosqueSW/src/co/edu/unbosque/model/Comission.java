package co.edu.unbosque.model;

public class Comission extends Personal {
	
	private int nCliente;

	public Comission(String cedula, String nombre, String apellido, char genero, String telefono, double salarioBase,
			String correo, String direccion, int año) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, año);
	}
	
	public void calcularSalario() {
		
	}
	public int getnCliente() {
		return nCliente;
	}
	public void setnCliente(int nCliente) {
		this.nCliente = nCliente;
	}
}
