<%-- 
    Document   : borraPersona
    Created on : May 25, 2016, 7:32:12 PM
    Author     : constantin brindusoiu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
      <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/badooo","root", "root");
            Statement s = conexion.createStatement();

            s.execute ("DELETE FROM cliente WHERE clienteid=" + request.getParameter("clienteid"));
        %>  
       <script>document.location = "index.jsp"</script> 
    </body>
</html>
