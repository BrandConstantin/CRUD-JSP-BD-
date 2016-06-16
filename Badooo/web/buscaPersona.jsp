<%-- 
    Document   : buscaPersona
    Created on : May 25, 2016, 7:33:24 PM
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

      ResultSet listado = s.executeQuery ("SELECT COUNT(*) FROM cliente WHERE nombre LIKE '%" + request.getParameter("nombre") + "%'");
      listado.next();
      int coincidencias = listado.getInt(1);

      // Si no se encuentra ningún cliente con el nombre especificado,
      // volvemos a la página principal.
      if (coincidencias == 0) {
        out.println("<script>document.location = \"index.jsp\"</script>");
      }

      ResultSet listado2 = s.executeQuery ("SELECT * FROM cliente WHERE nombre LIKE '%" + request.getParameter("nombre") + "%'");

      // Si hay un único cliente con el nombre especificado, vamos directamente
      // a la página de detalle.
      if (coincidencias == 1) {
        listado2.next();
        out.println("<script>document.location = \"detallePersona.jsp?clienteid=" + listado2.getInt("clienteid") + "\"</script>");
      }

      // Si hay varios clientes cuyos nombres coinciden con el patrón buscado,
      // se muestran todos esos nombres para que el usuario elija.
      if (coincidencias > 1) {
        %>
    <div class="container">
      <div class="row"><% out.print("<img src='img/gente.jpg'/>"); %></div>
      <div class="row s12 m12 l12">
          <div class="card grey lighten-4">
            <h3 class="center">TODAS las personas de BADOOO</h3>
            <h6 class="center">(conoce gente que le va la marcha)</h6>
            <h6 class="center">----------------------------------------------------------------------------------------------------</h6>
                  <table class="bordered centered responsive-table">
                  <thead><th>NOMBRE</th><th></th></thead>
                  <%
                  while (listado2.next()) {
                    %>
                    <tr>
                      <td><%=listado2.getString("nombre") %></td>
                      <form method="post" action="detallePersona.jsp">
                        <input type="hidden" name="clienteid" value="<%=listado2.getString("clienteid") %>">
                        <td>
                        <button class="btn waves-effect waves-light center green" type="submit" name="editar">
                          <i class="fa fa-plus-circle"></i> Detalle
                        </button>
                        </td>
                      </form>
                    </tr>
                    <%
                  } // while
                  %>
                </table>
              </div>
            </div>
            <div class="col s3 m3 l3"></div>
      <%
      } // if

      conexion.close();
    %>
    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
  </body>
</html>

