package ua.mega.Lecture_10_JDBC.item_02;

import ua.mega.Lecture_10_JDBC.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDML {

    private static final String INSERT_USER_1 = "INSERT INTO user (name, age) VALUES ('Anton', 27)";
    private static final String INSERT_USER_2 = "INSERT INTO user (name, age) VALUES ('Vitia', 30)";
    private static final String INSERT_USER_3 = "INSERT INTO user (name, age) VALUES ('Pavel', 33)";
    private static final String DELETE_USER = "DELETE FROM user";
    private static final String UPDATE_USER_1 = "UPDATE user SET name = 'Santa' WHERE id = 4"; // id может быть не с 1 (внимательно)

    public static void main(String[] args) throws SQLException {
//        insert(INSERT_USER_1); // id не передаем тк у него auto-increment
//        insert(INSERT_USER_2);
//        insert(INSERT_USER_3);
        update(UPDATE_USER_1);
//        delete(DELETE_USER);

    }

    private static void update(String updateUser) throws SQLException {
        Connection connection = MyConnection.createConnection();
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(updateUser);
        System.out.println("The numbers of updated rows is " + count);

        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }

    private static void delete(String deleteUser) throws SQLException {
        Connection connection = MyConnection.createConnection();
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(deleteUser);
        System.out.println("The numbers of deleted rows is " + count);

        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }

    private static void insert(String insertUser) throws SQLException {
        Connection connection = MyConnection.createConnection();
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(insertUser);
        System.out.println("The numbers of inserted rows is " + count);

        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }
}
