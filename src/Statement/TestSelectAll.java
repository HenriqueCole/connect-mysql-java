package Statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class TestSelectAll {
    public static void main(String[] args) throws SQLException {
        Collection<Contact> contacts = new ArrayList<>();

        String sql = "SELECT * FROM contacts";
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connection = connectionDatabase.connectBD();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Contact contact = new Contact(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("phone"),
                        resultSet.getInt("age")
                );
                contacts.add(contact);
            }
            System.out.println(contacts);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
