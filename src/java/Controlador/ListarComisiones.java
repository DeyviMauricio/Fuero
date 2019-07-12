/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Comisiones;
import ModeloDAO.ComisionesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "ListarComisiones", urlPatterns = {"/listComisiones"})
public class ListarComisiones extends HttpServlet {

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
                    ComisionesDAO dao= new ComisionesDAO();
                    List<Comisiones>list= dao.listar();
                    Iterator iter= list.iterator();
                    Comisiones c;
                     while(iter.hasNext()){
                        c=(Comisiones)iter.next();  
                        
                   out.print("<tr>"+
                           "<td>"+c.getId_soli()+"</td>"+
                           "<td>"+c.getArea()+"</td>"+
                           "<td>"+c.getNombre()+"</td>"+
                           "<td>"+c.getLugar()+"</td>"+
                           "<td>"+c.getFechaSolicitada()+"</td>"+
                           "<td>"+c.getTiempo_uso()+"</td>"+
                           "<td>"+c.getHora_salida()+"</td>"+
                           "<td>"+c.getN_pasajeros()+"</td>"+
                           "<td>"+c.getDescripcion()+"</td>"+
                           "<td>"+
                            "<div class='desplegar-content'>"
                                 +"<p id='desliza' class='desliza'>Opciones</p>"
                                +"<ul class='deslizando' id='deslizando'>"+
                                     "<li><a href='#' id='show-editar'>Editar</a></li>"+
                                     "<li><a href='#'>Eliminar</a></li>"+
                                     "<li><a href='#'>Detalles</a></li>"+
                                 "</ul>"+
                             "</div>"     
                           +"</td>"+
                            "</tr>");     
                }  
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
