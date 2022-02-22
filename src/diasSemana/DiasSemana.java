package diasSemana;

import java.util.Scanner;



/**
 * @author Alejandrico
 * @version 1.0
 */

//Inicio del programa y declaración de variables:

public class DiasSemana {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numeroDia;
			//String seleccion = null;
// Solicitud de datos al usuario
			System.out.println("El programa te devuelve el día de la semana seleccionando:");
			System.out.println("1.- Lunes.");
			System.out.println("2.- Martes.");
			System.out.println("3.- Miércoles.");
			System.out.println("4.- Jueves.");
			System.out.println("5.- Viernes.");
			System.out.println("6.- Sábado.");
			System.out.println("7.- Domingo.");
			System.out.println("_____________________________________________________________");
			System.out.print("Dime un número y te digo a qué día de la semana corresponde: ");
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
			seleccion = "El día seleccionado es LUNES";
			break;
		case 2:
			seleccion = "El día seleccionado es MARTES";
			break;
		case 3:
			seleccion = "El día seleccionado es MIÉRCOLES";
			break;
		case 4:
			seleccion = "El día seleccionado es JUEVES";
			break;
		case 5:
			seleccion = "El día seleccionado es VIERNES";
			break;
		case 6:
			seleccion = "El día seleccionado es SÁBADO";
			break;
		case 7:
			seleccion = "El día seleccionado es DOMINGO";
			break;
		default:
			seleccion = "ERROR: número incorrecto.";
		}
		System.out.println(seleccion);
	}
}