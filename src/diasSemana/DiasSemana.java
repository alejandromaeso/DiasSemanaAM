package diasSemana;

import java.util.Scanner;



/**
 * @author Alejandrico
 * @version 1.0
 */

//Inicio del programa y declaraci�n de variables:

public class DiasSemana {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numeroDia;
			//String seleccion = null;
// Solicitud de datos al usuario
			System.out.println("El programa te devuelve el d�a de la semana seleccionando:");
			System.out.println("1.- Lunes.");
			System.out.println("2.- Martes.");
			System.out.println("3.- Mi�rcoles.");
			System.out.println("4.- Jueves.");
			System.out.println("5.- Viernes.");
			System.out.println("6.- S�bado.");
			System.out.println("7.- Domingo.");
			System.out.println("_____________________________________________________________");
			System.out.print("Dime un n�mero y te digo a qu� d�a de la semana corresponde: ");
			numeroDia = scanner.nextInt();
// Realizamos comparaciones y mostramos el resultado
			decisionDia(numeroDia);
		}
	}

	/**
	 * @param numeroDia parametro que utilizara el usuario para elegir el dia de la semana
	 * que quiere saber cual es
	 * 
	 */
	public static void decisionDia(int numeroDia) {
		String seleccion;
		switch (numeroDia) {
		case 1:
			seleccion = "El d�a seleccionado es LUNES";
			break;
		case 2:
			seleccion = "El d�a seleccionado es MARTES";
			break;
		case 3:
			seleccion = "El d�a seleccionado es MI�RCOLES";
			break;
		case 4:
			seleccion = "El d�a seleccionado es JUEVES";
			break;
		case 5:
			seleccion = "El d�a seleccionado es VIERNES";
			break;
		case 6:
			seleccion = "El d�a seleccionado es S�BADO";
			break;
		case 7:
			seleccion = "El d�a seleccionado es DOMINGO";
			break;
		default:
			seleccion = "ERROR: n�mero incorrecto.";
		}
		System.out.println(seleccion);
	}
}