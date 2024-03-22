package Works.Exercise.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
    static Connection objConnection = null;

    public Connection openConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String password = "Rlwl2023.";
            objConnection = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Properly connected to DB");
        } catch (ClassNotFoundException e) {
            System.out.println("Error >> Driver not found");
        } catch (SQLException e) {
            System.out.println("Couldn't establish a connection with DB");
        }
        return objConnection;
    }

    public void closeConnection() {
        try {
            if (objConnection != null) {
                objConnection.close();
                System.out.println("DB connection closed");
            }
        } catch (SQLException e) {
            System.out.println("Error >> " + e.getMessage());
        }
    }
}
