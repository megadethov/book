package ua.mega.avalon.services;


import ua.mega.avalon.data.BookNotFoundException;
import ua.mega.avalon.domain.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooksByAuthor(String author);

    public List<Book> getAllRecommendedBooks(String userId);

    public Book getBookByIsbn(String isbn) throws BookNotFoundException;

    public List<Book> getEntireCatalogue();

    public void registerNewBook(Book newBook);

    public void deleteFromStock(Book oldBook);
}
