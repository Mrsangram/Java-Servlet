<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
       <head>
              <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
              <title>Databases</title>
       </head>
       <body>
              <h1>This is My Web Page</h1>
              <c:set var="name" value="This is My country"></c:set>
              Out Put in the User :<c:out value="${name}"></c:out>
              <br>
              <b>String Lenght:<c:out value="${fn:toLowerCase(name)}"></c:out></b><br>
              <b>String Lenght:<c:out value="${fn:toUpperCase(name)}"></c:out></b>
              <%--<c:remove var="name"></c:remove>--%>
              <hr>
              <sql:setDataSource var="ds" driver="com.jdbc.mysql.Driver" url="jdbc:mysql://localhost:3306/registration" user="root" password=""></sql:setDataSource>
              <sql:query dataSource="${ds}" var="sr">select * from usr</sql:query>
              <table >
                     <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Password</th>
                            <th>Email</th>
                     </tr>
              
              </table>
              
       </body>
</html>
