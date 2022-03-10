package Nivel1;

import java.util.ArrayList;
//nos falta una clase de ventas
public class Ticket {

    public ArrayList<Articulo> listaArticulos= new ArrayList<Articulo>();
    private static int id = 0;
    private  int idTicket;
    private static Ventas ventas = new Ventas();

    Ticket(){

        idTicket=Ticket.id++;
    }
    public ArrayList<Articulo> getTicket (){
        return listaArticulos;
    }
    public  int getID (){
        return idTicket;
    }

    public void addArticuloAlTicket (Articulo articulo){

        listaArticulos.add(articulo);
        ventas.listaVentas.add(articulo);
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
    public int getIdTicket() {
        return idTicket;
    }
    public void imprimirTicket(){
        listaArticulos.forEach(x->System.out.println("ID: D"+x.getID()+" / Nombre: "+x.getNombre()+" / Precio: €"+x.getPrecio()));
    }

}
