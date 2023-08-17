/**
 * 
 */
package Ejercicio_09;

/**
 * 
 */

public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    private static final String COLOR_POR_DEFECTO = "blanco";
    private static final char CONSUMO_POR_DEFECTO = 'F';
    private static final double PRECIO_POR_DEFECTO = 100;
    private static final double PESO_POR_DEFECTO = 5;

    private static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};

    public Electrodomestico() {
        this.precioBase = PRECIO_POR_DEFECTO;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
    }

    public Electrodomestico(double precioBase, double peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private void comprobarColor(String color) {
        color = color.toLowerCase();
        for (String c : COLORES_DISPONIBLES) {
            if (c.equals(color)) {
                this.color = color;
                return;
            }
        }
        this.color = COLOR_POR_DEFECTO;
    }

    private void comprobarConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = CONSUMO_POR_DEFECTO;
        }
    }


    public static void main(String[] args) {
        Electrodomestico electrodomestico1 = new Electrodomestico();
        System.out.println("Electrodoméstico 1:");
        System.out.println("Precio: " + electrodomestico1.precioBase);
        System.out.println("Color: " + electrodomestico1.color);
        System.out.println("Consumo energético: " + electrodomestico1.consumoEnergetico);
        System.out.println("Peso: " + electrodomestico1.peso);
        
        Electrodomestico electrodomestico2 = new Electrodomestico(250, 10);
        System.out.println("\nElectrodoméstico 2:");
        System.out.println("Precio: " + electrodomestico2.precioBase);
        System.out.println("Color: " + electrodomestico2.color);
        System.out.println("Consumo energético: " + electrodomestico2.consumoEnergetico);
        System.out.println("Peso: " + electrodomestico2.peso);
        
        Electrodomestico electrodomestico3 = new Electrodomestico(300, "rojo", 'B', 15);
        System.out.println("\nElectrodoméstico 3:");
        System.out.println("Precio: " + electrodomestico3.precioBase);
        System.out.println("Color: " + electrodomestico3.color);
        System.out.println("Consumo energético: " + electrodomestico3.consumoEnergetico);
        System.out.println("Peso: " + electrodomestico3.peso);
        
        

    }
}
