package test;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAddAbsolute() {
		Calculator calculator = new Calculator();
		
		assertEquals(10, calculator.addAbsolute(3,7));
	}

}
