<%-- 
    Document   : LectureView
    Created on : Oct 23, 2022, 6:28:54 PM
    Author     : AD
--%>
<%@page import = "model.*" %>
<%@page import = "java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <h1 class="welcome">Welcome</h1>
        <a href="StudentList">
            <h2>View Student List</h2>
        </a>    
        <a href="SearchStudent">
            <h2>Search a Student</h2>
        </a> 
        <a href="insert">
            <h2>Insert Student</h2>
        </a> 
        <a href="Delete.html">
            <h2>Delete Student</h2>
        </a>  
        <div class="logout">
        <a href="LogoutServlet"><h2>Logout</h2></a>
        </div>
    </body>
</html>
