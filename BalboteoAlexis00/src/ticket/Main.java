package ticket;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		Ticket uno = new Ticket();
		
		System.out.println(uno.getIdentificador());
		Ticket unoq = new Ticket();
		Ticket uno1 = new Ticket();
		Ticket uno3= new Ticket();
		Ticket uno4 = new Ticket();
		Ticket uno5 = new Ticket(LocalDateTime.of(2026, 1, 25, 23, 30));
		System.out.println(uno5.getIdentificador());
		
		
		
		System.out.println(uno5.isFinSemana());
		
		
		

	}

}
