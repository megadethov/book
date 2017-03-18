package ua.mega.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Reading All Form Parameters
 */
public class ReadParams extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String title = "Reading All Form Parameters";

        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
        writer.println(
                docType + "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body bgcolor=\"#f0f0f0\"\n>" +
                        "<h1 align=\"center\">" + title + "</h1>\n" +
                        "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
                        "<tr bgcolor=\"#949494\"\n>" +
                        "<td>Param Name</td><th>Param Value(s)</th>\n" +
                        "</tr>\n");

        Enumeration paramNames = req.getParameterNames();

        while (paramNames.hasMoreElements()) {
            String paramName = (String) paramNames.nextElement();
            writer.print("<tr><td>" + paramName + "</td>\n<td>");
            String[] paramValues = req.getParameterValues(paramName);

            // Read single valued data
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0)
                    writer.println("<i>No Value</i>");
                else
                    writer.println(paramValue);
            } else {
                // Read multiple valued data
                writer.println("<ul>");

                for(int i=0; i < paramValues.length; i++) {
                    writer.println("<li>" + paramValues[i]);
                }

                writer.println("</ul>");
            }
        }

        writer.println("</tr>\n</table>\n</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
