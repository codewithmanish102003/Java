import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/student   "; // XAMPP default MySQL port is 3306
        String user = "root";  // Default XAMPP username
        String password = "";  // Default XAMPP password is empty

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");

            // Close connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
        }
    }
}
