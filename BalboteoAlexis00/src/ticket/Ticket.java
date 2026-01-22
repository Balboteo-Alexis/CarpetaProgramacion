package ticket;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

	// Atributos de clase constantes
	public static final int MAX_NUM_IDENTIFICADOR = 99999999;


	// Atributos de clase variables
	private static short anno;
	private static int secuencia;

	// Atributos de objeto inmutables
	private final String identificador;
	private final LocalDate fecha;

	// Atributos de objeto variables
	private LocalTime uso;
	

	// constructor un parametro
	public Ticket(LocalDate fecha) {

		if (secuencia == MAX_NUM_IDENTIFICADOR) {
			throw new IllegalStateException("Maximo numero de tickets creados este año");

		}

		this.uso = null;
		this.fecha = fecha;
		short añoActual = (short) LocalDateTime.now().getYear();
		
		if (anno != añoActual) {
			anno = añoActual;
			secuencia = 1;
		}

		this.identificador = String.format("%04d-%08d", (int) anno, secuencia++);
		
		

	}

	// constructor sin parametros
	public Ticket() {
		this(LocalDate.now());
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
	public LocalDate getFecha() {
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
		
		if(LocalDate.now().getYear()  != this.fecha.getYear() 
				|| LocalDateTime.now().getDayOfYear()  != this.fecha.getDayOfYear()) {
			
			throw new IllegalStateException("Fecha erronea");
			
		}
		this.uso = LocalTime.now();
		
	}

	@Override
	public String toString() {

		return String.format ("{ID: %s, Fecha:%02d/%02d/%02d, Usado: %s}",
				this.identificador,
				this.fecha.getYear(), this.fecha.getMonthValue(), this.fecha.getDayOfMonth(),
				isUsado() == false ? "no" : String.format ("%02d:%02d", uso.getHour(), uso.getMinute()));
			    
		
	}
	
	
	
	

}
