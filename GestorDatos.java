package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public static ArrayList<Tour> leerToursDesdeArchivo(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue; // Si la línea está vacía, se la salta

                String[] partes = linea.split(";");

                if (partes.length == 3) {
                    String nombre = partes[0];
                    String destino = partes[1];
                    int precio = Integer.parseInt(partes[2]); // Convertimos el texto a número entero

                    Tour nuevoTour = new Tour(nombre, destino, precio);
                    listaTours.add(nuevoTour);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}