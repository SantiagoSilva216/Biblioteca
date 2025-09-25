package Biblioteca;

public class Libro extends MaterialBiblioteca {
    private String genero;

    public Libro() {
    }
    public Libro(String titulo, String autor, int anio, String genero) {
        super(titulo, autor, anio);
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Libro -> Título: " + getTitulo() + ", Autor: " + getAutor()
                + ", Año: " + getAnio() + ", Género: " + genero);
    }
}

