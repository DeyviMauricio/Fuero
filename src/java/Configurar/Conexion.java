
package Configurar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection conn;
    public Conexion(){
        try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=fuero","sa","12345678");
        }catch(ClassNotFoundException | SQLException e){
                System.out.println("ERROR:"+e);

        }
   }
   public Connection getConnection(){
   return conn;
   }
   public void Desconectar() throws SQLException{
      this.conn.close();
   }
}
