	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="header.jsp" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
<%@ page isELIgnored="false" %>
<script src="https://code.jquery.com/jquery-2.2.1.in.js"></script>
<script src="https://cdn.datatables.net/1.10.10/js/jquery/dataTables.min.js"></script>
<link href="https://cdn.datatables.net/1.10.10/css/jquery/dataTables.min.css" rel="stylesheet">
<script>
$(document).ready(function(){
	var searchCondition='${searchCondition}';
	$('.table').DataTable({
		"lengthMenu":[[3,5,7,-1],[3,5,7,"All"]],
		"oSearch":{"sSearch":searchCondition}
	})
});
</script>
</head>
<body>
<div class="container">

		<table class="table table-striped">
			<thead>
				<tr>
				<th>Image</th>
					<th>Product Name</th>
					<th>Description</th>
					<th>Category</th>
                   <th>View/Edit/Delete</th>

				</tr>
			</thead>
			<c:forEach var="p" items="${ProductList}">
				<tr>
				<td>
				<c:url var="src" value="/resources/images/${p.id }.png" ></c:url>
				<img src="${src }" height="40" width="70"/>
				</td>
					<td>${p.name }</td>
					<td>${p.description }</td>
					<td>${p.category.categoryDetails}</td>
				
				
				<c:url var="url" value="/all/Product/viewproduct/${p.id }"></c:url>
					<td>
					<a href="${url }"><span class="glyphicon glyphicon-info-sign"></span></a> 
					<c:url var="delete" value="/admin/Product/deleteProduct/${p.id }"></c:url>
					<a href="${delete }"><span class="glyphicon glyphicon-remove"></span></a>
					
					<c:url var="edit" value="/admin/Product/editform/${p.id }"></c:url>
					<a href="${edit }"><span class="glyphicon glyphicon-pencil"></span></a>
				    </td>
				</tr>
			</c:forEach>
		</table>

	</div>
	</body>
</html>