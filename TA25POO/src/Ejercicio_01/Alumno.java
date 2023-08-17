/**
 * 
 */
package Ejercicio_01;
/**
 * 
 */
public class Alumno {
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void mensajeMayorEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", 20);
        Alumno alumno2 = new Alumno("María", 16);

        System.out.println("Datos del alumno 1:");
        alumno1.imprimirDatos();
        alumno1.mensajeMayorEdad();

        System.out.println("\nDatos del alumno 2:");
        alumno2.imprimirDatos();
        alumno2.mensajeMayorEdad();
    }
}
