package a1;

public class Main {

	public static void main(String[] args) {
		
	
		Puntos p1 = new Puntos(5,0);
		Puntos p2 = new Puntos(10,10);
		Puntos p3 = new Puntos(-3,7);
		
//		p1.x = 5;
//		p1.y= 0;
//		p2.x =10;
//		p2.y =10;
//		p3.x =-3;
//		p3.y =7;

		System.out.println(p3.y);
		System.out.println(p1.x);
		System.out.println(p2.y +"\n\n");
		
		p3.y++;
		p1.x= p1.x+3;
		p2.y = p1.x*p2.y;
		
		System.out.println(p3.y);
		System.out.println(p1.x);
		System.out.println(p2.y);
		
	}

}
