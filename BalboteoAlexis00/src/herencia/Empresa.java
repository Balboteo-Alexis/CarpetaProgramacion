package herencia;

import java.time.LocalDate;

public class Empresa {

	// Atributos de clase constantes

	// Atributos de clase variables
	private final short cont = 0;

	// Atributos de objeto inmutables

	protected final String codigo;
	protected final String nombreProducto;
	protected final LocalDate fechaCaducidad;
	protected final int numLote;

	// Atributos de objeto variables

	// constructores

	public Empresa(String nombreProducto, LocalDate fechaCaducidad, int numLote) {

		this.codigo = generarCodigo();
		this.nombreProducto = nombreProducto;
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public String generarCodigo() {

		String codigo;

		codigo = String.format("00", cont);

		return codigo;
	}

}
