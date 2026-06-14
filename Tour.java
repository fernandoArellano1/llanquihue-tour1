package model;

public class Tour {
    // Atributos solicitados para el caso Llanquihue Tour
    private String nombre;
    private String destino;
    private int precio;

    public Tour(String nombre, String destino, int precio) {
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }

    // Método toString para que al imprimir el objeto se vea ordenado
    @Override
    public String toString() {
        return "Tour: " + nombre + " | Destino: " + destino + " | Precio: $" + precio;
    }
}
