package cancion;

public class Cliente {

	public static void main(String[] args) {
		
		
		Cancion vacia, porDefecto, ;
		
		vacia = new Cancion("", "");
		
		porDefecto = new Cancion();
		
		porDefecto.ponTitulo("");
		
		porDefecto.ponTitulo("Thunder");
		
		clonar(porDefecto);
	}

}
