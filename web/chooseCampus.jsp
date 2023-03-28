<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FPT University</title>
        <link href="../myStyle.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <link rel="shortcut icon" href="../favicon.ico"/>
    </head>
    <body>
        <div class="container">
            <div class="container-form">
                <h4 class="error">${error}</h4>
                <h1>FPT University</h1>

                <hr>
                <form action="ChooseCampus" method="POST">
                    <div class="form-group">
                        <label>Select Campus</label>
                        <select class="form-control" name="campusId">
                            <option value="1">FU-Hòa Lạc</option>
                            <option value="2">FU-Hồ Chí Minh</option>
                            <option value="3">FU-Đà Nẵng</option>
                            <option value="4">FU-Cần Thơ</option>
                        </select>
                    </div>

                    <div class="form-group">
                        <label>Select Role</label>
                        <select class="form-control" name="RoleId">
                            <option value="1">Lecture</option>
                            <option value="2">Student</option>

                        </select>
                    </div>
                    <button type="submit" class="btn btn-primary my-botton">Next</button>
                </form>
            </div>
        </div>
    </body>
</html>
