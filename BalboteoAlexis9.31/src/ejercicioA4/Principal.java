package ejercicioA4;

import java.io.File;

public class Principal {

	public static void main(String[] args) {

		
		File misCosas = new File("DOCS\\Mis cosas");
		
		File alfabeto = new File("DOCS\\Alfabeto");
		
		misCosas.mkdir();
		alfabeto.mkdir();
		
		
		
		File foto = new File("DOCS\\FOTOS");
		
		
		File nuevo = new File("DOCS\\Mis cosas\\FOTOS");
		
		foto.renameTo( nuevo );
		
		
		for (int i = 65; i < 91; i++) {
			
			
			File nueva = new File("DOCS\\Alfabeto\\" +  (char)i );
			
			nueva.mkdir();
			
			
		}
		
		
	}
	
	
	
	

}
