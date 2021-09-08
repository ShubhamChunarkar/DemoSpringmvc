
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Author confirm Page</title>
</head>
<body>
<br><br>
	The Author firstname is:${author.first_name} 
	
	<br><br>
	The Author lastname is:${author.last_name} 
	
	<br><br>
	
	The audio released by author is :${author.audio} 
	<br><br>
	
	Country:${author.country} 
	
	<br><br>
	
	Gender:${author.gender}
	
	<br><br>
	Genres:
	<ul>
	<c:forEach var="temp" items="${author.genre}">
		<li> ${temp} </li>
	</c:forEach>
	</ul>
	<br><br>
	Age is:${author.age}
	
	<br><br>
   Postalcode is:${author.postalcode}
   
   <br>
   Website:${author.website}
   
</body>
</html>