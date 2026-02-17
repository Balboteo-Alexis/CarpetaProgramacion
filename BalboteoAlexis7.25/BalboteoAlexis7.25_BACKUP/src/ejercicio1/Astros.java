package ejercicio1;

public abstract class Astro {

	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables

	protected int masaCuerpo;
	protected int diametroMedio;
	protected int periodoRotEje;
	protected int traslacion;
	protected int gravedad;

	// Metodos

	public abstract int getMasaCuerpo() ;

	public abstract int getDiametroMedio() ;

	public abstract int getPeriodoRotEje() ;

	public abstract int getTraslacion() ;

	public abstract int getGravedad();

	public abstract void setMasaCuerpo(int masaCuerpo) ;

	public abstract void setDiametroMedio(int diametroMedio);

	public abstract void setPeriodoRotEje(int periodoRotEje) ;

	public abstract void setTraslacion(int traslacion);

	public abstract void setGravedad(int gravedad);

	public abstract String toString();

}
