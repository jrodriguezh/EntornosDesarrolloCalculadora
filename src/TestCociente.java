import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Alejandro Ocaña
 *
 */

class TestCociente {

	/**
	 * Este Test comprobará que no existen errores a la hora de realizar la
	 * división entre dos numeros reales {@link Cociente#division(double, double)}
	 */

	@Test
	void testDivisionDoubleDouble() {
		// 1 Arrange - Preparar
		// 2 Act - Ejecutar
		double esperado = 3.75;
		double resultado = Cociente.division(15.00, 4.00);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Este Test comprobará que no existen errores a la hora de realizar la
	 * división entre dos numeros reales {@link Cociente#division(double, double)}
	 */

	@Test
	void testDivisionEntre0() {
		// 1 Arrange - Preparar
		// 2 Act - Ejecutar
		double esperado = 3.75;
		double resultado = Cociente.division(15, 0);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
		
	}
	

	@Test
	void testDivisionIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testInverso() {
		fail("Not yet implemented");
	}

	@Test
	void testRaiz() {
		fail("Not yet implemented");
	}

}
