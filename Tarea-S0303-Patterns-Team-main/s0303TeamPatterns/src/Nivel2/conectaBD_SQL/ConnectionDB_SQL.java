package Nivel2.conectaBD_SQL;

import java.sql.*;

public class ConnectionDB_SQL {

        final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/floristeria";
        final String USUARIO = "root";
        final String CLAVE = "aldoamorfo1";

        //este es el metodo para conectar a la bbdd
        public Connection conectar () {
            Connection myConnection = null;
            try {
                //crear conexion
                myConnection = DriverManager.getConnection(URL, USUARIO, CLAVE);
                System.out.println("Connectando.....");
            } catch (Exception e) {
                System.out.println("No se puede conectar al servidor.");
                //metodo que imprime el nombre la exception
                e.printStackTrace();
            }
            return myConnection;
        }

        /*
            AppMenu appMenu = new AppMenu();

            appMenu.realizarOpcionMenu();
            //ejecutar la instruccion sql
            //ResultSet myResulSet = myStatement.executeQuery();  ---> aqui dentro va la query SELECT * FROM ARTICULO
            //recorrer el resulset
            while(myResultSet.next()) {
                System.out.println(myResultSet.getString("NOMBREARTICULO")); ---> NOMBRE DE LA COLUMNA QUE QUIERAS IMPRIMIR, se puede concatenar
        }

 */
}
