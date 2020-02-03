package co.edu.unbosque.model;
import java.util.Calendar;
public abstract class PersonalSalary extends Personal{
	
	public PersonalSalary(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		// TODO Auto-generated constructor stub
	}

	public int calcularAntiguedad() {
		Calendar cal= Calendar.getInstance();
		int antiguedad = cal.get(Calendar.YEAR);
		antiguedad -= getAnio();
		return antiguedad;
	}

	@Override
	public abstract double calcularSalario();

}
