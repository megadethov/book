package ua.mega;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public void setEmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Boolean saveEmployeeByPrepareStatement(final Employee e) {
        String sql = "INSERT INTO employee values(?,?,?)";
        return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setInt(1, e.getId());
                ps.setString(2, e.getName());
                ps.setFloat(3, e.getSalary());

                return ps.execute();
            }
        });
    }

}
