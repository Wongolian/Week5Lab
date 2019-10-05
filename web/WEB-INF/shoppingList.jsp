<%-- 
    Document   : ShoppingList
    Created on : 3-Oct-2019, 4:11:50 PM
    Author     : Steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Shopping List!</h1>

        <form action="shoppinglist" method="POST">
            <span>Hello ${username}!</span>
            <a href="" action="logout">Logout</a>
        </form>
        <br>
        <br>
        <h2>List</h2>
        <br>
        <form action="" method="POST">
            Add item: <input type="text" action="add" name="item">
            <input type="submit" value="Add">

        </form>
        <br>
        <br>
        <form action="" method="POST">
            <table>
                <c:forEach var="item" items="${item}">
                    <ul>${item}</ul>
                </c:forEach>
            </table>
            <input type="submit" value="Delete" action="delete">
        </form>
    </body>
</html>
