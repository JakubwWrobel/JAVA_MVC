<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 20.06.2020
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add to Cart</title>
</head>
<body>
<main>
    <h1>Cart Items</h1>
    <div class="koszyk">
        <p>W koszyku jest ${cart.sizeOfCart} pozycji</p>
        <p>W koszyku jest ${cart.numberOfQuantities} produktów</p>
        <p>Wartość koszyka to: ${cart.totalAmount} produktów</p>
    </div>
</main>
</body>
</html>
