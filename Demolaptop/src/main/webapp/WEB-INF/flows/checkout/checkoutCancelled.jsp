<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/pages/header.jsp" %>
<%@ page isELIgnored="false" %>

<div class="container-wrapper">
    <div class="container">
    <section>
    <div class="jumbotron">
    <h1 class="alert alertt-danger">checkout Cancelled!</h1>
    <p> your checkout process is cancelled! you may continue shopping.</p>
    </div>
     </section>
     </div>
     </div>
<section class="container">
<p><a href="<spring:url value="/Product/Productlist"/>" class="btn btn-default">Products</a></p>
</section>
<script src="<c:url value="/resources/js/controller.js"></c:url>"></script>
<%@ include file="/WEB-INF/pages/footer.jsp"%>