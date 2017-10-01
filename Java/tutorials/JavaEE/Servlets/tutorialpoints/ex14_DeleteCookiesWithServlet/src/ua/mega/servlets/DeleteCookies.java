package ua.mega.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Delete Cookies with Servlet
 */
public class DeleteCookies extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = null;
        Cookie[] cookies = null;
        // Get an array of Cookies associated with this domain
        cookies = req.getCookies();

        // Set response content type
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        String title = "Delete Cookies Example";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
        writer.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n");
        if (cookies != null) {
            writer.println("<h2> Cookies Name and Value</h2>");
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                if (cookie.getName().compareTo("first_name") == 0) {
                    cookie.setMaxAge(0);
                    resp.addCookie(cookie);
                    writer.print("Deleted cookie : " + cookie.getName() + "<br>");
                }
                writer.print("Name : " + cookie.getName() + ",  ");
                writer.print("Value: " + cookie.getValue() + " <br/>");

            }
        } else {
            writer.println(
                    "<h2>No cookies founds</h2>");
        }
        writer.println("</body>");
        writer.println("</html>");
    }
}
