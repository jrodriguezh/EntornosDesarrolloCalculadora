import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Jesús Rodríguez Herranz
 */
class TestSuma {

	/**
	 * Este test comprobara que las sumas de dos numero reales se estan realizando
	 * de forma correcta Test method for {@link Suma#suma(double, double)}.
	 */
	@Test
	
	void testSumaDoubleDouble() {
		// 1 Arrange - Preparar

		// 2 Act - Ejecutar
		double esperado = 8.1;
		double resultado = Suma.suma(2.3, 5.8);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);

	}

	/**
	 * Este test comprobara que las sumas de dos numero enteros se estan realizando
	 * de forma correcta. Test method for {@link Suma#suma(int, int)}.
	 */
	@Test

	void testSumaIntInt() {
		// 1 Arrange - Preparar

		// 2 Act - Ejecutar
		int esperado = 23;
		int resultado = Suma.suma(16, 7);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/** Este test comprobara que las sumas de tres numero reales se estan realizando
	 * de forma correcta.
	 * Test method for {@link Suma#suma(double, double, double)}.
	 */
	@Test
	void testSumaDoubleDoubleDouble() {
		// 1 Arrange - Preparar

		// 2 Act - Ejecutar
		double esperado = 19.8;
		double resultado = Suma.suma(8.4, 6.9, 4.5);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/** Este test comprobara que las sumas de tres numero enteros se estan realizando
	 * de forma correcta.
	 * Test method for {@link Suma#suma(int, int, int)}.
	 */
	@Test
	void testSumaIntIntInt() {
		// 1 Arrange - Preparar

		// 2 Act - Ejecutar
		int esperado = 58;
		int resultado = Suma.suma(20, 14, 24);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/**
	 * Test method for {@link Suma#sumaAcumulado(int)}.
	 */
	@Test
	void testSumaAcumulado() {
		// 1 Arrange - Preparar;
		// 2 Act - Ejecutar
		int esperado = 18;
		int prueba1 = Suma.sumaAcumulado(8);
		int resultado = Suma.sumaAcumulado(10);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

}
