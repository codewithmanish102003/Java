
import java.sql.SQLException;

public class InsertData {

    @SuppressWarnings("unused")
    private static Object DriverManager;
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            java.sql.Connection conn = java.sql.DriverManager.getConnection(url, user, password);

            // Insert query using PreparedStatement
            String sql = "INSERT INTO bca (id,name) VALUES (?, ?)";
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "4");
            pstmt.setString(2, "Alice");

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            }

            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
}

