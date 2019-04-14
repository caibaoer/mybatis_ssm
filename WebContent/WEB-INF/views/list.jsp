<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr><td>ID</td><td>Name</td><td>Age</td></tr>
		<!-- 写成多了一个空格就会有问题： items=" ${students}"  -->
		<c:forEach items="${students}" var="student">
			<tr>	
				<td>${student.id }</td>
				<td>${student.name }</td>
				<td>${student.age }</td>
			</tr>
		
		</c:forEach>
	
	</table>
</body>
</html>