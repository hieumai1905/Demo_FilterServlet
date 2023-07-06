package com.example.overview;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "Filter1", urlPatterns = {"/*"})
public class Filter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("begin filter 1");
        chain.doFilter(request, response);
        System.out.println("end filter 1");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
