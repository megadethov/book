package ua.mega;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthFilter implements Filter {

    private List<String> pathFilters = new ArrayList<>(Arrays.asList(new String[]{"one", "two", "three"}));

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        StringUtils.substringAfterLast("", "/");
    }

    @Override
    public void destroy() {

    }
}
