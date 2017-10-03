package ua.mega.Lecture_10_JDBC.item_08;

import ua.mega.Lecture_10_JDBC.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class SavePointExample {
    public static final String QUERY = "INSERT INTO user (id, name, age) VALUES (?,?,?)";

    public static void main(String[] args) {
        savePointExample();
    }

    private static void savePointExample() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Savepoint savepoint = null;

        try {
            connection = MyConnection.createConnection();
            connection.setAutoCommit(false); // начинаем транзакцию


            // Вставка юзера 1
            preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setInt(1, 666);
            preparedStatement.setString(2, "myUser");
            preparedStatement.setInt(3, 22);
            preparedStatement.executeUpdate();

            // создаем точку для отката
            savepoint = connection.setSavepoint("savepoint1"); // можно без параметра

            // Вставка юзера 2 - вылетит SQLException
            preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setInt(1, 666); // ошибка - такой id уже есть
            preparedStatement.setString(2, "newMyUser");
            preparedStatement.setInt(3, 100);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback(savepoint); // откат будет не до последнего коммита, а до указанного Savepoint
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) {
                    connection.commit(); // делаем здесь коммит отката до Savepoint из catch
                    connection.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
    }
}
