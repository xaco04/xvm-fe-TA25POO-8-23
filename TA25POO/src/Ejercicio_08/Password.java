/**
 * 
 */
package Ejercicio_08;

/**
 * 
 */
import java.util.Random;

public class Password {
    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        this.contraseña = generarContraseñaAleatoria(this.longitud);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarContraseñaAleatoria(this.longitud);
    }

    private String generarContraseñaAleatoria(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contraseñaGenerada = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contraseñaGenerada.append(caracteres.charAt(indice));
        }

        return contraseñaGenerada.toString();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public static void main(String[] args) {
        Password password1 = new Password();
        Password password2 = new Password(12);

        System.out.println("Contraseña 1 (longitud " + password1.getLongitud() + "): " + password1.getContraseña());
        System.out.println("Contraseña 2 (longitud " + password2.getLongitud() + "): " + password2.getContraseña());
    }
}
