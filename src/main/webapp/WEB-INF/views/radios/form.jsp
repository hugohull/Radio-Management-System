<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Radio</title>
</head>
<body>
<form:form action="/addRadio" modelAttribute="radio">
    ID:
    <form:input path="id"/>
    <form:errors path="id"/><br/>

    Name:
    <form:input path="name"/>
    <form:errors path="name"/><br/>

    Format:
    <form:input path="format"/>
    <form:errors path="format"/><br/>

    <input type="submit"/><form:errors/>
</form:form>
</body>
</html>