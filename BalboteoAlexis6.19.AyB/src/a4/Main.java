package a4;

public class Main {

	public static void main(String[] args) {
		
		Articulo bolsa = new Articulo("Bolsa",5,(byte)21,10);
		
//		bolsa.cuantosQuedan = 10;
//		bolsa.nombre = "Bolsa";
//		bolsa.precio = 5;
		
		System.out.printf("%s, Precio: %d IVA: %d %% - PVP: %.2f", bolsa.nombre,bolsa.precio,bolsa.iva, (double)(bolsa.precio * bolsa.iva/100.0)+bolsa.precio);
		

		bolsa.precio=10;
		System.out.println();
		
		System.out.printf("%s, Precio: %d IVA: %d %% - PVP: %.2f", bolsa.nombre,bolsa.precio,bolsa.iva, (double)(bolsa.precio * bolsa.iva/100.0)+bolsa.precio);
		
		
	}

}
