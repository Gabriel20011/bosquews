package co.edu.unbosque.model;

import java.util.Calendar;
public abstract class PersonalSalary extends Personal{
	
	public int calcularAntiguedad() {
		Calendar cal= Calendar.getInstance();
		int antiguedad = cal.get(Calendar.YEAR);
		antiguedad -= año;
		return antiguedad;
	}

	@Override
	public abstract double calcularSalario();

}
