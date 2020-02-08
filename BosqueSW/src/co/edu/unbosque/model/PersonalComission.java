package co.edu.unbosque.model;
import java.io.Serializable;

public class PersonalComission extends Personal implements Serializable{
	
	/**
	 * Esta clase representa a los tipos de pesonal que trabajan unicamente por comision 
	 * Debido a que siguen siendo personales entonces heredaran estas caracteristicas de la clase Personal
	 * 
	 * <b>pre<b/> Sera nesesario que se herede a la clase personal
	 * <b>post<b/> Una insancia de PersonalComission sera creado
	 * 
	 */
	private double venta;

	/**
	 * El contructor de esta clase instanciara un objeto pasandole los atributos basicos heredados de una personal
	 * mas las ventas que tenga
	 * 
	 *<b>pre<b/> se requerira que esta clase herede de la clase personal
	 *<b>post<b/> se instanciara un PersonalCommision 
	 *
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
	 * @param venta las ventas que tiene a cargo este personalComission
	 */
	public PersonalComission(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, double venta) {
		super(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		this.venta = venta;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este metodo calcula el salario correspondiente de el pesonal por comision teniendo en cuenta las ventas a cargo
	 * 
	 * <b>pre<b/> debe haber sido inicializado correctamente el salario base de el personal por comision
	 * <b>post<b/> el salario base habra sido actualizado asi como se habra retornado este valor
	 * 
	 * @return double el salario actualizado del personal por comision
	 */
	public double calcularSalario() {
		setSalarioBase(1100000);
		if(venta>=800000) {
			setSalarioBase(getSalarioBase() + venta);
		}
		return getSalarioBase();
	}
	/**
	 * Este metodo retorna las ventas que posee la instancia de el persional por comission
	 * 
	 * <b>pre<b/> debe haber un valor inicial de ventas y por eso...
	 * <b>pre<b/> debe haber sido instanciado
	 * @return las ventas que tiene a cargo un personal por comision
	 */
	public double getVenta() {
		return venta;
	}
	/**
	 * Este metodo permite modificar el valor de ventas de un personal por comision
	 * 
	 * <b>pre<b/> debe haber un valor inicial de ventas y por eso...
	 * <b>pre<b/> debe haber sido instanciado
	 * <b>post<b/> El atributo de venta sera modificado
	 * 
	 * @param venta el nuevo valor de ventas 
	 */
	public void setVenta(double venta) {
		this.venta = venta;
	}
}
