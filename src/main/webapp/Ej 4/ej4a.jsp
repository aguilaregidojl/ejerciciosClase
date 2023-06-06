<%-- 
    Document   : ej4a
    Created on : 6 jun 2023, 16:26:30
    Author     : java
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 4</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        <% float nota1 = Float.parseFloat(request.getParameter("nota 1")); %>
        <% float nota2 = Float.parseFloat(request.getParameter("nota 2")); %>
        <% float nota3 = Float.parseFloat(request.getParameter("nota 3")); %>
        <% float nota = (nota1 + nota2 + nota3)/3; %>
        <% out.println("La media es " + nota); %>
    </body>
</html>
