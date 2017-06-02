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

        String password = request.getParameter("password");
        if (password.equals("admin")) {
            chain.doFilter(request, response); //sends request to next resource
        } else {
           writer.print("username or password error!");
           request.getRequestDispatcher("index.html").include(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
