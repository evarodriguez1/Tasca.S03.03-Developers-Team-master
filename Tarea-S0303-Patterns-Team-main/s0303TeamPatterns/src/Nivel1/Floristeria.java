package Nivel1;



import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Floristeria {

    private String nombre;
    private Stock stockArbol;
    private Stock stockDecoracion;
    private Stock stockFlor;



    public Floristeria(String nombre) {
        this.nombre = nombre;
        stockArbol= new StockArbol();
        stockDecoracion = new StockDecoracion();
        stockFlor = new StockFlor();

    }


    /* // fijarse para crear varias floristerias
     public static Floristeria crearFloristeria(String nombre) {
         if (floristeria == null) {
             floristeria = new Floristeria(nombre);
         }
         return floristeria;
     }*/
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
/* public void crearStock(String tipo) {
        // String tipo = ingresarString("Elige el tipo de Articulo que deseas crear (A, F o D): ");

        String tipoLower = tipo.toLowerCase();
        switch (tipoLower) {
            case "a":
                StockArbol stockArbol = new StockArbol();
                System.out.println("se ha creado un stock de arboles");
                break;
            case "f":
                StockFlor stockFlor = new StockFlor();
                System.out.println("se ha creado un stock de flores");
                break;
            case "d":
                StockDecoracion stockDecoracion = new StockDecoracion();
                System.out.println("se ha creado un stock de decoracion");
                break;
            default:
                System.out.println("La opción no es válida, elige A, F o D.");
        }
*/

    /*
    public void valorTotalTienda(){

        double sumatoriaTotalTienda = get + valorTotalDecoracion + valorTotalFlores;
    }

     */
    public void imprimirStocks (){
        stockArbol.imprimirStock();
        stockDecoracion.imprimirStock();
        stockFlor.imprimirStock();
    }


    static double ingresarDouble(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        double doubleIngresado = input.nextDouble();
        return doubleIngresado;
    }

    static int ingresarInt(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        int intIngresado = input.nextInt();
        return intIngresado;
    }

    static String ingresarString(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        String stringIngresado = input.nextLine().toLowerCase();
        return stringIngresado;
    }

}



