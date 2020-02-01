package co.edu.unbosque.model;

public class EngenieerSenior extends PersonalSalary {

	private int nVentas;

	@Override
	public double calcularSalario() {
		salarioBase = 3500000;
		if(calcularAntiguedad()>=2 && calcularAntiguedad()<4) {
			salarioBase += (salarioBase*5)/100;
		}
		if(calcularAntiguedad()>=4 && calcularAntiguedad()<8) {
			salarioBase += (salarioBase*10)/100;
		}
		if(calcularAntiguedad()>=8 && calcularAntiguedad()<16) {
			salarioBase += (salarioBase*15)/100;
		}
		if(calcularAntiguedad()>15) {
			salarioBase += (salarioBase*20)/100;
		}
		if(nVentas>0 && nVentas<=5) {
			salarioBase += (salarioBase*10)/100;
		}
		if(nVentas>5 && nVentas<=10) {
			salarioBase += (salarioBase*15)/100;
		}
		if(nVentas>10 && nVentas<=20) {
			salarioBase += (salarioBase*20)/100;
		}
		if(nVentas>20) {
			salarioBase += (salarioBase*30)/100;
		}
		return salarioBase;
	}

	public int getnVentas() {
		return nVentas;
	}

	public void setnVentas(int nVentas) {
		this.nVentas = nVentas;
	}
	
}
