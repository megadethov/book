package ua.mega;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StudentJDBCTemplate implements StudentDAO {

    private DataSource dataSource;
    private SimpleJdbcCall jdbcCall;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
    }

    @Override
    public void create(String name, Integer age) {
        JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        String sql = "INSERT INTO student (name, age) VALUES (?, ?)";

        jdbcTemplateObject.update(sql, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

    @Override
    public Student getStudent(Integer id) {
        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
        Map<String, Object> out = jdbcCall.execute(in);

        Student student = new Student();
        student.setId(id);
        student.setName((String) out.get("out_name"));
        student.setAge((Integer) out.get("out_get"));

        return student;
    }

    @Override
    public List<Student> listStudents() {
        JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        String sql = "SELECT * FROM student";
        List<Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
        return students;
    }
}
