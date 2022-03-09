package Nivel1;

public class Flor extends Articulo{

    
    private static int id = 0;
    private String color;
    private static final String tipo = "F";

    public Flor(String nombre, double precio, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        idArticulo=Flor.id++;
    }

    public String getColor() {
        return color;
    }
}
