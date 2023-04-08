<%-- 
    Document   : logout
    Created on : 25 Mar, 2023, 4:17:20 PM
    Author     : shivam singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("index.html");
            
        %>
    </body>
</html>
