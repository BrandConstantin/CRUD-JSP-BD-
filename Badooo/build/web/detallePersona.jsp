<%-- 
    Document   : detallePersona
    Created on : May 25, 2016, 7:36:29 PM
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
    <link rel="stylesheet" href="css/materialize.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>BADOOO</title>
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/badooo","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");

      ResultSet listado = s.executeQuery ("SELECT * FROM cliente WHERE clienteid='" + request.getParameter("clienteid") +"'");

      listado.next();
    %>
             
    <div class="container">
      <div class="row"><% out.print("<img src='img/gente.jpg'/>"); %></div>
      <div class="row s12 m12 l12">
          <div class="card grey lighten-4">
            <h3 class="center">Detalles persona BADOOO</h3>
            <h6 class="center">(conoce gente que le va la marcha)</h6>
            <h6 class="center">----------------------------------------------------------------------------------------------------</h6>
          <h5 class="center"><%=listado.getString("nombre") %></h5>
            <p>
              <i class="mdi-action-label-outline teal-text"> CÓDIGO: </i>
              <b><%=listado.getString("clienteid") %></b>
            </p>
            <p>
              <i class="mdi-action-perm-identity teal-text"> NOMBRE: </i>
              <b><%=listado.getString("nombre") %></b>
            </p>
            <p>
              <i class="mdi-communication-location-on teal-text"> DIRECCIÓN: </i>
              <b><%=listado.getString("direccion") %></b>
            </p>
            <p>
              <i class="mdi-communication-call teal-text"> TELÉFONO: </i>
              <b><%=listado.getString("telefono") %></b>
            </p>
            <p>
              <i class="fa fa-birthday-cake teal-text"> FECHA NACIM.: </i>
              <b><%=listado.getString("nacimiento") %></b>
            </p>
            <p>
              <i class="mdi-action-perm-identity teal-text"> ESTADO: </i>
              <b><%=listado.getString("estado") %></b>
            </p>
            <br>
            <p class="center">
              <a href="index.jsp" class="btn waves-effect waves-light center green">
                Aceptar
                <i class="mdi-action-check-circle"></i>
              </a>
            </p>
            <br>
          </form>
        </div>
      </div>
    </div>
    <% conexion.close(); %>

    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
  </body>
</html>

