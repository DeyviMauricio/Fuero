<%
  HttpSession sesion = request.getSession();
    
   if(sesion.getAttribute("nivel")== null){
      response.sendRedirect("index.jsp");
   }else{
    String nivel = sesion.getAttribute("nivel").toString();
    if(!nivel.equals("2")){
       response.sendRedirect("index.jsp");
    }
   }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="desing/css/main.css">      
         <script src="desing/js/jquery.js"></script>
        <title>DirectorLogistico</title>
    </head>
    <body>
        <div class="head">
             <%@include file="WEB-INF/header.jsp"%>
        </div>
        <div class="side">
            <%@include file="WEB-INF/sideDLogistico.jsp"%>
        </div>
         <div class="body">
                <div class="content arriba">

                </div>
         </div>
        <script src="desing/js/fontawesome.js" type="text/javascript"></script>
        <script src="desing/js/solid.js" type="text/javascript"></script>
        <script src="desing/js/brands.js" type="text/javascript"></script>       
        <script src="desing/js/main.js"></script>    
    </body>
</html>
