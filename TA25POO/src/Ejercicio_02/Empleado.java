/**
 * 
 */
package Ejercicio_02;

/**
 * 
 */
public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
    }

    public void mensajePagarImpuestos() {
        if (sueldo > 3000) {
            System.out.println(nombre + " debe pagar impuestos.");
        } else {
            System.out.println(nombre + " no debe pagar impuestos.");
        }
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos", 2500);
        Empleado empleado2 = new Empleado("Ana", 3200);

        System.out.println("Datos del empleado 1:");
        empleado1.imprimirDatos();
        empleado1.mensajePagarImpuestos();

        System.out.println("\nDatos del empleado 2:");
        empleado2.imprimirDatos();
        empleado2.mensajePagarImpuestos();
    }
}