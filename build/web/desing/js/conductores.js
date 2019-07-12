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
function Edit(id){                
        $.ajax({
            url:'listar-Conductor-Id',
            dataType:'json',
            type:'GET',
            data:{
                txtId:id
            },
            success:function(data){
                var result = data[0];
                if(result.id===0){
                    alert('no se ha podido listar al conductor, intente nuevamente...');                   
                }else{
                    $('#txtIdModal').val(result.idConductor);
                    $('#txtNombreModal').val(result.nombre);
                    $('#txtPatModal').val(result.patConductor);//                              
                    $('#txtMatModal').val(result.mat);//
                    $('#txtDniModal').val(result.dni);
                    $('#txtLicenciaTipoModal').val(result.licenciaConductor);//
                    $('#txtNuLicenciaModal').val(result.n_licencia);
                    $('#txtEstadosModal').val(result.estado);
                    $('#txtTipoModal').val(result.tipo);//
                    $('#txtNacionalidadModal').val(result.nacionalidad);
                    $('#txtPasaporteModal').val(result.pasaporte);                 
                    $('#modal-actualizar').addClass( "show" );
                    $('#modal-actualizar').on('click',function(e){
                    if(e.target.classList.contains('modal'))$('#modal-actualizar').removeClass('show');
                    });
                }  
            },fail:function(result){
                console.log("ha sucedido un error interno");
            }            
        });
    }
    function Actualizar() {
        $('#modal-actualizar').removeClass('show');
        var idConductor = $("#txtIdModal").val();
        var nombre = $("#txtNombreModal").val();
        var pat = $("#txtPatModal").val();
        var mat = $("#txtMatModal").val();
        var dni = $("#txtDniModal").val();
        var licencia = $("#txtLicenciaTipoModal").val();
        var n_licencia = $("#txtNuLicenciaModal").val(); 
        var estados = $("#txtEstadosModal").val(); 
        var tipo_condu = $("#txtTipoModal").val();
        var nacionalidad = $("#txtNacionalidadModal").val(); 
        var pasaporte = $("#txtPasaporteModal").val();
        
    $.ajax({
        url: "actualizar-Conductor",
        dataType: "json",
        type: "GET",
        data: {
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
        success: function (result) {
            if (result.records === 0) {
                alert(idConductor);
            } else {
                $.ajax({
                    url: "listConductor",
                    type: "GET",
                    success: function (result) {
                        $("#listarConductores").html(result);
                    }
                });
            }

        }
    });
}

 function Delete(Id) {
    $.ajax({
        url: "eliminar-Conductor",
        dataType: "json",
        type: "GET",
        data: {
            txtId:Id
        },
        success: function (result) {
            if (result.records === 0) {
                alert("no se ha podido eliminar el area, intente nuevamente...");
            } else {
                $.ajax({
                    url: "listConductor",
                    type: "GET",
                    success: function (result) {
                        $("#listarConductores").html(result);
                    }
                });
            }

        }
    });
}
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
 