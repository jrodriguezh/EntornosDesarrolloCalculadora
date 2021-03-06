/**
 * Esta clase implementará todos los métodos que están relacionados con las sumas de la calculadora.
 *  
 * @author Alejandro Ocaña
 * @version 1.0
 *
 */

public class Suma {
	private static int acumulador = 0;
	
	
	/**
	 * Este método sirve para hacer una suma de dos valores reales.
	 *  
	 * @param valor1 Primer valor de la suma.
	 * @param valor2 Segundo valor de la suma.
	 * @return Resultado de la suma.
	 */
	
	public static double suma(double valor1, double valor2) {
		return valor1+valor2;
	}
	
	/**
	 * Este método sirve para hacer una suma de dos valores enteros.
	 * 
	 * @param valor1 Primer valor de la suma.
	 * @param valor2 Segundo valor de la suma.
	 * @return Resultado de la suma.
	 */
	
	
	public static int suma(int valor1, int valor2) {
		return valor1+valor2;
	}
	
	/**
	 * Este método sirve para hacer una suma de tres valores reales.
	 * 
	 * @param valor1 Primer valor de la suma.
	 * @param valor2 Segundo valor de la suma.
	 * @param valor3 Tercer valor de la suma.
	 * @return Resultado de la suma.
	 */
	
	public static double suma(double valor1, double valor2, double valor3) {
		return valor1+valor2+valor2;
	}
	
	/**
	 * Este método sirve para hacer una suma de tres valores enteros.
	 * 
	 * @param valor1 Primer valor de la suma.
	 * @param valor2 Segundo valor de la suma.
	 * @param valor3 Tercer valor de la suma.
	 * @return Resultado de la suma.
	 */
	
	public static int suma(int valor1, int valor2, int valor3) {
		return valor1+valor2+valor2;
	}
	
	/**
	 *  Este método sirve para ir sumando sobre el valor acumulado.
	 * @param nuevovalor Valor que se quiere sumar.
	 * @return Resultado de la suma con el valor acumulado.
	 * 
	 */
	
	public static int sumaAcumulado(int nuevovalor) {
		acumulador +=nuevovalor;
		return acumulador;
		
	}
	
	
}