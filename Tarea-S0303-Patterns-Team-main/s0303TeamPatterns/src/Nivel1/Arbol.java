package Nivel1;

public class Arbol extends Articulo{

    private static int id = 0;

    private double altura;
    //private static final String tipo = "A";

    public Arbol(String nombre, double precio, double altura) {
        this.nombre = nombre;
        this.precio = precio;
        this.altura = altura;
        idArticulo=Arbol.id++;
        tipo= "A";
    }

    public double getAltura() {
        return altura;
    }


}
