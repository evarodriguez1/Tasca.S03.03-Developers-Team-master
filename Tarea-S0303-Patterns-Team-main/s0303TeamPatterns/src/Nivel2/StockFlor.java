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
        //declaracion y ejecucion de instrucciones sql para crear el articulo flor y subirlo al BD
        try {
            Statement st = cn.createStatement();
            PreparedStatement miSentencia = cn.prepareStatement("INSERT INTO flores (tipo, idArticulo,nombre, precio, color) VALUES(?,?,?,?,?)");
            PreparedStatement miSentencia2 = cn.prepareStatement("INSERT INTO articulos (tipo, idArticulo,nombre, precio) VALUES(?,?,?,?)");
            miSentencia.setString(1, "F");
            miSentencia.setString(2, null);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, String.valueOf(precio));
            miSentencia.setString(5, color);

            miSentencia2.setString(1, "F");
            miSentencia2.setString(2, null);
            miSentencia2.setString(3, nombre);
            miSentencia2.setString(4, String.valueOf(precio));


            miSentencia.executeUpdate();
            miSentencia2.executeUpdate();

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
        //declaracion y ejecucion de instrucciones sql para eliminar el articulo flor y sacarlo de la BD
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
