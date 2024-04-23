package modelo.persistencia.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public class Persistencia {

    // XAMPP
    private static String login = "root";
    private static String password = "";
//    

    private static String url = "jdbc:mysql://localhost:3306/facturacion?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC&useSSL=false";


    public static Connection createConnection() {


    }

    public static void closeConnection() {

    }
}
