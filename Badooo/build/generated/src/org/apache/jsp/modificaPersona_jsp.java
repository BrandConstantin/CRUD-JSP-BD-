package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class modificaPersona_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    ");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\"></div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"row col m3\"></div>\n");
      out.write("        <div class=\"col m6 card-panel grey lighten-5\">\n");
      out.write("          <h5 class=\"center\">Datos del cliente</h5>\n");
      out.write("          <form method=\"post\" action=\"altaPersona.jsp\">\n");
      out.write("            <div class=\"input-field blue-text\">\n");
      out.write("              <i class=\"mdi-action-label-outline prefix\"></i>\n");
      out.write("              <input type=\"number\" name=\"clienteid\" id=\"clienteid\" value=\"");
      out.print(request.getParameter("clienteid") );
      out.write("\" readonly>\n");
      out.write("              <label for=\"clienteid\">código</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"mdi-action-perm-identity prefix\"></i>\n");
      out.write("              <input type=\"text\" name=\"nombre\" id=\"nombre\" value=\"");
      out.print(request.getParameter("nombre") );
      out.write("\" required>\n");
      out.write("              <label for=\"nombre\">nombre</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"mdi-communication-location-on prefix\"></i>\n");
      out.write("              <input type=\"text\" name=\"direccion\" id=\"direccion\" value=\"");
      out.print(request.getParameter("direccion") );
      out.write("\" required>\n");
      out.write("              <label for=\"direccion\">dirección</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"mdi-communication-call prefix\"></i>\n");
      out.write("              <input type=\"text\" name=\"telefono\" id=\"telefono\" value=\"");
      out.print(request.getParameter("telefono") );
      out.write("\" required>\n");
      out.write("              <label for=\"telefono\">teléfono</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fa fa-birthday-cake prefix\"></i>\n");
      out.write("              <input type=\"date\" class=\"datepicker\" name=\"nacimiento\" id=\"nacimiento\" value=\"");
      out.print(request.getParameter("nacimiento") );
      out.write("\" required>\n");
      out.write("              <label for=\"nacimiento\">Fecha Nacim.</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"mdi-action-perm-identity prefix\"></i>\n");
      out.write("              <input type=\"text\" name=\"estado\" id=\"nombre\" value=\"");
      out.print(request.getParameter("estado") );
      out.write("\" required>\n");
      out.write("              <label for=\"estado\">estado</label>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"center\">\n");
      out.write("              <button class=\"btn waves-effect waves-light center\" type=\"submit\" name=\"aceptar\">\n");
      out.write("              Aceptar\n");
      out.write("              <i class=\"mdi-action-check-circle\"></i>\n");
      out.write("              </button>\n");
      out.write("              <a href=\"index.jsp\" class=\"btn waves-effect waves-light center red\">\n");
      out.write("              Cancelar\n");
      out.write("              <i class=\"fa fa-times\"></i>\n");
      out.write("              </a>\n");
      out.write("            </p>\n");
      out.write("            <br>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
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
      out.write("</html>\n");
      out.write("\n");
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
