package za.ac.cput.psmanager.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Franciel Sebastiao
 */
public class PsManagerDbConnection {
    public static Connection prisonersConnection() throws SQLException{
        String url = "jdbc:derby://localhost:1527/PsManagerDb;create=true";
        String user = "fransebastiao";
        String password = "mycput";

        return DriverManager.getConnection(url, user, password);
    }
}
