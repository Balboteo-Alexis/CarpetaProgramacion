package ejercicio2;

import java.time.LocalDate;

import ejercicio2.Deportivo.Traccion;

public class Principal {

	public static void main(String[] args) {
		
		Coche uno = new Coche("Alcaraz",(short) 1000, LocalDate.now(),   (short) 100,"1234AED");
		
		uno.setCilindrada((short) 3000);
		
		
		System.out.println(uno.toString());
		
		Coche dos = new Coche();
		Coche tres = new Coche();
		
		System.out.println(dos.toString());
		System.out.println(tres.toString());
		
		System.out.println();
		
		Deportivo cinco = new Deportivo("Roberto",(short) 1700, LocalDate.now(),   (short) 100,"9933AED", Traccion.DELANTERA);
		
		System.out.println(cinco.getTraccion());
		
		System.out.println(cinco.toString());
		
		
		
	}
	
	
}
