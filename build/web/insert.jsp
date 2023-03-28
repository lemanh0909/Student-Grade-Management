<%-- 
    Document   : insert
    Created on : Oct 24, 2022, 1:01:40 AM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Information Student</h1>
        <hr>
        <form action="insert" method="POST">
            <div class="form-group">
                <label>Student ID</label>
                <input type="text" class="form-control" placeholder="Enter Student ID" name="studentID">
            </div>
            <div class="form-group">
                <label>Last Name</label>
                <input type="text" class="form-control" placeholder="Enter Student Name" name="name">
            </div>
            <div class="form-group">
                <label>Date Of Birth</label>
                <input type="date" class="form-control" name="dob">
            </div>
            <div class="form-group">
                <label>Gender</label>
                <div>
                    <input type="radio" name="gender" value="1" class="gender"> Male
                    <input type="radio" name="gender" value="0" class="gender">Female
                </div>
            </div>
            <div class="form-group">
                <label>Campus ID</label>
                <input type="text" class="form-control" placeholder="Enter Campus ID" name="campusID">
            </div>
            <button type="submit" class="btn btn-primary">Insert</button>
            <p><a href="StudentList">Back to Student List</a>
                <p><a href="LectureView.jsp">Back to homepage</a>
    </body>
</html>
