package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String rutaArchive = "src/resources/tours.txt";

        ArrayList<Tour> todosLosTours = GestorDatos.leerToursDesdeArchivo(rutaArchive);

        System.out.println("=== TODOS LOS TOURS DE LLANQUIHUE TOUR ===");
        for (Tour t : todosLosTours) {
            System.out.println(t);
        }

        System.out.println("\n--------------------------------------------------\n");

        int precioLimite = 16000;
        System.out.println("=== TOURS FILTRADOS (Precio mayor a $" + precioLimite + ") ===");

        for (Tour t : todosLosTours) {
            if (t.getPrecio() > precioLimite) {
                System.out.println(t);
            }
        }
    }
}