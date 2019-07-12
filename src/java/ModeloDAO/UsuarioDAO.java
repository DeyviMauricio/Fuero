
package ModeloDAO;

import Configurar.Conexion;
import Interfaz.Validar;

import java.sql.*;



public class UsuarioDAO implements Validar{
    Conexion cnx = new Conexion();
    Connection conn;
    PreparedStatement ps;
    String  sql;
    ResultSet rs;

    @Override
    public int exist(String usuario, String pass) {
      int nivel=0;
      try{
          conn=cnx.getConnection();
          sql="select nivel from usuario where nombre='"+usuario+"' and contraseña='"+pass+"'";
          ps=conn.prepareStatement(sql);
          rs=ps.executeQuery();
          while(rs.next()){
            nivel=rs.getInt(1);
          }
          conn.close();
          rs.close();
          return nivel;
      }catch(SQLException e){
          return nivel;
      }
    }
        
       
}
