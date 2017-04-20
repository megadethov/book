package ua.mega;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter implements Filter {

    FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String s = filterConfig.getInitParameter("construction");

        if (s.equals("yes")) {
            writer.print("This page is under construction");
        } else {
            chain.doFilter(request, response); // sends request to next resource
        }
    }

    @Override
    public void destroy() {

    }
}
