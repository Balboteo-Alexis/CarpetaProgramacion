package ejercicios;

import java.time.LocalDate;
import libtarea3.CuentaBancaria;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		// 1
		

		CuentaBancaria cuentaPrivada, cuentaConjunta, cuentaFamiliar;
		
		
		// 2 
		try {
			CuentaBancaria obj1 = new CuentaBancaria(0, LocalDate.of(2026, 9, 1));
			
		} catch (IllegalArgumentException ex21) {
			
			System.out.println(ex21.getMessage());
		}
		
		try {
			
			CuentaBancaria obj2 = new CuentaBancaria(-800);
			
		} catch (IllegalArgumentException ex22) {
			
		
			System.out.println(ex22.getMessage());
			
		}
		
		// 2.3
		
		try {
			cuentaPrivada = new CuentaBancaria(1000, LocalDate.of(2021, 7, 1),-200);
			
			
		} catch (IllegalArgumentException ex23) {
			
			System.out.println(ex23.getMessage());
			cuentaPrivada = new CuentaBancaria();
			
		}
		
		// 2.4
		
		
		try {
			cuentaConjunta = new CuentaBancaria(200, LocalDate.of(2021, 7, 1) );
			
		}  catch (IllegalArgumentException ex24) {
			
			System.out.println(ex24.getMessage());
			cuentaConjunta = new CuentaBancaria();
			
		}
		

		// 2.5 
		

			cuentaFamiliar = new CuentaBancaria( );
			
		
			
			
		// 3 
			
			
		System.out.printf("1 - id: %d %n2 - Fecha de creación: %s %n3 - : %.2f %n4 - id: %d %n "
				+ "5 - id: %d %n6 - id: %d ",cuentaPrivada.getId(), cuentaPrivada.getFechaCreacion(), cuentaPrivada.getLimiteDescubierto());
			
		
		
		
		
	}

}
