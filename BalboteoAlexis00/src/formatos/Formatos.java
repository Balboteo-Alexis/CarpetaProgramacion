package formatos;

public class Formatos {

	public static void main(String[] args) {
		
		boolean b=true;
		String d= String.format("Resultado: %b", b);      // boolean -------------------------------
		System.out.println (d);
		
		String cad="hola mundo";
		String e= String.format("Resultado: %s", cad);   //string------------------------------
		System.out.println (e);	
		
		int i=10;
		String f= String.format("Resultado: %d", i);     // entero------------------------------
		System.out.println (f);
		
		double m=10.5;
		String g= String.format("Resultado: %E", m);  //cientifica
		System.out.println (g);
		
		float k = 10.5f;
		String h = String.format("Resultado: %.2f", k);         //decimal------------------------------
		System.out.println (h); 
			
		double j=10.5;
		String l= String.format("Resultado: %g", j);//cientifica 
		System.out.println (l);
				
		
		
		System.out.printf("hola caracola %s",cad);
		
		
		
		
	}

}
