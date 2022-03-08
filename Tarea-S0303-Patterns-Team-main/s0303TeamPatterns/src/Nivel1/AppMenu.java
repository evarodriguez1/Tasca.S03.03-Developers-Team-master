package Nivel1;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMenu {
    private static ArrayList<Floristeria> dbFloristerias= new ArrayList <Floristeria> ();
    public int mostrarMenu() {

        int opcionElegida=0;
        final byte MINIMO = 0;
        final byte MAXIMO = 8;

       // do {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("1. crear floristeria.");
            System.out.println("2. crear producto y añadirlo al stock.");
            System.out.println("3. imprimir stock.");
            System.out.println("4. imprimir cantidades stock.");
            System.out.println("5. crear ticket y mostrarlo.");
            System.out.println("6. mostrar todos los tickets.");
            System.out.println("7. Ventas totales.");
            System.out.println("8. Eliminar articulo.");
            System.out.println("0. Salir de la aplicación.\n");

            opcionElegida = ingresarInt("Escoge una opción del 0 al 8: ");
            //if (opcionElegida < MINIMO || opcionElegida > MAXIMO) {
             //   System.out.println("Escoge una opcion válida.");
           // }
       // } while (opcionElegida < MINIMO || opcionElegida > MAXIMO);
        return opcionElegida;
    }

    public void realizarOpcionMenu() {


        Floristeria fl = null;
        boolean salir = false;
        String floristeria= "";
        do{
            switch(mostrarMenu()) {
                case 1:
                    String nombre = ingresarString("Cual es el nombre de la floristeria:");
                    // fl = Floristeria.crearFloristeria(nombre);
                    crearFloristeria(nombre);

                    break;
                case 2:
                   floristeria = ingresarString("En que floristeria quieres realizar la acción?");
                   String tipoArticulo = ingresarString("Que tipo de articulo quieres añadir (A,F,D):");


                   if (existeFloristeria(floristeria)){ //comprueba que existe la floristeria
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
                    floristeria = ingresarString("En que floristeria quieres realizar la acción?");
                    if (existeFloristeria(floristeria)){
                        getFloristeriaMenu(floristeria).imprimirStocks();
                    }
                   break;
                case 4:
                    floristeria = ingresarString("En que floristeria quieres realizar la acción?");
                    if (existeFloristeria(floristeria)){
                        getFloristeriaMenu(floristeria).mostrarCantidadStock();
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

    // SCANNERS
    public static double ingresarDouble(String mensaje) {
        System.out.println(mensaje);
        Scanner input = new Scanner (System.in);
        double numero = input.nextDouble();
        return  numero;
    }
    public static int ingresarInt(String mensaje) {
        System.out.println(mensaje);
        Scanner input = new Scanner (System.in);
        int numero = input.nextInt();
        return  numero;
    }
    public static String ingresarString(String mensaje) {
        System.out.println(mensaje);
        Scanner input = new Scanner (System.in);
        String palabra = input.nextLine();
        return  palabra;
    }

    //MENSAJES
    public static void msjNoExiste(){
        System.out.println("Lo sentimos, el nombre ingresado no existe en nuestra base de datos");
    }
    public static void msjLetraErronea(){
        System.out.println("La letra introducida es erronea vulevalo a intentar");
    }
    public  static void msjArticuloCreado(){
        System.out.println("Articulo creado con éxito");
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
