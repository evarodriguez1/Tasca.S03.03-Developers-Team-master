package Nivel2;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StockArbol extends Stock {

    //contrucor vacio
    public StockArbol() {
    }

    //metodos de articulos de arbol
    public void crearArticulo() throws SQLException {
        String nombre = teclado.ingresarString("Nombre Arbol:");
        double precio = teclado.ingresarDouble("Ingrese el precio:");
        double altura = teclado.ingresarDouble("Ingrese la altura:");
        dbArbol.add(new Arbol(nombre, precio, altura)); //inyeccion de  dependencia
        try {
            Statement st = cn.createStatement();
            PreparedStatement miSentencia = cn.prepareStatement("INSERT INTO alboles (tipo, idArbol,nombre, precio, altura) VALUES(?,?,?,?,?)");
            miSentencia.setString(1, "A");
            miSentencia.setString(2, null);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, String.valueOf(precio));
            miSentencia.setString(5, String.valueOf(altura));

            miSentencia.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
    public void eliminarArticulo(int idArticulo) {
        int i = 0;
        while (i < dbArbol.size()) {
            if (idArticulo == dbArbol.get(i).getID()) {
                dbArbol.remove(i);
            } else {
                i++;
            }
        }
        try {
            PreparedStatement miSentencia = cn.prepareStatement("DELETE FROM arboles WHERE idArticulo=? ");

            miSentencia.setInt(1, idArticulo);

            miSentencia.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    //metodos de stock de arbol
    public void imprimirStock() {
        dbArbol.forEach(x -> System.out.println("ID: A" + x.getID() + " / Nombre: " + x.getNombre() + " / Precio: €" + x.getPrecio() + " / Altura: " + x.getAltura() + "mts."));

    }
    public void mostrarCantidadStock() {
        System.out.println("Stock Árboles: " + dbArbol.size());

    }
    public double sumatoriaValorStock(){
        double valorTotalArboles = 0;
        for (int i = 0; i < dbArbol.size() ; i++){
            valorTotalArboles += dbArbol.get(i).getPrecio();
        }
        return valorTotalArboles;
    }

}
