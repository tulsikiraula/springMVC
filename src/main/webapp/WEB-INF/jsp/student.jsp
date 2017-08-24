<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add student page</title>
</head>
<body>
<form:form action="/springMVCDemo/addStudent" method ="post">
Id <form:input path="id"/><br>
Name <form:input path="name"/><br>
Age <form:input path="age"/><br>
<input type="submit">
</form:form>
</body>
</html>