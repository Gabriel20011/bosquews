package co.edu.unbosque.model;

import java.io.Serializable;

public class Comission extends Personal implements Serializable {
	
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
