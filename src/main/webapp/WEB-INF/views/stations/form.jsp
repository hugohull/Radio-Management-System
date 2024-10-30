<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Station</title>
</head>
<body>
<form:form action="/addStation" modelAttribute="station">
    Host:
    <form:input path="host"/>
    <form:errors path="host"/><br/>

    Producer:
    <form:input path="producer"/>
    <form:errors path="producer"/><br/>

    Genre:
    <form:input path="genre"/>
    <form:errors path="genre"/><br/>

    Frequency:
    <form:input path="frequency"/>
    <form:errors path="frequency"/><br/>

    <input type="hidden" name="radio" value="${radio}"/>
    <input type="submit"/><form:errors/>
</form:form>
</body>
</html>