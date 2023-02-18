/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 *
 * @author sangram
 */
public class myFilter  implements Filter{

    @Override
    public void init(FilterConfig fc) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        System.out.println("Before Servlet Without Filter");
        fc.doFilter(sr, sr1);
        PrintWriter out = sr1.getWriter();
        out.print("<h1>Welcome to New page</h1>");
        System.out.println("After Servlet With in Java Programming ");
    }

    @Override
    public void destroy() {
        
    }
    
    
}
