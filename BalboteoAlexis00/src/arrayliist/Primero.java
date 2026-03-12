package arrayliist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Primero {

	public static void main(String[] args) {

		int tam = 20;
		
		
		
		
		
		ArrayList<Integer> lista1 = new ArrayList<Integer>(tam);
		LinkedList<Integer> lista2 = new LinkedList<Integer>();
		
		
		
		
		for(int i = 0; i<20 ;i++) {
			
			int num = (int) (Math.random()*10 +10); 
			
			lista1.add(Integer.valueOf(num));

			
			lista2.add(Integer.valueOf(num));
			
			
		}
			
			
		System.out.println(lista1);
		System.out.println(lista2);
			
		
		
		
		
		
		
		
		
		
	}

}
