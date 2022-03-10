package Nivel1;

import java.util.ArrayList;

public class Ventas {
    public ArrayList<Articulo> Ventas = new ArrayList<Articulo>();


    public double mostrarSumatorioVentas(){
        double valorTotalVentas=0;
        for(int i = 0; i<Ventas.size(); i++){
            valorTotalVentas+=Ventas.get(i).precio;
        }
        return valorTotalVentas;
    }

}
