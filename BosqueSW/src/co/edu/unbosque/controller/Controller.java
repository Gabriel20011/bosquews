package co.edu.unbosque.controller;
import co.edu.unbosque.model.*;

public class Controller {
	private Mundo m;
	
	public Controller() {
		m = new Mundo();
		m.geteSenior().setA�o(2019);
		m.geteSenior().calcularAntiguedad();
		System.out.println(m.geteSenior().calcularSalario());
	}

	public Mundo getM() {
		return m;
	}

	public void setM(Mundo m) {
		this.m = m;
	}

}
