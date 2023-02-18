<%-- 
Document   : op
Created on : 15 May, 2021, 9:23:57 AM
Author     : Hack.sangram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error_ex.jsp" %>
<!DOCTYPE html>
<html>
       <head>
              <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
              <title>JSP Page</title>
       </head>
       <body>
              <%

//fatch two Number
                     String n1 = request.getParameter("n1");
                     String n2 = request.getParameter("n2");

//coversion string to interger
                     int num1 = Integer.parseInt(n1);
                     int num2 = Integer.parseInt(n2);
                     int  c= num1/num2;
              %>
              
              <h1> Result : <%=c%></h1>
       </body>
</html>
