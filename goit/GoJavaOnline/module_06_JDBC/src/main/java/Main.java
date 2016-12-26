import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.time.LocalDateTime;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        loadDriver();
        LOGGER.info("Connecting to DB");


        String url = "jdbc:postgresql://localhost:5432/company";
        String user = "postgres";
        String password = "postgres";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();) {
            LOGGER.info("Successfully connected to DB");
            String sql = "SELECT * FROM employee";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("name"));
                employee.setAge(resultSet.getInt("age"));
                employee.setAddress(resultSet.getString("address"));
                employee.setSalary(resultSet.getFloat("salary"));
                employee.setJoinDate(resultSet.getString("join_date"));
                System.out.println(employee);
            }
        } catch (SQLException e) {
            LOGGER.error("Exception occurred while connecting to DB: " + url, e);
        }
    }

    private static void loadDriver() {
        try {
            LOGGER.info("Loading JDBC driver: org.postgresql.Driver");
            Class.forName("org.postgresql.Driver");
            LOGGER.info("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            LOGGER.error("Can't find driver: org.postgresql.Driver");
            throw new RuntimeException(e);
        }
    }

}
