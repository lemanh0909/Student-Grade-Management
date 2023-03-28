<%-- 
    Document   : LectureMarkReport
    Created on : Oct 24, 2022, 5:20:39 AM
    Author     : AD
--%>

<%@page import = "model.*" %>
<%@page import = "java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  List<Grade> list = (List<Grade>)session.getAttribute("grade");
  String studentID = (String)session.getAttribute("studentID");
%> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Grade</title>
    </head>
    <body>
        <h2>Student ID: ${sessionScope.studentID} </h2>
        <h2>Average GPA: ${sessionScope.gpa} </h2>
        <table border="1">
            <tr align="center">
                <td align="center"> Subject ID </td>
                <td align="center"> Mark </td>
                <td  colspan="2" align="center"> <a href="InsertGrade.jsp?sudentID=<%=studentID%>"> Insert </a> </td>

            </tr>
            <%
                for(Grade x: list) {
            %>
            <tr align="center">
                <td><%=x.getSubjectId()  %></td>
                <td><%=x.getMark()  %></td>
                <td><a href="UpdateGrade?subjectID=<%=x.getSubjectId() %>">  Edit </a> </td>
                <td><a href="DeleteGrade?subjectID=<%=x.getSubjectId() %>">  Delete </a> </td>
            </tr>
            <%
        }
            %>
        </table>

        <p><button onclick='window.history.go(-1);'>Back to previous page</button>
        <p><a href="StudentList">Back to Student List</a>
            <p><a href="LectureView.jsp">Back to homepage</a>
        <p><a href="LogoutServlet">Logout</a>
            
    </body>
</html>
