// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.opengse.testlet.ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Wenbo Zhu
 */
public class ServletContextListenerOrderTestlet extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/plain");
    ServletContext servletContext = getServletContext();
    response.getWriter().println(servletContext.getAttribute("order"));
  }
}
