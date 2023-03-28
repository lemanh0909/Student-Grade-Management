<%-- 
    Document   : MarkReport
    Created on : Oct 23, 2022, 1:47:35 AM
    Author     : AD
--%>
<%@page import = "model.*" %>
<%@page import = "java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  List<Grade> list = (List<Grade>)session.getAttribute("grade");
%>    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Grade</title>
    </head>
    <body>
        <p> <h2>Student ID: ${sessionScope.account.studentId}</h2>
        <h2>Average GPA: ${sessionScope.gpa} </h2>
        <table border="1">
            <tr align="center">
                <td align="center"> Subject ID </td>
                <td align="center"> Mark </td>


            </tr>
            <%
                for(Grade x: list) {
            %>
            <tr align="center">
                <td><%=x.getSubjectId()  %></td>
                <td><%=x.getMark()  %></td>
            </tr>
            <%
        }
            %>
        </table>

        <p><button onclick='window.history.go(-1);'>Back to previous page</button>
            <p><a href="StudentView.jsp">Back to homepage</a>
        <p><a href="LogoutServlet">Logout</a>
    </body>
</html>
