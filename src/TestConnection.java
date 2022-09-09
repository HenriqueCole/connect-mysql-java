import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
    public static void main(String[] args) throws SQLException {
        Contact contact = new Contact("Cole", "cole@gmail.com", "99999-9999", 17);

        String sql = "INSERT INTO contacts (name, email, phone, age)" +
                "VALUES ('" + contact.getName() + "', '" + contact.getEmail() + "', '" + contact.getPhone() + "', '" + contact.getAge() + "')";
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connection = connectionDatabase.connectBD();
        Statement statement = connection.createStatement();
        statement.execute(sql);
        connection.close();
    }
}
