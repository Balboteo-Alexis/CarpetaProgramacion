/*
 * Descripción:
 * Autor: Alexis Balboteo González
 * Fecha: 28/01/2026
 */

package ejercicio2;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaramos variables
		CuentaBancaria alexis_1, alexis_2= new CuentaBancaria(), alexis_3= new CuentaBancaria();

		// instanciamos variables

		alexis_1= null;
		
		boolean error = true;
		while (error) {
			try {
				alexis_1 = new CuentaBancaria(1000, LocalDate.now(), valorAleatorio());
				error = false;
				System.out.println("Cuenta creada con exito \n" + alexis_1.toString());

			} catch (IllegalArgumentException ex31) {

				System.out.println(ex31.getMessage());
				error = true;
				alexis_1= null;
				
				}

		}

		error = true;
		while (error) {
			try {
				alexis_2 = new CuentaBancaria(1000, LocalDate.now(), valorAleatorio());
				error = false;
				System.out.println("Cuenta creada con exito \n" + alexis_2.toString());
			} catch (IllegalArgumentException ex31) {

				System.out.println(ex31.getMessage());
				error = true;


			}

		}

		error = true;
		while (error) {
			try {
				alexis_3 = new CuentaBancaria(1000, LocalDate.now(), valorAleatorio());
				error = false;
				System.out.println("Cuenta creada con exito \n" + alexis_3.toString());
			} catch (IllegalArgumentException ex31) {

				System.out.println(ex31.getMessage());
				error = true;


			}

		}
		
		
		// 4 indica que cuenta tiene menor limite
				System.out.println("\n");
		

		if(alexis_1.getLimiteDescubierto()<alexis_2.getLimiteDescubierto()) {
			
			if(alexis_2.getLimiteDescubierto()<alexis_3.getLimiteDescubierto()) {
				System.out.printf("La cuenta con mayor saldo es alexis_%d", alexis_3.getId()-2);
				
			}else {
				System.out.printf("La cuenta con mayor saldo es alexis_%d", alexis_2.getId()-2);
			}
			
		}else if(alexis_1.getLimiteDescubierto()<alexis_3.getLimiteDescubierto()) {
			System.out.printf("La cuenta con mayor saldo es alexis_%d", alexis_3.getId()-2);
			
			
		}else {
			System.out.printf("La cuenta con mayor saldo es alexis_%d", alexis_1.getId()-2);
		}
		
		
		
		
		
		//Realiza 5 transferencias de 300$
		
		int valor = 300;
		
		for (int i = 0; i<5;i++) {
			
			System.out.println("transferencia nº: "+ (i+1));
			
			try {
				alexis_1.transferir(valor, alexis_2);
			} catch (IllegalArgumentException ex51) {
				System.out.println(ex51.getMessage());
			} catch (IllegalStateException ex52) {
				System.out.println(ex52.getMessage());
			}
			
			
			
			
			
			System.out.println(alexis_1.toString());
			System.out.println(alexis_2.toString());
			System.out.println();
			
		}
		
		
		
		// 6 Embarga el 50% de la cuenta 3 
		
	System.out.println("\n\n  Embargo de la cuenta 3");
		try {
			alexis_3.embargar(50);
			
		} catch (IllegalArgumentException ex61) {
			System.out.println(ex61.getMessage());
		} catch (IllegalStateException ex62) {
			System.out.println(ex62.getMessage());
		}
		
		System.out.println(alexis_3.toString());
		
		
		
		// Mostarr los datos de todas las cuentas
		System.out.println();
		System.out.println("Info de cuentas y cunetas embargadas");
		System.out.println(alexis_1.toString());
		System.out.println(alexis_2.toString());
		System.out.println(alexis_3.toString());
		
		System.out.println(alexis_1.isEmbargada());
		System.out.println(alexis_2.isEmbargada());
		System.out.println(alexis_3.isEmbargada());

	}
	
	
	
	
	
	

	// genera un valor aleatorio entre -4000 y 0
	public static double valorAleatorio() {
		double valor;

		valor = (((int) (Math.random() * 400) - 400) * 10);

		return valor;
	}

}
