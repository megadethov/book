package ua.mega.Lecture_10_JDBC.item_05;

import ua.mega.Lecture_10_JDBC.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatableResultSet {

    private static final String SELECT_USER_BY_NAME = "SELECT * from user WHERE name = ?";

    public static void main(String[] args) throws SQLException {
        scrollByUser(SELECT_USER_BY_NAME, "Vitia", true);
    }

    private static void scrollByUser(String sql, String name, boolean isUpdatable) throws SQLException {
        Connection connection = MyConnection.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); // CONCUR_UPDATABLE - обновляемый ResultSet
        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
//.updateString(String columnLabel, String x) - это метод интерфейса ResultSet.
//Он вписывает значение x в столбец columnLabel выбранного ряда.
            resultSet.updateString("name", "VitiaChange");
            resultSet.updateString("id", "1000000");

            if (isUpdatable)
                resultSet.updateRow(); // обновляет БД по содержанию ResultSet (не работает когда курсор на INSERT row)
            else resultSet.cancelRowUpdates(); // роллбечит измененения resultSet.updateString
        } // while
        if (preparedStatement != null) preparedStatement.close(); // закрывает и ResultSet тоже
        if (connection != null) connection.close();

    }
}
