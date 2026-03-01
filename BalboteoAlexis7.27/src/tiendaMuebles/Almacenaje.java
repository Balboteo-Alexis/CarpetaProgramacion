package tiendaMuebles;

import java.util.Arrays;

public abstract class Almacenaje extends Mueble implements Personalizable {

	// atributos

	public static final byte MIN_MODULOS = 1;
	public static final byte MAX_MODULOS = 20;

	protected final int numMaxModulos;

	protected double anchura;
	protected double altura;

	protected Modulo[] array;
	protected int numModulosAnyadidos = MIN_MODULOS;

	// Constructor

	public Almacenaje(double precio,String descripcion,   double anchura, double altura, int numMaxModulos)
			throws IllegalArgumentException {
		super(descripcion, precio);

		if (numMaxModulos > MAX_MODULOS || numMaxModulos < MIN_MODULOS) {
			throw new IllegalArgumentException(
					" ERROR: No se puede crear el mueble de Almacenaje. El número de módulos no está en el rango permitido");
		}

		this.anchura = anchura;
		this.altura = altura;
		this.numMaxModulos = numMaxModulos;

		array = new Modulo[numMaxModulos];

		array[0] = Modulo.BALDA; 

	}

	// metodos

	public int getNumModulos() {
		return this.numMaxModulos;
	}

	public double getAnchura() {
		return this.anchura;
	}

	public double getAltura() {
		return this.altura;
	}

	public int getModulosAnyadidos() {
		return this.numModulosAnyadidos;
	}

	public String obtenerModulos() {

		return Arrays.toString(array);

	};

	public void anyadirModulo(Modulo modulo) throws IllegalStateException, NullPointerException {
		if (modulo == null) {
			throw new NullPointerException("\"Error: el módulo a añadir no puede ser nulo");
		}
		if (this.numModulosAnyadidos == this.numMaxModulos) {
			throw new IllegalStateException("Error: no se puede añadir el módulo " + modulo
					+ ". El número de módulos no puede superar el máximo permitido: " + this.numMaxModulos);
		}

		array[this.numModulosAnyadidos++] = modulo; // se suele ver asi o mejor por separado? el ++ despues porque el array
												// empieza desde 0,
												// si lo ponemos antes dejariamos huecos vacios porque empieza en 1, o
												// deberia cambiar eso

	};

	public Modulo extraerModulo() throws IllegalStateException {

		if (this.numModulosAnyadidos == 1) {
			throw new IllegalStateException(
					" Error: no se puede quitar el módulo. El número de módulos no puede ser inferior a "
							+ MIN_MODULOS);
		}

		Modulo extraido = array[(this.numModulosAnyadidos-1)];

//		array[this.numModulosAnyadidos] = null; // 	por que no puedo ponerlo a null?, entiendo que no importa porque luego pisariamos la posicio, pero por que no puedo ponerlo a null?
		numModulosAnyadidos--;
		return extraido;

	};

	@Override
	public String toString() {

		String frase;

		frase = super.toString() + " [numMaxModulos=" + numMaxModulos + ", anchura=" + anchura + ", altura=" + altura
				+ ", array=" + Arrays.toString(array) + "]";

		return frase;

	}

}
