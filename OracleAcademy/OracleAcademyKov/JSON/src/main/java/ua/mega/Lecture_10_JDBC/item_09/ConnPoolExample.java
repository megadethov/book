package ua.mega.Lecture_10_JDBC.item_09;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import ua.mega.Lecture_10_JDBC.User;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnPoolExample {
    public static void main(String[] args) throws PropertyVetoException, SQLException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.jdbc.Driver");
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        cpds.setUser("root");
        cpds.setPassword("root");

        cpds.setMinPoolSize(5);
        cpds.setAcquireIncrement(5);
        cpds.setMaxPoolSize(50);

        Connection connection = cpds.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user ");

        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getInt("age"));

            System.out.println(user);
            System.out.println("---------------------------");
        }
    }
}
