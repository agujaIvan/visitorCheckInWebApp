<%@ page import="edu.matc.controller.SessionInfo" %>
<% SessionInfo sessionInfo = new SessionInfo(request);
    sessionInfo.isAdmin(request, response);
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html >

<c:import url="/jsp/bs4Head.jsp" />
<body>

<c:import url="/jsp/bs4Header.jsp" />

<c:import url="/jsp/content-adminPortal.jsp" />

<c:import url="/jsp/bs4JavaScriptLinks.jsp" />

</body>
</html>