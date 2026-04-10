package ejercicio1;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main2m0 {

	public static void main(String[] args) {

		ArrayList<Alumno> evaluacion = new ArrayList<Alumno>();

		/* =========================================================
		 * 1. Importa la información contenida en el documento notas1.txt,
		 *    donde la información tiene el siguiente formato:
		 *    grupo;nombre;matemáticas;lengua;física;química;inglés
		 * ========================================================= */
		evaluacion = listaAlumnos("notas1.txt");

		/* =========================================================
		 * 2. Muestra el número de registros que contiene.
		 * ========================================================= */
		System.out.printf("%n[2] Registros importados desde notas1.txt: %d%n", evaluacion.size());

		/* =========================================================
		 * 3. Ordena los registros por grupo y nombre.
		 * ========================================================= */
		evaluacion.sort(new Comparador());
		System.out.printf("%n[3] Registros ordenados por grupo y nombre.%n");
		System.out.printf("    (Mostrando lista completa tras ordenar)%n");
		System.out.println(evaluacion.toString());

		/* =========================================================
		 * 4. Inserta siguiente registro:
		 *    1º ESO D;López Muro, Rosario;3;3;4;4;3
		 * ========================================================= */
		Alumno nuevo = new Alumno("1º ESO D", "López Muro, Rosario", 3, 3, 4, 4, 3);
		evaluacion.add(nuevo);
		System.out.printf("%n[4] Insertado registro al final:%n    %s%n", nuevo.toString());

		/* =========================================================
		 * 5. Insertar el siguiente registro en mitad de la lista:
		 *    1º ESO B;Duarte Durán, Alba;2;3;4;1;3
		 * ========================================================= */
		nuevo = new Alumno("1º ESO B", "Duarte Durán, Alba", 2, 3, 4, 1, 3);
		int mitad = evaluacion.size() / 2;
		evaluacion.add(mitad, nuevo);
		System.out.printf("%n[5] Insertado registro en mitad (posición %d):%n    %s%n", mitad, nuevo.toString());   // por qué este no se ordena? y el de last si?

		/* =========================================================
		 * 6. Mostrar la posición que ocupa el último registro anterior insertado.
		 * ========================================================= */
		
		System.out.println(evaluacion.toString());
		
		System.out.printf("%n[6] La posición del último registro insertado es: %d%n", evaluacion.indexOf(nuevo));

		/* =========================================================
		 * 7. Importa los registros del documento notas2.txt a un ArraList auxiliar
		 *    e incluye los elementos de este ArrayList auxiliar al primer ArrayList.
		 * ========================================================= */
		ArrayList<Alumno> auxiliar = new ArrayList<Alumno>();
		auxiliar = listaAlumnos("notas2.txt");
		evaluacion.addAll(auxiliar);

		System.out.printf("%n[7] Importados %d registros desde notas2.txt y añadidos a la lista principal.%n", auxiliar.size());
		System.out.printf("    Total de registros actuales en evaluación: %d%n", evaluacion.size());

		/* =========================================================
		 * 8. Busca el registro con el nombre “Cordero Benítez, Alejandro”
		 *    y muestra toda su información.
		 * ========================================================= */
		String persona = "Cordero Benítez, Alejandro";

		int posicion;
		posicion = buscarPersona(persona, evaluacion);

		System.out.printf("%n[8] Búsqueda por nombre: \"%s\"%n", persona);
		if (posicion != -1) {
			System.out.printf("    Encontrado en la posición %d:%n    %s%n", posicion, evaluacion.get(posicion).toString());
		} else {
			System.out.printf("    Resultado: no está esta persona en la lista.%n");
		}

		/* =========================================================
		 * 9. Busca el registro con el nombre “Fernández Villalón, Carlos”
		 *    y muestra toda su información.
		 * ========================================================= */
		persona = "“Fernández Villalón, Carlos"; // no está en la lista

		posicion = buscarPersona(persona, evaluacion);

		System.out.printf("%n[9] Búsqueda por nombre: \"%s\"%n", persona);
		if (posicion != -1) {
			System.out.printf("    Encontrado en la posición %d:%n    %s%n", posicion, evaluacion.get(posicion).toString());
		} else {
			System.out.printf("    Resultado: no está esta persona en la lista.%n");
		}

		/* =========================================================
		 * 10. Borra el registro que está en la posición mitad más 1,
		 *     indicando la información del registro que borras.
		 * ========================================================= */
		mitad = evaluacion.size()/2; 
		System.out.printf("%n[10] Eliminación del registro en 'mitad + 1'.%n");
		System.out.printf("     Posición base (mitad): %d -> posición a borrar (mitad+1): %d%n", mitad, (mitad + 1));

		System.out.printf("     Registro a borrar:%n     %s%n", evaluacion.get(mitad + 1).toString());

		evaluacion.remove(mitad + 1);
		System.out.printf("     OK: registro eliminado correctamente.%n");

		/* =========================================================
		 * 11. Borra los primeros 10 registros.
		 * ========================================================= */
		System.out.printf("%n[11] Borrado de los primeros 10 registros.%n");
		System.out.printf("     Tamaño antes de borrar: %d%n", evaluacion.size());

		for (int j = 0; j < 10; j++) {
			evaluacion.remove(0);
		}

		System.out.printf("     Tamaño después de borrar: %d%n", evaluacion.size());

		/* =========================================================
		 * 12. Borra todos los registros que tengan en matemáticas un 2.
		 *     Indica cuántos registros borras.
		 * ========================================================= */
		int borrados = 0;

		Iterator<Alumno> it = evaluacion.iterator();

		while (it.hasNext()) {
			Alumno a = it.next();
			if (a.getMates() == 2) {
				it.remove();
				borrados++;
			}
		}

		System.out.printf("%n[12] Borrado por condición (matemáticas == 2).%n");
		System.out.printf("     Total de registros borrados: %d%n", borrados);
		System.out.printf("     Registros restantes en evaluación: %d%n", evaluacion.size());

		/* =========================================================
		 * 13. Calcula la nota media para cada alumno.
		 * ========================================================= */
		double nota;

		System.out.printf("%n[13] Nota media por alumno:%n");
		for (Alumno alumno : evaluacion) {

			nota = notaMedia(alumno);

			System.out.printf("     %s  --  Nota media: %.2f%n", alumno.toString(), nota);

		}

		/* =========================================================
		 * 14. Crea una sublista por cada grupo y ordénala por nombre descendente.
		 * ========================================================= */
		//Como lo ordeno si ya tengo un comparador definido?

		System.out.printf("%n[14] Creación de sublistas por grupo:%n");
		ArrayList<Alumno> grupoA = new ArrayList<Alumno>();
		ArrayList<Alumno> grupoB = new ArrayList<Alumno>();
		ArrayList<Alumno> grupoC = new ArrayList<Alumno>();
		ArrayList<Alumno> grupoD = new ArrayList<Alumno>();
		ArrayList<Alumno> grupoE = new ArrayList<Alumno>();

		for (Alumno alumno : evaluacion) {

			if (alumno.getCurso().equals("1º ESO A")) {

				grupoA.add(alumno);
			} else if (alumno.getCurso().equals("1º ESO B")) {

				grupoB.add(alumno);
			} else if (alumno.getCurso().equals("1º ESO C")) {

				grupoC.add(alumno);
			} else if (alumno.getCurso().equals("1º ESO D")) {

				grupoD.add(alumno);
			} else {

				grupoE.add(alumno);
			}

		}

		System.out.printf("     Grupo A: %d alumnos%n", grupoA.size());
		System.out.printf("     Grupo B: %d alumnos%n", grupoB.size());
		System.out.printf("     Grupo C: %d alumnos%n", grupoC.size());
		System.out.printf("     Grupo D: %d alumnos%n", grupoD.size());
		System.out.printf("     Grupo E: %d alumnos%n", grupoE.size());

		System.out.printf("%n     Listado grupo A:%n%s%n", grupoA.toString());
		System.out.printf("%n     Listado grupo B:%n%s%n", grupoB.toString());
		System.out.printf("%n     Listado grupo C:%n%s%n", grupoC.toString());
		System.out.printf("%n     Listado grupo D:%n%s%n", grupoD.toString());
		System.out.printf("%n     Listado grupo E:%n%s%n", grupoE.toString());

		/* =========================================================
		 * 15. Calcula para cada grupo la nota media de cada materia.
		 * ========================================================= */

		/* =========================================================
		 * 16. Para cada grupo muestra las diez mejores notas en matemáticas
		 *     ordenadas por nota y nombre.
		 * ========================================================= */

	}

	// metodos

	public static double notaMedia(Alumno alumno) {

		double suma  = alumno.getFisica() +alumno.getIngles() + alumno.getLengua() + alumno.getMates() + alumno.getPlastica();
		double resultado  = suma /5f;

		return resultado;
	}

	public static int buscarPersona(String nombre, ArrayList<Alumno> evaluacion) {

		Alumno clave = new Alumno(null, nombre, 0, 0, 0, 0, 0);

		int pos = evaluacion.indexOf(clave); // funciona porque en el equals solo tomamos en cuenta el nombre

		return pos;

	}

	public static ArrayList<Alumno> listaAlumnos(String nombreFichero) {

		ArrayList<Alumno> evaluacion = new ArrayList<Alumno>();

		try {
			File archivo = new File(nombreFichero);
			Scanner lector = new Scanner(archivo);

			while (lector.hasNext()) {

				String linea = lector.nextLine();
				String[] valores = linea.split(";");
				Alumno nuevo = new Alumno(valores[0], valores[1], Integer.parseInt(valores[2]),
						Integer.parseInt(valores[3]), Integer.parseInt(valores[4]), Integer.parseInt(valores[5]),
						Integer.parseInt(valores[6]));

				evaluacion.add(nuevo);

			}

			lector.close();
		} catch (Exception ex1) {

			System.out.println("Error: " + ex1.getMessage());

		}
		return evaluacion;

	}

}
