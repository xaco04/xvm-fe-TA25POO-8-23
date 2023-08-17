/**
 * 
 */
package Ejercicio_03;

/**
 * 
 */
public class Operaciones {
    private int valor1;
    private int valor2;

    public Operaciones(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int sumar() {
        return valor1 + valor2;
    }

    public int restar() {
        return valor1 - valor2;
    }

    public int multiplicar() {
        return valor1 * valor2;
    }

    public double dividir() {
        if (valor2 != 0) {
            return (double) valor1 / valor2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones(10, 5);

        System.out.println("Suma: " + operaciones.sumar());
        System.out.println("Resta: " + operaciones.restar());
        System.out.println("Multiplicación: " + operaciones.multiplicar());

        try {
            System.out.println("División: " + operaciones.dividir());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
