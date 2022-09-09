import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {
    public static void main(String[] args) throws SQLException {
        int id = 2;
        String sql = "SELECT * FROM contacts WHERE id = " + id;
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connection = connectionDatabase.connectBD();
        Statement statement = connection.createStatement();
        statement.executeQuery(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet != null && resultSet.next()) {
            Contact contact = new Contact(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("phone"),
                    resultSet.getInt("age")
            );
            System.out.println(contact);
        } else {
            System.out.println("Contact not found!");
        }
    }
}
