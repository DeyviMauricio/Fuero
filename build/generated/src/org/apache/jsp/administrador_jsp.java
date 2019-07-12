package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administrador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/header.jsp");
    _jspx_dependants.add("/WEB-INF/sideBarAdm.jsp");
  }

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

      out.write('\n');

  HttpSession sesion = request.getSession();
    
   if(sesion.getAttribute("nivel")== null){
      response.sendRedirect("index.jsp");
   }else{
    String nivel = sesion.getAttribute("nivel").toString();
    if(!nivel.equals("1")){
       response.sendRedirect("index.jsp");
    }
   }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!--<script src=\"https://kit.fontawesome.com/dce9f33c33.js\"></script>-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"desing/css/main.css\">  \n");
      out.write("         <script src=\"desing/js/jquery.js\"></script>\n");
      out.write("        <script src=\"desing/js/mostrar.js\"></script>\n");
      out.write("        <title>Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"head\">\n");
      out.write("             ");
      out.write("\n");
      out.write(" <nav class=\"cabecera-pagina\">\n");
      out.write("            <img src=\"desing/img/logo.png\" alt=\"\" width=\"230\" height=\"50\"/>\n");
      out.write(" </nav>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"side\">\n");
      out.write("           ");
      out.write('\n');
      out.write('\n');

  HttpSession htp = request.getSession();

      out.write("\n");
      out.write("     <i class=\"icono fa fa-bars btn-menu\"></i>\n");
      out.write("     <div class=\"contenedor-menu\">\n");
      out.write("            <div class=\"cabecera\">\n");
      out.write("                <h2 class=\"title\">MENU</h2>\n");
      out.write("            </div>   \n");
      out.write("            \n");
      out.write("              \n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                    <div class=\"contenedor-user\">\n");
      out.write("                          <i class=\"fa fa-user usuario\"></i>\n");
      out.write("                          <p class=\"user\">Bienvenido ");
      out.print(htp.getAttribute("nombre"));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"icono izquierda fa fa-user\"></i>Usuario<i class=\"icono derecha fa fa-caret-down\"></i></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\" id=\"cargar-usuarios\">Usuarios</a></li>\n");
      out.write("                            <li><a href=\"#\" id=\"cargar-user\">Detalles</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"icono izquierda fas fa-user-tie\"></i>Perfiles<i class=\"icono derecha fa fa-caret-down\"></i></a>\n");
      out.write("                        <ul>\n");
      out.write("                             <li><a href=\"#\" id=\"cargar-director\">Directores</a></li>\n");
      out.write("                            <li><a href=\"#\" id=\"cargar-chofer\">Choferes</a></li>                           \n");
      out.write("                        </ul>                       \n");
      out.write("                    </li>\n");
      out.write("                    <li >\n");
      out.write("                        <a href=\"#\"><i class=\"icono izquierda fas fa-male\"></i>Choferes<i class=\"icono derecha fa fa-caret-down\"></i></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\" id=\"cargar-choferes\">Registrar</a></li>\n");
      out.write("                            <li><a href=\"#\" id=\"cargar-asignaciones\">Comisiones Asignadas</a></li>\n");
      out.write("                        </ul>  \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"icono izquierda fas fa-car\"></i>Vehiculos<i class=\"icono derecha fa fa-caret-down\"></i></a>\n");
      out.write("                         <ul>\n");
      out.write("                            <li><a href=\"#\" id=\"cargar-vehiculos\">Registrar</a></li>\n");
      out.write("                            <li><a href=\"#\" id=\"cargar-documentos\">Documentacion</a></li>\n");
      out.write("                         </ul>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"icono izquierda fas fa-bell\"></i>Alertas<i class=\"icono derecha fa fa-caret-down\"></i></a>\n");
      out.write("                        <ul>\n");
      out.write("                         <li><a href=\"#\" id=\"mostrar-notificaciones\">Notificaciones</a></li>\n");
      out.write("                        </ul>     \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"icono izquierda fab fa-uber\"></i>Comisiones<i class=\"icono derecha fa fa-caret-down\"></i></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\" id=\"cargar-solicitudes\">Solicitudes</a></li>\n");
      out.write("                            <li><a href=\"#\" id=\"cargar-asignar\">Asignar</a></li>\n");
      out.write("                            <li><a href=\"#\" id=\"cargar-comisiones\">Historial</a></li>\n");
      out.write("                        </ul>     \n");
      out.write("                    </li>\n");
      out.write("                    <li>   \n");
      out.write("                        <a href=\"index.jsp?cerrar=true\"><i class=\"icono izquierda fas fa-sign-out-alt cerrar\"></i>Cerrar Sesión</a>         \n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("           </ul>    \n");
      out.write("            \n");
      out.write("     </div>\n");
      out.write("    </div>   \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("         <div class=\"body\">\n");
      out.write("                <div class=\"content arriba\" id=\"aqui\">              \n");
      out.write("                </div>\n");
      out.write("         </div>\n");
      out.write("        <script src=\"desing/js/fontawesome.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"desing/js/solid.js\" type=\"text/javascript\"></script>\n");
      out.write("         <script src=\"desing/js/brands.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"desing/js/main.js\"></script>          \n");
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
