package TRY;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EjercicioClase1 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu fecha de nacimiento");
		String  fechaNacimiento = teclado.nextLine();
		
		try {
			
			LocalDate fNacimiento = LocalDate.parse(fechaNacimiento);
			LocalDate hoy = LocalDate.now();
			Period tiempoTranscurrido = Period.between(fNacimiento, hoy);
			System.out.println(tiempoTranscurrido);
		}catch(Exception ex) {
			System.out.println("Error en la fecha");
		}
		
		teclado.close();

	}

}
