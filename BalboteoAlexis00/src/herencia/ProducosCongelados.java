package herencia;

import java.time.LocalDate;

public class ProducosCongelados extends Empresa {
	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables

	private short mesesConserva;
	private short tempRecomendada;
	
	public ProducosCongelados(String nombreProducto, LocalDate fechaCaducidad, int numLote) {
		super(nombreProducto, fechaCaducidad, numLote);
		
		
		this.mesesConserva = mesesConserva;
		this.tempRecomendada = tempRecomendada;
		
	}

}
