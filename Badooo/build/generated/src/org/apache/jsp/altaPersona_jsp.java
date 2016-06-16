package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class altaPersona_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"estilos.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
              
      out.write("\n");
      out.write("      <script>document.location = \"index.jsp\"</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
