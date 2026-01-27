package claseBombilla;

public class Main {

	public static void main(String[] args) {
		

		Bombilla azul, roja, blanca;
		
		azul = new Bombilla();
		roja = new Bombilla(true);
		blanca = new Bombilla(false);
		
		try {
			azul.apagar();
			
		} catch (IllegalStateException ex1) {
			System.out.println("Bombilla ya apagada");
		}
				
		System.out.println("azul "+ azul.toString()+"\n");
		
		try {
			blanca.apagar();
			
		} catch (IllegalStateException ex1) {
			System.out.println("Bombilla ya apagada");
		}
		System.out.println("blanca " + blanca.toString()+"\n");
		
		roja.conmutar();
		
		System.out.println("roja "+ roja.toString());
		
		System.out.println("cuantas bombillas hay en total: " +azul.getBombillasTotales());
		
		
		
		
	}

}
