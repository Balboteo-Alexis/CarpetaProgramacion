package formatos;

public class Formatos {

	public static void main(String[] args) {
		
		boolean b=true;
		String d= String.format("Resultado: %b", b);
		System.out.println (d);
		
		String cad="hola mundo";
		String e= String.format("Resultado: %s", cad);
		System.out.println (e);	
		
		int i=10;
		String f= String.format("Resultado: %d", i);
		System.out.println (f);
		
		double m=10.5;
		String g= String.format("Resultado: %E", m);
		System.out.println (g);
		
		float k = 10.5f;
		String h = String.format("Resultado: %f", k);
		System.out.println (h);
			
		double j=10.5;
		String l= String.format("Resultado: %g", j);
		System.out.println (l);
				
		
		
		
		
		
	}

}
