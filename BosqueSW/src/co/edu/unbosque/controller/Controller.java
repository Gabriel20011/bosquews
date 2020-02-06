package co.edu.unbosque.controller;
import co.edu.unbosque.model.*;

public class Controller {
	private Mundo m;
	
	public Controller() {
		m = new Mundo();
	}
	public void agregarComission(String cedula, String nombre, String apellido, char genero, String telefono,
			double salarioBase, String correo, String direccion, int anio, double venta) {
		PersonalComission p = new PersonalComission(cedula, nombre, apellido, genero, telefono, salarioBase, correo, direccion, anio, venta);
		if(buscar(cedula)==null) {
			m.getPersonal().add(p);			
		}
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
		if(per!=null) {
			per.setNombre(nombre);
			per.setApellido(apellido);
			per.setTelefono(telefono);
			per.setDireccion(direccion);
			per.setCorreo(correo);			
		}
	}
	public void eliminar(String cedula) {
		Personal per = buscar(cedula);
		if(per!=null) {
			m.getPersonal().remove(per);
		}
	}
	public Personal buscar(String cedula) {
		Personal per = null;
		for (int i = 0; i < m.getPersonal().size(); i++) {
			if(m.getPersonal().get(i).getCedula().equals(cedula)) {
				per = m.getPersonal().get(i);
			}
		}
		return per;
	}
	public Mundo getM() {
		return m;
	}

	public void setM(Mundo m) {
		this.m = m;
	}

}
