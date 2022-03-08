package Nivel1;



import java.util.ArrayList;
import java.util.Scanner;

public class Floristeria {

    private String nombre;

    private static Floristeria floristeria;

    //contructor
    public Floristeria(String nombre) {
        this.nombre = nombre;
    }

    //NUEVOS METODOS AÑADIDOS
   public String getNombre() {
       return nombre;
   }


    /*
    public void valorTotalTienda(){

        double sumatoriaTotalTienda = get + valorTotalDecoracion + valorTotalFlores;
    }

     */

    //METODOS SCANNER
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



