<%-- 
    Document   : LoginLecture
    Created on : Oct 23, 2022, 4:16:47 PM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String campid =(String)request.getAttribute("campusId");
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lecture Login</title>
        <link href="../myStyle.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <link rel="shortcut icon" href="../favicon.ico"/>
    </head>
    <body>
        <div class="container">
            <div class="container-login">
                <h4 class="error">${requestScope.error}</h4>
                <h1>Login</h1>
                <form action="LoginLecture?campusId=<%= campid %>" method="POST">
                    <div class="form-group">
                        <label>Lecture ID</label>
                        <input type="text" class="form-control" placeholder="Enter Lecture ID" name="lectureID">
                    </div>
                    <div class="form-group">
                        <label>Password</label>
                        <input type="password" class="form-control" placeholder="Enter Password" name="password">
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </div>
    </body>
</html>
