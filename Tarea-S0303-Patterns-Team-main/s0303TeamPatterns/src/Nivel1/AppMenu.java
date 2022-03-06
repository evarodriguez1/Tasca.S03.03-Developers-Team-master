package Nivel1;

import java.util.Scanner;

public class AppMenu {

    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        int opcionElegida;
        final byte MINIMO = 0;
        final byte MAXIMO = 8;

        do {
            System.out.println("\nMENÃº PRINCIPAL");
            System.out.println("1. crear floristeria.");
            System.out.println("2. crear producto y añadirlo al stock.");
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
