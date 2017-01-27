package ua.mega.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * HTTP Header Request Example
 */
public class DisplayHeader extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        String title = "HTTP Header Request Example";

        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";

        writer.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n"+
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
                "<tr bgcolor=\"#949494\">\n" +
                "<th>Header Name</th><th>Header Value(s)</th>\n"+
                "</tr>\n");

        Enumeration headerNames = req.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String hName = (String) headerNames.nextElement();
            writer.print("<tr><td>" + hName + "</td>\n");
            String hValue = req.getHeader(hName);
            writer.print("<td> " + hValue + "</td></tr>\n");
        }
        writer.println("</table>\n</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
