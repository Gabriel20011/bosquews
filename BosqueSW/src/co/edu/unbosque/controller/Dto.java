package co.edu.unbosque.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Personal;

public class Dto {
	
	private List<Personal> per;
	private File archivo;
	
	public Dto() {
	
		per = new ArrayList<Personal>();
	}
	public void cargarArchivo() {
		String[] datoLinea;
		try {
			FileInputStream fr = new FileInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(fr, "utf-8"));
			String linea = br.readLine();
			while(linea!=null) {
				datoLinea = linea.split(";");
				per.add(datoLinea);
				linea = br.readLine();
			}
			fr.close();

		}
		catch(IOException e) {
		}	
	}

}
