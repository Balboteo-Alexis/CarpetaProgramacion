package ejercicio8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Cliente> agenda  = new ArrayList<Cliente>();		
		
		for(int i = 0 ; i<30; i++) {
			
			agenda.add(agregarCliente());
			
		}
		
		
		
		
		
		
		
		
		
		
		int opcion;
		
		
		
		do {
		    System.out.println("------- MENÚ CLIENTE --------");
		    System.out.print(
		        "1.- Añadir teléfono a un cliente.\n"
		      + "2.- Mostrar un teléfono por índice de un cliente.\n"
		      + "3.- Buscar teléfonos que contienen una cadena en un cliente.\n"
		      + "4.- Añadir producto a las compras de un cliente.\n"
		      + "5.- Eliminar un producto de las compras de un cliente.\n"
		      + "6.- Ver productos comprados (ordenados alfabéticamente) de un cliente.\n"
		      + "7.- Ver total de unidades compradas por un cliente.\n"
		      + "8.- Salir del programa\n"
		      + "------------------\n\n"
		      + "¿Cuál es tu elección?: "
		    );
		    
		    opcion = teclado.nextInt();
		    
		    teclado.nextLine();
		    
		    
		    
		    switch (opcion) {
		        case 1:
		        	
		        	agenda.get(0).addTelefono("76234678324");
		        	
		        	
		            break;
		        case 2:
		        	
		        	
		        	System.out.println(agenda.get(3).getTelefono(0));
		        	
		            break;
		        case 3:
		        	
		        	System.out.println(agenda.get(5).buscarTelefono("9")); 
		        	
		        	
		        	
		            break;
		        case 4:
		        	
		            break;
		        case 5:
		        	
		            break;
		            
		        case 6:
		        	
		            break;
		        case 7:
		        	
		            break;
		        case 8:
		        	
		            System.out.println("Saliendo del programa...");
		            break;
		        default:
		            System.out.println("Opción no válida. Intenta de nuevo.");
		    }
		    
		    System.out.println("\n\n");
		} while (opcion != 8);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Cliente agregarCliente() {
		
		
		String[] nombres = {"pepe","leon","oscar","ale","fede","paulinho","carvajal","leopo","leandro"};
		
		String[] emails = {"coconut@gmail.com","cosa@gmail.com","lulu@gmail.com","ferr@gmail.com","manolin@gmail.com","feddde@gmail.com","nano@gmail.com","sdfdse@gmail.com"};
		
		String[] telefonosss = {"234234234","234234234","89779879","67567567567","5637678","021367874"};
		
		String[] productos = {"pan","sol","nube","chuches","armario","mesa","almohada"};
		
		Cliente cliente;
		
		String nombre = nombres[(int)(Math.random()*9)];
		String email = emails[(int)(Math.random()*8)]; 
		ArrayList<String> telefono = new ArrayList<String>();
		telefono.add(telefonosss[(int)(Math.random()*6)]) ;
		HashMap<String, Integer> compras = new HashMap<String, Integer>();
		compras.put(productos[(int)(Math.random()*6)], (int)(Math.random()*10));
		
		
		cliente = new Cliente(nombre, email, telefono, compras);
		
		
		
		
		return cliente;
	}
	
	
	

}
