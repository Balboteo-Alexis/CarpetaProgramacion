package ejercicioA2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String texto;
		boolean info;

		do {

			System.out.print("Dame una ruta de archivos: ");

			texto = teclado.nextLine();

			System.out.println("Quieres mas info ?");
			info = teclado.nextBoolean();

			if (!texto.equals("")) {

				File ruta = new File(texto);

				try {
					muestraInfoRuta(ruta, info);
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

	public static void muestraInfoRuta(File ruta, boolean info) throws FileNotFoundException {
		if (ruta.isFile()) {
			System.out.printf("Nombre del archivo: %s\n", ruta.getName());
		} else if (ruta.isDirectory()) {

			System.out.printf("Nombre del directorio: %s\n", ruta.getName());
			File[] archivos = ruta.listFiles();

			Arrays.sort(archivos, new comparadorFiles());

			for (int i = 0; i < archivos.length; i++) {
				String nombre = archivos[i].getName();
				if (archivos[i].isDirectory()) {
					System.out.printf("%s[*]\n", nombre);
					if (info) {
						
						System.out.println("Tamaño: " + archivos[i].getTotalSpace());
						System.out.println("Fecha ultima modificacion: " + new Date( archivos[i].lastModified()));
						System.out.println();
					}
				}


			}

			for (int i = 0; i < archivos.length; i++) {
				String nombre = archivos[i].getName();
				if (archivos[i].isFile()) {
					System.out.printf("%s[A]\n", nombre);
					if (info) {
						
						System.out.println("Tamaño: " + archivos[i].getTotalSpace());
						System.out.println("Fecha ultima modificacion: " + new Date( archivos[i].lastModified()));
						System.out.println();
					}
				}


			}
		} else {
			throw new FileNotFoundException("La ruta introducida no es válida.");
		}
	}

}
