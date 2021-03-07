/**
 * Esta clase contendra los metodos que realizaran las divisiones en la
 * calculadora
 * 
 * @author Jesus Rodriguez Herranz
 */

public class Cociente {

	/**
	 * Este metodo sirve para realizar la division de dos numeros reales
	 * 
	 * Casos especiales:<br>
	 * 
	 * No es posible dividir entre cero, puesto que daraa lugar a un numero
	 * infinito, Si divides un numero entre 0 dara lugar a un error tipo
	 * java.lang.ArithmeticException: / by zero
	 * 
	 * 
	 * @param valor1 Contendra el primer numero real de la division
	 * @param valor2 Contendra el segundo numero real de la division
	 * @return devolvera el resultado de la division
	 */

	public static double division(double valor1, double valor2) {
		return valor1 / valor2;
	}

	/**
	 * Este metodo sirve para realizar la division de dos numeros enteros<br>
	 * 
	 * Casos especiales:<br>
	 * 
	 * No es posible dividir entre cero, puesto que daraa lugar a un numero
	 * infinito, Si divides un numero entre 0 dara lugar a un error tipo
	 * java.lang.ArithmeticException: / by zero
	 * 
	 * 
	 * 
	 * <br>
	 * 
	 * @param valor1 Contendra el primer numero entero de la division
	 * @param valor2 Contendra el segundo numero entero de la division
	 * @return devolvera el resultado de la division
	 */

	public static int division(int valor1, int valor2) {
		return valor1 / valor2;
	}

	/**
	 * Este metodo sirve para calcular el inverso "1/x siendo x el numero" de un
	 * numero
	 * 
	 * @param valor1 Contendra el valor del numero a invertir
	 * @return devolvera el resultado de la inversion
	 */

	public static int inverso(int valor1) {
		return 1 / valor1;
	}

	/**
	 * Este metodo sirve para realizar el calculo de la raiz cuadrada de un numero
	 * entero
	 * 
	 * @param valor1 Contendra el valor del que se quiere calcular la raiz cuadrada
	 * @return devolvera el resultado de la raiz cuadrada
	 */

	public static double raiz(int valor1) {

		return Math.sqrt(valor1);

	}
	
}
