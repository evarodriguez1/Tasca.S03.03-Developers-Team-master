package Nivel1;


import java.util.Scanner;

public class Stock implements IStock{

    //constructor
    public Stock (){



    }

    @Override
    public void crearArticulo() {

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


    }
    public void mostrarCantidadStock(){

    }
    public double sumatoriaValorStock(){
        return 0;
    }

    //SCANNERS
    static double ingresarDouble () {
        Scanner input = new Scanner (System.in);
        double doubleIngresado =input.nextDouble();
        return doubleIngresado;
    }
    static int ingresarInt () {
        Scanner input = new Scanner (System.in);
        int intIngresado =input.nextInt();
        return intIngresado;
    }
    static String ingresarString () {
        Scanner input = new Scanner(System.in);

        String stringIngresado = input.nextLine().toLowerCase();
        return stringIngresado;
    }

    //TEXTOS
    public void msjEliminación () {
        System.out.println("El articulo ha sido eliminado");
    }


}
