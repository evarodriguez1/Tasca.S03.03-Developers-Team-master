package Nivel1;



public class App {

    public static void main(String[]args){


        Floristeria floristeria = new Floristeria("Floristeria 1");

        floristeria.crearStock("F");

        Stock stock = new StockArbol();

        stock.crearArticulo();
        stock.crearArticulo();

        stock.imprimirStock();
        stock.mostrarCantidadStock();
        System.out.println(stock.sumatoriaValorStock());
        
        stock.eliminarArticulo(0);
        stock.mostrarCantidadStock();
        stock.imprimirStock();
        System.out.println(stock.sumatoriaValorStock());

    }

}
