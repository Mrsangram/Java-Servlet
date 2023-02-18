<%-- 
    Document   : page1
    Created on : 15 May, 2021, 6:14:53 PM
    Author     : Hack.sangram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
       <head>
              <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
              <title>JSP Page</title>
       </head>
       <body>
              <h1>I am Page 2</h1>

              <%
       //                     out.print("<p>Processing...</p>");
       //                     Thread.sleep(5000);
       //                     
                     response.sendRedirect("https://www.google.com");
                     

              %>

       </body>
</html>
