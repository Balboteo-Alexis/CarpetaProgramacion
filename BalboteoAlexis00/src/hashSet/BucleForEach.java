package hashSet;

import java.util.HashSet;

public class BucleForEach {

	public static void main(String[] args) {
		
		int num =10;
		
		HashSet<Integer> conjunto = new HashSet<Integer>(num);

		for (int i = 0; i < num; i++) {

			int valor = (int) (Math.random() * 10);

			if (!conjunto.add(Integer.valueOf(valor))) {

//				System.out.println("numero: " + valor + " no se ha introducido por duplicado");

			}

		}
		System.out.println(conjunto.size() + " " + conjunto);
		
		System.err.println("suma total de pares = " +sumarPar(conjunto));
		System.out.println("suma total de impares = " +sumarImpar(conjunto));
		
		

	}
	     
	
	
	
	
	public static int sumarPar(HashSet <Integer> conjunto) {
		int resultado = 0;
		
		for (Integer i : conjunto) {
			if(i %2 == 0) {
				resultado = resultado + i.intValue();
			}
		}
		
		
		
		return resultado;
		
	}
	
	public static int sumarImpar(HashSet <Integer> conjunto) {
		int resultado = 0;
		
		for (Integer i : conjunto) {
			if(i %2!= 0) {
				resultado = resultado + i.intValue();
			}
		}
		
		
		
		return resultado;
		
	}
	
	

}
