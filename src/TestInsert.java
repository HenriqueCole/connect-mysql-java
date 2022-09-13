import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) throws SQLException {
        Contact contact = new Contact("The man", "theman@gmail.com", "99999-9999", 17);

        String sql = "INSERT INTO contacts (name, email, phone, age)" +
                "VALUES ('" + contact.getName() + "', '" + contact.getEmail() + "', '" + contact.getPhone() + "', '" + contact.getAge() + "')";
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connection = connectionDatabase.connectBD();
        Statement statement = connection.createStatement();
        statement.execute(sql);
        System.out.println("Contact inserted successfully!");
        connection.close();
    }
}
