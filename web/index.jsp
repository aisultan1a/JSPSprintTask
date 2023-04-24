<%@ page import="java.util.Scanner" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
</head>
<body>

    <div class="container">
        <div class="row">
            <div class="col-3 mx-auto">
                <%
                    for (int i = 0; i<10;i++){
                %>
                <div class="card">
                    <img src="https://images.pexels.com/photos/5546810/pexels-photo-5546810.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" class="card-img-top">
                    <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                    </div>
                </div>
                <%
                    }
                %>
            </div>
        </div>
    </div>

</body>
</html>
