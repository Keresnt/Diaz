import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/comm"; // Change to your database URL
    private static final String USER = "root"; // Change to your database username
    private static final String PASSWORD = "nemuimors"; // Change to your database password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}