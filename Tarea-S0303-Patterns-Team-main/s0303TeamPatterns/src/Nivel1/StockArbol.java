package Nivel1;

import java.util.ArrayList;

public class StockArbol extends Stock {

    public ArrayList<Arbol> dbArbol;

    public StockArbol() {
        dbArbol = new ArrayList<Arbol>();
    }

    public void crearArticulo() {
        String nombre = ingresarString("Nombre Arbol:");
        double precio = ingresarDouble("Ingrese el precio:");
        double altura = ingresarDouble("Ingrese la altura:");
        dbArbol.add(new Arbol(nombre, precio, altura));

    }

    public void eliminarArticulo(int idArticulo) {
        int i = 0;
        while (i < dbArbol.size()) {
            if (idArticulo == dbArbol.get(i).getID()) {
                dbArbol.remove(i);
                msjEliminación();
            } else {
                i++;
            }
        }
    }

    public void imprimirStock() {
        dbArbol.forEach(x -> System.out.println("ID: A" + x.getID() + " / Nombre: " + x.getNombre() + " / Precio: €" + x.getPrecio() + " / Altura: " + x.getAltura() + "mts."));

    }

    public void mostrarCantidadStock() {
        System.out.println("Stock Árboles: " + dbArbol.size());

    }

    public double sumatoriaValorStock(){
        double valorTotalArboles = 0;
        for (int i = 0; i < dbArbol.size() ; i++){
            valorTotalArboles += dbArbol.get(i).getPrecio();
        }
        return valorTotalArboles;
    }

}
