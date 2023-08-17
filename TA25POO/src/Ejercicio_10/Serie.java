/**
 * 
 */
package Ejercicio_10;

/**
 * 
 */

public class Serie {
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this("", 3, false, "", "");
    }

    public Serie(String titulo, String creador) {
        this(titulo, 3, false, "", creador);
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this(titulo, numeroTemporadas, false, genero, creador);
    }

    public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }


    public static void main(String[] args) {
        Serie serie1 = new Serie();
        Serie serie2 = new Serie("Breaking Bad", "Vince Gilligan");
        Serie serie3 = new Serie("Game of Thrones", 8, "Fantasy", "George R.R. Martin");
        Serie serie4 = new Serie("Stranger Things", 5, true, "Science Fiction", "Duffer Brothers");

        System.out.println("Serie 1:");
        System.out.println("Título: " + serie1.titulo);
        System.out.println("Temporadas: " + serie1.numeroTemporadas);
        System.out.println("Entregado: " + serie1.entregado);
        System.out.println("Género: " + serie1.genero);
        System.out.println("Creador: " + serie1.creador);

        System.out.println("\nSerie 2:");
        System.out.println("Título: " + serie2.titulo);
        System.out.println("Temporadas: " + serie2.numeroTemporadas);
        System.out.println("Entregado: " + serie2.entregado);
        System.out.println("Género: " + serie2.genero);
        System.out.println("Creador: " + serie2.creador);

        System.out.println("\nSerie 3:");
        System.out.println("Título: " + serie3.titulo);
        System.out.println("Temporadas: " + serie3.numeroTemporadas);
        System.out.println("Entregado: " + serie3.entregado);
        System.out.println("Género: " + serie3.genero);
        System.out.println("Creador: " + serie3.creador);

        System.out.println("\nSerie 4:");
        System.out.println("Título: " + serie4.titulo);
        System.out.println("Temporadas: " + serie4.numeroTemporadas);
        System.out.println("Entregado: " + serie4.entregado);
        System.out.println("Género: " + serie4.genero);
        System.out.println("Creador: " + serie4.creador);
    }
}
