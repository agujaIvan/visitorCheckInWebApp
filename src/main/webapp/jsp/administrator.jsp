<%@ page import="edu.matc.controller.SessionInfo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<%@include file="checkSession.jsp"%>
<c:set var="pageTitle" value="Administrator page" scope="session" />
<c:import url="/jsp/head.jsp" />

<body>
    <c:import url="/jsp/navBar.jsp" />


    <div class="container">
      <h2 style="color: red">${message}</h2>
    </div>

    <c:import url="/js/jQuery.jsp" />
</body>
</html>
