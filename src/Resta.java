/**
 * Esta clase contendra los metodos que realizaran las restas en la calculadora
 * 
 * @author Jesus Rodriguez Herranz
 */
public class Resta {
	
	private static int acumulador = 0;

	/**
	 * Este metodo sirve para restar dos numeros enteros<br>
	 * 
	 * Casos especiales: 
	 * <br>
	 * Esta calculadora no permitira la entrada de numeros negativos
	 * 
	 * @param valor1 Contendra el primer numero entero de la resta
	 * @param valor2 Contendra el primer numero entero de la resta
	 */
	
	public static int resta(int valor1, int valor2) {
		return (valor1 - valor2);
	}
	
	/**
	 * Este metodo sirve para restar dos numeros reales<br>
	 * 
	 * Casos especiales: 
	 * <br>
	 * Esta calculadora no permitira la entrada de numeros negativos
	 * 
	 * @param valor1 Contendra el primer numero real de la resta
	 * @param valor2 Contendra el segundo numero real de la resta
	 */
	
	public static double resta(double valor1, double valor2) {
		return (valor1 - valor2);
	}
	
	/**
	 * Este metodo sirve para restar tres numeros enteros<br>
	 * 
	 * Casos especiales: 
	 * <br>
	 * Esta calculadora no permitira la entrada de numeros negativos
	 * 
	 * @param valor1 Contendra el primer numero entero de la resta
	 * @param valor2 Contendra el segundo numero entero de la resta
	 * @param valor3 Contendra el tercer numero entero de la resta
	 */
	
	public static double resta(double valor1, double valor2, double valor3) {
		return (valor1 - valor2 - valor3);
	}
	
	/**
	 * Este metodo sirve para restar un valor acumulado<br>
	 * 
	 * Casos especiales:
	 * <br>
	 * Esta calculadora no permitira la entrada de numeros negativos
	 * 
	 * @param nuevovalor
	 */
	
	public static int restaAcumulado(int nuevovalor) {
		acumulador -= nuevovalor;
		return (acumulador);

	}
}
