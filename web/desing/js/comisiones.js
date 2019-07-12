function refrescar(){
      listar();
   };
 function listar(){     
       $.ajax({
           url:"listarComisiones",
           method:"GET",
           datType:"json",
           data:{},
           success:function(result){
               $("#listarConductores").html(result);
           },fail:function(result){
               
           }
           
       });
 }

