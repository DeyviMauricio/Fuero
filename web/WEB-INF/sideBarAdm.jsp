
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  HttpSession htp = request.getSession();
%>
            <i class="icono fa fa-bars btn-menu" id="btn-menu"></i>
            <div class="contenedor-menu">
                   <div class="cabecera">
                       <h2 class="title">MENU</h2>
            </div>   
            
              
            <ul class="menu">
                    <div class="contenedor-user">
                          <i class="fa fa-user usuario"></i>
                          <p class="user">Bienvenido <%=htp.getAttribute("nombre")%></p>
                    </div>
                    <li>
                        <a href="#"><i class="icono izquierda fa fa-user"></i>Usuario<i class="icono derecha fa fa-caret-down"></i></a>
                        <ul>
                            <li><a href="#" id="cargar-usuarios">Usuarios</a></li>
                            <li><a href="#" id="cargar-user">Detalles</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="icono izquierda fas fa-user-tie"></i>Perfiles<i class="icono derecha fa fa-caret-down"></i></a>
                        <ul>
                             <li><a href="#" id="cargar-director">Directores</a></li>
                            <li><a href="#" id="cargar-chofer">Choferes</a></li>                           
                        </ul>                       
                    </li>
                    <li >
                        <a href="#"><i class="icono izquierda fas fa-male"></i>Choferes<i class="icono derecha fa fa-caret-down"></i></a>
                        <ul>
                            <li><a href="#" id="cargar-choferes">Registrar</a></li>
                            <li><a href="#" id="cargar-asignaciones">Comisiones Asignadas</a></li>
                        </ul>  
                    </li>
                    <li>
                        <a href="#"><i class="icono izquierda fas fa-car"></i>Vehiculos<i class="icono derecha fa fa-caret-down"></i></a>
                         <ul>
                            <li><a href="#" id="cargar-vehiculos">Registrar</a></li>
                            <li><a href="#" id="cargar-documentos">Documentacion</a></li>
                         </ul>
                    </li>
                    
                    <li>
                        <a href="#"><i class="icono izquierda fas fa-bell"></i>Alertas<i class="icono derecha fa fa-caret-down"></i></a>
                        <ul>
                         <li><a href="#" id="mostrar-notificaciones">Notificaciones</a></li>
                        </ul>     
                    </li>
                    <li>
                        <a href="#"><i class="icono izquierda fab fa-uber"></i>Comisiones<i class="icono derecha fa fa-caret-down"></i></a>
                        <ul>
                            <li><a href="#" id="cargar-solicitudes">Solicitudes</a></li>
                            <li><a href="#" id="cargar-asignar">Asignar</a></li>
                            <li><a href="#" id="cargar-comisiones">Historial</a></li>
                        </ul>     
                    </li>
                    <li>   
                        <a href="index.jsp?cerrar=true"><i class="icono izquierda fas fa-sign-out-alt cerrar"></i>Cerrar Sesión</a>         
                    </li>
                    
           </ul>    
            
     </div>
    </div>   

