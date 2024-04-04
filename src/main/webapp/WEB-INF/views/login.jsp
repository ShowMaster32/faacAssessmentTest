<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <title>Login Page</title>
    <style>
        body {
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: #f1f1f1;
        }
        .form-control {
            border-radius: 20px;
        }
        .btn {
            border-radius: 20px;
        }
        .savedUser {
            color: red;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-4">
            <h2 class="text-center">Login Form</h2>
            <form method="POST" action="/login">
                <div class="form-group">
                    <input type="text" class="form-control" name="username" placeholder="Username" required>
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" name="password" placeholder="Password" required>
                </div>
                <% String savedUserMessage = (String) request.getAttribute("savedUserMessage");
                    if(savedUserMessage != null) {%>
                <p class="savedUser"><%= savedUserMessage %></p>
                <% } %>
                <button type="submit" class="btn btn-primary btn-block">Submit</button>
            </form>
            <button onclick="window.location.href='/'" class="btn btn-secondary mt-2 btn-block">Torna alla Home</button>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>