package Nivel1;

public class Flor implements IArticulo{

    
    private static int id = 0;
    private  int idFlor;
    private String nombre;
    private double precio;
    private String color;
    private static final String tipo = "F";

    public Flor(String nombre, double precio, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        idFlor=Flor.id++;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getID() {
        return idFlor;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }
}
