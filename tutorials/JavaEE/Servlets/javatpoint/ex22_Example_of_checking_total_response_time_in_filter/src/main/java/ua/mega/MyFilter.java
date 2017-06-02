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

        long before = System.currentTimeMillis();

        chain.doFilter(request, response);

        long after = System.currentTimeMillis();

        writer.print("<br/>Total response time "+(after-before)+" miliseconds");
        writer.close();
    }

    @Override
    public void destroy() {

    }
}
