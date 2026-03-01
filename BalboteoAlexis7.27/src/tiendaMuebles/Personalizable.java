package tiendaMuebles;

public interface Personalizable {
	
	

	public String obtenerModulos();
	
	public void añadirModulo(Modulo modulo) throws IllegalStateException, NullPointerException;
	
	public Modulo extraerModulo() throws IllegalStateException;
	
	
	
	
	

}
