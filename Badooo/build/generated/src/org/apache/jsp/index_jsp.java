package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/materialize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("    <title>Badooo</title>\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("    ");
  
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/badooo","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");

      ResultSet listado = s.executeQuery ("SELECT * FROM cliente");
    
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">");
 out.print("<img src='img/gente.jpg'/>"); 
      out.write("</div>\n");
      out.write("      <div class=\"row s12 m12 l12\">\n");
      out.write("          <div class=\"card grey lighten-5\">\n");
      out.write("            <h3 class=\"center\">BADOOO</h3>\n");
      out.write("            <h6 class=\"center\">(conoce gente que le va la marcha)</h6>\n");
      out.write("            <h6 class=\"center\">----------------------------------------------------------------------------------------------------</h6>\n");
      out.write("            <table class=\"bordered centered responsive-table\">\n");
      out.write("              <thead><th>CÓDIGO</th><th>NOMBRE</th><th>DIRECCIÓN</th><th>TELEFONO</th><th>FECHA NACIM</th><th>ESTADO</th><th></th><th></th></thead>\n");
      out.write("              ");

                while (listado.next()) {
              
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                    <td>");
      out.print(listado.getString("clienteid") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(listado.getString("nombre") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(listado.getString("direccion") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(listado.getString("telefono") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(listado.getString("nacimiento") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(listado.getString("estado") );
      out.write("</td>\n");
      out.write("                    <form method=\"post\" action=\"modificaPersona.jsp\">\n");
      out.write("                      <input type=\"hidden\" name=\"clienteid\" value=\"");
      out.print(listado.getString("clienteid") );
      out.write("\">\n");
      out.write("                      <input type=\"hidden\" name=\"nombre\" value=\"");
      out.print(listado.getString("nombre") );
      out.write("\">\n");
      out.write("                      <input type=\"hidden\" name=\"direccion\" value=\"");
      out.print(listado.getString("direccion") );
      out.write("\">\n");
      out.write("                      <input type=\"hidden\" name=\"telefono\" value=\"");
      out.print(listado.getString("telefono") );
      out.write("\">\n");
      out.write("                      <input type=\"hidden\" name=\"nacimiento\" value=\"");
      out.print(listado.getString("nacimiento") );
      out.write("\">\n");
      out.write("                      <input type=\"hidden\" name=\"estado\" value=\"");
      out.print(listado.getString("estado") );
      out.write("\">\n");
      out.write("                      <td>\n");
      out.write("                      <button class=\"btn waves-effect waves-light center blue\" type=\"submit\" name=\"editar\">\n");
      out.write("                        Editar\n");
      out.write("                      </button>\n");
      out.write("                      </td>\n");
      out.write("                    </form>\n");
      out.write("                    <form method=\"post\" action=\"borraPersona.jsp\">\n");
      out.write("                        <input type=\"hidden\" name=\"clienteid\" value=\"");
      out.print(listado.getString("clienteid") );
      out.write("\">\n");
      out.write("                      <td>\n");
      out.write("                      <button class=\"btn waves-effect waves-light center red\" type=\"submit\" name=\"borrar\">\n");
      out.write("                        Borrar\n");
      out.write("                      </button>\n");
      out.write("                      </td>\n");
      out.write("                    </form>\n");
      out.write("                  </tr>\n");
      out.write("              ");

                }
              
      out.write("\n");
      out.write("              <form method=\"post\" action=\"altaPersona.jsp\">\n");
      out.write("                <tr>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"number\" name=\"clienteid\" id=\"clienteid\" required>\n");
      out.write("                      <label for=\"clienteid\">Código</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"text\" name=\"nombre\" id=\"nombre\">\n");
      out.write("                      <label for=\"nombre\">Nombre</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"text\" name=\"direccion\" id=\"direccion\">\n");
      out.write("                      <label for=\"direccion\">Dirección</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"tel\" name=\"telefono\" id=\"telefono\">\n");
      out.write("                      <label for=\"telefono\">Teléfono</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"date\" class=\"datepicker\" name=\"nacimiento\" id=\"nacimiento\">\n");
      out.write("                      <label for=\"nacimiento\">Fecha Nacim</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"text\" name=\"estado\" id=\"estado\">\n");
      out.write("                      <label for=\"estado\">Estado</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <button class=\"btn waves-effect waves-light center\" type=\"submit\" name=\"aceptar\">\n");
      out.write("                      Añadir\n");
      out.write("                    </button>\n");
      out.write("                  </td>\n");
      out.write("                </tr>\n");
      out.write("              </form>\n");
      out.write("              <form method=\"post\" action=\"buscaPersona.jsp\">\n");
      out.write("                <tr>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"text\" name=\"nombre\" id=\"buscaNombre\">\n");
      out.write("                      <label for=\"buscaNombre\">nombre</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <button class=\"btn waves-effect waves-light center\" type=\"submit\" name=\"aceptar\">\n");
      out.write("                      <i class=\"fa fa-search\"></i> Buscar\n");
      out.write("                    </button>\n");
      out.write("                  </td>\n");
      out.write("                </tr>\n");
      out.write("              </form>\n");
      out.write("            </table>  \n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("              \n");
      out.write("    ");

      conexion.close();
    
      out.write("\n");
      out.write("    <!--Import jQuery before materialize.js-->\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      $('.datepicker').pickadate({\n");
      out.write("        // The title label to use for the month nav buttons\n");
      out.write("        labelMonthNext: 'Mes siguiente',\n");
      out.write("        labelMonthPrev: 'Mes anterior',\n");
      out.write("\n");
      out.write("        // The title label to use for the dropdown selectors\n");
      out.write("        labelMonthSelect: 'Selecciona un mes',\n");
      out.write("        labelYearSelect: 'Selecciona un año',\n");
      out.write("\n");
      out.write("        // Months and weekdays\n");
      out.write("        monthsFull: [ 'Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre' ],\n");
      out.write("        monthsShort: [ 'Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic' ],\n");
      out.write("        weekdaysFull: [ 'Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado' ],\n");
      out.write("        weekdaysShort: [ 'Dom', 'Lun', 'Mar', 'Mié', 'Jue', 'Vie', 'Sab' ],\n");
      out.write("\n");
      out.write("        // Materialize modified\n");
      out.write("        weekdaysLetter: [ 'D', 'L', 'M', 'X', 'J', 'V', 'S' ],\n");
      out.write("\n");
      out.write("        // Today and clear\n");
      out.write("        today: 'Hoy',\n");
      out.write("        clear: 'Limpiar',\n");
      out.write("        close: 'Cerrar',\n");
      out.write("        format: \"yyyy-mm-dd\",\n");
      out.write("        showOtherMonths: true,\n");
      out.write("        selectOtherMonths: true,\n");
      out.write("        selectMonths: true, // Creates a dropdown to control month\n");
      out.write("        selectYears: 100, // Creates a dropdown of 15 years to control year\n");
      out.write("        max: true,\n");
      out.write("        firstDay: 1\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
