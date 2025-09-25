package Biblioteca;

public class Main {
    public static void main(String[] args) {

        MaterialBiblioteca[] materiales = new MaterialBiblioteca[3];

        materiales[0] = new Libro("El Quijote", "Miguel de Cervantes", 1605, "Novela");
        materiales[1] = new Revista("National Geographic", "Varios", 2024, 210);
        materiales[2] = new Tesis("Inteligencia Artificial", "Ana Pérez", 2023, "Universidad Nacional");

        for (MaterialBiblioteca material : materiales) {
            material.mostrarInfo();
        }
    }
}
