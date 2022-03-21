package Nivel2.conectaBD_SQL;

import java.sql.*;

public class ConnectionDB_SQL {

        final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/floristeria";
        final String USUARIO = "root";
        final String CLAVE = "";

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
}
