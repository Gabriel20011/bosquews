package co.edu.unbosque.model;
import java.io.Serializable;

public abstract class Personal implements Serializable {
	
	/**
	 * Esta clase es la base que representa las caracteristicas mas generales de un empleado de BosqueSW
	 * 
	 * Debido a que la clase es abstracta, entonces no habra instancias de esta clase, pero otras clases heredaran
	 * estas caracteristicas.
	 * 
	 */
	
	private String cedula;
	private String nombre;
	private String apellido;
	private char genero;
	private String telefono;
	private double salarioBase;
	private String correo;
	private String direccion;
	private int anio;
	
	
	/**
	 * Este es el constructor de la clase la cual definira los atributos generales de cualquier personal de BosqueSW
	 * 
	 * <b>post</b> se habra rellendado los datos basicos de cualquier personal de la empresa BosqueSW  
	 * 
	 * @param cedula referencia a la cedula personal del empleado
	 * @param nombre referencia al nombre del empleado
	 * @param apellido referencia al apellido del personal
	 * @param genero un char que identifica el sexo del personal
	 * @param telefono numero telefonico de contacto del personal
	 * @param salarioBase salario inicial que poseera el 
	 * @param correo correo electronico del personal
	 * @param direccion referencia a la direccion fisica del personal
	 * @param anio año de entrada a la empresa 
	 */
	public Personal(String cedula, String nombre, String apellido, char genero, String telefono, double salarioBase,
			String correo, String direccion, int anio) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.telefono = telefono;
		this.salarioBase = salarioBase;
		this.correo = correo;
		this.direccion = direccion;
		this.anio = anio;
	}

	/**
	 * Este metodo abstracto sera heredado por otras clases para su debida implementacion
	 * 
	 * <b>post</b> se usara este metoddo para calcular el salario que ganara cada personal de acuerdo a su condicion
	 * 
	 * @return el salario que tendra cada personal
	 */
	public abstract double calcularSalario();
	
	/**
	 * Este metodo obtiene la celula de un cierto personal
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * 
	 * @return Cedula una cadena de caracteres que representan la cedula de un personal
	 */
	public String getCedula() {
		return cedula;
	}
	
	/**
	 * Este metodo recoge una nueva cedula en caso de necesitar modificar el dato especifico
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * <b>post</b> se modificara la cedula (atributo) de cierto personal
	 * 
	 * @param cedula La nueva cedula con la que se identificara al personal
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * Este metodo obtiene el nombre de un cierto personal
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * 
	 * @return una cadena de caracteres que representan el nombre de un personal
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Este metodo recoge un nuevo nombre en caso de necesitar modificar el dato especifico
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * <b>post</b> se modificara el nombre (atributo) de cierto personal
	 * 
	 * @param nombre El nuevo nombre con el que se identificara al personal
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Este metodo obtiene el apellido de un cierto personal
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * 
	 * @return una cadena de caracteres que representan el apellido de un personal
	 */
	
	public String getApellido() {
		return apellido;
	}
	/**
	 * Este metodo recoge un nuevo apellido en caso de necesitar modificar el dato especifico al personal
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * <b>post</b> se modificara el apellido (atributo) de cierto personal
	 * 
	 * @param apellido EL nuevo apellido con el que se identificara al personal
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * Este metodo obtiene el sexo  de un cierto personal
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * 
	 * @return una cadena de caracteres que representan la cedula de un personal
	 */
	
	public char getGenero() {
		return genero;
	}
	/**
	 * Este metodo recoge un carater para identificar el cambio de sexo en caso de necesitar modificar el dato especifico en cierto personal
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * <b>post</b> se modificara el sexo (atributo) de cierto personal
	 * 
	 * @param genero El nuevo sexo con el que se identificara al personal
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}
	/**
	 * Este metodo obtiene la celula de un cierto personal
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * 
	 * @return una cadena de caracteres que representan la cedula de un personal
	 */
	
	public String getTelefono() {
		return telefono;
	}
	/**
	 * Este metodo recoge un nuevo numero telefonico en caso de necesitar modificar este dato especifico en cierto personal
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * <b>post</b> se modificara el numero telefonico (atributo) de cierto personal
	 * 
	 * @param telefono El nuevo numero telefonico el que se identificara al personal
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * Este metodo obtiene la celula de un cierto personal
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * 
	 * @return una cadena de caracteres que representan el salarioBase de un personal
	 */
	
	public double getSalarioBase() {
		return salarioBase;
	}
	/**
	 * Este metodo recoge una salario en caso de necesitar modificar este dato especifico
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * <b>post</b> se modificara el salarioBase (atributo) de cierto personal
	 * 
	 * @param salarioBase El nuevo salario base que se asignara al personal
	 */
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}/**
	 * Este metodo obtiene la celula de un cierto personal
	 * 
	 * <b>pre</b> un personal debe haber sido creado
	 * 
	 * @return una cadena de caracteres que representan el correo de un personal
	 */
	
	public String getCorreo() {
		return correo;
	}
	/**
	 * Este metodo recoge una nueva cedula en caso de necesitar modificar el dato especifico
	 * 
	 * <b>pre<b/> un personal debe haber sido creado
	 * <b>post<b/> se modificara la cedula (atributo) de cierto personal
	 * 
	 * @param cedula La nueva cedula con la que se identificara al personal
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * Este metodo obtiene la celula de un cierto personal
	 * 
	 * <b>pre<b/> un personal debe haber sido creado
	 * 
	 * @return una cadena de caracteres que representan la direccion de un personal
	 */
	
	public String getDireccion() {
		return direccion;
	}
	/**
	 * Este metodo recoge una nueva direccion en caso de necesitar modificar este dato especifico
	 * 
	 * <b>pre<b/> un personal debe haber sido creado
	 * <b>post<b/> se modificara la dureccion (atributo) de cierto personal
	 * 
	 * @param cedula La nueva direccion con la que se identificara al personal
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * Este metodo obtiene el año de ingreso de un cierto personal
	 * 
	 * <b>pre<b/> un personal debe haber sido creado
	 * 
	 * @return una cadena de caracteres que representan el anio de ingreso de un personal
	 */
	
	public int getAnio() {
		return anio;
	}
	/**
	 * Este metodo recoge un nuevo anio en caso de necesitar modificar este dato especifico
	 * 
	 * <b>pre<b/> un personal debe haber sido creado
	 * <b>post<b/> se modificara la dureccion (atributo) de cierto personal
	 * 
	 * @param cedula EL anio de ingreso con la que se identificara al personal
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
}
