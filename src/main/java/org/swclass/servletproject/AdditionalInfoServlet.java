package org.swclass.servletproject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AdditionalInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(request.getMethod() + "<br/>");
        out.print(request.getPathInfo()+ "<br/>");
        out.print(request.getPathTranslated()+ "<br/>");
        out.print(request.getQueryString()+ "<br/>");
        out.close();
    }
}
