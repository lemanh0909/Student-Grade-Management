<%-- 
    Document   : Delete.jsp
    Created on : Nov 7, 2022, 2:38:37 AM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.*" %>
<%@page import = "java.util.*" %>
<%
 Student x = (Student) request.getAttribute("x");
  CampusDAO u = new CampusDAO();
%>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2> Delete a student </h2>
            <h2>Student found:</h2>
    <table border="1">
        <tr align="center">
            <td align="center"> Student ID </td>
            <td align="center"> Student Name </td>
            <td align="center"> Gender </td>
            <td align="center"> Date of birth </td>
            <td align="center"> Campus </td>

        </tr>
        <tr align="center">
            <td><%= x.getStudentId() %> </td>
            <td><%= x.getName() %></td>
                        <%         String gen;
                        if(x.isGender()){
                              gen = "Female";
                          }
                          else{
                              gen="Male";
                          }
            %>
            <td><%=gen%></td>
            <td><%= x.getDob() %></td>
            <% Campus c = u.getCampusList(x.getCampusId());%>
            <td><%= c.getCampusName()%></td>
        </tr>
    </table>
            <a href="delete?rollno=<%=x.getStudentId() %>"> Confirm to delete </a>
        <p><button onclick='window.history.go(-1);'>Back to previous page</button>
        <p><a href="LectureView.jsp">Back to homepage</a>
    </body>
</html>
