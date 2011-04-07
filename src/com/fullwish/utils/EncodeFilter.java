/**
 * 
 */
package com.fullwish.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodeFilter implements Filter {
    
    public static int userDelTime = 8;
    
    public void destroy() {}
    
    public void doFilter(ServletRequest servletRequest,
      ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {
      servletRequest.setCharacterEncoding("UTF-8");
      servletResponse.setCharacterEncoding("UTF-8");
      filterChain.doFilter(servletRequest, servletResponse);
     }
    public void init(FilterConfig fc) throws ServletException {}
   }
