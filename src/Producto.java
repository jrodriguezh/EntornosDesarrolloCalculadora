/**
 * Esta clase implementar� todos los m�todos que est�n relacionados con la multiplicaci�n de la calculadora. 
 * @author Alejandro Oca�a
 *
 */

public class Producto {
	
	/**	
	 * Este m�todo sirve para obtener el producto de dos n�meros reales.
	 * @param valor1 Primer multiplicando.
	 * @param valor2 Segundo multiplicando.
	 * @return Resultado de la multiplicaci�n.
	 */

	public static double producto(double valor1, double valor2) {
		return valor1*valor2;
	}
	
	/**
	 * Este m�todo sirve para obtener el producto de dos n�meros enteros.
	 * @param valor1 Primer multiplicando.
	 * @param valor2 Segundo multiplicando.
	 * @return Resultado de la multiplicaci�n.
	 */
	
	public static int producto(int valor1, int valor2) {
		return valor1*valor2;
	}

	/**
	 * Este m�todo sirve para obtener el producto de tres n�meros reales.
	 * @param valor1 Primer multiplicando.
	 * @param valor2 Segundo multiplicando.
	 * @param valor3 Tercer multiplicando.
	 * @return Resultado de la multiplicaci�n.
	 */
	
	public static double producto(double valor1, double valor2, double valor3) {
		return valor1*valor2*valor2;
	}
	
	/**
	 * Este m�todo sirve para obtener el producto de tres n�meros enteros.
	 * @param valor1 Primer multiplicando.
	 * @param valor2 Segundo multiplicando.
	 * @param valor3 Tercer multiplicando.
	 * @return Resultado de la multiplicaci�n.
	 */
	
	public static int producto(int valor1, int valor2, int valor3) {
		return valor1*valor2*valor2;
	}
	
	/**
	 * Este m�todo sirve para obtener la potencia de un numero.<br>
	 * Casos especiales:<br>
	 * �Cualquier potencia de exponente 0, es igual a 1 (siempre que su base no sea 0) 
	 * �Cualquier potencia de exponente 1, es igual a la base.
	 * �Cero elevado a cualquier exponente (distinto de cero) es igual a cero.
	 * �Si la base de la potencia es un n�mero positivo, el resultado siempre ser� positivo.
	 * �Si la base de la potencia es un n�mero negativo, el signo del resultado depende del tipo de exponente, a saber: si el exponente es par, el signo ser� positivo, pero si es impar, el exponente ser� negativo.
	 * 
	 * @param x Base de la potencia.
	 * @param y Exponente de la potencia.
	 * @return Resultado de la potencia.
	 */
	
	public static int potencia(int x, int y) {
		return (int) Math.pow(x, y);
		
	}
	
	
}
