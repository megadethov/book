package ua.mega.Lecture_10.item_00;

import ua.mega.Lecture_10.MyConnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaData {
    public static void main(String[] args) throws SQLException {
        // устанавливаем соединение с БД
        Connection connection = MyConnection.createConnection();
        // теперь можем спрашивать у connection мета инфо по БД
        DatabaseMetaData metaData = connection.getMetaData();
        System.out.println("Support batch update: " + metaData.supportsBatchUpdates());
        System.out.println("Support insensetiveRS: " + metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
        System.out.println("Support sensetiveRS: " + metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
        System.out.println("Support cuncurrent updatable: " + metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE));
        System.out.println();

        if (connection != null)
        connection.close(); // ОБЯЗАТЕЛЬНО !!!
    }
}
