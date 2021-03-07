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
	 * Este test comprobará que no existen errores a la hora de realizar un resta entre dos números enteros {@link Resta#resta(int, int)}
	 */
	
	@Test
	void testRestaIntIntDosNumerosNegativos() {
		// 1 Arrange - Preparar
		// 2 Act - Ejecutar
		int esperando= -5;
		int resultado = Suma.suma(-2, -3); 
		assertEquals(esperando,resultado);
		
	}

	@Test
	void testRestaDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testRestaDoubleDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testRestaAcumulado() {
		fail("Not yet implemented");
	}

}
