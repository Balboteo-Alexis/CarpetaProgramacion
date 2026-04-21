package ejercicioA1;

import java.io.File;

public class Principal {

	public static void main(String[] args) {

		
		
		
		
		
	}
	
	
	public void muestrainfoRuta(File ruta) {
		
		if(ruta.isFile()) {
			
			System.out.println(ruta.toString());
			
		}else if(ruta.isDirectory()) {
			System.out.println(ruta.toString());
			
		}
		
	}
	
	

}
