import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase para realizar las pruebas de los metodos de la clase Resta.
 * 
 * @author Alejandro Ocaña
 *
 */

class TestResta {

	/**
	 * Este test comprobará si existen errores a la hora de realizar un resta entre
	 * dos números enteros {@link Resta#resta(int, int)}
	 */

	@Test
	void testRestaIntIntDosNumerosNegativos() {
		// 1 Arrange - Preparar
		// 2 Act - Ejecutar
		int esperando = 1;
		int resultado = Resta.resta(-2, -3);
		// 3 Assert - Comprobar
		assertEquals(esperando, resultado);

	}

	/**
	 * Este test comprobara si existen errores a la hora de realizar una resta entre
	 * dos números reales {@link Resta#resta(double, double)}
	 */

	@Test
	void testRestaDoubleDoubleDosNumerosNegativos() {
		// 1 Arrange - Preparar
		// 2 Act - Ejecutar
		double esperado= 1.50;
		double resultado = Resta.resta(-1.5, -3.00);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/**
	 * Este test comprobara si existen errores a la hora de realizar una resta entre
	 * dos números reales {@link Resta#resta(double, double, double)}
	 */
	
	@Test
	void testRestaDoubleDoubleDouble() {
		fail("Not yet implemented");

		
	}

	@Test
	void testRestaAcumulado() {
		fail("Not yet implemented");
	}

}

