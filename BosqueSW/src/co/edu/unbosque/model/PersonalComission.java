package co.edu.unbosque.model;

public class PersonalComission extends Personal {
	private double venta;

	public double calcularSalario() {
		salarioBase = 1100000;
		if(venta>=800000) {
			salarioBase += venta;
		}
		return salarioBase;
	}
	public double getVenta() {
		return venta;
	}
	public void setVenta(double venta) {
		this.venta = venta;
	}
}
