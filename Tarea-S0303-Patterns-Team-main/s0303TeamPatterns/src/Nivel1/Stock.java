package Nivel1;


import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Stock {
    protected ArrayList<Arbol> dbArbol = new ArrayList<Arbol>();
    protected ArrayList<Flor> dbFlor= new  ArrayList<Flor>();
    protected ArrayList<Decoracion> dbDecoracion = new ArrayList<Decoracion>();

    //SCANNERS
    public static double ingresarDouble(String mensaje) {
        Scanner input = new Scanner (System.in);
        double numero=0.0;
        boolean correcto = false;
        do {
            System.out.println(mensaje);
            try{
                numero = input.nextDouble();
                correcto=true;
            }catch (InputMismatchException ex){
                System.out.println("Error de formato, mire que sean numeros separados por coma");
            }
            input.nextLine();
        }while (!correcto);
        return  numero;
    }
    public static int ingresarInt(String mensaje) {
        Scanner input = new Scanner (System.in);
        int numero= 0;
        boolean correcto = false;
        do {
            System.out.println(mensaje);
            try{
                numero = input.nextInt();
                correcto=true;
            }catch (InputMismatchException ex){
                System.out.println("Error de formato, mire que sean numeros ");
            }
            input.nextLine();
        }while (!correcto);
        return  numero;
    }
    public static String ingresarString(String mensaje) {
        Scanner input = new Scanner (System.in);
        String palabra= "";
        boolean correcto = false;
        do {
            System.out.println(mensaje);
            try{
                palabra = input.nextLine();
                correcto=true;
            }catch (Exception ex){
                System.out.println("Error de formato ");
            }
            input.nextLine();
        }while (!correcto);

        return  palabra;
    }

   public Stock (){

    }

    public void crearArticulo(){
    }

    public void eliminarArticulo(int idArticulo){
    }

    public void imprimirStock(){
    }

    public void mostrarCantidadStock(){
    }

    public double sumatoriaValorStock(){
        return 0;
    }

    public Articulo getArticulo (int idArticulo, String tipo){
        Articulo articulo = null;



        switch (tipo.toLowerCase()){
            case "a":
                for (int i=0; i<dbArbol.size();i++){
                    if(dbArbol.get(i).getID()==idArticulo);
                    articulo= dbArbol.get(i);
                }
                break;
            case "d":
                for (int i=0; i<dbDecoracion.size();i++){
                    if(dbDecoracion.get(i).getID()==idArticulo);
                    articulo= dbDecoracion.get(i);
                }
                break;
            case "f":
                for (int i=0; i<dbFlor.size();i++){
                    if(dbFlor.get(i).getID()==idArticulo);
                    articulo= dbFlor.get(i);
                }
                break;
        }
        return articulo;
    }




}
