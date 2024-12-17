package claseDatos;

public class empleado {
	private String dni;
	private String nombre;
	private String apellido;
	private String categ;
	private int edad;
	private boolean clubsocial;
	private float sueldo;
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param categ
	 * @param edad
	 * @param clubsocial
	 * @param sueldo
	 */
	public empleado(String dni, String nombre, String apellido, String categ, int edad, boolean clubsocial,
			float sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.categ = categ;
		this.edad = edad;
		this.clubsocial = clubsocial;
		this.sueldo = sueldo;
		
		
	}
	
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param categ
	 * @param edad
	 * @param clubsocial
	 * @param sueldo
	 */
	public empleado(String dni, String nombre, String apellido) {
		super();
		this.dni = "";
		this.nombre = "*******";
		this.apellido = "******";
		this.categ = "base";
		this.edad = 0;
		this.clubsocial = false;
		this.sueldo = (float)0.0;
		
		
	}
	////////////Gater///////////////

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCateg() {
		return categ;
	}

	public void setCateg(String categ) {
		this.categ = categ;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isClubsocial() {
		return clubsocial;
	}

	public void setClubsocial(boolean clubsocial) {
		this.clubsocial = clubsocial;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	

