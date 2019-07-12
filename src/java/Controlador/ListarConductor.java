
package Controlador;

import Modelo.Conductor;
import ModeloDAO.ConductorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ListarConductor", urlPatterns = {"/listConductor"})
public class ListarConductor extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
       
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                   response.setCharacterEncoding("utf-8");
                    PrintWriter out = response.getWriter();
                   ConductorDAO dao = new ConductorDAO();
                   List<Conductor>list= dao.listar();
                   Iterator iter= list.iterator();
                   Conductor c;                 
                   while(iter.hasNext()){
                        c=(Conductor)iter.next();  
                   out.print("<tr>"+
                           "<td>"+c.getNombre()+"</td>"+
                           "<td>"+c.getApePat()+" "+c.getApeMat()+"</td>"+
                           "<td>"+c.getDni()+"</td>"+
                           "<td>"+c.getTipoLicencia()+" / Nª"+c.getN_licencia()+"</td>"+
                           "<td>"+c.getEstado()+"</td>"+
                           "<td>"+c.getTipo_conductor()+"</td>"+
                           "<td>"+c.getNacionalidad()+"</td>"+
                           "<td>"+c.getPasaporte()+"</td>"+
                           "<td>"+                        
                               "<a class='edit opcion' onclick='Edit()'><i class='fa fa-edit'></i></a>"
                               +"<a class='delete opcion' onclick='Delete()'><i class='fas fa-trash-alt'></i></a>"  
                           +"</td>"+
                            "</tr>");     
                }  
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
