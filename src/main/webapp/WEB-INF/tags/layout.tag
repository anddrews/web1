<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
</head>

<body>

<div class="header">
    <c:choose>
        <c:when test="${user.role=='GUEST'}">
            <p style="display: inline-block">Users: ${user.userName}</p>
            <a href="/web1/login">Login</a>
            <a href="/web1/createUser">Registration</a>
        </c:when>

        <c:otherwise>
            <p style="display: inline-block">Users: ${user.userName}</p>

            <a href="/web1/logout">Logout</a>
        </c:otherwise>
    </c:choose>

</div>
<div class="wrapper">
<c:if test="${user.role!='GUEST'}">
    <p>Name:${user.userName}</p>
    <jsp:doBody/>
</c:if>


</div>
<footer>
    <p> Develop by Kondratenko e-mail:anddrews@tut.by</p>
</footer>
</body>
</html>
