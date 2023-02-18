<%-- 
    Document   : Example
    Created on : 15 May, 2021, 1:54:03 PM
    Author     : Hack.sangram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/mylib" prefix="t" %>
<!DOCTYPE html>
<html>
       <head>
              <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
              <title>Taglib in JSP</title>
       </head>
       <body>
              <h1>Tag Lib Create in JSP</h1>
              <t:mytag></t:mytag>
              <t:printTable number="23"></t:printTable>
       </body>
</html>
