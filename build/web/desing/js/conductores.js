 function registrar(){
        var idConductor = $("#txtId").val();
        var nombre = $("#txtNombre").val();
        var pat = $("#txtPat").val();
        var mat = $("#txtMat").val();
        var dni = $("#txtDni").val();
        var licencia = $("#txtLicencia").val();
        var n_licencia = $("#txtNuLicencia").val(); 
        var estados = $("#txtEstados").val(); 
        var tipo_condu = $("#txtTipo").val();
        var nacionalidad = $("#txtNacionalidad").val(); 
        var pasaporte = $("#txtPasaporte").val(); 
        
        $.ajax({
            url:"agregarConductor",
            dataType:"json",
            type:"GET",
            data:{
                txtId:idConductor,                         
                txtNombre:nombre,
                txtPat:pat,
                txtMat:mat,
                txtDni:dni,
                txtLicencia:licencia,
                txtNuLicencia:n_licencia,
                txtEstados:estados,
                txtTipo:tipo_condu,
                txtNacionalidad:nacionalidad,
                txtPasaporte:pasaporte
            },
            success:function(result){
                if(result.records===0){
                    alert("no se ha podido agregar,intente nuevamente...");
                }else{
                    $.ajax({
                        url:"listConductor",
                        type:"GET",
                        success:function(result){
                            $("#listarConductores").html(result);    
                        }
                    });
                }
                
            }
        });
 };

function refrescar(){
      listar();
   };
 function listar(){     
       $.ajax({
           url:"listConductor",
           method:"GET",
           datType:"json",
           data:{},
           success:function(result){
               $("#listarConductores").html(result);
           },fail:function(result){
               
           }
           
       });
 }
 function refrescarComision(){
      listarComision();
   };
 function listarComision(){     
       $.ajax({
           url:"listComisiones",
           method:"GET",
           datType:"json",
           data:{},
           success:function(result){
               $("#listarComisiones").html(result);
           },fail:function(result){
               
           }
           
       });
 }