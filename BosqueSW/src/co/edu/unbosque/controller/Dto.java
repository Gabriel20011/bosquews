package co.edu.unbosque.controller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Personal;

public class Dto {
	
	private List<Personal> per;
	private File archivo;
	
	public Dto() {
	
		per = new ArrayList<Personal>();
	}
}
