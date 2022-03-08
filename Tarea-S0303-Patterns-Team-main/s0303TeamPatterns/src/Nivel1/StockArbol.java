package Nivel1;

import java.util.ArrayList;

public class StockArbol extends Stock {

    public ArrayList<Arbol> dbArbol;

    public StockArbol() {
        dbArbol = new ArrayList<Arbol>();
    }

    public void crearArticulo() {
        System.out.println("Ingrese el nombre del árbol:");
        String nombre = ingresarString();
        System.out.println("Ingrese el precio:");
        double precio = ingresarDouble();
        System.out.println("Ingrese la altura:");
        double altura = ingresarDouble();
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

    public void imprimirStockArbol() {
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
