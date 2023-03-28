package controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.util.*;
import model.*;


@WebServlet(urlPatterns = {"/delete"})
public class DeleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String xRollno = request.getParameter("rollno");
        StudentDAO u = new StudentDAO();
        Student x = u.getStudent(xRollno);
        u.deleteGrade(xRollno);
        u.deleteStudent(xRollno);
        response.sendRedirect("StudentList");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String xRollno = request.getParameter("rollno");
        StudentDAO u = new StudentDAO();
        Student x = u.getStudent(xRollno);
        if(x==null) {
           pr.println("<h2> A student is not found</h2>");
           request.getRequestDispatcher("Delete.jsp").include(request, response);
        }
        else {
        request.setAttribute("x", x);
        request.getRequestDispatcher("Delete.jsp").forward(request, response);
        }

    }
}
