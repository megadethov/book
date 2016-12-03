package ua.mega.Lecture_10.item_03;

import ua.mega.Lecture_10.MyConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLSelect {

    public static final String QUERY = "SELECT * FROM user";

    public static void main(String[] args) throws SQLException {

        getAll(QUERY);
    }

    public static void getAll(String query) throws SQLException {
        Connection connection = MyConnection.createConnection();
        Statement statement = connection.createStatement();
//        boolean execute = statement.execute(query); // не возвращает ResultSet, но он есть
//        System.out.println(execute);
//        ResultSet resultSet = statement.getResultSet(); // так тоже раблотает, если перед этим был execute()
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
//            String name = resultSet.getString(2); // аналог выше
            int age = resultSet.getInt("age");

            System.out.println(id);
            System.out.println(name);
            System.out.println(age);
            System.out.println("----------------");

        } // while

        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }
}
