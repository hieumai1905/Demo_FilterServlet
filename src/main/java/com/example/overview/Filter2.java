package com.example.overview;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpFilter;

import java.io.IOException;

@WebFilter(filterName = "Filter3", urlPatterns = {"/*"}, dispatcherTypes = {DispatcherType.REQUEST})
public class Filter2 extends HttpFilter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("begin filter 3");
        chain.doFilter(request, response);
        System.out.println("end filter 3");
    }

}
