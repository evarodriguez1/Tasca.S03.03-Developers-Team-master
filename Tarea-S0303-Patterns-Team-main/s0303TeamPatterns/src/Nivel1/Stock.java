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
    protected Teclado teclado = new Teclado();
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
