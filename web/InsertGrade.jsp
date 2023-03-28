<%-- 
    Document   : InsertGrade
    Created on : Oct 24, 2022, 1:16:48 PM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Grade</title>
    </head>
    <body>
        <h2>Student ID: ${sessionScope.studentID} </h2>
        <h4 class="error">${requestScope.error}</h4>
        <form action="InsertGrade" method="post">
            Enter Subject ID<input  type="text" name="subjectID">
            Enter Grade<input  type="text" name="mark">
            <button type="submit" class="btn btn-primary">Finish</button>
        </form>
        <p><button onclick='window.history.go(-1);'>Back to previous page</button>
        <p><a href="StudentList">Back to Student List</a>
        <p><a href="LectureView.jsp">Back to homepage</a>
    </body>
</html>
