package ar.edu.ort.tp1.unidad0.scanner;

//Debo importar el siguiente paquete
import java.util.Scanner;

public class EjemploScanner {

	private static Scanner input = new Scanner(System.in);
	private	static int numero;
	private static char letra;
	private static String nombreEjemplo;

	public static void main(String[] args) {
		System.out.println("Ingrese un numero entre 1 y 10");
		numero = input.nextInt();
		
		System.out.println("Ingrese una letra");
		letra = input.next().charAt(0);
		input.nextLine(); // limpiamos el buffer
		
		System.out.println("Ingrese un nombre");
		nombreEjemplo = input.nextLine();
		
		System.out.println("El Numero ingresado es: " + numero);
		System.out.println("La letra ingresada es: " + letra);	
		System.out.println("El nombre ingresado es: " + nombreEjemplo);
		input.close();
	}
}