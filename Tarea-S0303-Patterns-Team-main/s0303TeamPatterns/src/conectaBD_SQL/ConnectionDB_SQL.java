package conectaBD_SQL;
import java.sql.*;
public class ConnectionDB_SQL {
    public static void main(String[]args) {

        final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/floristeria";
        final String USUARIO = "root";
        final String CLAVE = "";

        try {
            //crear conexion
            Connection myConnection = DriverManager.getConnection(URL, USUARIO, CLAVE);

            //crear objeto statment
            Statement myStatment = myConnection.createStatement();
/*
            //ejecutar la instruccion sql
            //ResultSet myResulSet = myStatment.executeQuery();  ---> aqui dentro va la query SELECT * FROM ARTICULO
            //recorrer el resulset
            while(myResultSet.next()) {
                System.out.println(myResultSet.getString("NOMBREARTICULO")); ---> NOMBRE DE LA COLUMNA QUE QUIERAS IMPRIMIR, se puede concatenar
        }

 */
        }catch (Exception e) {

            System.out.println("No se puede conectar al servidor.");
            e.printStackTrace();
        }
    }
}
