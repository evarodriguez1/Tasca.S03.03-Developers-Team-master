package Nivel1;

import java.util.ArrayList;

public class Ventas {
    public ArrayList<Articulo> listaVentas = new ArrayList<Articulo>();

    public void mostrarSumatorioVentas(){
        double valorTotalVentas=0;
        for(int i = 0; i<listaVentas.size(); i++){
            valorTotalVentas+=listaVentas.get(i).precio;
        }
    }
}
