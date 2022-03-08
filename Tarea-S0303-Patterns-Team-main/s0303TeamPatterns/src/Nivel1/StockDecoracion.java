package Nivel1;

import java.util.ArrayList;

public class StockDecoracion extends Stock{

    public ArrayList<Decoracion> dbDecoracion;

    public StockDecoracion() {
        dbDecoracion = new ArrayList<Decoracion>();
    }

    public void crearArticulo() {
        System.out.println("Ingrese el nombre de la decoración:");
        String nombre = ingresarString();
        System.out.println("Ingrese el precio:");
        double precio = ingresarDouble();
        System.out.println("Ingrese el material:");
        String material = ingresarString();
        dbDecoracion.add(new Decoracion (nombre,precio,material));
    }

    public void eliminarArticulo(int idArticulo) {
        int i = 0;
        while (i<dbDecoracion.size()){
            if (idArticulo == dbDecoracion.get(i).getID()){
                dbDecoracion.remove(i);
                msjEliminación();
            } else {
                i++;
            }
        }
    }

    public void imprimirStockDecoracion() {
        dbDecoracion.forEach(x->System.out.println("ID: D"+x.getID()+" / Nombre: "+x.getNombre()+" / "+x.getPrecio()+" / "+x.getMaterial()));
    }

    public void mostrarCantidadStock() {
        System.out.println("Stock Decoración: " + dbDecoracion.size());
    }

    public double sumatoriaValorStock(){
        double valorTotalDecoracion = 0;

        for (int i = 0; i < dbDecoracion.size() ; i++){
            valorTotalDecoracion += dbDecoracion.get(i).getPrecio();
        }

        return valorTotalDecoracion;
    }

}
