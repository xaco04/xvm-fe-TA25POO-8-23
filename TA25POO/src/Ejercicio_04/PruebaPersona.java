/**
 * 
 */
package Ejercicio_04;

/**
 * 
 */

import java.util.Scanner;

public class PruebaPersona {
	 public static void main(String[] args) {
	     try (Scanner scanner = new Scanner(System.in)) {
			Persona persona1 = new Persona();
			 Persona persona2 = new Persona();

			 System.out.print("Introduce el nombre de la primera persona: ");
			 String nombre1 = scanner.nextLine();
			 persona1.setNombre(nombre1);

			 System.out.print("Introduce el nombre de la segunda persona: ");
			 String nombre2 = scanner.nextLine();
			 persona2.setNombre(nombre2);

			 System.out.println();
			 System.out.println("Saludos:");
			 persona1.saludar();
			 persona2.saludar();
		}
	 }
}
