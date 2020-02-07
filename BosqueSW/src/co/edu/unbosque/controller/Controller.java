package co.edu.unbosque.controller;
import java.util.ArrayList;
import co.edu.unbosque.model.*;
import co.edu.unbosque.view.MainWindow;

public class Controller {
	
	private Mundo m;
	private MainWindow ventana;

	public Controller() {
		m = new Mundo();
		ventana = new MainWindow(this);
		ventana.setVisible(true);
		
	}

	public void agregarSenior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio) {
		EngenieerSenior es = new EngenieerSenior(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio);
		if(buscar(cedula)==null) {
			m.geteSenior().add(es);
		}
	}
	
	public void agregarJunior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, int level) {
		EngenieerJunior ej = new EngenieerJunior(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio, level);
		if(buscar(cedula)==null) {
			m.geteJunior().add(ej);
		}
	}
	
	public void modificar(String cedula, String nombre, String apellido, String telefono, String correo, String direccion) {
		Personal per = buscar(cedula);
		if(per!=null && per instanceof PersonalComission) {
			per.setNombre(nombre);
			per.setApellido(apellido);
			per.setTelefono(telefono);
			per.setDireccion(direccion);
			per.setCorreo(correo);			
		}
		if(per!=null && per instanceof EngenieerJunior) {
			per.setNombre(nombre);
			per.setApellido(apellido);
			per.setTelefono(telefono);
			per.setDireccion(direccion);
			per.setCorreo(correo);			
		}
		if(per!=null && per instanceof EngenieerSenior) {
			per.setNombre(nombre);
			per.setApellido(apellido);
			per.setTelefono(telefono);
			per.setDireccion(direccion);
			per.setCorreo(correo);			
		}
	}
	
	public void eliminar(String cedula) {
		Personal per = buscar(cedula);
		if(per!=null && per instanceof PersonalComission) {
			m.getpComission().remove(per);
		}	
		if(per!=null && per instanceof EngenieerSenior) {
			m.geteSenior().remove(per);
		}
		if(per!=null && per instanceof EngenieerJunior) {
			m.geteJunior().remove(per);
		}
	}
	
	public Personal buscar(String cedula ) {
		Personal per = null;
		for (int i = 0; i < m.geteJunior().size(); i++) {
			if(m.geteJunior().get(i).getCedula().equals(cedula)) {
				per = m.geteJunior().get(i);
			}
		}
		for (int i = 0; i < m.geteSenior().size(); i++) {
			if(m.geteSenior().get(i).getCedula().equals(cedula)) {
				per = m.geteSenior().get(i);
			}
		}
		for (int i = 0; i < m.getpComission().size(); i++) {
			if(m.getpComission().get(i).getCedula().equals(cedula)) {
				per = m.getpComission().get(i);
			}
		}
		return per;
	}
	
	public void clasificar() {
		for (int i = 0; i < m.getPersonal().size(); i++) {
			if(m.getPersonal().get(i) instanceof PersonalComission) {
				m.getpComission().add((PersonalComission) m.getPersonal().get(i));
			}if(m.getPersonal().get(i) instanceof EngenieerJunior) {
				m.geteJunior().add((EngenieerJunior) m.getPersonal().get(i));
			}if(m.getPersonal().get(i) instanceof EngenieerSenior) {
				m.geteSenior().add((EngenieerSenior) m.getPersonal().get(i));
			}
		}
	}
	
	public void converger() {
		m.setPersonal(new ArrayList<Personal>());
		for (int i = 0; i < m.getpComission().size(); i++) {
			m.getPersonal().add(m.getpComission().get(i));
		}
		for (int i = 0; i < m.geteJunior().size(); i++) {
			m.getPersonal().add(m.geteJunior().get(i));
		}
		for (int i = 0; i < m.geteSenior().size(); i++) {
			m.geteSenior().add(m.geteSenior().get(i));
		}
	}
	
	public Mundo getM() {
		return m;
	}

	public void setM(Mundo m) {
		this.m = m;
	}

}
