<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ page isELIgnored="false" %>
</head>
<body>
<div class="container-wrapper">
<div class="container">

<c:url var="url" value="/all/registerCustomer"></c:url>

<form:form action="${url }" commandName="customer">

<div class="form-group">
<form:label path="firstname">FIRST NAME</form:label>
<form:input path="firstname"></form:input>
<form:errors path="firstname"></form:errors>
</div>

<div class="form-group">
<form:label path="lastname">LAST NAME</form:label>
<form:input path="lastname"></form:input>
<form:errors path="lastname"></form:errors>
</div>
<div class="form-group">
<form:label path="email">EMAIL</form:label>
<form:input path="email"></form:input>
<form:errors path="email"></form:errors>
</div>
<div class="form-group">
<form:label path="phonenumber">PHONE NUMBER</form:label>
<form:input path="phonenumber"></form:input>
<form:errors path="phonenumber"></form:errors>
</div>
<div class="form-group">
<form:label path="users.username">USERNAME</form:label>
<form:input path="users.username"></form:input>
${duplicateUsername}
<form:errors path="users.username"></form:errors>
</div>
<div class="form-group">
<form:label path="users.password">PASSWORD</form:label>
<form:input path="users.password" type="password"></form:input>
<form:errors path="users.password"></form:errors>
</div>
<div class="form-group">
<form:label path="billingAddress.apartmentNumber">APARTMENT NUMBER</form:label>
<form:input path="billingAddress.apartmentNumber"></form:input>
<form:errors path="billingAddress.apartmentNumber"></form:errors>
</div>
<div class="form-group">
<form:label path="billingAddress.streetName">STREET NAME</form:label>
<form:input path="billingAddress.streetName"></form:input>
<form:errors path="billingAddress.streetName"></form:errors>
</div>
<div class="form-group">
<form:label path="billingAddress.city">CITY</form:label>
<form:input path="billingAddress.city"></form:input>
<form:errors path="billingAddress.city"></form:errors>
</div>
<div class="form-group">
<form:label path="billingAddress.state">STATE</form:label>
<form:input path="billingAddress.state"></form:input>
<form:errors path="billingAddress.state"></form:errors>
</div>
<div class="form-group">
<form:label path="billingAddress.country">COUNTRY</form:label>
<form:input path="billingAddress.country"></form:input>
<form:errors path="billingAddress.country"></form:errors>
</div>
<div class="form-group">
<form:label path="billingAddress.zipcode">ZIPCODE</form:label>
<form:input path="billingAddress.zipcode"></form:input>
<form:errors path="billingAddress.zipcode"></form:errors>
</div>

<div class="form-group">
<form:label path="shippingAddress.apartmentNumber">APARTMENT NUMBER</form:label>
<form:input path="shippingAddress.apartmentNumber"></form:input>
<form:errors path="shippingAddress.apartmentNumber"></form:errors>

</div>
<div class="form-group">
<form:label path="shippingAddress.streetName">STREET NAME</form:label>
<form:input path="shippingAddress.streetName"></form:input>
<form:errors path="shippingAddress.streetName"></form:errors>

</div>
<div class="form-group">
<form:label path="shippingAddress.city">CITY</form:label>
<form:input path="shippingAddress.city"></form:input>
<form:errors path="shippingAddress.city"></form:errors>

</div>
<div class="form-group">
<form:label path="shippingAddress.state">STATE</form:label>
<form:input path="shippingAddress.state"></form:input>
<form:errors path="shippingAddress.state"></form:errors>

</div>
<div class="form-group">
<form:label path="shippingAddress.country">COUNTRY</form:label>
<form:input path="shippingAddress.country"></form:input>
<form:errors path="shippingAddress.country"></form:errors>

</div>
<div class="form-group">
<form:label path="shippingAddress.zipcode">ZIPCODE</form:label>
<form:input path="shippingAddress.zipcode"></form:input>
<form:errors path="shippingAddress.zipcode"></form:errors>

</div>

<input type="submit" value="register">

</form:form>

</div>

</div>
</body>
</html>