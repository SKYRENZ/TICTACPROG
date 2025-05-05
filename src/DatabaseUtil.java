import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseUtil {
    public static final String URL = "jdbc:mysql://localhost:3306/test1";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static void saveWinner(String winner) {
        try (Connection con = getConnection();
             PreparedStatement statement = con.prepareStatement(
                 "INSERT INTO testing (winner) VALUES (?)")) {
            statement.setString(1, winner);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
        }
    }
}