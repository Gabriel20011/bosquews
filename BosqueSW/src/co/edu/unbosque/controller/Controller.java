package co.edu.unbosque.controller;
import co.edu.unbosque.model.*;

public class Controller {
	private Mundo m;
	
	public Controller() {
		m = new Mundo();
	}

	public Mundo getM() {
		return m;
	}

	public void setM(Mundo m) {
		this.m = m;
	}

}
