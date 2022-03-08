package Nivel1;

import java.util.ArrayList;

public class StockFlor extends Stock{

    public ArrayList<Flor> dbFlor;

    public StockFlor() {
        dbFlor = new ArrayList<Flor>();
    }

    public void crearArticulo() {
        System.out.println("Ingrese el nombre de la flor:");
        String nombre = ingresarString();
        System.out.println("Ingrese el precio:");
        double precio = ingresarDouble();
        System.out.println("Ingrese el color:");
        String color = ingresarString();
        dbFlor.add(new Flor (nombre,precio,color));
    }

    public void eliminarArticulo(int idArticulo) {
        int i = 0;
        while (i<dbFlor.size()){
            if (idArticulo == dbFlor.get(i).getID()){
                dbFlor.remove(i);
                msjEliminación();
            } else {
                i++;
            }
        }
    }

    public void imprimirStock() {
        dbFlor.forEach(x->System.out.println("ID: F"+x.getID()+" / Nombre: "+x.getNombre()+" / "+x.getPrecio()+" / "+x.getColor()));
    }

    public void mostrarCantidadStock() {
        System.out.println("Stock Flor: " + dbFlor.size());
    }

    public double sumatoriaValorStock(){
        double valorTotalFlores = 0;

        for (int i = 0; i < dbFlor.size() ; i++){
            valorTotalFlores += dbFlor.get(i).getPrecio();
        }

        return valorTotalFlores;
    }

}
