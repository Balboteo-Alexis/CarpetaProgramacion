package a4;

public class Articulo {
	
	String nombre;
	int precio;
	byte iva = 21;
	int cuantosQuedan;
	
	public Articulo(String nombre, int precio, byte iva, int cuantosQuedan) {
		
		this.nombre = nombre;
		this.iva = iva;
		this.precio = precio;
		this.cuantosQuedan=cuantosQuedan;
		
		
		
	}
	
	

}
