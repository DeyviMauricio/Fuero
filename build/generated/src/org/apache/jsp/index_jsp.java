package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"desing/css/login.css\">\n");
      out.write("        <title>Log In</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <div class=\"form-contain\">\n");
      out.write("        <div class=\"form-logo\">\n");
      out.write("        </div>\n");
      out.write("        <form class=\"form-content\" action=\"LogIn\" method=\"POST\">\n");
      out.write("            <div class=\"form-item\"> \n");
      out.write("                <input type=\"text\" name=\"txtMail\" class=\"form-input\" placeholder=\"E-mail\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-item\">\n");
      out.write("                <input type=\"password\" name=\"txtPass\" name=\"txtPass\"class=\"form-input\" placeholder=\"Contraseña\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-item\">\n");
      out.write("                <input type=\"submit\" name=\"btnIniciar\" class=\"form-input btn\" value=\"Ingresar\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            ");

               HttpSession sesion=request.getSession();
               int nivel=0;
               if(request.getAttribute("nivel")!=null){
                   nivel=(Integer)request.getAttribute("nivel");
                   if(nivel==1){
                    sesion.setAttribute("nombre",request.getAttribute("nombre"));
                    sesion.setAttribute("nivel",nivel);
                    response.sendRedirect("administrador.jsp");
                   }else if(nivel==2){
                     sesion.setAttribute("nombre",request.getAttribute("nombre"));
                    sesion.setAttribute("nivel",nivel);
                    response.sendRedirect("dLogistico.jsp");
                   }else if(nivel==3){
                     sesion.setAttribute("nombre",request.getAttribute("nombre"));
                    sesion.setAttribute("nivel",nivel);
                    response.sendRedirect("directores.jsp");
                   }else if(nivel==4){
                     sesion.setAttribute("nombre",request.getAttribute("nombre"));
                    sesion.setAttribute("nivel",nivel);
                    response.sendRedirect("conductor.jsp");
                   }
               }
               if(request.getParameter("cerrar")!=null){
                   sesion.invalidate();
               }
            
      out.write("\n");
      out.write("        </div>\n");
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
