package co.edu.unbosque.model;
import java.util.ArrayList;
/*
 * Esta clase es al que se encarga de inicializar las respectivas arraylist en las que se guardaran los
 * diferentes empleados segun su tipo 
 * @author	Juan David Quintero
 * @author  Sergio Ortiz
 * @author  Gabriel Alejandro Ortega
 * @author  Juan Diego Fajardo
 */
public class Mundo  {
	//E stands for employees
	//P stands for personal
	private ArrayList<EngenieerJunior> eJunior;
	private ArrayList<EngenieerSenior> eSenior;
	private ArrayList<PersonalComission> pComission;
	private ArrayList<Personal> personal;

	/*
	 * Es el contructor de la clase mundo y inicializa las respectivas arraylists de la misma
	 * 
	 */
	public Mundo() {
		
		eJunior = new ArrayList<EngenieerJunior>();
		eSenior = new ArrayList<EngenieerSenior>();
		pComission = new ArrayList<PersonalComission>();
		personal = new ArrayList<Personal>();	
	}
	public ArrayList<EngenieerJunior> geteJunior() {
		return eJunior;
	}
	public void seteJunior(ArrayList<EngenieerJunior> eJunior) {
		this.eJunior = eJunior;
	}
	public ArrayList<EngenieerSenior> geteSenior() {
		return eSenior;
	}
	public void seteSenior(ArrayList<EngenieerSenior> eSenior) {
		this.eSenior = eSenior;
	}
	public ArrayList<PersonalComission> getpComission() {
		return pComission;
	}

	public void setpComission(ArrayList<PersonalComission> pComission) {
		this.pComission = pComission;
	}
	public ArrayList<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(ArrayList<Personal> personal) {
		this.personal = personal;
	}
}
