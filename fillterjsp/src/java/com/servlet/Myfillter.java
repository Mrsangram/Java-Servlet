/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;       
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.*;
import javax.servlet.ServletResponse;

/**
 *
 * @author Hack.sangram
 */
public class Myfillter implements Filter {

       @Override
       public void init(FilterConfig fc) throws ServletException {

       }

       @Override
       public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
              System.out.println("Before Filter Method");
              //..
              //.....
              //..........
              fc.doFilter(sr,sr1);
       }

       @Override
       public void destroy() {
              
       }

}


