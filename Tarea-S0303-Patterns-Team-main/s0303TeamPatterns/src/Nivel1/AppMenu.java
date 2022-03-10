package Nivel1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class AppMenu {
    private static ArrayList<Floristeria> dbFloristerias= new ArrayList <Floristeria> ();
    Teclado teclado= new Teclado();
    public int mostrarMenu() {

        int opcionElegida=0;

            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("1. crear floristeria.");
            System.out.println("2. crear producto y añadirlo al stock.");
            System.out.println("3. Eliminar articulo.");
            System.out.println("4. imprimir stock.");
            System.out.println("5. imprimir cantidades stock.");
            System.out.println("6. crear ticket y mostrarlo.");
            System.out.println("7. mostrar todos los tickets.");
            System.out.println("8. Ventas totales.");

            System.out.println("0. Salir de la aplicación.\n");

            opcionElegida = teclado.ingresarInt("Escoge una opción del 0 al 8: ");

        return opcionElegida;
    }

    public void realizarOpcionMenu() {


        Floristeria fl = null;
        boolean salir = false;
        String floristeria= "";
        String tipoArticulo;
        do{
            switch(mostrarMenu()) {
                case 1:
                    String nombre = teclado.ingresarString("Cual es el nombre de la floristeria:");
                    crearFloristeria(nombre);

                    break;
                case 2:
                   floristeria = teclado.ingresarString("En que floristeria quieres realizar la acción?");


                   if (existeFloristeria(floristeria)){ //comprueba que existe la floristeria
                       tipoArticulo=teclado.ingresarString("Que tipo de articulo quieres añadir (A,F,D):");
                       if (tipoLetra(tipoArticulo)){ //comprueba que la letra inserida es correcta
                           getFloristeriaMenu(floristeria).getStock(tipoArticulo).crearArticulo(); //crea y añade al stock un articulo
                           msjArticuloCreado();

                       }else{
                           msjLetraErronea();
                       }
                   }else{
                       msjNoExiste();
                   }
                   break;
                case 3:
                    floristeria = teclado.ingresarString("En que floristeria quieres realizar la acción?");
                    int idArticulo;

                    if (existeFloristeria(floristeria)){ //comprueba que existe la floristeria
                        tipoArticulo=teclado.ingresarString("Que tipo de articulo quieres añadir (A,F,D):");
                        if (tipoLetra(tipoArticulo)){ //comprueba que la letra inserida es correcta
                            getFloristeriaMenu(floristeria).getStock(tipoArticulo).eliminarArticulo(teclado.ingresarInt("Ingrese el id del articulo:")); //elimina del stock un articulo
                            msjArticuloEliminado();

                        }else{
                            msjLetraErronea();
                        }
                    }else{
                        msjNoExiste();
                    }
                    break;
                case 4:
                    floristeria = teclado.ingresarString("En que floristeria quieres realizar la acción?");
                    if (existeFloristeria(floristeria)){
                        getFloristeriaMenu(floristeria).imprimirStocks();
                    }
                   break;
                case 5:
                    floristeria = teclado.ingresarString("En que floristeria quieres realizar la acción?");
                    if (existeFloristeria(floristeria)){
                        getFloristeriaMenu(floristeria).mostrarCantidadStock();
                    }
                    break;
                case 6 :
                    floristeria = teclado.ingresarString("En que floristeria quieres realizar la acción?");
                    Floristeria floristeria1 = null;

                    if (existeFloristeria(floristeria)){
                        floristeria1=getFloristeriaMenu(floristeria);
                        floristeria1.addArtiuclosTicket(floristeria1);
                    }
                    break;
                case 7 :
                    floristeria = teclado.ingresarString("En que floristeria quieres realizar la acción?");
                    if (existeFloristeria(floristeria)){
                        getFloristeriaMenu(floristeria).mostrarTickets();
                    }
                    break;
                case 8 :
                    floristeria = teclado.ingresarString("En que floristeria quieres realizar la acción?");
                    if (existeFloristeria(floristeria)){
                        getFloristeriaMenu(floristeria).sumatoriaValorStock();
                    }
                    break;
                case 0 :
                    salir=true;
                    break;
                default:
                    System.out.println("Escoge una opcion válida.");

            }
        }while (!salir);
    }


    //MENSAJES
    public static void msjNoExiste(){
        System.out.println("Lo sentimos, el nombre ingresado no existe en nuestra base de datos");
    }
    public static void msjLetraErronea(){
        System.out.println("La letra introducida es erronea vuelvalo a intentar");
    }
    public static void msjArticuloCreado(){
        System.out.println("Articulo creado con éxito");
    }
    public static void msjArticuloEliminado (){
        System.out.println("Articulo eliminado");
    }

    //
    public static void crearFloristeria(String nombre) {
        if (dbFloristerias.isEmpty()) {
            dbFloristerias.add(new Floristeria(nombre));
        }else if (!existeFloristeria(nombre)) {
            dbFloristerias.add(new Floristeria(nombre));
        }else{
            System.out.println("La floristeria ya existe");
        }

    }

    static Floristeria getFloristeriaMenu(String nombre){
        int i = 0;
        Floristeria f1= null;
        while (i<dbFloristerias.size()&& i>=0) {
            if (nombre.equalsIgnoreCase(dbFloristerias.get(i).getNombre())) {
                f1 = dbFloristerias.get(i);
                i=-1;
            } else {
                i++;
            }
        }
        return f1;


    }
    // COMPROBACIONES
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

    static boolean tipoLetra (String nombre){
       boolean letraAdecuada= false;
       if(nombre.equalsIgnoreCase("a")||nombre.equalsIgnoreCase("d")||nombre.equalsIgnoreCase("f")){
            letraAdecuada=true;
        }
       return letraAdecuada;
    }

}
