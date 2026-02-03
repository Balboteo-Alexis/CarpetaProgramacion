package cd;

import cancion.Cancion;

public class CD {

	// Atributos de clase constantes
	public static final int NUM_MAX_CANCIONES = 20;

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables
	private  Cancion[] canciones;
	private int contador;

	// constructores

	public CD() {

		this.contador = 0;
		this.canciones = new Cancion[NUM_MAX_CANCIONES];


	}

	public int numenoCanciones() {
		return this.contador;
	}

	public Cancion dameCancion(int num) throws IllegalArgumentException {

		if(num>=contador) {
			throw new IllegalArgumentException("Error");
		}
		
		Cancion seleccionada;

		seleccionada = this.canciones[num];

		return seleccionada;
	}

	public void grabaCancion(int num, Cancion nueva) throws IllegalArgumentException {

		if(num>=contador) {
			throw new IllegalArgumentException("Error");
		}
		
		this.canciones[num] = nueva;

	}

	public void agrega(Cancion nueva)throws IllegalArgumentException {

		if(this.contador >= NUM_MAX_CANCIONES) {
			throw new IllegalArgumentException("Error");
		}
		
		this.canciones[contador] = nueva;
		this.contador++;
	}

	public void elimina(int num) throws IllegalArgumentException {
		
		if(num>=contador) {
			throw new IllegalArgumentException("Error");
		}
		
		for(int i= num ; i <contador; i++) {
			this.canciones[i]  =this.dameCancion(i+1);
		}
		contador--;

	}

	public void copia(CD unCd) {

		for (int i = 0; i < NUM_MAX_CANCIONES; i++) {

			this.canciones[i] = unCd.canciones[i];

		}

		this.contador = unCd.contador;

	}

	public String toString() {

		String frase = "";

		for (int i = 0; i < NUM_MAX_CANCIONES; i++) {

			if (canciones[i] != null) {

				frase = frase + canciones[i].dameTitulo() + " ";

			}

		}

		return String.format("El CD tiene %d canciones y sus canciones son: %s", numenoCanciones(), frase);

	}

}
