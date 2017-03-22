<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ page isELIgnored="false" %>
</head>
<body ng-app="app" ng-controller="ProductController">
<div>
<div class="page-header">
<b>PRODUCT DETAILS</b>
</div>
<table>
<tr>
<td>Product Name :</td>
<td>${Product.name }</td>
</tr>
<tr>
<td>Product Description</td>
<td>${Product.description }</td>
</tr>
<tr>
<td>Product Price</td>
<td>${Product.price }</td>
</tr>
<tr>
<td>Category details</td>
<td>${Product.category.categoryDetails }</td>
</tr>
<tr>
<td>Manfacturing Date</td>
<td>${Product.mfg }</td>
</tr>

			<tr>
			<td>
			</td>
			<c:url value="/addCartItem/${Product.id }" var="url"></c:url>
			<td><a href="" ng-click="addToCart(${Product.id })"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
			</tr>
</table>

	</div>
	<script src="<c:url value="/resources/js/controller.js"></c:url>"></script>

</body>
</html>
