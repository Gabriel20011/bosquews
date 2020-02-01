package co.edu.unbosque.model;

public class EngenieerJunior extends PersonalSalary {

	private int level;

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
		if(level>1 && level<=3) {
			salarioBase += (salarioBase*5)/100;
		}
		if(level>3 && level<=5) {
			salarioBase += (salarioBase*8)/100;
		}
		return salarioBase;		
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
