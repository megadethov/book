package ua.mega.servlets;

import ua.mega.domain.Book;
import ua.mega.services.BookService;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddNewBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // do the work and render a response.
        String isbn = req.getParameter("isbn");
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        double price = Double.parseDouble(req.getParameter("price"));

        String targetPage;

        if (isbn.trim().equals("") || title.trim().equals("") || author.equals("")) {
            targetPage = "/add-new-book.jsp";
        } else {
            Book newBook = new Book(isbn, title, author, price);
            BookService service = BookService.getService();
            service.registerNewBook(newBook);
            targetPage = "/book-added.jsp";
        }

        // Forward to a JSP page to inform the user all is well
        ServletContext context = req.getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher(targetPage);
        dispatcher.forward(req, res);
    }
}
