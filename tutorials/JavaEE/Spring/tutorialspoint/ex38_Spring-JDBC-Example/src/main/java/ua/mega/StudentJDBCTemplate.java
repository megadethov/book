package ua.mega;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        String sql = "INSERT INTO student (name, age) values (?, ?)";

        jdbcTemplateObject.update(sql, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

    @Override
    public Student getStudent(Integer id) {
       String sql = "SELECT * from student WHERE id = ?";
        Student student = jdbcTemplateObject.queryForObject(sql, new Object[]{id}, new StudentMapper());
        return student;
    }

    @Override
    public List<Student> listStudents() {
        String sql = " SELECT * FROM student";
        List<Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
        return students;
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM student WHERE id = ?";
        jdbcTemplateObject.update(sql, id);
        System.out.println(("Deleted Record with ID = " + id));
        return;
    }

    @Override
    public void update(Integer id, Integer age) {
        String sql = "UPDATE student SET age = ? WHERE id = ?";
        jdbcTemplateObject.update(sql, age, id);
        System.out.println("Updated Record with ID = " + id );
        return;
    }
}
