package a3;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(0,5,0,5);
		Rectangulo r2 = new Rectangulo(7,2,9,3);
		

//		r1.x1 = 0;
//		r1.x2 = 5;
//		r1.y1 = 0;
//		r1.y2 = 5;
//		
//		r2.x1 = 7;
//		r2.x2 = 2;
//		r2.y1 = 9;
//		r2.y2 = 3;
//		
//		
		System.out.printf("Primer rectangulo%n"
				+ "cord x1: %d"
				+ "cord y1: %d%n"
				+ "cord x2: %d"
				+ "cord y2: %d%n"
				+ "el perimetro es: %d%n"
				+ "el area es: %d",  r1.x1,r1.x2, r1.y1,r1.y2,r1.x1+r1.x2+ r1.y1+r1.y2, r1.x1*r1.y1 );
		
		System.out.println("\n");
		
		System.out.printf("Segundo rectangulo%n"
				+ "cord x1: %d"
				+ "cord y1: %d%n"
				+ "cord x2: %d"
				+ "cord y2: %d%n"
				+ "el perimetro es: %d%n"
				+ "el area es: %d.",  r2.x1,r2.x2, r2.y1,r2.y2, r2.x1+r2.x2+ r2.y1+r2.y2,r2.x1*r2.y1);
	}
	
	
	
	
	

}
