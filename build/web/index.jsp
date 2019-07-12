
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="desing/css/login.css">
        <title>Log In</title>
    </head>
    <body>

    <div class="form-contain">
        <div class="form-logo">
        </div>
        <form class="form-content" action="LogIn" method="POST">
            <div class="form-item"> 
                <input type="text" name="txtMail" class="form-input" placeholder="E-mail">
            </div>
            <div class="form-item">
                <input type="password" name="txtPass" name="txtPass"class="form-input" placeholder="Contraseña">
            </div>
            <div class="form-item">
                <input type="submit" name="btnIniciar" class="form-input btn" value="Ingresar">
            </div>
        </form>
    </div>

        <div>
            <%
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
            %>
        </div>
    </body>
</html>
