package ticket;

import java.time.LocalDate;



public class Main {

	public static void main(String[] args) {
		
		Ticket uno = new Ticket();
		
		System.out.println(uno.getIdentificador());
		Ticket unoq = new Ticket();
		Ticket uno1 = new Ticket();
		Ticket uno3= new Ticket();
		Ticket uno4 = new Ticket();
		Ticket uno5 = new Ticket(LocalDate.of(2026, 1, 22));
		
		uno5.usar();
		
		System.out.println(uno5.isUsado());
		System.out.println(uno5.getIdentificador());
		
		
		
		System.out.println(uno5.isFinSemana());
		
		System.out.println(uno5.toString());
		
		
		

	}

}
