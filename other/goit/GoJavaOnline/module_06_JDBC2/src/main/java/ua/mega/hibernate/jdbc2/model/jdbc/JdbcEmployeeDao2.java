package ua.mega.hibernate.jdbc2.model.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.hibernate.jdbc2.model.EmployeeDao2;
import ua.mega.hibernate.jdbc2.model.Employee;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcEmployeeDao2 implements EmployeeDao2 {

    private DataSource dataSource;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao2.class);

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Employee load(int id) {

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee WHERE id = ?");) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return createEmployee(resultSet);
            } else {
                throw new RuntimeException("Can not find employee with id: " + id);
            }

        } catch (SQLException e) {
            LOGGER.error("Exception occurred while connecting to DB: ", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public List<Employee> getAll() {

        List<Employee> employees = new ArrayList<>();

        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();) {

            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
            while (resultSet.next()) {
                Employee employee = createEmployee(resultSet);
                employees.add(employee);
            }
        } catch (SQLException e) {
            LOGGER.error("Exception occurred while connecting to DB: ", e);
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



}

