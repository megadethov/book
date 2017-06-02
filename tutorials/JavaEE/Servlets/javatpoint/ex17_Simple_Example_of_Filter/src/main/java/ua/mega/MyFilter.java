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
        PrintWriter writer = response.getWriter();
        writer.print("filter is invoked before");

        chain.doFilter(request, response); //sends request to next resource

        writer.print("filter is invoked after");
    }

    @Override
    public void destroy() {

    }
}
