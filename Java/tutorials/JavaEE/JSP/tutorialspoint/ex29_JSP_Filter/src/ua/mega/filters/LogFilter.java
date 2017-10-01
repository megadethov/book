package ua.mega.filters;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

/**
 * Following is the JSP Filter Example that would print the clients IP address
 * and current date time each time it would access any JSP file.
 * This example would give you basic understanding of JSP Filter, but you can
 * write more sophisticated filter applications using the same concept:
 */
public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Get init parameter
        String testParam = filterConfig.getInitParameter("test-param");
        //Print the init parameter
        System.out.println("Test param: " + testParam);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // Get the IP address of client machine.
        String ipAddress = request.getRemoteAddr();
        // Log the IP address and current timestamp.
        System.out.println("IP " + ipAddress + ", Time " + new Date().toString());
        // Pass request back down the filter chain
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
/* Called before the Filter instance is removed
      from service by the web container*/
    }
}
