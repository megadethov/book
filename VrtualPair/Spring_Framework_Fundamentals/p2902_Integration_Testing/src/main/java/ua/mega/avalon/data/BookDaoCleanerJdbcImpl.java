package ua.mega.avalon.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ua.mega.avalon.domain.Book;

import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//@Repository("bookDao")
public class BookDaoCleanerJdbcImpl implements BookDao {

    // SQL
    private static final String INSERT_BOOK_SQL = "insert into BOOK (ISBN, TITLE, AUTHOR,PRICE) values (?, ?, ?, ?) ";
    private static final String CREATE_TABLE_SQL = "create table BOOK(ISBN VARCHAR(20), TITLE VARCHAR(50), AUTHOR VARCHAR(50), PRICE DOUBLE)";
    private static final String GET_ALL_BOOKS_SQL = "select * from BOOK";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void createTables() {
        try {
            jdbcTemplate.update(CREATE_TABLE_SQL);
        } catch (BadSqlGrammarException e) {
            System.out.println("Assuming that the table already exists");
        }
    }

    @Override
    public List<Book> allBooks() {
        return jdbcTemplate.query(GET_ALL_BOOKS_SQL, new BookMapper());
    }

    @Override
    public Book findByIsbn(String isbn) throws BookNotFoundException {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM BOOK WHERE ISBN=?", new BookMapper(), isbn);
        } catch (EmptyResultDataAccessException e) {
            throw new BookNotFoundException();
        }
    }

    @Override
    public void create(Book newBook) {
        jdbcTemplate.update(INSERT_BOOK_SQL, newBook.getIsbn(), newBook.getTitle(), newBook.getAuthor(), newBook.getPrice());
    }

    @Override
    public void delete(Book redundantBook) {
        jdbcTemplate.update("DELETE FROM BOOK WHERE ISBN=?", redundantBook.getIsbn());
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        return jdbcTemplate.query("SELECT * FROM BOOK WHERE AUTHOR=?", new BookMapper(), author);
    }
}

class BookMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
        String isbn = resultSet.getString("ISBN");
        String title = resultSet.getString("TITLE");
        String author = resultSet.getString("PRICE");
        double price = resultSet.getDouble("PRICE");

        return new Book(isbn, title, author, price);
    }
}