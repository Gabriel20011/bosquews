package co.edu.unbosque.controller;
import java.io.File; 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Personal;

public class Dto {

	private ArrayList<Personal> per;
	private File archivo;

	public Dto() {
		per = new ArrayList<Personal>();
		archivo = new File("src/co/edu/unbosque/persistence/datos.dat");
		try {
			if (!archivo.exists()) {
				archivo.createNewFile();
				actualizarPersonal(null);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		leerArchivo();
	}
	public void leerArchivo() {
		FileInputStream fl;
		ObjectInputStream ob;
		try {
			fl = new FileInputStream(archivo);
			ob = new ObjectInputStream(fl);
			per = (ArrayList<Personal>) ob.readObject();
			System.out.println("Lectura existosa!");
			ob.close();
			fl.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void actualizarPersonal(ArrayList<Personal> personal) {
		FileOutputStream fo;
		ObjectOutputStream ob;
		try {
			fo = new FileOutputStream(archivo);
			ob = new ObjectOutputStream(fo);

			ob.writeObject(personal);

			ob.close();
			fo.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<Personal> getPer() {
		return per;
	}
	public void setPer(ArrayList<Personal> per) {
		this.per = per;
	}
}
