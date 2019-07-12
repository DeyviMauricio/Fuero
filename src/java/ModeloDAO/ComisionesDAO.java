
package ModeloDAO;

import Configurar.Conexion;
import Interfaz.ComisionesI;
import Modelo.Comisiones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ComisionesDAO implements ComisionesI{
    
    Connection cn;
    Conexion conexion = new Conexion();
    PreparedStatement ps ;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<Comisiones>list = new ArrayList<>();

        try {
            cn=conexion.getConnection();
            String query="select*from solicitud_comision";
            ps=cn.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){        
                Comisiones c= new Comisiones();
                c.setId_soli(rs.getString(1));
                c.setArea(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setLugar(rs.getString(4));
                c.setFechaSolicitada(rs.getString(5));
                c.setTiempo_uso(rs.getString(6));
                c.setHora_salida(rs.getString(7));
                c.setN_pasajeros(rs.getInt(8));
                c.setDescripcion(rs.getString(9));               
                list.add(c);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    
}
