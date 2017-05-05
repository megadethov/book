package ua.mega.servlets;

import ua.mega.domain.Book;
import ua.mega.services.BookService;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FindBooksByAuthorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // do the work - find all books by the supplied author
        BookService service = BookService.getService();
        // form handling - extracting a parameter from the form
        String author = req.getParameter("author");

        String targetPage;

        if (author.trim().equals("")) {
            req.setAttribute("message", "Please, fill in a name of the author");
            targetPage = "/findByAuthor.jsp";
        } else {
            List<Book> allBooksByAuthor = service.getAllBooksByAuthor(author);
            req.setAttribute("allBooksByAuthor", allBooksByAuthor);
            targetPage = "/find-books-results.jsp";
        }
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher(targetPage);
        dispatcher.forward(req, resp);
    }
}
