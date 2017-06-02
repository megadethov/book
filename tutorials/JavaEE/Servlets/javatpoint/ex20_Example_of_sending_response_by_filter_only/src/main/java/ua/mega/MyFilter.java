package ua.mega;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

       writer.print("<br/>this site is underconstruction..");
       writer.close();
    }

    @Override
    public void destroy() {

    }
}
