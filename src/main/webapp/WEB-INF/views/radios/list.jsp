<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List of Radios</title>
</head>
<body>
<c:forEach items="${radios}" var="radio">
    <p>Name: ${radio.name}, Format:  ${radio.format} </br><a href="/stations?radio=${radio.id}">[List of stations]</a></p>
</c:forEach>
</body>
</html>