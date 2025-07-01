<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Employee List</title></head>
<body>
<h2>Employee List</h2>
<ul>
  <c:forEach var="emp" items="${employees}">
    <li>${emp}</li>
  </c:forEach>
</ul>
<a href="/">Back to Home</a>
</body>
</html>
