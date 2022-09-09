import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) throws SQLException {
        Contact contact = new Contact(2, "Colezada", "cole@gmail.com", "99999-9999", 17);
        String sql = "UPDATE contacts SET " +
                "name = '" + contact.getName() + "', " +
                "email = '" + contact.getEmail() + "', " +
                "phone = '" + contact.getPhone() + "', " +
                "age = " + contact.getAge() +
                " WHERE id = " + contact.getId();
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connection = connectionDatabase.connectBD();
        Statement statement = connection.createStatement();
        statement.execute(sql);
        System.out.println("Contact updated successfully!");
        connection.close();
    }
}
