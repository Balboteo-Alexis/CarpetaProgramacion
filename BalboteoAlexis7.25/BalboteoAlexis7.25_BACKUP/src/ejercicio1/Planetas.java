package ejercicio1;

public class Planeta extends Astro {

	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables

	private int distanciaSol;
	private int orbitaSol;
	private boolean tieneSatelites;

	public int getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public int getOrbitaSol() {
		return orbitaSol;
	}

	public void setOrbitaSol(int orbitaSol) {
		this.orbitaSol = orbitaSol;
	}

	public boolean isTieneSatelites() {
		return tieneSatelites;
	}

	public void setTieneSatelites(boolean tieneSatelites) {
		this.tieneSatelites = tieneSatelites;
	}

	public String toString() {
		return "Planetas [distanciaSol=" + distanciaSol + ", orbitaSol=" + orbitaSol + ", tieneSatelites="
				+ tieneSatelites + "]";
	}

}
