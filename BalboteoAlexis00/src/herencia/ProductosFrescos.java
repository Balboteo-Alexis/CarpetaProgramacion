package herencia;

import java.time.LocalDate;

public class ProductosFrescos extends Empresa {

	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables

	private LocalDate fechaEnvasado;
	private String paisOrigen;

	
	
	public ProductosFrescos(String nombreProducto, LocalDate fechaCaducidad, int numLote,
			LocalDate fechaEnvasado, String paisOrigen) {
		super(nombreProducto, fechaCaducidad, numLote);
		
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
		

	}
	
	
	
	
	
	
	
	
	
	
	
	

}