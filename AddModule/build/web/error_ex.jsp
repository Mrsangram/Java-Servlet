<%-- 
    Document   : error_ex
    Created on : 15 May, 2021, 9:34:15 AM
    Author     : Hack.sangram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<%@page isErrorPage="true" %>@
<!DOCTYPE html>
<html>
       <head>
              <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
              <title>Sorry ! Something Went Wrong...</title>
       </head>
       <body>
               <div class="contrainer p-3 text-center">
                      <img src="img/NotFound.jpg"  style="height: 220px;width: 300px;" class="img-fluid" />
              <h1>Sorry ! Something Went  Wrong... </h1>
              
              <p><%= exception%></p>
                 
              <a href="index.html" class="btn btn-outline-primary">Home Page</a>
               </div>
       </body>
</html>
