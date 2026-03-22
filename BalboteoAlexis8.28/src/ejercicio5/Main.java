package ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Ciudadano> poblacion = new ArrayList<Ciudadano>();
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 50; i++) {

			poblacion.add(generarCiudadano());
		}

		Collections.sort(poblacion, new Comparador());

		System.out.println(poblacion.toString());

		// 1 Un sexo determinado solicitado al usuario

		System.out.println("Buscamos hombres o mujeres( H / M ):");

		String sexoPedido = teclado.nextLine();

		char sexo = sexoPedido.toUpperCase().charAt(0);

		int numPersonas = contarSexo(poblacion, sexo);

		System.out.printf("hay un total de: %d , %s", numPersonas, sexo);

		System.out.println();

		// 2 Un estado civil determinado solicitado al usuario

		System.out.println("Estado civil: ");

		String estadoCivil = teclado.nextLine();

		int numEstado = buscarEstadoCivil(poblacion, estadoCivil);

		System.out.printf("Para lo que buscas, hay en la lista %d personas %s %n", numEstado, estadoCivil);

		// 3 Un rango de edad determinado solicitado al usuario (por décadas). Por
		// ejemplo, el usuario
		// introducirá 1995 y mostrará las personas nacidas entre 1990 y 1999.

		System.out.print("Dime un año y te mostarre quienes son de esa decada: ");

		int anno = teclado.nextInt();
		
		ArrayList<Ciudadano> ciudadanosDecada =  listaDecada(poblacion, anno);
		
		System.out.println(ciudadanosDecada.toString());
		
		
		
		// 4 Sexo y estado civil determinado solicitado al usuario
		
		
		
		System.out.println("Sexo y estado civil determinado solicitado al usuario");
		teclado.nextLine();
		System.out.println("Sexo:");
		String sexo4 = teclado.nextLine();
		System.out.println("Estado civil:");
		String estadoCivil4 =  teclado.nextLine();
		
		int resultado4 = buscaPersona(poblacion, sexo4, estadoCivil4);
		
		System.out.printf("Para tus requisitos, existen %d personas", resultado4);
		
		
		
	}
	
	
	public static int buscaPersona(ArrayList<Ciudadano> lista, String sexo, String estadoCivil) {
		
		int resultado = 0;
		
		for (Ciudadano ciudadano : lista) {
			
			if(ciudadano.getSexo().equals(sexo) && ciudadano.getEstadoCivil().equals(estadoCivil)) {
				
				resultado++; 
				
			}
				
			
		}
		
		return resultado;
	}
	

	public static ArrayList<Ciudadano> listaDecada(ArrayList<Ciudadano> lista, int anno) {

		ArrayList<Ciudadano> resultado = new ArrayList<Ciudadano>();

		int decada = anno / 10;

		for (Ciudadano ciudadano : lista) {

			int decadaCiudadano = (LocalDate.now().getYear() - ciudadano.getEdad())/10;

			
			if (decada == decadaCiudadano) {

				resultado.add(ciudadano);

			}

		}

		return resultado;

	}

	public static int buscarEstadoCivil(ArrayList<Ciudadano> lista, String estado) {

		int resultado = 0;

		for (Ciudadano ciudadano : lista) {
			if (ciudadano.getEstadoCivil().equals(estado)) {

				resultado++;
			}

		}

		return resultado;
	}

	private static Object Comparador() {
		// TODO Auto-generated method stub
		return null;
	}

	public static int contarSexo(ArrayList<Ciudadano> lista, char sexo) {

		int cont = 0;

		if (sexo == 'M') {

			for (Ciudadano ciudadano : lista) {

				if (ciudadano.getSexo() == "Mujer") {

					cont++;

				}

			}

		} else {

			for (Ciudadano ciudadano : lista) {

				if (ciudadano.getSexo() == "Hombre") {

					cont++;

				}

			}

		}

		return cont;

	}

	public static Ciudadano generarCiudadano() {

		String[] nombres = { "USER", "pepe", "jose", "manolo", "fede", "arnau", "blizcrank", "rana", "loco", "camilo" };
		String[] sexos = { "Hombre", "Mujer" };
		String[] estados = { "Soltero", "Casado", "Divorciado", "Viudo" };

		String nombre = nombres[(int) (Math.random() * 10)];
		String sexo = sexos[(int) (Math.random() * 2)];
		String estadoCivil = estados[(int) (Math.random() * 4)];
		int edad = (int) (Math.random() * 100);

		Ciudadano ciudadano;

		ciudadano = new Ciudadano(nombre, sexo, estadoCivil, edad);

		return ciudadano;

	}

}
