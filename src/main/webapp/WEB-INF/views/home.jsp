<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <title>Benvenuti nella mia applicazione</title>
</head>
<body>
<div class="container">
    <h1 class="text-center mt-5">Benvenuti nella mia applicazione!</h1>
    <p class="text-center">
        <a href="login" class="btn btn-primary mt-2">Accedi</a>
    </p>
    <%
        String welcomeMessage = (String) request.getAttribute("welcomeMessage");
        if(welcomeMessage != null) {
    %>
    <p class="text-center mt-3"><%= welcomeMessage %></p>
    <%
        }
    %>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>