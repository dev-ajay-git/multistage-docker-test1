<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Employee List</title></head>
<body>
  <h2>Employees</h2>
  <ul>
    <c:forEach var="emp" items="${employees}">
      <li>${emp}</li>
    </c:forEach>
  </ul>
  <br/>
  <a href="/">Back to Form</a>
</body>
</html>
