<%--
  Created by IntelliJ IDEA.
  User: DKondov
  Date: 05.04.2018
  Time: 16:27
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<html>
<head>
    <title>Enter city</title>
</head>
<body>
<h1>Enter city for weather info</h1><br/>
<h3>Be careful!</h3>
<form action="${pageContext.servletContext.contextPath}/weather/cityname">
    <lable><input type="text" name="cityName" required>Название города</lable><br/>
    <fieldset> <legend><b>Единицы измерения температуры</b></legend>
        <label><input type="radio" name="degreeParam" value="celsius" checked>градусы Цельсия</label>
        <label><input type="radio" name="degreeParam" value="fahrenheit">градусы Фаренгейта</label>
    </fieldset><br/>
    <fieldset> <legend><b>Прогноз или текущее состояние?</b></legend>
        <label><input type="radio" name="typeInfo" value="current" checked>текущее состояние</label>
        <label><input type="radio" name="typeInfo" value="forecast">прогноз</label>
    </fieldset><br/>
    <input type="submit" value="Submit">
</form><br/>
<%--<c:if test="${not empty exception.message}">--%>
    <%--<p style="color: red;">--%>
        <%--<c:out value="${exception.message}"/>--%>
    <%--</p>--%>
<%--</c:if>--%>
</body>
</html>
