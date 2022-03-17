package Nivel2;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StockFlor extends Stock {

    //contructor vacio
    public StockFlor() {

    }

    //metodos de articulos flor
    public void crearArticulo() {
        String nombre = teclado.ingresarString("Nombre Flor:");
        double precio = teclado.ingresarDouble("Ingrese el precio:");
        String color = teclado.ingresarString("Ingrese el color:");
        dbFlor.add(new Flor(nombre,precio,color));
        try {
            Statement st = cn.createStatement();
            PreparedStatement miSentencia = cn.prepareStatement("INSERT INTO flores (tipo, idArticulo,nombre, precio, color) VALUES(?,?,?,?,?)");
            miSentencia.setString(1, "F");
            miSentencia.setString(2, null);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, String.valueOf(precio));
            miSentencia.setString(5, color);

            miSentencia.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void eliminarArticulo(int idArticulo) {
        int i = 0;
        while (i < dbFlor.size()){
            if (idArticulo == dbFlor.get(i).getID()){
                dbFlor.remove(i);
            } else {
                i++;
            }
        }
        try {
            PreparedStatement miSentencia = cn.prepareStatement("DELETE FROM flores  WHERE idArticulo=? ");

            miSentencia.setInt(1, idArticulo);

            miSentencia.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    //metodos de stock
    public void imprimirStock() {
        dbFlor.forEach(x->System.out.println("ID: F"+x.getID()+" / Nombre: "+x.getNombre()+" / Precio: €"+x.getPrecio()+" / Color: "+x.getColor()));
    }
    public void mostrarCantidadStock() {
        System.out.println("Stock Flor: " + dbFlor.size());
    }
    public double sumatoriaValorStock(){
        double valorTotalFlores = 0;
        for (int i = 0; i < dbFlor.size() ; i++){
            valorTotalFlores += dbFlor.get(i).getPrecio();
        }
        return valorTotalFlores;
    }

}
