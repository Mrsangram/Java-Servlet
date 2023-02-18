<%-- 
    Document   : JSTLpage
    Created on : May 14, 2021, 11:06:23 AM
    Author     : sangram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Taglib Example</title>
    </head>
    <body>
<h1>Tag lib in java programming </h1>
<c:set var="name"  value="India is My country"></c:set>
<c:out value="${name}"></c:out>
<c:if test="${3>21}">
    <h2>This is True black</h2>
</c:if>
    </body>
</html>
