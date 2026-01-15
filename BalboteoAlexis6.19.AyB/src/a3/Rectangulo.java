package a3;

public class Rectangulo {
	
	int x1;
	int x2;
	int y1;
	int y2;
	
	public Rectangulo(int x1,int y1,int x2,int y2) {
		
		this.x1 =x1;
		this.x2 =x2;
		this.y1 =y1;
		this.y2 =y2;
		
		if(x1>x2||y1>y2) {
			throw new IllegalArgumentException("Valores incorrectos.");
		}
		
	}
	

}
