package ua.mega;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveEmployee(Employee e) {
        String sql = "INSERT INTO employee VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, e.getId(), e.getName(), e.getSalary());
    }

    public int updateEmployee(Employee e) {
        String sql = "UPDATE employee SET name=?, salary=? where id=?";
        return jdbcTemplate.update(sql, e.getName(), e.getSalary(), e.getId());
    }

    public int deleteEmployee(Employee e) {
        String sql = "DELETE FROM employee WHERE id=?";
        return jdbcTemplate.update(sql, e.getId());
    }
}
