package claseDADO;



public class Dado {
	
	// Atributos de clase constantes
	public static final byte MAX_CARAS = 20;
	public static final byte NUM_CARAS_DEFAULT = 6;
	


	// Atributos de clase variables


	// Atributos de objeto inmutables
	private final int caras;
	

	// Atributos de objeto variables
	private int lanzamientos;
	private int[] registroCaras;

	
	// constructor con un parametro
	public Dado(int caras) {
		
		if(caras != 4 || caras != 6|| caras != 8|| caras != 12|| caras != 20) {
			throw new IllegalStateException("Numero de caras incorrecto");
			
		}
		
		this.caras=caras;
		this.lanzamientos=0;
		this.registroCaras= new int[19];
		
	}
	//constructor sin parametros
	public Dado() {
		this(NUM_CARAS_DEFAULT);
	}
	//get lanzamientos
	public int getLanzamientos() {
		return this.lanzamientos;
	}
	
	//get caras
	public int getCaras() {
		return this.caras;
	}
	// lanzar un dado y obtener su resultado
	public String lanzar() {
		String result;
		String[] numeros= {"UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", 
				"DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISÉIS", "DICECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE"};
		
		int num = (int) Math.random()*this.caras;
		result = numeros[num];
		this.lanzamientos++;
		
		return result;
	}
	@Override
	public String toString() {
		return 	String.format ("Numero de caras: %d. Numero de lanzamientos: %d", this.caras,this.lanzamientos);
	}
	

	
	
	
	
	
	
	
	
	

}
