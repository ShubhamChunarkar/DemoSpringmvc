<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
 	.error{color:red;}
</style>
<title>Insert title here</title>
</head>
<body>
<h4>Fill Out the Form (*) required</h4>
<form:form action="processForm" modelAttribute="author">
	
	
		First name(*): <form:input path="first_name" label="first_name"/>
						
		<br><br>
	
		Last name: <form:input path="last_name" />
					<form:errors path="last_name" cssClass="error" />
		<br><br>
		Age: <form:input path="age" />
			 <form:errors path="age" cssClass="error" />
		<br><br>
		Audio: <form:input path="audio" /> <br><br>
		
		country:
		<br><br>
		<form:select path="country">
		<c:forEach var="prof" items="${thecountryOptions}">
     		<form:option value="${prof.key}" label="${prof.value}" />
   		</c:forEach>
			<!--<form:options items="${thecountryOptions}" />-->
			
		</form:select>
		<br><br>
		PostalCode: <form:input path="postalcode" />
			 <form:errors path="postalcode" cssClass="error" />
		
		<br><br>
		Select Gender: 
		 <!-- Male:<form:radiobutton path="gender" value="male"/>
		FeMale:<form:radiobutton path="gender" value="male"/>
		NotPrefer to say:<form:radiobutton path="gender" value="Not disclosed"/>-->
		<form:radiobuttons path="gender" items="${author.genders}"  />
		 
		<br><br>
		FavouriteGenre:
		Country Music  <form:checkbox path="genre" value="CountryMusic"/>
		Classical	<form:checkbox path="genre" value="Classical"/>
		Pop Music	<form:checkbox path="genre" value="PopMusic"/>
		<br><br>
		
		Website: <form:input path="website" />
			 <form:errors path="website" cssClass="error" />
		
		<br><br>
		
		
		<input type="submit" value="Submit" />
		
	
	</form:form>


</body>
</html>