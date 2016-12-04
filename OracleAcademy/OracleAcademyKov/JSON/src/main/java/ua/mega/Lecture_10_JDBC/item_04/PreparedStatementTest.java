package ua.mega.Lecture_10_JDBC.item_04;

import ua.mega.Lecture_10_JDBC.MyConnection;
import ua.mega.Lecture_10_JDBC.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PreparedStatementTest {

    public static final String INSERT_USER = "INSERT INTO user (name, age) VALUES (?, ?)";
    public static final String UPDATE_USER = "UPDATE user SET name = ? WHERE id = ?";
    public static final String SELECT_USER_BY_NAME = "SELECT * from user WHERE name = ?";

    public static void main(String[] args) throws SQLException {
//        insert(INSERT_USER);
//        update(UPDATE_USER);

        List<User> users = findUsersByName(SELECT_USER_BY_NAME, "Santa");
        System.out.println(users);
    }

    private static void insert(String insertUser) throws SQLException {
        Connection connection = MyConnection.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(insertUser); // прекомпилированный
        // теперь нужно насетить в него неизвестные ?
        preparedStatement.setString(1, "myUser");
        preparedStatement.setInt(2, 41);

        preparedStatement.executeUpdate(); // выполнить INSERT

        if (preparedStatement != null) preparedStatement.close();
        if (connection != null) connection.close();
    }

    private static void update(String updateUser) throws SQLException {
        Connection connection = MyConnection.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(updateUser/*, Statement.RETURN_GENERATED_KEYS*/);

        preparedStatement.setString(1, "TestUpdate");
        preparedStatement.setInt(2, 7);

        preparedStatement.executeUpdate(); // выполнить UPDATE

        if (preparedStatement != null) preparedStatement.close();
        if (connection != null) connection.close();
    }

    private static List<User> findUsersByName(String sql, String name) throws SQLException {
        Connection connection = MyConnection.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery(); // есть результат
        List<User> users = new ArrayList<>(); // сюда будем складывать собранных User

        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getInt("age"));

            users.add(user); // ложим собранного User в коллекцию
        }
        if (resultSet != null) resultSet.close();
        if (preparedStatement != null) preparedStatement.close();
        if (connection != null) connection.close();

        return users;
    }
}
