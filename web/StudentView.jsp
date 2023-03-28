<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.*" %>
<%@page import = "java.util.*" %>
<!DOCTYPE html>
<%
  CampusDAO u = new CampusDAO();
   Student s = (Student)session.getAttribute("account");
   int cid = s.getCampusId();
  Campus x = u.getCampusList(cid);
  String gen;
  if(s.isGender()){
        gen = "Female";
    }
    else{
        gen="Male";
    }
  
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Information</title>
    </head>
    <body>
        <p> <h2>Student ID: ${sessionScope.account.studentId}</h2>
        <p> <a href="MarkReport"/> View Grade </a>
    <table border="1">
        <tr align="center">
            <td align="center"> Student ID </td>
            <td align="center"> Student Name </td>
            <td align="center"> Gender </td>
            <td align="center"> Date of birth </td>
            <td align="center"> Campus </td>

        </tr>
        <tr align="center">
            <td>${sessionScope.account.studentId} </td>
            <td>${sessionScope.account.name}</td>
            <td><%=gen%></td>
            <td>${sessionScope.account.dob}</td>
            <td><%= x.getCampusName()%></td>
        </tr>
    </table>

    <p><button onclick='window.history.go(-1);'>Back to previous page</button>
    <p><a href="index.html">Back to homepage</a>
    <p><a href="LogoutServlet">Logout</a>
</body>
</html>
