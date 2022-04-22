package org.swclass.servletproject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/netInfo")
public class URLInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print("reqeust url " + request.getRequestURL() + "<br/>");
        writer.print("reqeust uri " + request.getRequestURI() + "<br/>");
        writer.print("context Path " + request.getContextPath() + "<br/>");
        writer.print("Servlet Path " + request.getServletPath() + "<br/>");
        writer.print("reqeust Protocol " + request.getProtocol());
        writer.close();
    }
}
