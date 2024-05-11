package modelo.persistencia.JDBC;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public class Persistencia {

    // XAMPP
    private static String login = "";
    private static String password = "";
//    

    private static String url = "jdbc:mysql://localhost:3306/facturacion?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC&useSSL=false";


    public static Connection createConnection() throws Exception {
    
        String login = "phpmyadmin";
	String password = "developer";
	Connection conn = null;
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    conn = DriverManager.getConnection(url, login, password);
	    if (conn == null) {
                throw new Exception("Can not connnect to DAtabase");
	    }

	} catch (SQLException ex) {
	    System.out.println(ex);
        } catch (ConnectException ex) {
            System.out.println(ex.getCause());
	} catch (ClassNotFoundException ex) {
	}
        return conn;

    }

    public static void closeConnection() {

    }
}
