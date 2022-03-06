package Nivel1;

import java.util.ArrayList;
//nos falta una clase de ventas
public class Ticket {

    public ArrayList<IArticulo> listaArticulos = new ArrayList<IArticulo>();

    public void addArticulo (IArticulo articulo){
        listaArticulos.add(articulo);
    }

    public void mostrarCompra(){
        listaArticulos.forEach(x-> System.out.println("ID: " + x.getTipo() +x.getID()+" / Nombre: "+x.getNombre()+" / "+x.getPrecio()));
    }

    public double totalPrecioTicket(){
        double totalVentas=0;
        for(int i=0;i<listaArticulos.size();i++){
            totalVentas+= listaArticulos.get(i).getPrecio();
        }
       return Math.round(totalVentas*100d)/100d;
    }

}
