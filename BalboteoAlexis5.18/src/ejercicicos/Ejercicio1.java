package ejercicicos;

import java.time.format.DateTimeFormatter;

import libtarea3.Bombilla;
import libtarea3.Utilidades;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("Trabajo con bombillas: \n-----------------------\n");

		// 1

		Bombilla roja, azul, amarilla, morada, rosa;

		// 2
		System.out.println("Consulta inicial:\n");
		// 2.1

		System.out.printf("Numero de bombillas creadas: %d%n", Bombilla.getBombillasCreadas());

		// 2.2

		System.out.printf("Numero de bombillas encendidas: %d%n", Bombilla.getBombillasEncendidas());

		// 3
		System.out.println("\nCreación de bombillas:");
		// 3.1

		System.out.println("Crear bombilla encendida con pontencia no valida:");

		try {
			roja = new Bombilla(true, 250);

		} catch (IllegalArgumentException ex31) {

			System.out.println(ex31.getMessage());
			roja =  new Bombilla();
		}

		// 3.2
		System.out.println("Crear bombilla con pontencia no valida:");
		try {
			azul = new Bombilla(5);
		} catch (IllegalArgumentException ex32) {

			System.out.println(ex32.getMessage());
		}

		// 3.3
		System.out.println("Crear bombilla encendida con pontencia valida:");
		try {
			amarilla = new Bombilla(true, 100);
		} catch (IllegalArgumentException ex33) {
			System.out.println(ex33.getMessage());
			amarilla = new Bombilla();
		}

		// 3.4

		morada = new Bombilla(true);

		// 3.5

		rosa = new Bombilla();

		// 4

		// 4.1

		try {
			amarilla.encender();
		} catch (IllegalStateException ex41) {
			System.out.println(ex41.getMessage());
		}
		// 4.2
		System.out.println("\nConmutando:");

		for (int i = 0; i < 6; i++) {

			amarilla.conmutar();
			System.out.println("\nEsperando");
			Utilidades.esperar(1);
			System.out.printf("Exito en la %d conmutación%n", i + 1);
		}

		// 4.3

		try {

			morada.apagar();

		} catch (IllegalStateException ex43) {
			System.out.println(ex43.getMessage());
		}

		// 4.4

		try {

			rosa.encender();

		} catch (IllegalStateException ex44) {
			System.out.println(ex44.getMessage());
		}

		// 5
		System.out.println("\n\nInformación de la primera bombilla : ");
		// 5.1
		System.out.printf("Potencia de la bombilla: %.2f %n", amarilla.getPotencia());

		// 5.2
		System.out.printf("Estado(encendida o apagada): %b %n", amarilla.getEstado());

		// 5.3

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/M/yyyy H:mm:ss");
		String fecha = amarilla.getUltimaVezEncendida().format(formato);
		System.out.println(fecha);

		// 5.4

		System.out.printf("Numero de veces encendida: %d %n", amarilla.getVecesEncendida());

		// 5.5
		System.out.printf("Tiempo que lleva encendida: %.2f segindos %n", amarilla.getTiempoEncendida());

		// 5.6

		System.out.printf("Potencia consumida: %.2f %n", amarilla.getPotenciaConsumida());

		// 6
		System.out.println("\nValores finales:");
		// 6.1

		System.out.printf("Numero de bombillas creadas: %d%n", Bombilla.getBombillasCreadas());

		// 6.2

		System.out.printf("Numero de bombillas encendidas: %d%n", Bombilla.getBombillasEncendidas());

	}

}
