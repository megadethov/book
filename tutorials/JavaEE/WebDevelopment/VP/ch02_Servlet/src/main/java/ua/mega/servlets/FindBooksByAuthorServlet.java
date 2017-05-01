package ua.mega.servlets;

import ua.mega.domain.Book;
import ua.mega.services.BookService;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FindBooksByAuthorServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        // do the work - find all books by the supplied author
        BookService service = new BookService();

        // form handling - extracting a parameter from the form
        String author = req.getParameter("author");

        List<Book> allBooksByAuthor = service.getAllBooksByAuthor(author);

        // render the output
        out.print("<html><head><title>Our entire catalogue</title>");
        out.print("<body><h1>Our entire catalogue</h1>");
        out.print("<ul>");
        for (Book next : allBooksByAuthor) {
            out.print("<li>");
            out.print(next.getTitle());
            out.print("</li>");
        }
        out.print("</ul>");
        out.print("</body></html>");

        out.close();
    }
}
