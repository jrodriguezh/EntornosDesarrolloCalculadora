import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Alejandro Oca?a
 *
 */

class TestCociente {

	/**
	 * Este Test comprobar? que no existen errores a la hora de realizar la divisi?n
	 * entre dos numeros reales {@link Cociente#division(double, double)}
	 */

	@Test
	void testDivisionDoubleDouble() {
		// 1 Arrange - Preparar
		double esperado = 3.75;
		// 2 Act - Ejecutar
		double resultado = Cociente.division(15.00, 4.00);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/**
	 * Este Test comprobar? que no es posible realizar la divisi?n entre 0
	 * {@link Cociente#division(double, double)}
	 */

	@Test
	void testDivisionEntre0() {
		// 1 Arrange - Preparar
		double esperado = Double.POSITIVE_INFINITY;
		// 2 Act - Ejecutar
		double resultado = Cociente.division(15, 0);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);

	}

	/**
	 * Este Test comprobar? que no existen errores a la hora de realizar la divisi?n
	 * entre dos numeros enteros {@link Cociente#division(int, int)}
	 */

	@Test
	void testDivisionIntInt() {
		// 1 Arrange - Preparar
		double esperado = 6.25;
		// 2 Act - Ejecutar
		double resultado = Cociente.division(25, 4);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/**
	 * Este test comprobar? que no existen errores a la hora de obtener el inverso
	 * de un n?mero {@link Cociente#inverso(int)}
	 */

	@Test
	void testInverso() {
		// 1 Arrange - Preparar
		double esperado = 0.2;
		// 2 Act - Ejecutar
		double resultado = Cociente.inverso(5);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/**
	 * Este test comprobar? que no existen errores a la hora de obtener el inverso
	 * del n?mero 0 {@link Cociente#inverso(int)}
	 */

	@Test
	void testInverso0() {
		// 1 Arrange - Preparar
		double esperado = Double.POSITIVE_INFINITY;
		// 2 Act - Ejecutar
		double resultado = Cociente.inverso(0);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/**
	 * Este test comprobar? que no existen errores a la hora de obtener la raiz
	 * cuadrada de un n?mero {@link Cociente#raiz(int)}
	 */

	@Test
	void testRaiz() {
		// 1 Arrange - Preparar
		double esperado = 2.2360679774997896964091736687313;
		// 2 Act - Ejecutar
		double resultado = Cociente.raiz(5);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Este test comprobar? que no existen errores a la hora de obtener la raiz
	 * cuadrada de un n?mero menor que 0 {@link Cociente#raiz(int)}
	 */

	@Test
	void testRaizMenor0() {
		// 1 Arrange - Preparar
		double esperado = Double.NaN;
		// 2 Act - Ejecutar
		double resultado = Cociente.raiz(-2);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Este test comprobar? que no existen errores a la hora de obtener la raiz
	 * cuadrada de un n?mero positivo infinito {@link Cociente#raiz(int)}
	 */

	@Test
	void testRaizInfinito() {
		// 1 Arrange - Preparar
		double esperado = Double.POSITIVE_INFINITY;
		// 2 Act - Ejecutar
		double resultado = Cociente.raiz(Double.POSITIVE_INFINITY);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Este test comprobar? que no existen errores a la hora de obtener la raiz
	 * cuadrada de 0 {@link Cociente#raiz(int)}
	 */

	@Test
	void testRaiz0() {
		// 1 Arrange - Preparar
		double esperado = 0;
		// 2 Act - Ejecutar
		double resultado = Cociente.raiz(0);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}
	
	
}
