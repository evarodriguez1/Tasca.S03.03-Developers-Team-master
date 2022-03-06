package Nivel1;

public class Arbol implements IArticulo{

    private static int id = 0;
    private int idArbol;
    private String nombre;
    private double precio;
    private double altura;
    private static final String tipo = "A";

    public Arbol(String nombre, double precio, double altura) {
        this.nombre = nombre;
        this.precio = precio;
        this.altura = altura;
        idArbol=Arbol.id++;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int getID() {
        return idArbol;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public double getAltura() {
        return altura;
    }


}
