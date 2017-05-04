package ua.mega.servlets;

import ua.mega.domain.Book;
import ua.mega.services.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DisplayAllBooksServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // do some work
        BookService bookService = BookService.getService();
        List<Book> allBooks = bookService.getEntireCatalogue();

        // forward to the displayAllBooks.jsp page to display the results

    }
}
