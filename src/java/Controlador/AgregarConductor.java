
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

/**
 *
 * @author Sam
 */
@WebServlet(name = "AgregarConductor", urlPatterns = {"/agregarConductor"})
public class AgregarConductor extends HttpServlet {

   
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
            String idConductor =request.getParameter("txtId");
            String nombre = request.getParameter("txtNombre");
            String apePat = request.getParameter("txtPat");
            String apeMat = request.getParameter("txtMat");
            String dni = request.getParameter("txtDni");
            String tipoLicencia= request.getParameter("txtLicencia");
            String n_licencia=request.getParameter("txtNuLicencia");
            String estados = request.getParameter("txtEstados");
            String tipo_conductor = request.getParameter("txtTipo");
            String nacionalidad = request.getParameter("txtNacionalidad");
            long pasaporte =Integer.parseInt(request.getParameter("txtPasaporte"));
            
            ConductorDAO dao = new ConductorDAO();
            int records = dao.agregar(idConductor, nombre, apePat, apeMat, dni, tipoLicencia, n_licencia, estados, tipo_conductor, nacionalidad, pasaporte);
            PrintWriter out = response.getWriter();
            Gson gson = new Gson();
            JsonObject mJson= new JsonObject();
            mJson.addProperty("records", records);          
            String jsonData = gson.toJson(mJson);
            out.println(jsonData);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
