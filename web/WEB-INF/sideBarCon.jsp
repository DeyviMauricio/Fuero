<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  HttpSession hts = request.getSession();
%>
<!DOCTYPE html>   

        <i class="icono fa fa-bars btn-menu" id="btn-menu"></i>
     <div class="contenedor-menu">
                   <div class="cabecera">
                       <h2 class="title">MENU</h2>
                    </div>   
            
              
            <ul class="menu">
                    <div class="contenedor-user">
                          <i class="fa fa-user usuario"></i>
                          <p class="user">Bienvenido <%=hts.getAttribute("nombre")%></p>
                    </div>
                    <li>
                        <a href="#"><i class="icono izquierda fa fa-user"></i>Usuario</a>
                        <ul>
                            <li><a href="#">Detalles</a></li>
                        </ul>
                    </li>

                    <li>
                        <a href="#"><i class="icono izquierda fas fa-car"></i>Vehiculos<i class="icono derecha fa fa-caret-down"></i></a>
                         <ul>
                            <li><a href="#">Registrar Estado Vehiculo</a></li>
                            <li><a href="#">Registrar Salida</a></li>
                         </ul>
                    </li>
                    <li>
                        <a href="#"><i class="icono izquierda fab fa-uber"></i>Comisiones<i class="icono derecha "></i></a>
                        <ul>
                            <li><a href="#">Mis Comisiones</a></li>
                        </ul>     
                    </li>
                    <li>
             
                        <a href="index.jsp?cerrar=true"><i class="icono izquierda fas fa-sign-out-alt cerrar"></i>Cerrar Sesión</a> 
                    </li>
           </ul>    
     </div>
    </div>   