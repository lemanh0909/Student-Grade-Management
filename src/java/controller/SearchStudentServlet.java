package controller;

import model.*;
import java.util.*;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet(name = "SearchStudentServlet", urlPatterns = {"/SearchStudent"})
public class SearchStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //response.sendRedirect("search.jsp");
        String u = "<form action='SearchStudent' method='post'>";
        u += "<p> Student ID:";
        u += "<input type='text' name='studentId'/>";    
        u += "<input type='Submit' value='Search'>";
        u += "</form>";  
        out.print(u);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String xName = request.getParameter("studentId").trim();
        StudentDAO u = new StudentDAO(); 
        Student x = null;
        if(xName.length()==0)
            out.print("Please Enter Student ID");
           else
            x = u.getStudent(xName);
        request.setAttribute("x", x);
        request.getRequestDispatcher("SearchStudent.jsp").forward(request, response);

    }
}