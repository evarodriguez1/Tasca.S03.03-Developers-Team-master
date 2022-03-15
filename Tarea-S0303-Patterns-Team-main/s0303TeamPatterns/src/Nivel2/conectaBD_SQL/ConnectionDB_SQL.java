package Nivel2.conectaBD_SQL;

import java.sql.*;
public class ConnectionDB_SQL {
    public static void main(String[]args) {

        final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/mysql";
        final String USUARIO = "root";
        final String CLAVE = "Sg7535sg";

        try {
            //crear conexion
            Connection myConnection = DriverManager.getConnection(URL, USUARIO, CLAVE);

            //crear objeto statment
            Statement myStatement = myConnection.createStatement();

            String instruccionSql = "INSERT INTO ARTICULO (IDARTICULO, NOMBRE, PRECIO) VALUES ('','','')";


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
        }catch (Exception e) {

            System.out.println("No se puede conectar al servidor.");
            e.printStackTrace();
        }
    }
}
