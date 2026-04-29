package Rectangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testEjemplo {

	@Test
	void test() {
		
		ejemplo r = new ejemplo(10, 4);
		
		assertAll(
				
				() -> assertEquals(12,r.area()),
				() -> assertEquals(14,r.perimetro())
				
				
				
				);
		
		
	
	}

}
