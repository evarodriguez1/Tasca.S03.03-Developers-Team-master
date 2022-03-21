package Nivel2;

import java.sql.SQLException;

public class App {

    //throws used to declare exceptions that can occur during the execution of a program.
    public static void main(String[]args) throws SQLException {

        AppMenu appMenu = new AppMenu();

        appMenu.realizarOpcionMenu();

    }

}
