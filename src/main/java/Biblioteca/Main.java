package Biblioteca;

public class Main {
    public static void main(String[] args) {

        // Arreglo polimórfico de tipo MaterialBiblioteca
        MaterialBiblioteca[] materiales = new MaterialBiblioteca[3];

        materiales[0] = new Libro("El Quijote", "Miguel de Cervantes", 1605, "Novela");
        materiales[1] = new Revista("National Geographic", "Varios", 2024, 210);
        materiales[2] = new Tesis("Inteligencia Artificial", "Ana Pérez", 2023, "Universidad Nacional");

        // Polimorfismo: cada objeto ejecuta su propia versión de mostrarInfo()
        for (MaterialBiblioteca material : materiales) {
            material.mostrarInfo();
        }
    }
}
