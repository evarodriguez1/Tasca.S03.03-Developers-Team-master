package Nivel1;


import java.util.Scanner;

public class Stock implements IStock{

    //SCANNERS
    static double ingresarDouble (String mensaje) {
        Scanner input = new Scanner (System.in);
        System.out.println(mensaje);
        double doubleIngresado =input.nextDouble();
        return doubleIngresado;
    }
    static int ingresarInt (String mensaje) {
        Scanner input = new Scanner (System.in);
        System.out.println(mensaje);
        int intIngresado =input.nextInt();
        return intIngresado;
    }
    static String ingresarString (String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        String stringIngresado = input.nextLine().toLowerCase();
        return stringIngresado;
    }
    //TEXTOS
    public void msjEliminación () {
        System.out.println("El articulo ha sido eliminado");
    }


    public Stock (){



    }

    public void crearArticulo(){
        /*
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

         */
    }

    public void eliminarArticulo(int idArticulo){
        /*
        int id=ingresarInt("Ingrese el ID del Articulo:");
        String tipoLower=tipo.toLowerCase();

        switch (tipoLower) {
            case "a":
                eliminarArbol(id);
                break;
            case "f":
                eliminarFlor(id);
                break;
            case "d":
                eliminarDecoracion(id);
                break;
            default:
                System.out.println("La opción no es válida, elige A, F o D.");
        }

         */
    }

    public void imprimirStock(){

       /* getDbArbol();
        getDbDecoracion();
        getDbFlor();

        */
    }

    public void mostrarCantidadStock(){

    }

    public double sumatoriaValorStock(){
        return 0;
    }


}
