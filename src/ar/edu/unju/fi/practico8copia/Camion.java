package ar.edu.unju.fi.practico8copia;

public class Camion extends Registro{

	private int kilometros;
	
	//--------------------------CONSTRUCTORES----------------------------------------------------------
	public Camion() {
		// TODO Auto-generated constructor stub
	}

	public Camion(String placa, float precio, Responsable responsable, boolean estaAlquilado, int kilometros) {
		super(placa,precio,responsable,estaAlquilado);
		this.kilometros = kilometros;
	}

	//-----------------------METODOS ACCESORES-------------------------------
	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	
	//-------------------------METODOS-------------------------------------
	
	@Override
	public float calcularPrecioXKm() {
		float precioXKm = this.precio * this.kilometros;
		return precioXKm;
	}

	@Override
	public String isAlquilado () {
		String mensaje;
		if(estaAlquilado == true) {
			mensaje = "sigue alquilado";
		}else {
			mensaje = "Devuelto";
		}
		return mensaje;
	}
	
	@Override
	public String toString() {
		return "Camion [ N° Placa=" + placa + ", Kilometros=" + kilometros
				+ ", Precio=" + precio + ", Esta Alquilado? " + isAlquilado() + "]";
	}
	
	
	
}
