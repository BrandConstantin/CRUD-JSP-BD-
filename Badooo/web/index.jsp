<%--
  Hacer la base de datos de una aplicación para conocer gente nueva
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
    <title>Badooo</title>
  </head>
  
  <body>
    <%  
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/badooo","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");

      ResultSet listado = s.executeQuery ("SELECT * FROM cliente");
    %>
    
    <div class="container">
      <div class="row"><% out.print("<img src='img/gente.jpg'/>"); %></div>
      <div class="row s12 m12 l12">
          <div class="card grey lighten-4">
            <h3 class="center">BADOOO</h3>
            <h6 class="center">(conoce gente que le va la marcha)</h6>
            <h6 class="center">----------------------------------------------------------------------------------------------------</h6>
            <table class="bordered centered responsive-table">
              <thead><th>CÓDIGO</th><th>NOMBRE</th><th>DIRECCIÓN</th><th>TELEFONO</th><th>FECHA NACIM</th><th>ESTADO</th><th></th><th></th></thead>
              <%
                while (listado.next()) {
              %>
                  <tr>
                    <td><%=listado.getString("clienteid") %></td>
                    <td><%=listado.getString("nombre") %></td>
                    <td><%=listado.getString("direccion") %></td>
                    <td><%=listado.getString("telefono") %></td>
                    <td><%=listado.getString("nacimiento") %></td>
                    <td><%=listado.getString("estado") %></td>
                    <form method="post" action="modificaPersona.jsp">
                      <input type="hidden" name="clienteid" value="<%=listado.getString("clienteid") %>">
                      <input type="hidden" name="nombre" value="<%=listado.getString("nombre") %>">
                      <input type="hidden" name="direccion" value="<%=listado.getString("direccion") %>">
                      <input type="hidden" name="telefono" value="<%=listado.getString("telefono") %>">
                      <input type="hidden" name="nacimiento" value="<%=listado.getString("nacimiento") %>">
                      <input type="hidden" name="estado" value="<%=listado.getString("estado") %>">
                      <td>
                      <button class="btn waves-effect waves-light center green" type="submit" name="editar" >
                        Editar
                      </button>
                      </td>
                    </form>
                    <form method="post" action="borraPersona.jsp">
                        <input type="hidden" name="clienteid" value="<%=listado.getString("clienteid") %>">
                      <td>
                      <button class="btn waves-effect waves-light center red" type="submit" name="borrar">
                        Borrar
                      </button>
                      </td>
                    </form>
                  </tr>
              <%
                }
              %>
              <form method="post" action="altaPersona.jsp">
                <tr>
                  <td>
                    <div class="input-field">
                      <input type="number" name="clienteid" id="clienteid" required>
                      <label for="clienteid">Código</label>
                    </div>
                  </td>
                  <td>
                    <div class="input-field">
                      <input type="text" name="nombre" id="nombre">
                      <label for="nombre">Nombre</label>
                    </div>
                  </td>
                  <td>
                    <div class="input-field">
                      <input type="text" name="direccion" id="direccion">
                      <label for="direccion">Dirección</label>
                    </div>
                  </td>
                  <td>
                    <div class="input-field">
                      <input type="tel" name="telefono" id="telefono">
                      <label for="telefono">Teléfono</label>
                    </div>
                  </td>
                  <td>
                    <div class="input-field">
                      <input type="date" class="datepicker" name="nacimiento" id="nacimiento">
                      <label for="nacimiento">Fecha Nacim</label>
                    </div>
                  </td>
                  <td>
                    <div class="input-field">
                      <input type="text" name="estado" id="estado">
                      <label for="estado">Estado</label>
                    </div>
                  </td>
                  <td>
                    <button class="btn waves-effect waves-light center black" type="submit" name="aceptar">
                      Añadir
                    </button>
                  </td>
                </tr>
              </form>
              <form method="post" action="buscaPersona.jsp">
                <tr>
                  <td>
                    <div class="input-field">
                      <input type="text" name="nombre" id="buscaNombre">
                      <label for="buscaNombre">nombre</label>
                    </div>
                  </td>
                  <td>
                    <button class="btn waves-effect waves-light center black" type="submit" name="aceptar">
                      <i class="fa fa-search"></i> Buscar
                    </button>
                  </td>
                </tr>
              </form>
            </table>  
          </div>
      </div>
    </div>
              
    <%
      conexion.close();
    %>
    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
    <script>
      $('.datepicker').pickadate({
        // The title label to use for the month nav buttons
        labelMonthNext: 'Mes siguiente',
        labelMonthPrev: 'Mes anterior',

        // The title label to use for the dropdown selectors
        labelMonthSelect: 'Selecciona mes',
        labelYearSelect: 'Selecciona año',

        // Months and weekdays
        monthsFull: [ 'Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre' ],
        monthsShort: [ 'Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic' ],
        weekdaysFull: [ 'Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado' ],
        weekdaysShort: [ 'Dom', 'Lun', 'Mar', 'Mié', 'Jue', 'Vie', 'Sab' ],

        // Materialize modified
        weekdaysLetter: [ 'D', 'L', 'M', 'X', 'J', 'V', 'S' ],

        // Today and clear
        today: 'Hoy',
        clear: 'Limpiar',
        close: 'Guardar',
        format: "yyyy-mm-dd",
        showOtherMonths: true,
        selectOtherMonths: true,
        selectMonths: true, // Creates a dropdown to control month
        selectYears: 100, // Creates a dropdown of 15 years to control year
        max: true,
        firstDay: 1
      });
    </script>
  </body>
</html>