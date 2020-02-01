package co.edu.unbosque.model;

public class Mundo  {
	private EngenieerJunior eJunior;
	private EngenieerSenior eSenior;
	private PersonalComission pComission;
	
	public Mundo() {
		eJunior = new EngenieerJunior();
		eSenior = new EngenieerSenior();
	}

	public EngenieerJunior geteJunior() {
		return eJunior;
	}
	public void seteJunior(EngenieerJunior eJunior) {
		this.eJunior = eJunior;
	}
	public EngenieerSenior geteSenior() {
		return eSenior;
	}
	public void seteSenior(EngenieerSenior eSenior) {
		this.eSenior = eSenior;
	}
}
