package ua.mega;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDao {
    NamedParameterJdbcTemplate template;

    public EmployeeDao(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    public void save(Employee e) {
        String sql = "INSERT INTO employee VALUES (:id, :name, :salary)";

        Map<String, Object> map = new HashMap<>();
        map.put("id", e.getId());
        map.put("name", e.getName());
        map.put("salary", e.getSalary());

        template.execute(sql, map, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }
}
