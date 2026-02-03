package cd;

import cancion.Cancion;

public class Cliente {

	public static void main(String[] args) {
		
		CD unCd;
		unCd = new CD();
		
		
		
		Cancion bonita = new Cancion("bonita","armando");
		Cancion buena = new Cancion("buena","armando");
		Cancion mala = new Cancion("mala","armando");
		
		
		unCd.agrega(bonita);
		unCd.agrega(buena);
		unCd.agrega(mala);

		
		
		System.out.println(unCd.numenoCanciones());
		unCd.elimina(1);
		
		CD otroCd;
		
		otroCd = new CD();
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(otroCd.toString());
		System.out.println(unCd.toString());
		
		
		
		
	}

}
