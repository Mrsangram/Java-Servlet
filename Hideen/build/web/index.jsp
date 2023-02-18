<%-- 
    Document   : index
    Created on : May 13, 2021, 10:17:25 AM
    Author     : sangram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hidden in web page in java servlet </h1>
        
        <form action="Servlet1" method="post" >
            <p>
                Enter the user Name:
            </p><input type="text" placeholder="Enter the user name" name="user_name"  />
            <button type="submit" name="submit" >Goto Next Page</button>
            
        </form>
    </body>
</html>
