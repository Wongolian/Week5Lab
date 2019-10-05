<%-- 
    Document   : register
    Created on : 3-Oct-2019, 4:12:09 PM
    Author     : Steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form action="shoppinglist" method="POST">
            Username: <input type="text" name="user">
            <input type="submit" value="Register" name="action">
        </form>
    </body>
</html>
