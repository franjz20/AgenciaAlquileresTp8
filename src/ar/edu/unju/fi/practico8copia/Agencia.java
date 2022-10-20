package ar.edu.unju.fi.practico8copia;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Agencia {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		ArrayList<Registro> registros = new ArrayList<Registro>();
		
		String numPlaca = "ABC123";// variable para buscar la placa en el punto 3
		float acum = 0; // variable para acumular el importe total del punto 5 
		
		LocalDate fechaAlquiler = LocalDate.now();
		LocalDate fechaDevolucion = LocalDate.parse("2022-10-28");
		LocalDate fechaDevolucion2 = LocalDate.parse("2022-10-29");
		
		Responsable unResponsable = new Responsable(43526849,"Franco Juarez");
		Responsable dosResponsable = new Responsable(4342598,"Lionel Messi");
		Responsable tresResponsable = new Responsable(38453931,"Diego Maradona");
		Responsable cuatroResponsable = new Responsable(32987456,"Javier Mascherano");
		
		Camion unCamion = new Camion("ABC123",150,unResponsable,true,30000);
		Tractor unTractor = new Tractor("ADS312",500,dosResponsable,true,fechaAlquiler,fechaDevolucion);
		Camion dosCamion = new Camion("FRN984",150,tresResponsable,true, 25000);
		Tractor dosTractor = new Tractor("ESP210",450,cuatroResponsable,false, fechaAlquiler,fechaDevolucion2);
		
		//PUNTO 2
		registros.add(unCamion);
		registros.add(unTractor);
		registros.add(dosCamion);
		registros.add(dosTractor);
		
		//PUNTO 3
		for (Registro registro : registros) {
			if(registro.getPlaca() == numPlaca) {
				registro.setEstaAlquilado(false);
				if(registro.isEstaAlquilado() == false) {
					System.out.println("El vehiculo: "+unCamion.isAlquilado());
				}else {
					System.out.println("No se encontró la placa del vehiculo.");
				}
				System.out.println("El monto total a pagar es: $" + registro.calcularPrecioXKm());
			}
		}

		//PUNTO 4
		for (Registro registro : registros) {
			if(registro instanceof Camion) {
				if(registro.isEstaAlquilado() == true) {
					System.out.println(registro.toString());					
				}
			}
		}
		
		//PUNTO 5
		for (Registro registro : registros) {
			if(registro instanceof Camion) {
				if(registro.isEstaAlquilado() == false) {
					acum = acum + registro.calcularPrecioXKm();
				}
			}else {
				if(registro instanceof Tractor) {
					if(registro.isEstaAlquilado() == false) {
						acum = acum + registro.calcularPrecioXDia();
					}
				}
			}
		}
		
		System.out.println("El importe total de los Alquileres realizados es de $"+acum);
		
		//Punto 7 item 1 del Practico 8
		for (Registro registro : registros) {
			if(registro instanceof Camion) {
				if(registro.isEstaAlquilado() == false) {
					System.out.println(registro.toString());
				}
			}else {
				if(registro instanceof Tractor) {
					if(registro.isEstaAlquilado() == false) {
						System.out.println(registro.toString());
					}
				}
			}
		}
		
		System.out.println("------------------------------------------------------");
		//Punto 7 item 2 del Practico 8
		Period periodo = Period.between(fechaAlquiler, fechaDevolucion); 
		
		for (Registro registro : registros) {
			if(registro instanceof Tractor) {
				if(periodo.getDays() > 2) {
					System.out.println(registro.toString());
				}	
			}			
		}

		System.out.println("----------------------------------------------------------");
		//Punto 7 item 3 del Practico 8
		for (Registro registro : registros) {
			if(registro instanceof Camion) {
				double cantidadKm = ((Camion) registro).getKilometros();
				if(cantidadKm > 200) {
					System.out.println(registro.toString());
				}
			}
		}
	}

}
