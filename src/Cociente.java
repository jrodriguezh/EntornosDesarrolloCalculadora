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
	 * No es posible dividir entre cero, puesto que dara lugar a un numero
	 * infinito, Si divides un numero entre 0 dara lugar a un error tipo
	 * java.lang.ArithmeticException: / by zero. Si la division no resulta en un
	 * numero exacto, el programa devolvera una aproximacion
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
	 * java.lang.ArithmeticException: / by zero. Si la division no resulta en un
	 * numero exacto, el programa devolvera una aproximacion
	 * 
	 * 
	 * 
	 * <br>
	 * 
	 * @param valor1 Contendra el primer numero entero de la division
	 * @param valor2 Contendra el segundo numero entero de la division
	 * @return devolvera el resultado de la division
	 */

	public static double division(int valor1, int valor2) {
		
		double resultado = valor1/valor2;
		return resultado;
	}

	/**
	 * Este metodo sirve para calcular el inverso "1/x siendo x el numero" de un
	 * numero<br>
	 * 
	 * Casos especiales:<br>
	 * 
	 * No es posible dividir entre cero, puesto que daraa lugar a un numero
	 * infinito, Si divides un numero entre 0 dara lugar a un error tipo
	 * java.lang.ArithmeticException: / by zero. Si la division no resulta en un
	 * numero exacto, el programa devolvera una aproximacion
	 * 
	 * 
	 * @param valor1 Contendra el valor del numero a invertir
	 * @return devolvera el resultado de la inversion
	 */

	public static double inverso(int valor1) {
		return 1 / valor1;
	}


	/**
	 * Este metodo sirve para realizar el calculo de la raiz cuadrada de un numero
	 * numero<br>
	 * 
	 * Casos especiales:<br>
	 * 
	 * Si el argumento es NaN o menor que cero, el resultado será Nan. Si el
	 * argumento es infinito positivo. El resultado es postivo infinito. Si el
	 * argumento es cero positivo o cero negativo, el resultado sera el mismo que el
	 * argumento
	 * 
	 * @param valor1 Contendra el valor del que se quiere calcular la raiz cuadrada
	 * @return devolvera el resultado de la raiz cuadrada
	 */

	public static double raiz(double valor1) {

		return Math.sqrt(valor1);

	}
	
}
