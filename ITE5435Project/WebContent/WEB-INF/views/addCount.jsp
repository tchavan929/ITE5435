<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Count</title>
</head>
<body>
<h1> Add Quantity of Product You want to add to Inventory</h1>

	<c:url value="/addToInventory" var="url" />
	<form:form method="GET" modelAttribute="inventory" action="${url}" >
	Add Quantity:<form:input path="count"/>
	<form:hidden path="product.product_id"/>
	
	<form:button>submit</form:button>
	</form:form>


</body>
</html>