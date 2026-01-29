package ticket;

import java.time.LocalDate;

import ticket.Ticket.Meses;



public class Main {

	public static void main(String[] args) {
		
		Ticket uno = new Ticket();
		
		
		Meses mes;
		
		
		System.out.println(uno.getIdentificador());
		Ticket unoq = new Ticket();
		Ticket uno1 = new Ticket();
		Ticket uno3= new Ticket();
		Ticket uno4 = new Ticket();
		Ticket uno5 = new Ticket(LocalDate.of(2026, 1, 28));
		
		uno5.usar();
		
		System.out.println(uno5.isUsado());
		System.out.println(uno5.getIdentificador());
		
		
		
		System.out.println(uno5.isFinSemana());
		
		System.out.println(uno5.toString());
		
		
		Ticket[] vector = new Ticket[9];
		
		vector[1] = uno3;
		
		System.out.println(vector[1].isUsado());
		

		
		
	
		String mess = "abril";
		
		if (Meses.valueOf(mess.toUpperCase()) == Meses.ABRIL) {
			
			System.out.println("buen camino");
			
			mes = (Meses.valueOf(mess.toUpperCase()));
			
			System.out.println(mes);
			
		}
		 
		 
		 
		 
		

		
	}

}
