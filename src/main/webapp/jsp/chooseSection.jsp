<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<%@include file="checkSession.jsp"%>
<c:set var="pageTitle" value="Choose section" scope="session" />
<c:import url="/jsp/head.jsp" />

<body>

    <c:import url="/jsp/navBar.jsp" />

    <c:import url="content-chooseSection.jsp" />

    <c:import url="/js/jQuery.jsp" />
</body>
</html>
