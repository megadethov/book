package ua.mega;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class EmployeeDao {
    SimpleJdbcTemplate template;

    public EmployeeDao(SimpleJdbcTemplate template) {
        this.template = template;
    }

    public int update(Employee e) {
        String sql = "UPDATE employee SET name=? WHERE id=?";
        return template.update(sql, e.getName(), e.getId());
    }
}
