package Nivel1;

public class Articulo {
    protected static int id = 0;
    protected int idArticulo;
    protected String nombre;
    protected double precio;
    protected String tipo;


    //Sobrecarga de constructores
    public Articulo() {
       tipo="";
    }



    public int getID() {
        return idArticulo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }
}
