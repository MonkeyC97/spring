<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: houchang
  Date: 2019-08-08
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>ShowUserListPage</title>
</head>
<body>
    <table border="1" align="center" width="80px">
        <tr>
            <th>userID</th>
            <th>userNAME</th>
            <th>userADDR</th>
    <c:forEach items="${userListKey}" var="uservar">
        <tr>
        <td>${uservar.userId}</td>
        <td>${uservar.userName}</td>
        <td>${uservar.userAddr}</td>
        </tr>
    </c:forEach>
        </tr>
    </table>
</body>
</html>
