package ua.mega;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        ServletContext context = getServletContext();
        Enumeration<String> e = context.getInitParameterNames();

        String str = "";
        while (e.hasMoreElements()) {
            str = e.nextElement();
            writer.print("<br>" + context.getInitParameter(str));
        }

        writer.close();
    }
}
