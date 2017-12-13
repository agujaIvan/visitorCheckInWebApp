<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<%@include file="checkSession.jsp"%>

<c:set var="pageTitle" value="Add dance style" scope="session" />
<c:import url="/jsp/head.jsp" />

<body>
    <c:import url="/jsp/navBar.jsp" />

    <c:import url="/jsp/content-danceStyle.jsp" />

    <c:import url="/js/jQuery.jsp" />
</body>
</html>
