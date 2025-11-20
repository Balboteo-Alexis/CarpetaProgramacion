package objetos;

import java.awt.Rectangle;

public class PrimerEJ {

	public static void main(String[] args) {
		
		Rectangle  r1;
		
		r1 = new Rectangle();
		System.out.println(r1.toString());
		
		r1.x = 10;
		
		System.out.println(r1);
		
		Rectangle r2 =r1;
		
		r2.y = 5;
		System.out.println(r2);
		
		

	}

}
