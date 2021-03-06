/**
 * Esta clase contendr� los m�todos que realizar�n las restas en la c�lculadora
 * 
 * @author Jesus Rodriguez Herranz
 */
public class Resta {
	
	private static int acumulador = 0;

	public static int resta(int valor1, int valor2) {
		return valor1 + valor2;
	}
	
	public static double resta(double valor1, double valor2, double valor3) {
		return valor1 + valor2 + valor2;
	}
	
	public static int resta(int valor1, int valor2, int valor3) {
		return valor1 + valor2 + valor2;
	}
	
	public static int restaAcumulado(int nuevovalor) {
		acumulador -= nuevovalor;
		return acumulador;

	}
}
