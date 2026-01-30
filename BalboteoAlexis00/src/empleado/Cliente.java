package empleado;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		
		Scanner teclado =new Scanner(System.in);
		
		Empleado camilito, ruben;
		
		camilito = new Empleado("79275696F", "Camilito", "Elpro");

		ruben = new Empleado((short)1100, (short)15, (short)10,(byte) 3, (byte)17, true, "61728365T", "Ruben ", "Gallardo");

		System.out.println("Camilito dime tu sueldo base: ");
		short sueldoB = teclado.nextShort();
		
		try {
			camilito.setSueldoBase(sueldoB);
		} catch (IllegalStateException ex2) {
			System.out.println(ex2.getMessage());
		}
		
		System.out.println("Camilito dime tus horas extra: ");
		short horasExtra = teclado.nextShort();
		
		try {
			camilito.setHorasExtrasRealizadas(horasExtra);
		} catch (IllegalStateException ex2) {
			System.out.println(ex2.getMessage());
		}
		
		System.out.println("Sueldo neto de camilito: ");
		System.out.println(camilito.sueldoBruto());
		
		
		
		
		System.out.println("\n\n Clonamos trabajador 2");
		Empleado adolfo = new Empleado("79275696F", "Camilito", "Elpro");
		adolfo.copia(ruben);
		
		
		System.out.println("Informacion de empleado 3: ");
		
		
		System.out.println("adolfo dime tu sueldo base: ");
		 sueldoB = teclado.nextShort();
		
		try {
			adolfo.setSueldoBase(sueldoB);
		} catch (IllegalStateException ex2) {
			System.out.println(ex2.getMessage());
		}
		
		System.out.println("adolfo dime tus horas extra: ");
		 horasExtra = teclado.nextShort();
		
		try {
			adolfo.setHorasExtrasRealizadas(horasExtra);
		} catch (IllegalStateException ex2) {
			System.out.println(ex2.getMessage());
		}
		
		System.out.println("Sueldo neto de adolfo: ");
		System.out.println(adolfo.sueldoBruto());
		
		
	}

}
