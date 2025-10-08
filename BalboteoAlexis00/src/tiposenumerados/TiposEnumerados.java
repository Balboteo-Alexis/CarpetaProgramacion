package tiposenumerados;
import java.util.Scanner;
public class TiposEnumerados
{

	public enum Meses{ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE}
	
	public static void main(String[] args)
	{
		
		Scanner teclado = new Scanner(System.in);
		
		Meses mesactual = Meses.SEPTIEMBRE;
		System.out.print(mesactual);

		
		teclado.close();
	}

}
