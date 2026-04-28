package ejercicioA1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String texto;

		do {

			System.out.print("Dame una ruta de archivos: ");

			texto = teclado.nextLine();

			if (!texto.equals("")) {

				File ruta = new File(texto);

				try {
					muestraInfoRuta(ruta);
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}

			} else {
				System.out.println("fin");
			}

			System.out.println();
		} while (!texto.equals(""));

		teclado.close();

	}

	public static void muestraInfoRuta(File ruta) throws FileNotFoundException
	{
		if(ruta.isFile())
		{
			System.out.printf("Nombre del archivo: %s\n", ruta.getName());
		}else if(ruta.isDirectory())
		{
			System.out.printf("Nombre del directorio: %s\n",ruta.getName());
			File[] archivos = ruta.listFiles();
			for(int i=0;i<archivos.length;i++)
			{
				String nombre = archivos[i].getName();
				if(archivos[i].isDirectory())
				{
					System.out.printf("%s[*]\n", nombre);
				}
			}
			for(int i=0;i<archivos.length;i++)
			{
				String nombre = archivos[i].getName();
				if(archivos[i].isFile())
				{
					System.out.printf("%s[A]\n", nombre);
				}
			}
		}else
		{
			throw new FileNotFoundException("La ruta introducida no es válida.");
		}
	}

}
