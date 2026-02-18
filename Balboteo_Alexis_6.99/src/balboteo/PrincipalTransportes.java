/*
 * Objetivo: mostrar el desarrollo de las clases creadas
 * Fecha: 
 * Autor: 
 */
package balboteo;



public class PrincipalTransportes {

	public static void main(String[] args) {

		// 1. Crea un camión con 20 tn de carga máxima.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println(" 1 ============");

		Camion camion1 = new Camion(TransportesPlayamar.MATRICULA_DEF, TransportesPlayamar.FECHA_DEF,
				TransportesPlayamar.ITF_DEF, TransportesPlayamar.TARIFA_DEF, 20);

		System.out.println(camion1.toString());

		// 2. Calcula el precio para un transporte de 200 kms.
		// Evidencia: el precio del transporte.
		System.out.println(" 2 ============");

		double precio = camion1.calcularTransporte(200);

		System.out.println("El precio del transporte es: " + precio);

		// 3. Crea una furgoneta con el volumen máximo permitido (valor solicitado al
		// usuario) y refrigerado (solicitado al usuario). Resto de valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println(" 3 ============");

		System.out.println("Dame el volumen maximo permitido en m3: ");

		double volumen = Entrada.real();
		
		System.out.println("Dime si tiene refrigeracion(1 si, 2 no): ");
		int unoOdos = Entrada.entero();
		boolean refrigerado;
		if (unoOdos == 1) {
			refrigerado = true;
		} else {
			refrigerado = false;
		}

		Furgoneta furgoneta1 = new Furgoneta(TransportesPlayamar.MATRICULA_DEF, TransportesPlayamar.FECHA_DEF,
				TransportesPlayamar.ITF_DEF, TransportesPlayamar.TARIFA_DEF, volumen, refrigerado);

		System.out.println(furgoneta1.toString());
		
		
		// 4. Calcula el precio del transporte para 50 kms.
		// Evidencia: el precio del transporte.
		System.out.println(" 4 ============");
		

		double costo = furgoneta1.calcularTransporte(50);

		System.out.println("El precio del transporte es: " + costo);
		
		
		

		// 5. Crea una motocicleta con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 5 ============");
		
		Motocicleta moto = new Motocicleta(TransportesPlayamar.MATRICULA_DEF, TransportesPlayamar.FECHA_DEF,
				TransportesPlayamar.ITF_DEF, TransportesPlayamar.TARIFA_DEF,Motocicleta.CILINDRADA_DEF,Motocicleta.CAJON_DEF);
		
		System.out.println(moto.toString());

		// 6. Calcula el precio de un transporte para 20 kms.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 6 ============");
		
		
		double costoTransporte = furgoneta1.calcularTransporte(20);

		System.out.println("El precio del transporte es: " + costoTransporte);

		// 7. Modifica el valor de ITV de la motocicleta a sí.
		// Evidencia: El valor de cada uno de los atributos.
		System.out.println(" 7 ============");
		
		
		moto.itv = true;
		
		System.out.println(moto.toString());
		

		// 8. Indica si la motocicleta tiene cajón de transporte.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 8 ============");

		System.out.println("La moto tiene cajon? "+ moto.isCajon());
		
		// 9. Modifica el valor de la tarifa base a la motocicleta.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 9 ============");

		
		
		
		
		// 10. Crea un camión con todos los valores solicitados al usuario (el objeto
		// debe ser creado por un método).
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 10 ============");

		// 11. Calcula el número de vehículos creados.
		// Evidencia. El número de vehículos creados.
		System.out.println(" 11 ============");

		System.out.println("En total se han crado " + TransportesPlayamar.getNumVehiculos() +" vehiculos");
		
		
	}

}
