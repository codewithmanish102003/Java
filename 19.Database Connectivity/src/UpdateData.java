import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "UPDATE bca SET name=? WHERE id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Alice Brown");
            pstmt.setInt(2, 1);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully!");
            }

            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

