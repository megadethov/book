package ua.mega.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Reading All Parameters
 */
public class ShowParameters extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String title = "Reading All Request Parameters";
        writer.println(ServletUtilities.headWithTitle(title) +
                "<body bgcolor=\"#fdf5e6\">\n" +
                "<h1 align=center>" + title + "</h1>\n" +
                "<table border=1 align=center>\n" +
                "<tr bgcolor=\"#ffad00\">\n" +
                "<th>parameter name<th>Parameter Value(s)");
        Enumeration paramNames = req.getParameterNames();
        while (paramNames.hasMoreElements()) {
            String paramName = (String) paramNames.nextElement();
            writer.print("<tr><td>" + paramName + "\n<td>");
            String[] paramValues =
                    req.getParameterValues(paramName);
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0)
                    writer.println("<I>No Value</I>");
                else
                    writer.println(ServletUtilities.filter(paramValue));
            } else {
                writer.println("<ul>");
                for (int i = 0; i < paramValues.length; i++) {
                    writer.println("<li>" + ServletUtilities.filter(paramValues[i]));
                }
                writer.println("</ul>");
            }
        }
        writer.println("</table>\n</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
