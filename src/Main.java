import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		int opcionSuma;
		int opcionResta;
		int opcionMultiplicar;
		int opcionDividir;

		System.out.println("Bienvenido a CALCULADORA:");

		while (!salir) {

			System.out.println("Selecciona cual de las operaciones deseas usar:");
			
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar/Potencia");
			System.out.println("4. Dividir/Raiz Cuadrada");
			System.out.println("5. Salir");
			System.out.println(" ");

			opcion = sn.nextInt();

			switch (opcion) {
			case 1:

				System.out.println("Ha elegido usted, Sumar. ¿Cuál de las siguientes sumas desea realizar?");
				System.out.println(" ");
				System.out.println("1. Sumar dos números reales");
				System.out.println("2. Sumar dos números enteros");
				System.out.println("3. Sumar tres número reales");
				System.out.println("4. Realizar una suma acumulativa");
				System.out.println("5. Salir");
				System.out.println(" ");
				System.out.println("Selecciona una de las opciones a continuación:");
				opcionSuma = sn.nextInt();

				switch (opcionSuma) {
				case 1:
					System.out.println("Introduzca los dos números reales");
					double sumdec1 = sn.nextDouble();
					double sumdec2 = sn.nextDouble();
					System.out.println(Suma.suma(sumdec1, sumdec2));
					break;
				case 2:
					System.out.println("Introduzca los dos números enteros");
					int sument1 = sn.nextInt();
					int sument2 = sn.nextInt();
					System.out.println(Suma.suma(sument1, sument2));
					break;
				case 3:
					System.out.println("Introduzca los tres números reales");
					double sumdec3 = sn.nextDouble();
					double sumdec4 = sn.nextDouble();
					double sumdec5 = sn.nextDouble();
					System.out.println(Suma.suma(sumdec3, sumdec4, sumdec5));
					break;
				case 4:
					System.out.println("Introduzca el valor acumulado");
					System.out.println("Cuando desee salir, tecleé " + "salir" + " ");
					int valacumul = sn.nextInt();
					while (valacumul != 0) {
						System.out.println(Suma.sumaAcumulado(valacumul));
					}
					break;
				}
				break;

			case 2:

				System.out.println("Ha elegido usted, Restar. ¿Cuál de las siguientes restas desea realizar?");
				System.out.println(" ");
				System.out.println("1. restar dos números reales");
				System.out.println("2. restar dos números enteros");
				System.out.println("3. restar tres número reales");
				System.out.println("4. Realizar una resta acumulativa");
				System.out.println("5. Salir");
				System.out.println(" ");
				System.out.println("Selecciona una de las opciones a continuación:");
				opcionResta = sn.nextInt();

				switch (opcionResta) {
				case 1:
					System.out.println("Introduzca los dos números reales");
					double sumdec1 = sn.nextDouble();
					double sumdec2 = sn.nextDouble();
					System.out.println(Resta.resta(sumdec1, sumdec2));
					break;
				case 2:
					System.out.println("Introduzca los dos números enteros");
					int sument1 = sn.nextInt();
					int sument2 = sn.nextInt();
					System.out.println(Resta.resta(sument1, sument2));
					break;
				case 3:
					System.out.println("Introduzca los tres números reales");
					double sumdec3 = sn.nextDouble();
					double sumdec4 = sn.nextDouble();
					double sumdec5 = sn.nextDouble();
					System.out.println(Resta.resta(sumdec3, sumdec4, sumdec5));
					break;
				case 4:
					System.out.println("Introduzca el valor acumulado");
					System.out.println("Cuando desee salir, tecleé " + "salir" + " ");
					int valacumul = sn.nextInt();
					System.out.println(Resta.restaAcumulado(valacumul));

					break;
				}

				break;
			case 3:

				System.out.println(
						"Ha elegido usted, Multiplicar/Potencia. ¿Cuál de las siguientes operaciones desea realizar?");
				System.out.println(" ");
				System.out.println("1. Multiplicar dos números reales");
				System.out.println("2. Multiplicar dos números enteros");
				System.out.println("3. Multiplicar tres número reales");
				System.out.println("4. Realizar el cálculo de una potencia");
				System.out.println("5. Salir");
				System.out.println(" ");
				System.out.println("Selecciona una de las opciones a continuación:");
				opcionMultiplicar = sn.nextInt();

				switch (opcionMultiplicar) {
				case 1:
					System.out.println("Introduzca los dos números reales");
					double muldec1 = sn.nextDouble();
					double muldec2 = sn.nextDouble();
					System.out.println(Producto.producto(muldec1, muldec2));
					break;
				case 2:
					System.out.println("Introduzca los dos números enteros");
					int mulent1 = sn.nextInt();
					int mulent2 = sn.nextInt();
					System.out.println(Producto.producto(mulent1, mulent2));
					break;
				case 3:
					System.out.println("Introduzca los tres números reales");
					double muldec3 = sn.nextDouble();
					double muldec4 = sn.nextDouble();
					double muldec5 = sn.nextDouble();
					System.out.println(Producto.producto(muldec3, muldec4, muldec5));
					break;
				case 4:
					System.out.println("Introduzca el valor de la base");
					int base = sn.nextInt();
					System.out.println("Introduzca el valor del exponente");
					int exponente = sn.nextInt();
					System.out.println(Producto.potencia(base, exponente));
					break;
				}

				break;
			case 4:

				System.out.println(
						"Ha elegido usted, Dividir/Raiz Cuadrada. ¿Cuál de las siguientes operaciones desea realizar?");
				System.out.println(" ");
				System.out.println("1. Dividir dos números reales");
				System.out.println("2. Dividir dos números enteros");
				System.out.println("3. Calcular el inverso");
				System.out.println("4. Calcular una raiz cuadrada");
				System.out.println("5. Salir");
				System.out.println(" ");
				System.out.println("Selecciona una de las opciones a continuación:");
				opcionDividir = sn.nextInt();

				switch (opcionDividir) {
				case 1:
					System.out.println("Introduzca los dos números reales");
					double divdec1 = sn.nextDouble();
					double divdec2 = sn.nextDouble();
					System.out.println(Cociente.division(divdec1, divdec2));
					break;
				case 2:
					System.out.println("Introduzca los dos números enteros");
					int divent1 = sn.nextInt();
					int divent2 = sn.nextInt();
					System.out.println(Cociente.division(divent1, divent2));
					break;
				case 3:
					System.out.println("Introduzca de que número quiere obtener el inverso");
					double inverso = sn.nextDouble();
					System.out.println(Cociente.inverso(inverso));
					break;
				case 4:
					System.out.println("Introduzca el valor del radicando");
					double radicando = sn.nextDouble();
					System.out.println(Cociente.raiz(radicando));
					break;
				}

				break;
			case 5:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 4");

				sn.next();
			}
		}

	}

}
