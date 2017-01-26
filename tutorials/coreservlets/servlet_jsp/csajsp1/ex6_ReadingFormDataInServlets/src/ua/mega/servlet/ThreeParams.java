package ua.mega.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Reading the Three Parameters
 */
public class ThreeParams extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String title = "Reading Three Request Parameters";
        writer.println(ServletUtilities.headWithTitle(title) +
                "<body>" +
                "<h1 align=center>" + title + "</h1>\n" +
                "<ul>\n" +
                " <li><b>param1</b>: "
                + req.getParameter("param1") + "\n" +
                " <li><b>param2</b>: "
                + req.getParameter("param2") + "\n" +
                " <li><b>param3</b>: "
                + req.getParameter("param3") + "\n" +
                "</ul>\n" +
                "</body>" +
                "</html>");
    }
}
