package balboteo;

import java.time.LocalDate;

public class Motocicleta extends TransportesPlayamar {

	// Atributos de clase constantes
	public static final short CILINDRADA_DEF= 100;
	public static final boolean CAJON_DEF = false;

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables

	private short cilindrada;
	private boolean cajon;

	public Motocicleta(String matricula, LocalDate fechaMatriculacion, boolean itv, int tarifaBase, short cilindrada,
			boolean cajon) throws IllegalArgumentException {
		super(matricula, fechaMatriculacion, itv, tarifaBase);

		this.cilindrada = cilindrada;
		this.cajon = cajon;

	}

	public double calcularTransporte(int kilometros) {

		double precio;

		precio = this.tarifaBase * kilometros;
		if (this.cajon) {
			precio += 15;
		}

		return precio;
	}

	public boolean isCajon() {
		return this.cajon;
	}

	@Override
	public String toString() {

		String frase = super.toString() + "\nMotocicleta [cilindrada=" + cilindrada + ", cajon=" + cajon + "]";

		return frase;
	}

}
