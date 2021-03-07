/**
 * Esta clase implementará todos los métodos que están relacionados con la multiplicación de la calculadora. 
 * @author Alejandro Ocaña
 *
 */

public class Producto {
	
	/**	
	 * Este método sirve para obtener el producto de dos números reales.
	 * @param valor1 Primer multiplicando.
	 * @param valor2 Segundo multiplicando.
	 * @return Resultado de la multiplicación.
	 */

	public static double producto(double valor1, double valor2) {
		return valor1*valor2;
	}
	
	/**
	 * Este método sirve para obtener el producto de dos números enteros.
	 * @param valor1 Primer multiplicando.
	 * @param valor2 Segundo multiplicando.
	 * @return Resultado de la multiplicación.
	 */
	
	public static int producto(int valor1, int valor2) {
		return valor1*valor2;
	}

	/**
	 * Este método sirve para obtener el producto de tres números reales.
	 * @param valor1 Primer multiplicando.
	 * @param valor2 Segundo multiplicando.
	 * @param valor3 Tercer multiplicando.
	 * @return Resultado de la multiplicación.
	 */
	
	public static double producto(double valor1, double valor2, double valor3) {
		return valor1*valor2*valor2;
	}
	
	/**
	 * Este método sirve para obtener el producto de tres números enteros.
	 * @param valor1 Primer multiplicando.
	 * @param valor2 Segundo multiplicando.
	 * @param valor3 Tercer multiplicando.
	 * @return Resultado de la multiplicación.
	 */
	
	public static int producto(int valor1, int valor2, int valor3) {
		return valor1*valor2*valor2;
	}
	
	/**
	 * Este método sirve para obtener la potencia de un numero.<br>
	 * Casos especiales:<br>
	 * ·Cualquier potencia de exponente 0, es igual a 1 (siempre que su base no sea 0) 
	 * ·Cualquier potencia de exponente 1, es igual a la base.
	 * ·Cero elevado a cualquier exponente (distinto de cero) es igual a cero.
	 * ·Si la base de la potencia es un número positivo, el resultado siempre será positivo.
	 * ·Si la base de la potencia es un número negativo, el signo del resultado depende del tipo de exponente, a saber: si el exponente es par, el signo será positivo, pero si es impar, el exponente será negativo.
	 * 
	 * @param x Base de la potencia.
	 * @param y Exponente de la potencia.
	 * @return Resultado de la potencia.
	 */
	
	public static int potencia(int x, int y) {
		return (int) Math.pow(x, y);
		
	}
	
	
}
