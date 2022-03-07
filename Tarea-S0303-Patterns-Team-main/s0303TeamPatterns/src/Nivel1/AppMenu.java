package Nivel1;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMenu {
    private static ArrayList<Floristeria> dbFloristerias= new ArrayList <Floristeria> ();
    public static int mostrarMenu() {

        int opcionElegida;
        final byte MINIMO = 0;
        final byte MAXIMO = 8;

        do {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("1. crear floristeria.");
            System.out.println("2. crear producto y añadirlo al stock.");
            System.out.println("3. imprimir stock.");
            System.out.println("4. Ventas totales.");
            System.out.println("5. imprimir cantidades stock.");
            System.out.println("6. crear ticket y mostrarlo.");
            System.out.println("7. mostrar todos los tickets.");
            System.out.println("8. eliminar ticket.");
            System.out.println("0. Salir de la aplicación.\n");
            opcionElegida = ingresarInt("Escoge una opción del 0 al 8: ");
            if (opcionElegida < MINIMO || opcionElegida > MAXIMO) {
                System.out.println("Escoge una opcion válida.");
            }
        } while (opcionElegida < MINIMO || opcionElegida > MAXIMO);
        return opcionElegida;
    }

    public static void realizarOpcionMenu() {
        Floristeria fl = null;
        boolean salir = false;
        do{
            switch(mostrarMenu()) {
                case 1:
                    String nombre = ingresarString("Cual es el nombre de la floristeria:");
                   // fl = Floristeria.crearFloristeria(nombre);

                    break;
                case 2:
                    String tipoArticulo = ingresarString("Que tipo de articulo quieres añadir (A,F,D):");

            }
        }while (!salir);
    }


    public static double ingresarDouble(String mensaje) {
        Scanner input = new Scanner (System.in);
        double numero = input.nextDouble();
        return  numero;
    }
    public static int ingresarInt(String mensaje) {
        Scanner input = new Scanner (System.in);
        int numero = input.nextInt();
        return  numero;
    }
    public static String ingresarString(String mensaje) {
        Scanner input = new Scanner (System.in);
        String palabra = input.nextLine();
        return  palabra;
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

}
