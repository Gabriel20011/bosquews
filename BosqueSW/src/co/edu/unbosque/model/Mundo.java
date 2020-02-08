package co.edu.unbosque.model;
import java.util.ArrayList;

public class Mundo  {
	//E stands for employees
	//P stands for personal
	/**
	 * Es el arraylist de EngenieerJunior
	 */
	private ArrayList<EngenieerJunior> eJunior;
	/**
	 * Es el arraylist de EngenieerSenior
	 */
	private ArrayList<EngenieerSenior> eSenior;
	/**
	 * Es el arraylist de PersonalComission
	 */
	private ArrayList<PersonalComission> pComission;
	/**
	 * Es el arraylist de personal
	 */
	private ArrayList<Personal> personal;
	/**
	 * Es el constructor de la clase donde se inicializan los arraylist
	 * <b> post </b> obtener los arraylist inicializados
	 */
	public Mundo() {
		
		eJunior = new ArrayList<EngenieerJunior>();
		eSenior = new ArrayList<EngenieerSenior>();
		pComission = new ArrayList<PersonalComission>();
		personal = new ArrayList<Personal>();	
	}
	/**
	 * Metodo donde se obtiene el arraylist
	 * <b> post </b> obtener los valores del arraylist
	 * @return eJunior obtiene el valor del Arraylist
	 */
	public ArrayList<EngenieerJunior> geteJunior() {
		return eJunior;
	}
	/**
	 * Metodo para actulizar los datos del Arraylist
	 * <b> post </b> actualizar los valores del Arraylist
	 * @param eJunior es el arraylist de ingeniero
	 */
	public void seteJunior(ArrayList<EngenieerJunior> eJunior) {
		this.eJunior = eJunior;
	}
	/**
	 * Metodo donde se obtiene el arraylist
	 * <b> post </b> obtener los valores del arraylist
	 * @return eSenior obtiene el valor del Arraylist
	 */
	public ArrayList<EngenieerSenior> geteSenior() {
		return eSenior;
	}
	/**
	 * Metodo para actulizar los datos del Arraylist
	 * <b> post </b> actualizar los valores del Arraylist
	 * @param eSenior es el arraylist de ingeniero
	 */
	public void seteSenior(ArrayList<EngenieerSenior> eSenior) {
		this.eSenior = eSenior;
	}
	/**
	 * Metodo donde se obtiene el arraylist
	 * <b> post </b> obtener los valores del arraylist
	 * @return pComision obtiene el valor del Arraylist
	 */
	public ArrayList<PersonalComission> getpComission() {
		return pComission;
	}
	/**
	 * Metodo para actulizar los datos del Arraylist
	 * <b> post </b> actualizar los valores del Arraylist
	 * @param pComision es el arraylist de ingeniero
	 */
	public void setpComission(ArrayList<PersonalComission> pComission) {
		this.pComission = pComission;
	}
	/**
	 * Metodo donde se obtiene el arraylist
	 * <b> post </b> obtener los valores del arraylist
	 * @return personal obtiene el valor del Arraylist
	 */
	public ArrayList<Personal> getPersonal() {
		return personal;
	}
	/**
	 * Metodo para actulizar los datos del Arraylist
	 * <b> post </b> actualizar los valores del Arraylist
	 * @param personal es el arraylist de ingeniero
	 */
	public void setPersonal(ArrayList<Personal> personal) {
		this.personal = personal;
	}
}
