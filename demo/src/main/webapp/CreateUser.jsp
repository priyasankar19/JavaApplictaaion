<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><br>

<p style="color:Green;font-size:100%;">
Register!!
<br>
<br>
<form:form action="/createUser"  modelAttribute="user" method="post">
 <spring:bind path="name">
<div>
<form:input type="text" style="color:blue;font-size:100%;text-align:center;" path="name" placeholder="Enter Name" name="name"></form:input><br><br>
<form:errors path="name"></form:errors>
</div>
</spring:bind>
 <spring:bind path="password">
<div>
<form:input type="password" style="color:blue;font-size:100%;text-align:center;" path="password" placeholder="Enter Password" name="password"></form:input><br><br>
</div>
</spring:bind>

<button type="submit" style="color:blue;font-size:100%;text-align:center;">submit</button>
    </form:form>
    </p>
</body>
</html>