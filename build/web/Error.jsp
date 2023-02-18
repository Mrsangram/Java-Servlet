<%-- 
    Document   : Error
    Created on : May 14, 2021, 11:40:07 AM
    Author     : sangram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry ! Some thing went Wrong ...</title>
        <style>
            *{padding:0;margin: 0; text-align: center}
        </style>
    </head>
    

        

            <h1>Sorry ! Some thing went Wrong ...</h1>
            <br>
            <p>Note...</p>
            <%= exception %>
        
    
</html>
