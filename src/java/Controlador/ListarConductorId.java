
package Controlador;

import Modelo.Conductor;
import ModeloDAO.ConductorDAO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListarConductorId", urlPatterns = {"/listar-Conductor-Id"})
public class ListarConductorId extends HttpServlet {

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
            List<Conductor> c =dao.listarId(ConductoId);
            PrintWriter out = response.getWriter();
            Gson gson = new Gson();
            JsonObject mJson = new JsonObject();
            String jsonData = gson.toJson(c);
            out.println(jsonData);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
