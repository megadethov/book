package ua.mega.hibernate.jdbc2.model.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.mega.hibernate.jdbc2.model.Employee;
import ua.mega.hibernate.jdbc2.model.EmployeeDao2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcEmployeeDao2 implements EmployeeDao2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(JdbcEmployeeDao2.class);
    private String url = "jdbc2:postgresql://localhost:5432/company";
    private String user = "postgres";
    private String password = "postgres";

    public JdbcEmployeeDao2() {
        loadDriver();
    }

    @Override
    public Employee load(int id) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee WHERE id = ?");) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return createEmployee(resultSet);
            } else {
                throw new RuntimeException("Can not find employee with id: " + id);
            }

        } catch (SQLException e) {
            LOGGER.error("Exception occurred while connecting to DB: " + url, e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Employee> getAll() {

        List<Employee> employees = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();) {

            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
            while (resultSet.next()) {
                Employee employee = createEmployee(resultSet);
                employees.add(employee);
            }
        } catch (SQLException e) {
            LOGGER.error("Exception occurred while connecting to DB: " + url, e);
            throw new RuntimeException(e);
        }
        return employees;
    }

    private Employee createEmployee(ResultSet resultSet) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt("id"));
        employee.setName(resultSet.getString("name"));
        employee.setAge(resultSet.getInt("age"));
        employee.setAddress(resultSet.getString("address"));
        employee.setSalary(resultSet.getFloat("salary"));
        employee.setJoinDate(resultSet.getString("join_date"));
        return employee;
    }


    private void loadDriver() {
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

