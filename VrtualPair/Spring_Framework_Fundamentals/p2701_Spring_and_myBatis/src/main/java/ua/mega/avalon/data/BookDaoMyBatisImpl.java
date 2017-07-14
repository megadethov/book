package ua.mega.avalon.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Repository;
import ua.mega.avalon.domain.Book;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
public class BookDaoMyBatisImpl implements BookDao {

    @Qualifier("bookSqlMapper")
    @Autowired
    private BookSqlMapper mapper;

    @PostConstruct
    private void createTable(){
            try
            {
                mapper.createTables();
            }
            catch (BadSqlGrammarException e)
            {
                System.out.println("Assuming the table already exists");
            }
    }

    @Override
    public List<Book> allBooks() {
        return mapper.findAllBooksSqlStatement();
    }

    @Override
    public Book findByIsbn(String isbn) throws BookNotFoundException {
        return mapper.findByIsbnSqlStatement(isbn);
    }

    @Override
    public void create(Book newBook) {
        mapper.createBookSqlStatement(newBook);
    }

    @Override
    public void delete(Book redundantBook) {
        mapper.deleteBookSqlStatement(redundantBook);
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        return mapper.findByAuthorSqlStatement(author);
    }
}
