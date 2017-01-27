package ua.mega.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Error Handler Servlet Example
 */
public class ErrorHandler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Analyze the servlet exception
        Throwable throwable = (Throwable) req.getAttribute("javax.servlet.error.exception");
        Integer statusCode = (Integer) req.getAttribute("javax.servlet.error.status_code");
        String servletName = (String) req.getAttribute("javax.servlet.error.servlet_name");
        if (servletName == null) {
            servletName = "Unknow";
        }
        String requestUri = (String) req.getAttribute("javax.servlet.error.request_uri");
        if (requestUri == null) {
            requestUri = "Unknown";
        }

        // Set response content type
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        String title = "Error/Exception Information";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
        writer.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n");
        if (throwable == null && statusCode == null){
            writer.println("<h2>Error information is missing</h2>");
            writer.println("Please return to the <a href=\"" +
                    resp.encodeURL("http://localhost:8080/") +
                    "\">Home Page</a>.");
        }else if (statusCode != null){
            writer.println("The status code : " + statusCode);
        }else{
            writer.println("<h2>Error information</h2>");
            writer.println("Servlet Name : " + servletName +
                    "</br></br>");
            writer.println("Exception Type : " +
                    throwable.getClass( ).getName( ) +
                    "</br></br>");
            writer.println("The request URI: " + requestUri +
                    "<br><br>");
            writer.println("The exception message: " +
                    throwable.getMessage( ));
        }
        writer.println("</body>");
        writer.println("</html>");
    }
    // Method to handle POST method request.
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
