package Biblioteca;

public class Revista extends MaterialBiblioteca {

    private int numeroEdicion;

    public Revista() {
    }
    public Revista(String titulo, String autor, int anio, int numeroEdicion) {
        super(titulo, autor, anio);
        this.numeroEdicion = numeroEdicion;
    }
    public int getNumeroEdicion() {
        return numeroEdicion;
    }
    public  void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Revista -> Título: " + getTitulo() + ", Autor: " + getAutor()
                + ", Año: " + getAnio() + ", Edición: " + numeroEdicion);
    }
}
