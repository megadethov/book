package ua.mega.Lecture_10_JDBC.item_06;

import ua.mega.Lecture_10_JDBC.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyBatch {

    public static final String INSERT_USER = "INSERT INTO user (name, age) VALUES (?, ?)";

    public static void main(String[] args) throws SQLException {
        batchUpdate(INSERT_USER);
    }

    private static void batchUpdate(String sql) throws SQLException {
        Connection connection = MyConnection.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        connection.setAutoCommit(false); // отключаем авто-коммит

        for (int i = 0; i < 5; i++) {
            preparedStatement.setString(1, "name" + i);
            preparedStatement.setInt(2, i);
            preparedStatement.addBatch();
        }

        int[] counts = preparedStatement.executeBatch(); // возвращает кол-во измененных строк каждым запросом

        connection.commit(); // теперь коммит

        if (preparedStatement != null) preparedStatement.close();
        if (connection != null) connection.close();
    }
}
