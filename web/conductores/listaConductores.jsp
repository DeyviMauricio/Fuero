
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">     
         <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>        
        <title>JSP Page</title>
    </head>
    <body>
      <div id="datos-conductor" class="datos">     
          <div class="container">
            <form class="form-contenido">
                    <div class="parejas">                      
                        <input type="text" name="txtId" id="txtId" class="form-control">
                        <label class="parejas-label">ID del chofer</label>
                    </div> 
                    <div class="parejas">                      
                        <input type="text" name="txtNombre" id="txtNombre" class="form-control">
                        <label class="parejas-label">Nombre del chofer</label>
                    </div>  
                    <div class="parejas">                      
                        <input type="text" name="txtPat" id="txtPat" class="form-control">
                        <label class="parejas-label">Apellido Paterno del chofer</label>
                    </div>      
                    <div class="parejas">                      
                        <input type="text" name="txtMat" id="txtMat" class="form-control">
                        <label class="parejas-label">Apellido Materno del chofer</label>
                    </div> 
                   <div class="parejas">                      
                        <input type="text" name="txtDni" id="txtDni" class="form-control">
                        <label class="parejas-label">Dni del chofer</label>
                    </div>                   
                        <select name="txtLicencia" id="txtLicencia" class="form-control">
                           <option>A-II</option>
                           <option>A-IIa</option>
                           <option>A-I</option>
                           <option>A-IIb</option>
                           <option>A-IIIb</option>
                           <option>A-IIIa</option>
                           <option>A-IIIc</option>
                           <option>B-IIa</option>
                           <option>B-I</option>
                           <option>B-IIb</option>
                           <option>B-IIC</option>
                       </select> 
                     <div class="parejas">                      
                         <input type="text" name="txtNuLicencia" id="txtNuLicencia" class="form-control">              
                        <label class="parejas-label">Numero de Licencia del chofer</label>
                    </div>              
                    <select name="txtEstados" id="txtEstados" class="form-control">
                        <option>Inactivo</option>
                        <option>Activo</option>                       
                    </select> 
                     <select name="txtTipo" id="txtTipo" class="form-control">
                        <option>Civil</option>
                        <option>Militar</option>                       
                    </select>  
                <div class="parejas">                      
                         <input type="text" name="txtNacionalidad" id="txtNacionalidad"  class="form-control">
                        <label class="parejas-label">Nacionalidad del chofer</label>
                 </div>  
                <div class="parejas">                      
                          <input type="text" name="txtPasaporte" id="txtPasaporte" class="form-control">
                        <label class="parejas-label">Pasaporte del chofer</label>
                    </div>         
                    <button href="#" onclick="registrar();" type="button" name="btn-registrar" id="btn-registrar" class="btn btn-registrar">Registrar<i class="fas fa-save icon"></i></button>               
                  
            </form>
         </div>
         <div class="container-table">
            <table class="table">
                <div class="table-header">
                            <p>Lista Conductores</p>
                            <a  href="#" onclick="refrescar();">Refrescar<i class="fas fa-sync-alt"></i></a>
                </div>
                <thead class="thead">      
                    <tr>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Dni</th>
                        <th>Licencia</th>
                        <th>Estado</th>
                        <th>Tipo</th>
                        <th>País.o</th>
                        <th>Pasaporte</th>
                        <th></th>
                    </tr>
                </thead>
               
                <tbody class="tbody" id="listarConductores">
                             
                </tbody>
            </table>

       </div> 
          <div class="modal actualizar" id="modal-actualizar" >   
               <div class="modal-content">
                   <div class="container-modal">
                        <form class="form-contenido">
                                
                                <div class="parejas">                      
                                    <input type="text" id="txtNombre" class="form-control">
                                    <label class="parejas-label">Nombre del chofer</label>
                                </div>  
                                <div class="parejas">                      
                                    <input type="text"  id="txtPat" class="form-control">
                                    <label class="parejas-label">Apellido Paterno del chofer</label>
                                </div>      
                                <div class="parejas">                      
                                    <input type="text"  id="txtMat" class="form-control">
                                    <label class="parejas-label">Apellido Materno del chofer</label>
                                </div> 
                               <div class="parejas">                      
                                    <input type="text"  id="txtDni" class="form-control">
                                    <label class="parejas-label">Dni del chofer</label>
                                </div>                   
                                    <select  id="txtLicencia" class="form-control">
                                       <option>A-II</option>
                                       <option>A-IIa</option>
                                       <option>A-I</option>
                                       <option>A-IIb</option>
                                       <option>A-IIIb</option>
                                       <option>A-IIIa</option>
                                       <option>A-IIIc</option>
                                       <option>B-IIa</option>
                                       <option>B-I</option>
                                       <option>B-IIb</option>
                                       <option>B-IIC</option>
                                   </select> 
                                 <div class="parejas">                      
                                     <input type="text"  id="txtNuLicencia" class="form-control">              
                                    <label class="parejas-label">Numero de Licencia del chofer</label>
                                </div>              
                                <select  id="txtEstados" class="form-control">
                                    <option>Inactivo</option>
                                    <option>Activo</option>                       
                                </select> 
                                 <select  id="txtTipo" class="form-control">
                                    <option>Civil</option>
                                    <option>Militar</option>                       
                                </select>  
                            <div class="parejas">                      
                                     <input name="txtNacionalidad" id="txtNacionalidad"  class="form-control">
                                    <label class="parejas-label">Nacionalidad del chofer</label>
                             </div>  
                            <div class="parejas">                      
                                      <input  name="txtPasaporte" id="txtPasaporte" class="form-control">
                                    <label class="parejas-label">Pasaporte del chofer</label>
                            </div>    
                            <div class="parejas">                      
                                    <input type="hidden"  id="txtId" class="form-control">                                   
                            </div> 
                                <button href="#" onclick="Exit();" type="button" class="btn btn-cerrar">Cancelar<i class="fas fa-times-circle icon"></i></button>
                                <button href="#" onclick="Actualizar();" type="button" class="btn btn-registrar">Actualizar<i class="fas fa-save icon"></i></button>               
                        </form>
                     </div>
               </div>
              
            </div>
          <div class="modal delete" id="modal-eliminar" >   
                   <button href="#" onclick="Exit();" type="button" >Cancelar<i class="fas fa-times-circle icon"></i></button>
                   <button href="#" onclick="Actualizar();" type="button" >Actualizar<i class="fas fa-save icon"></i></button>                
            </div>
       </div>
      </div>
    </body>
</html>
