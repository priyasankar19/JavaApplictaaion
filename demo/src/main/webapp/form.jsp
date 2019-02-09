<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<button onClick="getdetails()">Get details</button>

<div id="data">
click to get detail...
</div>

<script type="text/javascript">
var getdetails = function()
{
		fetch('http://localhost:8080/get').then(function(response)
				{
			return response.json()}).then(function(result)
					{
			var content = 'My name is ' + result[0].name +' and my dept is '+ result[0].dept;
			document.getElementById('data').innerHTML= content;
		});
	
}</script>
</body>
</html>