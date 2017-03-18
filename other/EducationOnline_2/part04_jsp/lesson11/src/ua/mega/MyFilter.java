package ua.mega;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    private Boolean status;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.status = Boolean.parseBoolean(filterConfig.getInitParameter("status"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setAttribute("flag", status);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
