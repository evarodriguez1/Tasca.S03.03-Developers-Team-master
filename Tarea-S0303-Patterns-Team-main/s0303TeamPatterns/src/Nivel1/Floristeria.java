package Nivel1;



import java.util.ArrayList;
import java.util.Scanner;

public class Floristeria {

    private String nombre;

    private static Floristeria floristeria;
    private static ArrayList<Floristeria> dbFloristerias= new ArrayList <Floristeria> ();

    public Floristeria(String nombre) {
        this.nombre = nombre;
    }

   /* // fijarse para crear varias floristerias
    public static Floristeria crearFloristeria(String nombre) {
        if (floristeria == null) {
            floristeria = new Floristeria(nombre);
        }
        return floristeria;
    }*/
   public String getNombre() {
       return nombre;
   }
    public void crearFloristeria(String nombre) {
        if (dbFloristerias.isEmpty()) {
            dbFloristerias.add(new Floristeria(nombre));
        }else if (!existeFloristeria(nombre)) {
            dbFloristerias.add(new Floristeria(nombre));
        }else{
            System.out.println("La floristeria ya existe");
        }


    }

    static boolean existeFloristeria(String nombre) {
        boolean floristeriaEnApp = false;
        int indice=0;

        while( floristeriaEnApp==false&&indice<dbFloristerias.size()) {
            if(nombre.equalsIgnoreCase(dbFloristerias.get(indice).getNombre())){
                floristeriaEnApp =true;
            } else {
                indice ++;
            }
        }

        return floristeriaEnApp;
    }




    public static void crearStock(String tipo) {
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


    /*
    public void valorTotalTienda(){

        double sumatoriaTotalTienda = get + valorTotalDecoracion + valorTotalFlores;
    }

     */

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



