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

        <form action="" method="POST">
            <span>Hello ${username}!</span>
            <a href="shoppinglist?action=logout">Logout</a>
        </form>
        <br>
        <br>
        <h2>List</h2>
        <br>
        <form action="shoppinglist" method="POST">
            Add item: <input type="text" name="item">
            <input type="submit" name="action" value="add">

        </form>
        <br>

        <form action="shoppinglist" method="post">
            <ul>
                <c:forEach items="${list}" var="item" varStatus="loop">
                    <label>
                        <input type="radio" name="item" value="${loop.count}"> ${item}
                        <br>
                    </label>
                </c:forEach>
            </ul>

            <input type="submit" name="action" value="delete" />
        </form>
    </body>
</html>
