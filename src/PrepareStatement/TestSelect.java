package PrepareStatement;

import java.sql.*;

public class TestSelect {
    public static void main(String[] args) throws SQLException {
        select("2");
    }

    public static Contact select(Object id) throws SQLException {
        String sql = "SELECT * FROM contacts WHERE id = ?";
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        Connection connection = connectionDatabase.connectBD();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, (Integer) id);
        ResultSet resultSet = statement.executeQuery(sql);
        Contact contact = null;
        if (resultSet != null && resultSet.next()) {
            contact = new Contact(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("phone"),
                    resultSet.getInt("age")
            );
            System.out.println(contact);
        } else {
            System.out.println("Statement.Contact not found!");
        }
        connection.close();
        return contact;
    }
}
