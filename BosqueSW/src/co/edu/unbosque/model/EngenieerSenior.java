package co.edu.unbosque.model;
import java.io.Serializable;

public class EngenieerSenior extends PersonalSalary implements Serializable {
	/**
	 * 
	 * Esta clase es dobde se le atribuyen los parametros de un ingeniero 
	 * 
	 * Debido a que la clase es extendida toma las caracteristicas de personal
	 */
	 
	/**
	 * Este es el constructor de la clase la cual definira los atributos del ingeniero
	 * 
	 * <b>post<b/> se habra rellendado los datos basicos de cualquier personal de la empresa BosqueSW  
	 * 
	 * @param cedula referencia a la cedula personal del empleado
	 * @param nombre referencia al nombre del empleado
	 * @param apellido referencia al apellido del personal
	 * @param genero un char que identifica el sexo del personal
	 * @param telefono numero telefonico de contacto del personal
	 * @param salarioBase salario inicial que poseera el 
	 * @param correo correo electronico del personal
	 * @param direccion referencia a la direccion fisica del personal
	 * @param anio año de entrada a la empresa 
	 */
	public EngenieerSenior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		// TODO Auto-generated constructor stub
	}
	/**
	 * es el numero de ventas
	 * <b> post </b> obtener el numero de ventas
	 */
	private int nVentas;
	/**
	 * Este metodo permite calcular el salario de un ingeniero Junior
	 * <b>post</b> este metodo permite calcular el salario de un ingeniero Junior
	 * @return el salario de cada ingeniero Junior
	 */
	@Override
	public double calcularSalario() {
		setSalarioBase(3500000);
		if(calcularAntiguedad()>=2 && calcularAntiguedad()<4) {
			setSalarioBase(getSalarioBase() * 5 / 100);
		}
		if(calcularAntiguedad()>=4 && calcularAntiguedad()<8) {
			setSalarioBase(getSalarioBase() * 10 / 100);
		}
		if(calcularAntiguedad()>=8 && calcularAntiguedad()<16) {
			setSalarioBase(getSalarioBase() * 15 / 100);
		}
		if(calcularAntiguedad()>15) {
			setSalarioBase(getSalarioBase() * 20 / 100);
		}
		if(nVentas>0 && nVentas<=5) {
			setSalarioBase(getSalarioBase() * 10 / 100);
		}
		if(nVentas>5 && nVentas<=10) {
			setSalarioBase(getSalarioBase() * 10 / 100);
		}
		if(nVentas>10 && nVentas<=20) {
			setSalarioBase(getSalarioBase() * 20 / 100);
		}
		if(nVentas>20) {
			setSalarioBase(getSalarioBase() * 30 / 100);
		}
		return getSalarioBase();
	}
	/**
	 * metodo para obtener el numero de ventas del ingeniero
	 * <b>post</b> obtener el valor de numero de ventas  del ingeniero
	 * @return level retornar el numero de ventas del ingeniero
	 */
	public int getnVentas() {
		return nVentas;
	}
	/**
	 * metodo para actualizar el numero de ventas
	 * <b> post </b> actualizar el numero de ventas del ingeniero
	 * @param nVentas es un variable entero donde se da el numero de ventas
	 */
	public void setnVentas(int nVentas) {
		this.nVentas = nVentas;
	}
}
