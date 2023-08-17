/**
 * 
 */
package Ejercicio_05;

/**
 * 
 */
public class Libro {
    private String autor;
    private String titulo;
    private String ubicacion;

    public Libro(String autor, String titulo, String ubicacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", "Ficción - Fantasía");
        Libro libro2 = new Libro("George Orwell", "1984", "Ficción - Ciencia Ficción");

        System.out.println("Libro 1:");
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Ubicación: " + libro1.getUbicacion());

        System.out.println("\nLibro 2:");
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Título: " + libro2.getTitulo());
        System.out.println("Ubicación: " + libro2.getUbicacion());
    }
}
