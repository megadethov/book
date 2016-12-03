package ua.mega.Lecture_10.item_04;

import com.mysql.jdbc.Statement;
import ua.mega.Lecture_10.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PreparedStatementTest {

    public static final String INSERT_USER = "INSERT INTO user (name, age) VALUES (?, ?)";
    public static final String UPDATE_USER = "UPDATE user SET name = ? WHERE id = ?";
    public static final String SELECT_USER_BY_NAME = "SELECT * from user WHERE name = ?";

    public static void main(String[] args) throws SQLException {
//        insert(INSERT_USER);
        update(UPDATE_USER);
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


}
