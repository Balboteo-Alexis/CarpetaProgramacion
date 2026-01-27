/*
 * Descripcion
 * Autor
 * Fecha
 */


package claseBombilla;

public class Bombilla {
	
	//Atributos clase
	public static final boolean DEFAULT_ESTADO_INICIAL = false;
	
	private static int bombillasTotales = 0;
	private static int bombillasEncendidas = 0;
	
	
	//Atributos objetos
	private boolean estadoLuminico;
	private int vecesEncendida ;
	
	
	
	
	// Cronstructor Bombilla con un parametro
	public Bombilla(boolean estadoLuminico) {
		this.estadoLuminico = estadoLuminico;
		this.bombillasTotales++;
		if(estadoLuminico) {
			bombillasEncendidas++;
			vecesEncendida = 1;
		}else {
			vecesEncendida = 0;
		}
	}
	
	// Cronstructor Bombilla sin parametros
	public Bombilla() {
		this(DEFAULT_ESTADO_INICIAL);
	}

	
	// GETTERS
	// Obtener el estadu luminico de la bombilla
	public boolean getEstadoLuminico() {
		return this.estadoLuminico;
	}
	// Obtener las veces encendidas
	public int getVecesEncendida() {
		return this.vecesEncendida;
	}
	// Obtener el numero de bombillasTotales
	public static int getBombillasTotales() {
		return bombillasTotales;
	}
	// Obtener el numero de bombillas encendidas totales
	public static int getBombillasEncendidas() {
		return bombillasEncendidas;
	}
	

	
	@Override
	public String toString() {
	  String resultado = String.format("Bombilla %s. Se ha encendido %d %s",
	    this.estadoLuminico ? "encendida" : "apagada",
	    this.vecesEncendida, 
	    this.vecesEncendida == 1 ? "vez" : "veces");

	    return resultado;
	}

	
	public void encender() {
		
		if(this.estadoLuminico) {
			throw new IllegalStateException("La bombilla ya está encendida");
		}
		this.estadoLuminico = true;
		this.vecesEncendida++;
		bombillasEncendidas++;
		
	}
	public void apagar() {
		
		if(this.estadoLuminico == false) {
			throw new IllegalStateException("La bombilla ya está apagada");
		}
		this.estadoLuminico = false;
		bombillasEncendidas++;
		
	}
	public void conmutar() {
		
		if(this.estadoLuminico) {
			apagar();
		}else {
			encender();
		}
		
	}
	
	
	
	
	
}
