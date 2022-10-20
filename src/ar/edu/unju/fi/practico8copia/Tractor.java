package ar.edu.unju.fi.practico8copia;

import java.time.LocalDate;
import java.time.Period;

public class Tractor extends Registro{

	private LocalDate fechaAlquiler;
	private LocalDate fechaDevolucion;

	//----------------------------CONSTRUCTORES---------------------------------------
	public Tractor() {
		// TODO Auto-generated constructor stub
	}

	public Tractor(String placa, float precio, Responsable responsable,boolean estaAlquilado, LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
		super(placa,precio,responsable,estaAlquilado);
		this.fechaAlquiler = fechaAlquiler;
		this.fechaDevolucion = fechaDevolucion;
	}

	//---------------------------METODOS ACCESORES------------------------------------------
	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	//------------------------------METODOS---------------------------------------------
	
	@Override
	public float calcularPrecioXDia() {
		Period periodo = Period.between(fechaAlquiler, fechaDevolucion);
		float precioXDia = periodo.getDays() * this.precio;
		return precioXDia;
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
		return "Tractor [ Fecha Alquiler=" + fechaAlquiler + ", Fecha Devolucion=" + fechaDevolucion + ", Placa=" + placa
				+ ", Precio=" + precio + ", Esta Alquilado? " + isAlquilado() + "]";
	}
	
}
