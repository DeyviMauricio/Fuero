   $(document).ready(function(){
       let $caja=$('#aqui');   
       /*Conductores*/
        $("#cargar-choferes").on('click',(function() {
             $caja.load('conductores/listaConductores.jsp  #datos-conductor');            
        }));
        
        $("#cargar-asignaciones").on('click',(function() {
             $caja.load('conductores/asignadas.jsp');
        }));
        /*-----------------------*/
        
         /*Comisiones*/
        $("#cargar-solicitudes").on('click',(function() {
            $caja.load('comisiones/solicitudes.jsp #datos-solicitudes');
        }));
        $("#cargar-asignar").on('click',(function() {
             $caja.load('comisiones/asignar.jsp');
        }));
        $("#cargar-comisiones").on('click',(function() {
             $caja.load('comisiones/historial.jsp');
        }));
        /*-----------------------*/
        
        
        /*Usuario*/
        $("#cargar-usuarios").on('click',(function() {
            $caja.load('usuario/crudUser.jsp');
        }));
        $("#cargar-user").on('click',(function() {
            $caja.load('usuario/detalles.jsp');
        }));
        /*-----------------------*/
        
        
         /*Vehiculo*/
         $("#cargar-vehiculos").on('click',(function() {
            $caja.load('vehiculos/registrar.jsp');
        }));
         $("#cargar-documentos").on('click',(function() {
            $caja.load('vehiculos/documentacion.jsp');
        }));
          /*-----------------------*/
          
          
          
           /*Perfiles*/
           $("#cargar-director").on('click',(function() {
            $caja.load('perfiles/directivos.jsp');
            }));
             $("#cargar-chofer").on('click',(function() {
            $caja.load('perfiles/choferes.jsp');
            }));
           /*-----------------------*/
    });
 