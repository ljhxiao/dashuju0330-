package com.offcen;

import javax.servlet.*;
import java.io.IOException;

/**
 * @creat 2020-06-21-11:30
 */
public class DemoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("创建");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行");
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
