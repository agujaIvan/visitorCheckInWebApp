<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
    <c:when test = "${user.userRole == 'dancer'}">
        <c:import url="/jsp/dancerHeader.jsp" />
    </c:when>
    <c:otherwise>
        <c:import url="/jsp/header.jsp" />
    </c:otherwise>
</c:choose>