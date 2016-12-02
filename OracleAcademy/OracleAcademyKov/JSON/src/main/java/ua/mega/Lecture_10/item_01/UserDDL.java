package ua.mega.Lecture_10.item_01;

import ua.mega.Lecture_10.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDDL {

//    private static final String CREATE_USER_TABLE = "CREATE  TABLE  IF NOT EXISTS bookstore (id INT NOT NULL , name VARCHAR(45) NULL, PRIMARY KEY (id))";
    private static final String CREATE_USER_TABLE = "CREATE TABLE `test`.`bookstore2` (`bookstore2_id` INT NOT NULL,`bookstore2_name` VARCHAR(45) NULL, PRIMARY KEY (`bookstore2_id`))";

    public static void main(String[] args) throws SQLException {
        createTable(CREATE_USER_TABLE);
    }

    public static void createTable (String createUserTable) throws SQLException {
        Connection connection = MyConnection.createConnection();

        Statement statement = connection.createStatement();
        statement.execute(createUserTable);
        statement.execute("commit");

        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }
}
