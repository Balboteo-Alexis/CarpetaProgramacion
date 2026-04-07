/*
 * Descripción: En este .java probaremos que nuestras clases funcionan adecuadamente
 * Autor: Alexis Balboteo González
 * Fecha: 25/03/2026
 */


package balboteo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrincipalVivienda {

	public static void main(String[] args) {

		// 1. Apartamento por defecto

		System.out.println("-------------------\nApartado 1\n");
		
		Apartamento blanco = new Apartamento();

		System.out.println(blanco.toString());

		// 2. Precio 1500€/m2
		System.out.println();
		System.out.println("-------------------\nApartado 2\n");
		double precio = blanco.calcularPrecio(1500);

		System.out.printf("El precio para la casa a un valor de 1500/m2 es de : %.2f euros ", precio);

		// 3. Apartamento con datos usuario
		System.out.println();
		System.out.println("-------------------\nApartado 3\n");
		
		System.out.println("Fecha de la reforma(yyyy MM dd):");

		String fecha = Entrada.cadena();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

		LocalDate fechaRef = LocalDate.parse(fecha, formatter);

		System.out.println("Distancia al centro en metros:");

		double distancia = Entrada.real();

		Apartamento negro = new Apartamento(fechaRef, distancia);
		
		System.out.println(negro.toString());
		

		// 4. Precio 800€/m2
		System.out.println();
		System.out.println("-------------------\nApartado 4\n");
		
		double dinero = negro.calcularPrecio(800);

		System.out.printf("El precio para la casa a un valor de 800/m2 es de : %.2f euros ", dinero);

		// 5. Unifamiliar por defecto

		System.out.println();
		System.out.println("-------------------\nApartado 5\n");
		

		Unifamiliar casita = new Unifamiliar();

		System.out.println(casita.toString());


		// 6. Unifamiliar con m2 usuario
		System.out.println();
		System.out.println("-------------------\nApartado 6\n");
		
		System.out.print("Cuantos metros para la casa: ");

		double metros2 = Entrada.real();

		Unifamiliar casaUsuario = new Unifamiliar(metros2);

		System.out.println(casaUsuario.toString());

		// 7. Es grande?
		System.out.println();
		System.out.println("-------------------\nApartado 7\n");


		System.out.println("La casa es grande ? " + casaUsuario.grande());

		// 8
		System.out.println();
		System.out.println("-------------------\nApartado 8\n");
		

		casaUsuario.setDisponible(false);

		System.out.println(casaUsuario.toString());

		System.out.println();
		System.out.println();
		// 9. Precio de venta a 1100
		
		System.out.println("-------------------\nApartado 9\n");

		double precioCasa = casaUsuario.calcularPrecio(1100);

		System.out.printf("El precio para la casa a un valor de 1500/m2 es de : %.2f euros ", precioCasa);
		System.out.println();
		// 10 patio a si

		System.out.println("-------------------\nApartado 10\n");
		
		casaUsuario.setPatio(true);

		System.out.println(casaUsuario.toString());

		// 11. Total viviendas
		System.out.println();
		System.out.println("-------------------\nApartado 11\n");

		int numVivivendas = Vivienda.getContador();

		System.out.println("El numero total de viviendas es: " + numVivivendas);

	}
}