package Nivel1;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Floristeria {

    private String nombre;
    private Stock stockArbol;
    private Stock stockDecoracion;
    private Stock stockFlor;
    private ArrayList<Ticket> dbTickets;




    public Floristeria(String nombre) {
        this.nombre = nombre;
        stockArbol= new StockArbol();
        stockDecoracion = new StockDecoracion();
        stockFlor = new StockFlor();
        dbTickets= new ArrayList<Ticket>();

    }

    //NUEVOS METODOS AÑADIDOS
    public String getNombre() {
        return nombre;
    }
    public Stock getStock(String nombre){
        Stock s1 = null;
        switch (nombre.toLowerCase()){
            case "a":
                s1= getStockArbol();
            break;
            case "d":
                s1=getStockDecoracion();
            break;
            case "f":
                s1=getStockFlor();
            break;
        }
        return s1;
    }

    public Stock getStockArbol() {
        return stockArbol;
    }

    public Stock getStockDecoracion() {
        return stockDecoracion;
    }

    public Stock getStockFlor() {
        return stockFlor;
    }

    public ArrayList<Ticket> getDbTickets() {
        return dbTickets;
    }

    /*  public void valorTotalTienda(){
            double sumatoriaTotalTienda = get + valorTotalDecoracion + valorTotalFlores;
        }

         */
    public void imprimirStocks (){
        stockArbol.imprimirStock();
        stockDecoracion.imprimirStock();
        stockFlor.imprimirStock();
    }
    public void mostrarCantidadStock() {
        stockArbol.mostrarCantidadStock();
        stockDecoracion.mostrarCantidadStock();
        stockFlor.mostrarCantidadStock();
    }
    public void sumatoriaValorStock(){
        double sA=  stockArbol.sumatoriaValorStock();
        double sD= stockDecoracion.sumatoriaValorStock();
        double sF= stockFlor.sumatoriaValorStock();
        double total = sA+sD+sF;
        System.out.println("El valor total de los stocks es de: "+ total);
    }
    public Ticket crearTicket (){
        Ticket t1 = new Ticket();
        dbTickets.add(t1);

        return t1;
    }
    public void addArtiuclosTicket (Floristeria floristeria){
        boolean ticketEnBD = false;
        int indice=ingresarInt("Ingresa 1 para añadir un articulo, de lo contrario pulse 0.");
        Object IArticulo;
        Ticket t1 = crearTicket();
        Articulo a1=null;
        int idArticulo = 0;
        String tipoArticulo= "";

        while( indice==1) {

            tipoArticulo=ingresarString("Qué tipo de artículo quieres añadir?");
            idArticulo=ingresarInt("Cual es el id del articulo que quieres añadir?");
            if(existeArticulo(idArticulo,tipoArticulo)) {
                switch (tipoArticulo.toLowerCase()) {
                    case "a":
                        t1.addArticuloAlTicket(floristeria.stockArbol.getArticulo(idArticulo, tipoArticulo));
                        stockArbol.eliminarArticulo(idArticulo); //para sacar del stock lo vendido

                        break;
                    case "d":
                        t1.addArticuloAlTicket(floristeria.stockDecoracion.getArticulo(idArticulo, tipoArticulo));
                        stockDecoracion.eliminarArticulo(idArticulo);
                        break;
                    case "f":
                        t1.addArticuloAlTicket(floristeria.stockFlor.getArticulo(idArticulo, tipoArticulo));
                        stockFlor.eliminarArticulo(idArticulo);
                }
                indice = ingresarInt("Ingresa 1 para añadir un articulo, de lo contrario pulse 0.");
            }else{
                System.out.println("El articulo no existe en nuestra base de datos");
            }

        }
        System.out.println(t1.toString());
    }

    public void mostrarTickets (){
        System.out.println(dbTickets);
    }


    public boolean existeArticulo (int idArticulo,String tipoArticulo) {
        boolean existeArticulo = false;
        switch (tipoArticulo.toLowerCase()) {
            case "a":
                for (int i = 0; i < stockArbol.dbArbol.size(); i++) {
                    if (idArticulo == stockArbol.dbArbol.get(i).getID()) {
                        existeArticulo = true;
                    }
                }

                break;
            case "d":
                for (int i = 0; i < stockDecoracion.dbDecoracion.size(); i++) {
                    if (idArticulo == stockDecoracion.dbDecoracion.get(i).getID()) {
                        existeArticulo = true;
                    }
                }
                break;
            case "f":
                for (int i = 0; i < stockFlor.dbFlor.size(); i++) {
                    if (idArticulo == stockFlor.dbFlor.get(i).getID()) {
                        existeArticulo = true;
                    }
                break;
                }

        }
        return existeArticulo;
    }


    public static int ingresarInt (String mensaje){
                Scanner input = new Scanner(System.in);
                int numero = 0;
                boolean correcto = false;
                do {
                    System.out.println(mensaje);
                    try {
                        numero = input.nextInt();
                        correcto = true;
                    } catch (InputMismatchException ex) {
                        System.out.println("Error de formato, mire que sean numeros ");
                    }
                    input.nextLine();
                } while (!correcto);
                return numero;
            }
    public static String ingresarString (String mensaje){
                Scanner input = new Scanner(System.in);
                String palabra = "";
                boolean correcto = false;
                do {
                    System.out.println(mensaje);
                    try {
                        palabra = input.nextLine();
                        correcto = true;
                    } catch (Exception ex) {
                        System.out.println("Error de formato ");
                    }
                    input.nextLine();
                } while (!correcto);

                return palabra;
            }

}


