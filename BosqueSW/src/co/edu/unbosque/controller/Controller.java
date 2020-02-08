package co.edu.unbosque.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.*;
import co.edu.unbosque.view.MainWindow;

public class Controller {

	private Mundo m;
	private MainWindow ventana;

	public Controller() {
		m = new Mundo();
		clasificar();
		ventana = new MainWindow(this);
		ventana.setVisible(true);

	}
	public boolean agregarComission(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, double venta) {
		PersonalComission pc = new PersonalComission(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio, venta);
		if(buscar(cedula)==null) {
			m.getpComission().add(pc);
			JOptionPane.showMessageDialog(null, "PERSONAL AGREGADO CON EXITO");
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "UN USUARIO CON LA MISMA CEDULA YA EXISTE!!");
			return false;
		}
	}
	public boolean agregarSenior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, int nventas) {
		EngenieerSenior es = new EngenieerSenior(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio, nventas);
		if(buscar(cedula)==null) {
			m.geteSenior().add(es);
			JOptionPane.showMessageDialog(null, "PERSONAL AGREGADO CON EXITO");
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "UN USUARIO CON LA MISMA CEDULA YA EXISTE!!");
			return false;
		}
	}
	public boolean agregarJunior(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, int level) {
		EngenieerJunior ej = new EngenieerJunior(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio, level);
		if(buscar(cedula)==null) {
			m.geteJunior().add(ej);
			JOptionPane.showMessageDialog(null, "PERSONAL AGREGADO CON EXITO");
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "UN USUARIO CON LA MISMA CEDULA YA EXISTE!!");
			return false;
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
			m.getPersonal().add(m.geteSenior().get(i));
		}
	}
	public Mundo getM() {
		return m;
	}

	public void setM(Mundo m) {
		this.m = m;
	}
}
