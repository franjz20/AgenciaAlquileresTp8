package ar.edu.unju.fi.practico8copia;


public class Registro {
	
	protected String placa;
	protected float precio;
	protected Responsable responsable;
	protected boolean estaAlquilado;
	
	//--------------------------CONSTRUCTORES-----------------------------------------------
	public Registro() {
		// TODO Auto-generated constructor stub
	}

	public Registro(String placa, float precio, Responsable responsable, boolean estaAlquilado) {
		super();
		this.placa = placa;
		this.precio = precio;
		this.responsable = responsable;
		this.estaAlquilado = estaAlquilado;
	}

	//-------------------------METODOS ACCESORES-------------------------------
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}
	
	public boolean isEstaAlquilado() {
		return estaAlquilado;
	}

	public void setEstaAlquilado(boolean estaAlquilado) {
		this.estaAlquilado = estaAlquilado;
	}
	
	//------------------------------METODOS------------------------------------------------
	
	public float calcularPrecioXKm() {
		return 0;
	}
	
	public float calcularPrecioXDia() {
		return 0;
	}

	public String isAlquilado () {
		String mensaje;
		if(estaAlquilado == true) {
			mensaje = "Si";
		}else {
			mensaje = "No";
		}
		return mensaje;
	}

	@Override
	public String toString() {
		return "Registro [placa=" + placa + ", responsable=" + responsable + ", estaAlquilado="
				+ isAlquilado() + "]";
	}
}
