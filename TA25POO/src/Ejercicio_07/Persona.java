/**
 * 
 */
package Ejercicio_07;

/**
 * 
 */

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    private static final char SEXO_POR_DEFECTO = 'H';
    private static final double PESO_POR_DEFECTO = 0;
    private static final double ALTURA_POR_DEFECTO = 0;
    
    public Persona() {
        this("", 0, SEXO_POR_DEFECTO);
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generarDNI();
        this.peso = PESO_POR_DEFECTO;
        this.altura = ALTURA_POR_DEFECTO;
    }

    public Persona(String nombre, int edad, char sexo, String DNI, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
    }

    private String generarDNI() {
        return "12345678A";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Mar", 25, 'M');
        Persona persona3 = new Persona("Xavi", 25, 'H', "87654321B", 70.5, 1.75);
        
        System.out.println("Persona 1: " + persona1.getNombre());
        System.out.println("Persona 2: " + persona2.getNombre());
        System.out.println("Persona 3: " + persona3.getNombre());
    }
}
