package ua.mega;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age, Integer marks, Integer year) {
        try {
            String sql = "INSERT INTO Student (name, age) VALUES (?, ?)";
            jdbcTemplateObject.update(sql, name, age);

            // Get the latest student id to be used in Marks table
            String sql2 = "SELECT MAX(id) FROM student";
            int sid = jdbcTemplateObject.queryForInt(sql2);

            String sql3 = "INSERT into marks(sid, marks, year) VALUES (?,?,?)";
            jdbcTemplateObject.update(sql3, sid, marks, year);

            System.out.println("Created Name = " + name + ", Age = " + age);

            // to simulate the exception.
            throw new RuntimeException("simulate Error condition");
        } catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            throw e;
        }
    }

    @Override
    public List<StudentMarks> listStudents() {
        String sql = "select * from Student, Marks where Student.id=Marks.sid";

        List<StudentMarks> studentMarks = jdbcTemplateObject.query(sql, new StudentMarksMapper());
        return studentMarks;

    }


}
