package hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetvsLinkedHashSet {

	public static void main(String[] args) {
		
		
		
		int num = (int) (Math.random() * 50)+20 ;

		HashSet<Integer> conjunto1 = new HashSet<Integer>(num);

		for (int i = 0; i < num; i++) {

			int valor = (int) (Math.random() * 20);

			if (conjunto1.add(Integer.valueOf(valor))) {

				for (Integer integer : conjunto1) {
					System.out.print(integer.intValue());
				}
				System.out.println();

			}

		}
		
		System.out.println("L\n");
		
		
		TreeSet<Integer> conjunto2 = new TreeSet<Integer>();
		
		for (int i = 0; i < num; i++) {
			
			int valor = (int) (Math.random() * 20);
			
			if (conjunto2.add(Integer.valueOf(valor))) {

				
				for (Integer integer : conjunto2) {
					System.out.print(integer.intValue());
				}
				System.out.println();

			}
			
		}
		
		
		
		LinkedHashSet<Integer> conjunto3 = new LinkedHashSet<Integer>(num);
		
		for (int i = 0; i < num; i++) {
			
			int valor = (int) (Math.random() * 20);
			
			if (conjunto3.add(Integer.valueOf(valor))) {

				
				for (Integer integer : conjunto3) {
					System.out.print(integer.intValue());
				}
				System.out.println();

			}
			
		}
		
		
		

		
		
		
		
		
		

	}

}
