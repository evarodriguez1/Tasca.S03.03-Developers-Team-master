package Nivel1;

import java.util.ArrayList;

public class StockFlor extends Stock{



    public StockFlor() {

    }

    public void crearArticulo() {
        String nombre = ingresarString("Nombre Flor:");
        double precio = ingresarDouble("Ingrese el precio:");
        String color = ingresarString("Ingrese el color:");
        dbFlor.add(new Flor (nombre,precio,color));
    }

    public void eliminarArticulo(int idArticulo) {
        int i = 0;
        while (i<dbFlor.size()){
            if (idArticulo == dbFlor.get(i).getID()){
                dbFlor.remove(i);

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
