

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>  
        <title>JSP Page</title>
    </head>
    <body>
        <div id="datos-solicitudes" class="datos">
            <div class="container">
                
            </div>
            <div class="container-table">
            <table class="table">
                <div class="table-header">
                            <p>Lista Comisiones</p>
                            <a  href="#" onclick="refrescarComision();">Refrescar<i class="fas fa-sync-alt"></i></a>
                </div>
                <thead class="thead">
                    <tr>
                        <th>ID</th>
                        <th>Area</th>
                        <th>Nombre Solicitante</th>                       
                        <th>Lugar de Destino</th>
                        <th>Fecha de Uso</th>
                        <th>Tiempo de Uso</th>
                        <th>Hora Salida</th>
                        <th>N° Pasajeros</th>
                        <th>Descripcion</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody class="tbody" id="listarComisiones">  
                    
                </tbody>        
            </table>
        </div>
        </div>
    </body>
</html>
