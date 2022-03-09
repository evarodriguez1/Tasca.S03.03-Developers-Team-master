package Nivel1;

public class Decoracion extends Articulo{
	
	private static int id = 0;

    private String material;
    private static final String tipo = "D";

    public Decoracion(String nombre, double precio, String material) {
        this.nombre = nombre;
        this.precio = precio;
        this.material = material;
        idArticulo = Decoracion.id++;
    }


    public String getMaterial() {
        return material;
    }


}



