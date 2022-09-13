package PrepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) throws SQLException {
        Contact contact = new Contact("The man", "theman@gmail.com", "99999-9999", 17);
        String sql = "INSERT INTO contacts (name, email, phone, age)" +
                "VALUES (?,?,?,?)";
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connection = connectionDatabase.connectBD();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, contact.getName());
        statement.setString(2, contact.getEmail());
        statement.setString(3, contact.getPhone());
        statement.setInt(4, contact.getAge());
        statement.execute();
        System.out.println("Statement.Contact inserted successfully!");
        connection.close();
    }
}
