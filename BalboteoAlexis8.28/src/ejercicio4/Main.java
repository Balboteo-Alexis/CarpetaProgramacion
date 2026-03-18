package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		HashSet<Trabajador> lista = new HashSet<Trabajador>();
		

		for(int i = 0 ; i<30; i++) {
			
			lista.add(agregarTrabajador());
			
			
		}
		
		
		
		
		List<Trabajador> ordenada  =new ArrayList<Trabajador>();
		
		
		
		for (Trabajador i : lista) {
			
			ordenada.add(i);
		}
		
		Collections.sort(ordenada, new Comparador());
		System.out.println(ordenada.toString());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static Trabajador agregarTrabajador() {
		
		Trabajador random;
		
		
		String[] nombres = { "USER", "pepe", "jose", "manolo", "fede", "arnau", "blizcrank", "rana", "loco", "camilo" };
		String[ ] sexos = {"Hombre","Mujer"};
		String[] estados = { "Soltero","Casado", "Divorciado", "Viudo"};
		
		
		String nombre, sexo, estadoCivil;
		int edad, salarioBase;
		
		
		nombre = nombres[(int)(Math.random()*10)];
		sexo = sexos[(int)(Math.random()*2)];
		estadoCivil = estados[(int)(Math.random()*4)];
		edad = (int)(Math.random()*100);
		salarioBase = (int)((Math.random()*1000) + 1000);
		
		
		
		
		random = new Trabajador(nombre,  edad, sexo,  estadoCivil,salarioBase);
		
		
		return random;
	}

}
