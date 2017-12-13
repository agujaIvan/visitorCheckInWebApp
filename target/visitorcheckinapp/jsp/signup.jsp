<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<c:set var="pageTitle" value="Signup" scope="session" />
<c:import url="/jsp/head2.jsp" />
<body>

<c:import url="/jsp/content-signup.jsp" />

<c:import url="/jsp/carousel.jsp" />

<c:import url="/jsp/footer.jsp" />

<c:import url="/jsp/javascriptLinks.jsp" />
<script src="${pageContext.request.contextPath}/js/signupValidation.js"></script>

</body>
</html>