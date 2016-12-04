package ua.mega.Lecture_10.item_07;

import ua.mega.Lecture_10.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
    private static final String INSERT_QUERY = "INSERT INTO user (id, name, age) VALUES (?, ?, ?)";
    private static final String UPDATE_USER = "UPDATE user SET name = ? WHERE name = ?";

    public static void main(String[] args) {
        insertWithUpdate();
    }

    private static void insertWithUpdate() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = MyConnection.createConnection();
            connection.setAutoCommit(false); // вкл. транзакции7

            // транзакция 1
            preparedStatement = connection.prepareStatement(INSERT_QUERY);
            preparedStatement.setInt(1, 1000);
            preparedStatement.setString(2, "testTransaction");
            preparedStatement.setInt(3, 120);
            preparedStatement.executeUpdate(); // выполняем INSERT
            connection.commit(); // тк авто-коммит откл. - делаем коммит

            // транзакция 2
            preparedStatement = connection.prepareStatement(UPDATE_USER);
            preparedStatement.setString(1, "test_Transaction_Update");
            preparedStatement.setString(2, "testTransaction");
            preparedStatement.executeUpdate(); // выполнить UPDATE
            connection.commit();



        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
           try  {
               if (preparedStatement != null) preparedStatement.close();
               if (connection != null) connection.close();
           } catch (SQLException e2) {
               e2.printStackTrace();
           }
        }
    }
}
