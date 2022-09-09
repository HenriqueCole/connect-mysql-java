import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {
    public static void main(String[] args) throws SQLException {
        int id = 2;
        String sql = "SELECT * FROM contacts WHERE id = " + id;
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connection = connectionDatabase.connectBD();
        Statement statement = connection.createStatement();
        statement.execute(sql);
        System.out.println("Contact selected successfully!");
        connection.close();
    }
}
