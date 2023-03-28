package controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import model.*;
import java.util.*;
import java.sql.Date;

@WebServlet(urlPatterns = {"/insert"})
public class InsertServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        LectureAccount account = (LectureAccount) request.getSession().getAttribute("account");
        if (account == null) {
            out.print("Access denied!");
            return;
        }
        response.sendRedirect("insert.jsp");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
        PrintWriter out = response.getWriter();
        LectureAccount account = (LectureAccount) request.getSession().getAttribute("account");
        if (account == null) {
            out.print("Access denied!");
            return;
        }
        PrintWriter pr = response.getWriter();
        String xRollno, xName;
        Date dob;
        boolean gender;
        int campusID;
        xRollno = request.getParameter("studentID");
        xRollno = xRollno.trim();
        StudentDAO u = new StudentDAO();
        Student x = u.getStudent(xRollno);
        if (x != null) {
            pr.print("<h3> The roll no " + xRollno + " already exists!");
            request.getRequestDispatcher("insert.jsp").include(request, response);
            return;
        }
        xName = request.getParameter("name");
        if (xName == null || xName.trim().length() == 0) {
            pr.print("<h3> The name must not be empty!");
            request.getRequestDispatcher("insert.jsp").include(request, response);
            return;
        }
        String sDob = request.getParameter("dob");
        dob = Date.valueOf(sDob);
        gender = request.getParameter("gender").trim().equals("male");
        campusID = Integer.parseInt(request.getParameter("campusID"));

        x = new Student(xRollno, xName, dob, gender, campusID);

        u.insert(x);
        response.sendRedirect("StudentList");
    }
}
