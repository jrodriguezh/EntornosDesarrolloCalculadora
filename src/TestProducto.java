import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Jesús Rodríguez Herranz
 */
class TestProducto {

	/**
	 * Este Test comprobara que no existen errores a la hora de realizar una
	 * multiplicacion entre dos numeros reales Test method for
	 * {@link Producto#producto(double, double)}.
	 */
	@Test
	void testProductoDoubleDouble() {
		// 1 Arrange - Preparar
		double esperado = -47.04;
		// 2 Act - Ejecutar
		double resultado = Producto.producto(-5.6, 8.4);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);

	}

	/**
	 * Este Test comprobara que no existen errores a la hora de realizar una
	 * multiplicacion entre dos numeros enteros
	 * Test method for {@link Producto#producto(int, int)}.
	 */
	@Test
	void testProductoIntInt() {
		// 1 Arrange - Preparar
		int esperado = 29538;
		// 2 Act - Ejecutar
		int resultado = Producto.producto(547, 54);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/**
	 * Este Test comprobara que no existen errores a la hora de realizar una
	 * multiplicacion entre tres numeros reales
	 * Test method for {@link Producto#producto(double, double, double)}.
	 */
	@Test
	void testProductoDoubleDoubleDouble() {
		// 1 Arrange - Preparar
		double esperado = -443454.36;
		// 2 Act - Ejecutar
		double resultado = Producto.producto(5.8, -458.12, 968);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/**
	 * Este Test comprobara que no existen errores a la hora de realizar una
	 * multiplicacion entre tres numeros enteros
	 * Test method for {@link Producto#producto(int, int, int)}.
	 */
	@Test
	void testProductoIntIntInt() {
		// 1 Arrange - Preparar
		int esperado = 17714970;
		// 2 Act - Ejecutar
		int resultado = Producto.producto(21, 1545, 546);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/**
	 * Este Test comprobara que no existen errores a la hora de realizar una
	 * potencia
	 * Test method for {@link Producto#potencia(int, int)}.
	 */
	@Test
	
	void testPotencia() {
		// 1 Arrange - Preparar
		int esperado = 4;
		// 2 Act - Ejecutar
		int resultado = Producto.potencia(2, 2);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/**
	 * Este Test comprobara que, como se indica en los casos especiales, cualquier
	 * potencia con exponente 0 que no sea de base 0, sera igual a uno Test method
	 * for {@link Producto#potencia(int, int)}.
	 */
	@Test
	
	void testPotenciaexponente0iguala1sisubasenoes0() {
		// 1 Arrange - Preparar
		int esperado = 1;
		// 2 Act - Ejecutar
		int resultado = Producto.potencia(5, 0);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Este Test comprobara que, como se indica en los casos especiales, cualquier
	 * potencia con exponente 1 es igual a la base.
	 * Test method for {@link Producto#potencia(int, int)}.
	 */
	@Test
	
	void testPotenciaexponente1igualalabase() {
		// 1 Arrange - Preparar
		int esperado = 10;
		// 2 Act - Ejecutar
		int resultado = Producto.potencia(10, 1);		
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
		
	}
	/**
	 * Este Test comprobara que, cualquier potencia con base 0 es igual a 0
	 * Test method for {@link Producto#potencia(int, int)}.
	 */
	@Test
	
	void testPotenciabase0iguala0() {
		// 1 Arrange - Preparar
		int esperado = 0;
		// 2 Act - Ejecutar
		int resultado = Producto.potencia(0, 2);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Este Test comprobara que, como se indica en los casos especiales, cualquier
	 * potencia con base positiva siempre será positiva Test method for
	 * {@link Producto#potencia(int, int)}.
	 */
	@Test
	
	void testPotenciabasepositivasiemprepositiva() {
		// 1 Arrange - Preparar
		int esperado = 9261;
		// 2 Act - Ejecutar
		int resultado = Producto.potencia(21, 3);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}

	/**
	 * Este Test comprobara que, como se indica en los casoss especiales, si la base
	 * de una potencia es negativa, el resultado sera positivo o negativo en funcion
	 * del exponenete, si este es par sera positivo y si este es impar sera negativo
	 * Test method for {@link Producto#potencia(int, int)}.
	 */
	@Test
	
	void testPotenciabasenegativasiemprepositiva() {
		// 1 Arrange - Preparar
		int esperado = 9261;
		// 2 Act - Ejecutar
		int resultado = Producto.potencia(21, 3);
		// 3 Assert - Comprobar
		assertEquals(esperado, resultado);
	}
}
