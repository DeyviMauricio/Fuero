
package Controlador;

import ModeloDAO.ConductorDAO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "EliminarConductor", urlPatterns = {"/eliminar-Conductor"})
public class EliminarConductor extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
         String ConductoId = request.getParameter("txtId");
            ConductorDAO dao = new ConductorDAO();
            int records = dao.eliminar(ConductoId);
            PrintWriter out = response.getWriter();
            Gson gson = new Gson();
            JsonObject mJson = new JsonObject();
            mJson.addProperty("records", records);
            String jsonData = gson.toJson(mJson);
            out.println(jsonData);
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
