<%-- 
    Document   : StudentList
    Created on : Oct 23, 2022, 9:45:18 PM
    Author     : AD
--%>
<%@page import = "model.*" %>
<%@page import = "java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
  List<Student> list = (List<Student>) session.getAttribute("list");
  float gpa = (float)session.getAttribute("gpa");
   CampusDAO u = new CampusDAO();
   StudentDAO st = new StudentDAO();
%> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of Student</title>
    </head>
    <body>
        <h2> List of students </h2>
        <h2>Average GPA: ${sessionScope.gpa} </h2>
        <p> <a href="ListStudentGpaDetail.jsp"/> List Students Gpa Detail </a>
<table border="1">
    <tr>
        <td align="center"> Student ID </td>
        <td align="center"> Student Name </td>
        <td align="center"> Gender </td>
        <td align="center"> Date of birth </td>
        <td align="center"> Campus </td>
        <td align="center"> GPA </td>
        <td  colspan="2" align="center"> <a href="insert.jsp"/> Insert </a> </td>
    </tr>
    <%
      for(Student x: list) {
        String gen;
  if(x.isGender()){
        gen = "Female";
    }
    else{
        gen="Male";
    }
    %>
    <tr>
        <td><a href="LectureMarkReport?rollno=<%= x.getStudentId() %>"><%= x.getStudentId() %></a></td>
        <td><%= x.getName() %> </td>
        <td><%= gen %> </td>
        <td><%= x.getDob() %> </td>
        <% Campus c = u.getCampusList(x.getCampusId());%>
        <td><%= c.getCampusName() %> </td>
        <td><%= st.getGpa(x.getStudentId()) %> </td>
        <td><a href="delete?rollno=<%=x.getStudentId() %>">  Delete </a> </td>

    </tr>  
    <% } %>  
</table>     
<p><button onclick='window.history.go(-1);'>Back to previous page</button>
<p><a href="LectureView.jsp">Back to homepage</a>
<p><a href="LogoutServlet">Logout</a>
</body>
</html>
