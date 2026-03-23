package parcialAñoPasado;

public class Main {

	public static void main(String[] args) {

		// 1. Crea un libro digital con 3.5 Mb de tamaño y formato PDF. Los demás
		// valores por defecto.
		// Evidencia: muestra el estado del objeto.

		
		Libro nuevo = new LibroDigital(3.5,"pdf");
		
		System.out.println(nuevo.toString());
		
		
		
		// 2. Modifica la fecha de publicación a 20/12/2030.
		// Evidencia: muestra el estado del objeto.
		
		
		

		// 3. Crea un libro físico con 350 páginas y tapa dura. Los demás valores por
		// defecto.
		// Evidencia: muestra el estado del objeto.

		// 4. Crea 20 libros físicos con número aleatorio de páginas entre -50 y 50
		// páginas y agrégalos
		// a una colección que controle los duplicados a través del identificador.
		// Evidencia: muestra todos los elementos de la colección y su número. En el
		// caso de que
		// no se puedan crear, muestra el motivo.

		// 5. Crea 10 libros digitales con valores por defecto y agrégalos a la
		// colección anterior.
		// Evidencia: muestra todos los elementos de la colección y su número. En el
		// caso de que
		// no se puedan crear, muestra el motivo.

		// 6. Calcula el precio de cada uno de los libros de la colección.
		// Evidencia: muestra todos los elementos de la colección con su precio.

		// 7. Indica la cantidad de libros que están en la colección y el importe total
		// de todos los libros.
		// Evidencia: muestra la cantidad de libros y el importe total.

		// 8. Ordena los libros por orden descendente del identificador.
		// Evidencia: muestra todos los elementos de la colección ordenados.

		// 9. Elimina los tres primeros libros con precio por debajo de 5€.
		// Evidencia: muestra los elementos de la colección eliminados. Muestra el
		// número de
		// elementos en la colección.

		// 10. Crea un libro digital con los siguientes valores usando un
		// pseudoconstructor.
		// El quijote//Miguel de Cervantes//1605//novela//true//8.5Mb//epub
		// Evidencia: muestra el estado del objeto.

		// 11. Calcula el número de años transcurridos desde la fecha de publicación del
		// libro "El quijote".
		// Evidencia: muestra el número de años.

	}

}
