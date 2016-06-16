<%-- 
    Document   : alta_persona
    Created on : 25-may-2016, 19:22:46
    Author     : constantin brindusoiu
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="estilos.css" />
    </head>
    <body>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/badooo","root", "root");
            Statement s = conexion.createStatement();

            request.setCharacterEncoding("UTF-8");
      
            // Comprueba si el clienteid de cliente ya existe
            String consulta = "SELECT COUNT(*) FROM cliente WHERE clienteid='"
                      + request.getParameter("clienteid")
                      + "'";

            ResultSet coincidencias = s.executeQuery(consulta);
            coincidencias.next();

            if (coincidencias.getInt(1) != 0) {
              out.print("<script type=\"text/javascript\">alert(\"Lo siento, el código " + request.getParameter("clienteid") + " ya existe\");</script>");
              out.print("<script>document.location = \"index.jsp\"</script>");
            } else {
              // Inserta los datos en la base de datos
              String insercion = "INSERT INTO cliente VALUES ('"
                          + request.getParameter("clienteid")
                          + "', '" + request.getParameter("nombre")
                        + "', '" + request.getParameter("direccion")
                        + "', '" + request.getParameter("telefono")
                        + "', '" + request.getParameter("nacimiento")
                        + "', '" + request.getParameter("estado")+ "')";
              out.print(insercion);
              s.execute(insercion);         
              conexion.close();
            }
              %>
      <script>document.location = "index.jsp"</script>
    </body>
</html>
