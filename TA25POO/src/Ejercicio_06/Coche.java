/**
 * 
 */
package Ejercicio_06;

/**
 * 
 */
public class Coche {
    private String marca;
    private String modelo;
    private int cilindrada;
    private double potencia;

    public Coche(String marca, String modelo, int cilindrada, double potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 1600, 120.5);
        Coche coche2 = new Coche("Ford", "Focus", 1800, 140.2);

        System.out.println("Coche 1:");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Cilindrada: " + coche1.getCilindrada() + " cc");
        System.out.println("Potencia: " + coche1.getPotencia() + " CV");

        System.out.println("\nCoche 2:");
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Modelo: " + coche2.getModelo());
        System.out.println("Cilindrada: " + coche2.getCilindrada() + " cc");
        System.out.println("Potencia: " + coche2.getPotencia() + " CV");
    }
}
