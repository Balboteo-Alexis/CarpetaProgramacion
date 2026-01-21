package ticket;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Ticket {

	// Atributos de clase constantes
	public static final int MAX_NUM_IDENTIFICADOR = 99999999;


	// Atributos de clase variables
	private static short año;
	private static int secuencia;

	// Atributos de objeto inmutables
	private final String identificador;
	private final LocalDateTime fecha;

	// Atributos de objeto variables
	private LocalDateTime uso;

	// constructor un parametro
	public Ticket(LocalDateTime fecha) {

		if (secuencia == MAX_NUM_IDENTIFICADOR) {
			throw new IllegalStateException("Maximo numero de tickets creados este año");

		}

		this.uso = null;
		this.fecha = fecha;
		short añoActual = (short) LocalDateTime.now().getYear();
		
		if (año != añoActual) {
			año = añoActual;
			secuencia = 1;
		}

		this.identificador = String.format("%04d-%08d", (int) año, secuencia++);
		
		

	}

	// constructor sin parametros
	public Ticket() {
		this(LocalDateTime.now());
	}

	// GETTERS
	// get id
	public String getIdentificador() {
		return this.identificador;
	}

	// get usado
	public boolean isUsado() {
		boolean usado;

		if (this.uso == null) {
			usado = false;
		} else {
			usado = true;
		}
		return usado;
	}

	// get fecha
	public LocalDateTime getFecha() {
		return this.fecha;
	}

	// get fin de semana, indica si es fin de semana
	public boolean isFinSemana() {

		boolean finde = false;

		if (this.fecha.getDayOfWeek() == DayOfWeek.SATURDAY || this.fecha.getDayOfWeek() == DayOfWeek.SUNDAY) {

			finde = true;
		}
		return finde;
	}

	// metodo usar
	public void usar() {
		
		if(isUsado()) {
			throw new IllegalStateException("Este ticket ha sido usado");
			
		}
		
		if(LocalDateTime.now().getYear()  == this.fecha.getYear() 
				&& LocalDateTime.now().getDayOfYear()  == this.fecha.getDayOfYear()) {
			
			this.uso = LocalDateTime.now();    // asi guardamos la hora
			
		}
		
	}

}
