
package ModeloDAO;

import Configurar.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Interfaz.ConductorI;
import Modelo.Conductor;

public class ConductorDAO implements ConductorI {
    
    Connection cn;
    Conexion conexion = new Conexion();
    PreparedStatement ps ;
    ResultSet rs;
    @Override
    public List listar() {
        List<Conductor>list = new ArrayList<>();
        try {
            cn=conexion.getConnection();
            String query="select * from conductor";
            ps=cn.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){        
                Conductor c= new Conductor();
                c.setIdConductor(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setApePat(rs.getString(3));
                c.setApeMat(rs.getString(4));
                c.setDni(rs.getString(5));
                c.setTipoLicencia(rs.getString(6));
                c.setN_licencia(rs.getString(7));
                c.setEstado(rs.getString(8));
                c.setTipo_conductor(rs.getString(9));
                c.setNacionalidad(rs.getString(10));
                c.setPasaporte(rs.getLong(11));
                list.add(c);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    @Override
    public int agregar(String _idConductor, String _nombre, String _apePat, String _apeMat, 
            String _dni, String _tipoLicencia, String _n_licencia,
            String _estado, String _tipoConductor, String _nacionalidad, long _pasaporte) {
        try {
            cn=conexion.getConnection();
            String query="insert into conductor values(?,?,?,?,?,?,?,?,?,?,?);";
            ps=cn.prepareStatement(query);
            ps.setString(1,_idConductor);
            ps.setString(2,_nombre);
            ps.setString(3,_apePat);
            ps.setString(4,_apeMat);
            ps.setString(5,_dni);
            ps.setString(6,_tipoLicencia);
            ps.setString(7,_n_licencia);
            ps.setString(8,_estado);
            ps.setString(9,_tipoConductor);
            ps.setString(10,_nacionalidad);
            ps.setLong(11,_pasaporte);
            int affects = ps.executeUpdate();
            return affects;
        } catch (SQLException e) {
        }
        return 0;
    }

    @Override
    public List listarId(String _idConductor) {
       List<Conductor>list = new ArrayList<>();
        try {
            cn=conexion.getConnection();
            String query="select * from conductor where id_conductor="+_idConductor;
            ps=cn.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){        
                Conductor c= new Conductor();
                c.setIdConductor(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setApePat(rs.getString(3));
                c.setApeMat(rs.getString(4));
                c.setDni(rs.getString(5));
                c.setTipoLicencia(rs.getString(6));
                c.setN_licencia(rs.getString(7));
                c.setEstado(rs.getString(8));
                c.setTipo_conductor(rs.getString(9));
                c.setNacionalidad(rs.getString(10));
                c.setPasaporte(rs.getLong(11));
                list.add(c);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    @Override
    public int eliminar(String _idConductor) {
        try {
            cn=conexion.getConnection();
            String query="delete from conductor where id_conductor=?";
            ps=cn.prepareStatement(query);
            ps.setString(1,_idConductor);
            int affects = ps.executeUpdate();
            return affects;
        } catch (SQLException e) {
        }
        return 0;
    }

    @Override
    public int actualizar(String _idConductor, String _nombre, String _apePat, String _apeMat, String _dni, String _tipoLicencia, String _n_licencia, String _estado, String _tipoConductor, String _nacionalidad, long _pasaporte) {
        try {
            cn=conexion.getConnection();
            String query="update conductor set nombre=?,apell_pat=?,apell_mat=?,DNI=?,tipo_licencia=?,numero_bevete=?,estado_conduc=?,tipo_conductor=?,nacionalidad=?,pasaporte=? where id_conductor=?;";
            ps=cn.prepareStatement(query); 
            ps.setString(1,_nombre);
            ps.setString(2,_apePat);
            ps.setString(3,_apeMat);
            ps.setString(4,_dni);
            ps.setString(5,_tipoLicencia);
            ps.setString(6,_n_licencia);
            ps.setString(7,_estado);
            ps.setString(8,_tipoConductor);
            ps.setString(9,_nacionalidad);
            ps.setLong(10,_pasaporte);
            ps.setString(11,_idConductor);
            int affects = ps.executeUpdate();
            return affects;
        } catch (SQLException e) {
        }
        return 0;
    }

  
}
