
package Interfaz;

import Modelo.Conductor;
import java.util.List;

public interface ConductorI {
    public List listar();
    public int agregar(String _idConductor,String _nombre,String _apePat,String _apeMat,String _dni,
                       String _tipoLicencia,String _n_licencia,String _estado,String _tipoConductor,
                       String _nacionalidad,long _pasaporte);
  
}
