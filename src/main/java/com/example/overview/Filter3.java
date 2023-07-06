package com.example.overview;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

import java.io.IOException;

@WebFilter(filterName = "Filter2", urlPatterns = {"/*"}, servletNames = {"Demo"})
public class Filter3 extends HttpFilter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("begin filter 2");
        chain.doFilter(request, response);
        System.out.println("end filter 2");
    }
}
