<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
	<head>
		
	</head> 
	<body> 

	<a href="${pageContext.request.contextPath }/account/add.html">Add new account</a>
	<br><br>
	<table border="1">
		<tr>
			<th>Book Name</th>
			<th>Title</th>
			<th>Descript</th>
		</tr>
		<c:forEach var="book" items="${books}">
			<tr>
				<td>${book.id }</td>
				<td>${book.title }</td>
				<td>${book.description }</td>
				
			</tr>
		</c:forEach>
	</table>	

</body>
</html>
