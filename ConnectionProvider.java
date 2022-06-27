 import java.sql.*;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {
        try {

            if (con == null) {
                //driver class load
                Class.forName("oracle.jdbc.driver.OracleDriver");

                //create a connection..
                con = DriverManager.
                        getConnection("jdbc:oracle:thin:@218.248.0.7:1521:rdbms","it20737302","vasavi");
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}