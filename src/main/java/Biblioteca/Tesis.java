package Biblioteca;

public class Tesis extends MaterialBiblioteca{
    private String universidad;

    public Tesis() {
    }

    public Tesis(String titulo, String autor, int anio, String universidad) {
        super(titulo, autor, anio);
        this.universidad = universidad;
    }

    public String getUniversidad() { return universidad; }
    public void setUniversidad(String universidad) { this.universidad = universidad; }

    @Override
    public void mostrarInfo() {
        System.out.println("Tesis -> Título: " + getTitulo() + ", Autor: " + getAutor()
                + ", Año: " + getAnio() + ", Universidad: " + universidad);
    }
}
