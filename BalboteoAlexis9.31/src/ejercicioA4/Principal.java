package ejercicioA4;

import java.io.File;

public class Principal {

	public static void main(String[] args) {

		
		File misCosas = new File("C:\\Users\\DAM1\\Documents\\Programación\\BalboteoAlexis9.31\\DOCS\\Mis cosas");
		
		File alfabeto = new File("C:\\Users\\DAM1\\Documents\\Programación\\BalboteoAlexis9.31\\DOCS\\Alfabeto");
		
		misCosas.mkdir();
		alfabeto.mkdir();
		
		
		for (int i = 65; i < 91; i++) {
			
			
			File nueva = new File("C:\\Users\\DAM1\\Documents\\Programación\\BalboteoAlexis9.31\\DOCS\\Alfabeto\\" +  (char)i );
			
			nueva.mkdir();
			
			
		}
		
		
	}
	
	
	
	

}
