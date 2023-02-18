<%-- 
    Document   : ErrorHandaling
    Created on : May 14, 2021, 11:32:21 AM
    Author     : sangram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page  errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Handlig in java </title>
    </head>
    <body>
        <h1>Error handling in java programming </h1><hr>
        <c:set var="name" value="india is my country :">
            
        </c:set>
        <h1>
        <c:out value="${name}"> </c:out>
        
        <%! int num =23;
        int  num2= 0;
        String contant = null;
         %>
         <% int devision = num/num2;%>
         
         <% out.print(devision);%>
         <% contant.length();%>
         </h1>
        
        
    </body>
</html>
