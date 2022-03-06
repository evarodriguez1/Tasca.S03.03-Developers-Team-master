package Nivel1;

public class Decoracion implements IArticulo{
	
	private static int id = 0;
    private int idDecoracion;
    private String nombre;
    private double precio;
    private String material;
    private static final String tipo = "D";

    public Decoracion(String nombre, double precio, String material) {
        this.nombre = nombre;
        this.precio = precio;
        this.material = material;
        idDecoracion = Decoracion.id++;
    }


    public String getNombre() {
        return nombre;
    }

    @Override
    public int getID() {
        return idDecoracion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public String getMaterial() {
        return material;
    }


}



