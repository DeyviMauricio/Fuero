package org.apache.jsp.Vistas.conductores;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import Modelo.Conductor;
import ModeloDAO.ConductorDAO;

public final class listaConductores_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"js_Conductor/opConductor.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div id=\"datos-conductor\" class=\"datos\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <form class=\"form-contenido\">\n");
      out.write("                    <input type=\"text\" name=\"txtId\"  id=\"txtId\" class=\"form-control\" placeholder=\"Identificador del chofer\">\n");
      out.write("                    <input type=\"text\" name=\"txtNombre\" id=\"txtNombre\" class=\"form-control\" placeholder=\"Nombre del chofer\">\n");
      out.write("                    <input type=\"text\" name=\"txtPat\" id=\"txtPat\" class=\"form-control\" placeholder=\"Apellido Paterno\">\n");
      out.write("             \n");
      out.write("                    <input type=\"text\" name=\"txtMat\" id=\"txtMat\" placeholder=\"Apellido Materno\" class=\"form-control\">\n");
      out.write("                    <input type=\"text\" name=\"txtDni\" id=\"txtDni\" placeholder=\"Dni del chofer\" class=\"form-control\">\n");
      out.write("                    <input type=\"text\" name=\"txtLicencia\"  id=\"txtLicencia\" placeholder=\"Licencia del chofer\" class=\"form-control\">                              \n");
      out.write("                \n");
      out.write("                            \n");
      out.write("                    <input type=\"text\" name=\"txtNuLicencia\" id=\"txtNuLicencia\" placeholder=\"Numero de Licencia\" class=\"form-control\">              \n");
      out.write("                     <input name=\"txtEstados\" id=\"txtEstados\" type=\"text\">\n");
      out.write("                                                          \n");
      out.write("                    <input type=\"text\" name=\"txtTipo\" id=\"txtTipo\" placeholder=\"Tipo del chofer\" class=\"form-control\">\n");
      out.write("                    <input type=\"text\" name=\"txtNacionalidad\" id=\"txtNacionalidad\" placeholder=\"Nacionalidad del chofer\" class=\"form-control\">\n");
      out.write("                    <input type=\"text\" name=\"txtPasaporte\" id=\"txtPasaporte\" placeholder=\"Pasaporte del chofer\" class=\"form-control\">\n");
      out.write("               \n");
      out.write("                    <button type=\"button\" name=\"btn-registrar\" id=\"btn-registrar\" class=\"btn-registrar\">Registrar<i class=\"fas fa-save icon\"></i></button>               \n");
      out.write("                  \n");
      out.write("            </form>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"container-table\">\n");
      out.write("            <table>\n");
      out.write("                <thead class=\"table-header\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td><h2>Lista Conductores</h2></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Apellidos</th>\n");
      out.write("                        <th>Dni</th>\n");
      out.write("                        <th>Licencia</th>\n");
      out.write("                        <th>Estado</th>\n");
      out.write("                        <th>TipoConductor</th>\n");
      out.write("                        <th>Nacionalidad</th>\n");
      out.write("                        <th>Acciones</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("               \n");
      out.write("                <tbody class=\"table-body\" id=\"listarConductores\">\n");
      out.write("                             \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("           <div class=\"modal\" id=\"modal\">\n");
      out.write("                <div class=\"modal-content\"></div>\n");
      out.write("            </div>\n");
      out.write("       </div>\n");
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
