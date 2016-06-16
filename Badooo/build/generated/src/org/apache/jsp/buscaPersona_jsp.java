package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class buscaPersona_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>BADOOO</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    ");

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
        out.println("<script>document.location = \"index.html\"</script>");
      }

      ResultSet listado2 = s.executeQuery ("SELECT * FROM cliente WHERE nombre LIKE '%" + request.getParameter("nombre") + "%'");

      // Si hay un único cliente con el nombre especificado, vamos directamente
      // a la página de detalle.
      if (coincidencias == 1) {
        listado2.next();
        out.println("<script>document.location = \"detalleCliente.jsp?clienteid=" + listado2.getInt("clienteid") + "\"</script>");
      }

      // Si hay varios clientes cuyos nombres coinciden con el patrón buscado,
      // se muestran todos esos nombres para que el usuario elija.
      if (coincidencias > 1) {
        
      out.write("\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\"></div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col s3 m3 l3\">&nbsp;</div>\n");
      out.write("              <div class=\"col s6 m6 l6\">\n");
      out.write("                <div class=\"card grey lighten-5\">\n");
      out.write("                  <h3 class=\"center\">G e s t i b a n k</h3>\n");
      out.write("                  <table class=\"bordered centered responsive-table\">\n");
      out.write("                  <thead><th>Nombre</th><th></th></thead>\n");
      out.write("                  ");

                  while (listado2.next()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                      <td>");
      out.print(listado2.getString("nombre") );
      out.write("</td>\n");
      out.write("                      <form method=\"post\" action=\"detalleCliente.jsp\">\n");
      out.write("                        <input type=\"hidden\" name=\"clienteid\" value=\"");
      out.print(listado2.getString("clienteid") );
      out.write("\">\n");
      out.write("                        <td>\n");
      out.write("                        <button class=\"btn waves-effect waves-light center purple lighten-2\" type=\"submit\" name=\"editar\">\n");
      out.write("                          <i class=\"fa fa-plus-circle\"></i> Detalle\n");
      out.write("                        </button>\n");
      out.write("                        </td>\n");
      out.write("                      </form>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                  } // while
                  
      out.write("\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col s3 m3 l3\"></div>\n");
      out.write("      ");

      } // if

      conexion.close();
    
      out.write("\n");
      out.write("    <!--Import jQuery before materialize.js-->\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
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
