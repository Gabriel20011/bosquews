package co.edu.unbosque.model;
import java.util.ArrayList;

public class Mundo  {
	//E stands for employees
	//P stands for personal
	j
	private ArrayList<EngenieerJunior> eJunior;
	private ArrayList<EngenieerSenior> eSenior;
	private ArrayList<PersonalComission> pComission;
	private ArrayList<Personal> personal;
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
