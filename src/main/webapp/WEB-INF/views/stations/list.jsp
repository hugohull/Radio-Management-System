<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<br>
<h2>List of Stations</h2>
<br>
<c:forEach items="${stations}" var="station">
    <p>Host: ${station.host}, Producer: ${station.producer}, Genre: ${station.genre}, Frequency: ${station.frequency} </p>
</c:forEach>

<a href="/newStation?radio=${radio_id}">[Add Station]</a>
</body>
</html>