package Rectangulo;

public class ejemplo {


	private int alto;
	private int ancho;
	
	public ejemplo(int alto, int ancho) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public int area() {
		
		
		return alto*ancho;
	}
	
	
	public int perimetro() {
		return 2 * ancho +  2*alto;
		
	}
	
	
}
