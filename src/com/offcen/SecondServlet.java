package com.offcen;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @creat 2020-06-14-11:26
 */
@WebServlet(value="/second")
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        //session.invalidate();
        HttpSession session1 = request.getSession();
        System.out.println(session1.getId());

        response.setContentType("text/html;charset=utf-8");
        request.setAttribute("name","tom");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/index.jsp");
        requestDispatcher.forward(request,response);
    }
}
