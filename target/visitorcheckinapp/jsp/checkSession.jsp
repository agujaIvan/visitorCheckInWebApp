<%@ page import="edu.matc.controller.SessionInfo" %>
<% SessionInfo sessionInfo = new SessionInfo(request);
    sessionInfo.isLogIn(request, response);
%>
