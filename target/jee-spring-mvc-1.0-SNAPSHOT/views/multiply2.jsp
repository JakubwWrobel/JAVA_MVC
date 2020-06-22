<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 20.06.2020
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiply</title>
</head>
<body>
<main>

    <h1>multiplication table</h1>
    <table border="1px solid black" cellpadding="1px">
        <tr>
            <th>X</th>
            <c:forEach items="${collect2}" var="coll2">
                <th>${coll2}</th>
            </c:forEach>
        </tr>
        <c:forEach items="${collect}" var="coll">
            <tr>
                <th>${coll} </th>
                <c:forEach items="${collect2}" var="coll2">
                    <td><c:out value="${coll * coll2}"></c:out></td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>

</main>
</body>
</html>
