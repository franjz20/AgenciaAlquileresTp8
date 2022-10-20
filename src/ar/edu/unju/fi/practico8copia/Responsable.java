package ar.edu.unju.fi.practico8copia;

public class Responsable {

	private int dni;
	private String nombre;
	
	//----------------------------CONSTRUCTORES----------------------------
	public Responsable() {
		// TODO Auto-generated constructor stub
	}

	public Responsable(int dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	//--------------------------METODOS ACCESORES---------------------------
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//------------------------METODOS---------------------------------------
	@Override
	public String toString() {
		return "Responsable [Dni=" + dni + ", Nombre=" + nombre + "]";
	}
	
}
