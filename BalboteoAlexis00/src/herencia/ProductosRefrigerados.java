package herencia;

import java.time.LocalDate;

public class ProductosRefrigerados extends Empresa{

	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables

	private String codigoOrganismo;
	private short tempMin;
	private LocalDate fechaConsumoPreferente;

	public ProductosRefrigerados(String nombreProducto, LocalDate fechaCaducidad, int numLote,
			String codigoOrganismo, short tempMin, LocalDate fechaConsumoPreferente) {
		super(nombreProducto, fechaCaducidad, numLote);
		
		this.codigoOrganismo = codigoOrganismo;
		this.tempMin = tempMin;
		this.fechaConsumoPreferente = fechaConsumoPreferente;
		
		
		
	}
}
