/*
 * Descripción: Un programa que usa cuentasbancarias y opera con ellas
 * Autor: Alexis Balboteo González
 * Fecha: 17/12/2025
 */

package ejercicio2;

import libtarea3.CuentaBancaria;

public class Ejercicio2Bonito {

	public static void main(String[] args) {

		
//  2 Declarar 3 variables de referencia
		CuentaBancaria balboteo_1,balboteo_2,balboteo_3,balboteo_5;
		
//	3 Instanciamos las variables con el metodo saldo aleatorio
		
		System.out.println("Creamos primera cuenta");
		try {
			balboteo_1 = new CuentaBancaria(saldoAleatorio());
			System.out.println("Cuenta creada con saldo aleatorio.");
		} catch (IllegalArgumentException ex31) {
			System.out.println(ex31.getMessage());
			System.out.println("Se le ha creado la cuenta por defecto sin saldo aleatorio.\n");
			balboteo_1 = new CuentaBancaria();
		}
		System.out.println("Creamos segunda cuenta");
		try {
			balboteo_2 = new CuentaBancaria(saldoAleatorio());
			System.out.println("Cuenta creada con saldo aleatorio.");
		} catch (IllegalArgumentException ex31) {
			System.out.println(ex31.getMessage());
			System.out.println("Se le ha creado la cuenta por defecto sin saldo aleatorio.\n");
			balboteo_2 = new CuentaBancaria();
		}
		System.out.println("Creamos tercera cuenta");
		try {
			balboteo_3 = new CuentaBancaria(saldoAleatorio());
			System.out.println("Cuenta creada con saldo aleatorio.");
		} catch (IllegalArgumentException ex31) {
			System.out.println(ex31.getMessage());
			System.out.println("Se le ha creado la cuenta por defecto sin saldo aleatorio.\n");
			balboteo_3 = new CuentaBancaria();
		}
		
		System.out.printf("Información de cada cuenta: %n%nCuenta: %d , %s %nCuenta: %d , %s %nCuenta: %d , %s %n%n" 
						    ,  balboteo_1.getId()+1, balboteo_1.toString(),balboteo_2.getId()+1, balboteo_2.toString(),balboteo_3.getId()+1, balboteo_3.toString());
		

//4 indica que cuenta tiene mayor saldo
		
		
		if(balboteo_1.getSaldo()<balboteo_2.getSaldo()) {
			
			if(balboteo_2.getSaldo()<balboteo_3.getSaldo()) {
				System.out.printf("La cuenta con mayor saldo es balboteo_%d%n", balboteo_3.getId()+1);
				
			}else {
				System.out.printf("La cuenta con mayor saldo es balboteo_%d%n", balboteo_2.getId()+1);
			}
			
		}else if(balboteo_1.getSaldo()<balboteo_3.getSaldo()) {
			System.out.printf("La cuenta con mayor saldo es balboteo_%d%n", balboteo_3.getId()+1);
			
			
		}else {
			System.out.printf("La cuenta con mayor saldo es balboteo_%d%n", balboteo_1.getId()+1);
		}
		
		
		System.out.println();
// 5 ingresamos 1000 a balboteo_1
		
		
		try {
			balboteo_1.ingresar(1000);
		} catch (IllegalArgumentException ex51) {
			System.out.println(ex51.getMessage());
		} catch (IllegalStateException ex52 ) {
			System.out.println(ex52.getMessage());
		}
		
		
		
		
// 6 ingresamos y extraemos de la cuenta
		
		int cont= 0;
		
		while(cont!= 10 || balboteo_1.isDescubierta()) {
			
			switch (cont) {
			case 0,2,4,6,8: {
				try {
					int ingreso = saldoAleatorio();
					System.out.printf("Ingreso de %d %n" , ingreso);
					balboteo_1.ingresar(ingreso);
						
				} catch (IllegalArgumentException ex51) {
					
				} catch (IllegalStateException ex52 ) {
					
				}
				
				
				break;
			}
			default:
				try {
					int retirada = saldoAleatorio();
					System.out.printf("Retirada de %d %n", retirada);
					balboteo_1.extraer(retirada);
					
				} catch (IllegalArgumentException ex53) {
					
				} catch (IllegalStateException ex54 ) {
					
				}
				
			}
			System.out.printf("Operación: %d ,La cuenta se ha quedado con un total de: %.0f euros.%n%n", cont+1, balboteo_1.getSaldo());
			cont ++;
			

		}
		
	
		//POR QUÉ ESTÁ MAL?  QUE ES LO QUE SE PIDE ENTONCES?
		

	}
	
// 1 Crear un metodo saldoAleatorio
	
// Metodo para calcular un numero del -3000.00 al 3000.00 con las decenas y unidades sea 00
	public static int saldoAleatorio() {

		int valor;
		valor =  ((int) (Math.random() * 60 - 30)) * 100;

		return valor;
	}

}
