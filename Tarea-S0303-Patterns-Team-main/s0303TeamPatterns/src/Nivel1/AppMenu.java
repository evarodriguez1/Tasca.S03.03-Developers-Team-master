package Nivel1;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMenu {
    private static ArrayList<Floristeria> dbFloristerias = new ArrayList <Floristeria> ();
    public static ArrayList<StockArbol> dbArbol = new ArrayList<StockArbol>();
    public static ArrayList<Flor> dbFlor = new ArrayList<Flor>();
    public ArrayList<Decoracion> dbDecoracion = new ArrayList<Decoracion>();


    //metodos de menu
    public static int mostrarMenu() {

        int opcionElegida = 0;
        final byte MINIMO = 0;
        final byte MAXIMO = 8;

        do {
            System.out.println("Escoge una opción del 0 al 8: ");
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("1. crear floristeria.");
            System.out.println("2. crear articulo y añadirlo al stock.");
            System.out.println("3. imprimir stock.");
            System.out.println("4. Ventas totales.");
            System.out.println("5. imprimir cantidades stock.");
            System.out.println("6. crear ticket y mostrarlo.");
            System.out.println("7. mostrar todos los tickets.");
            System.out.println("8. eliminar ticket.");
            System.out.println("0. Salir de la aplicación.\n");
            opcionElegida = ingresarInt();
            if (opcionElegida < MINIMO || opcionElegida > MAXIMO) {
                System.out.println("Escoge una opcion válida.");
            }
        } while (opcionElegida < MINIMO || opcionElegida > MAXIMO);
        return opcionElegida;
    }
    public static void realizarOpcionMenu() {
        boolean salir = false;

        while(salir == false) {
            switch (mostrarMenu()) {
                case 1:
                    System.out.println("Cual es el nombre de la floristeria:");
                    String nombre = ingresarString();
                    crearFloristeria(nombre);
                    break;
                case 2:
                    System.out.println("Que tipo de articulo quieres añadir (A,F,D):");
                    String tipoArticulo = ingresarString();
                    crearStockYArticulo(tipoArticulo);
                    break;
                case 3:
                    /*
                    System.out.println("De qué tipo de artículo quieres ver el Stock (A,F,D):");
                    tipoArticulo = ingresarString();

                    imprimirStock(tipoArticulo);

                     */
                case 4:
                    //ventas totales
                case 5:
                    //imprimir cantidades de stock
                case 6:
                    //crear tickets y mostrarlos
                case 7:
                    //mostrar todos los tickets
                case 8:
                    //eliminar tickets
                case 0:
                    salir = true;
            }
        }
    }

    private static void imprimirStock(String tipo) {
        String tipoLower = tipo.toLowerCase();
        switch (tipoLower){
            case "a":

        }

    }

    //metodos de desarrollo del menu
    public static void crearFloristeria(String nombre) {
        if (dbFloristerias.isEmpty()) { //si esta vacio, crearla
            dbFloristerias.add(new Floristeria(nombre));
        }else if (!existeFloristeria(nombre)) { //si el nombre no existe, crearla
            dbFloristerias.add(new Floristeria(nombre));
        }else{
            System.out.println("La floristeria ya existe");
        }

    }

    //aqui meti dos funciones en una, vemos si lo dejamos a asi o separamos
    //habria que agregar verificaciones
    public static void crearStockYArticulo(String tipo) {
        String tipoLower = tipo.toLowerCase();
        switch (tipoLower) {
            case "a":
                StockArbol stockArbol1 = new StockArbol();
                dbArbol.add(stockArbol1);
                System.out.println("se ha creado un stock de arboles");
                stockArbol1.crearArticulo();
                System.out.println("se ha creado el articulo del tipo arbol");
                break;
            case "f":
                StockFlor stockFlor = new StockFlor();
                System.out.println("se ha creado un stock de flores");
                stockFlor.crearArticulo();
                System.out.println("se ha creado el articulo del tipo flor");
                break;
            case "d":
                StockDecoracion stockDecoracion = new StockDecoracion();
                System.out.println("se ha creado un stock de decoracion");
                stockDecoracion.crearArticulo();
                System.out.println("se ha creado el articulo del tipo decoracion");
                break;
            default:
                System.out.println("La opción no es válida, elige A, F o D.");
        }

    }

/*
    public void crearArticulo(){

        String tipoLower=tipo.toLowerCase();
        switch (tipoLower) {
            case "a":
                crearArbol();
                break;
            case "f":
                crearFlor();
                break;
            case "d":
                crearDecoracion();
                break;
            default:
                System.out.println("La opción no es válida, elige A, F o D.");


        }

    }

 */

    //VERIFICACIONES
    static boolean existeFloristeria(String nombre) {
        boolean floristeriaEnApp = false;
        int indice = 0;

        while((floristeriaEnApp == false) && (indice < dbFloristerias.size())) {
            if(nombre.equalsIgnoreCase(dbFloristerias.get(indice).getNombre())){
                floristeriaEnApp = true;
            } else {
                indice ++;
            }
        }

        return floristeriaEnApp;
    }
    //falta existe stock o existe articulo o ambos

    //METODOS SCANNER
    public static double ingresarDouble() {
        Scanner input = new Scanner (System.in);
        double numero = input.nextDouble();
        return  numero;
    }
    public static int ingresarInt() {
        Scanner input = new Scanner (System.in);
        int numero = input.nextInt();
        return  numero;
    }
    public static String ingresarString() {
        Scanner input = new Scanner (System.in);
        String palabra = input.nextLine();
        return  palabra;
    }
}
