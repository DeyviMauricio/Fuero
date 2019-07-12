
package Interfaz;


import java.util.List;

public interface ConductorI {
    public List listar();
    public int agregar(String _idConductor,String _nombre,String _apePat,String _apeMat,String _dni,
                       String _tipoLicencia,String _n_licencia,String _estado,String _tipoConductor,
                       String _nacionalidad,String _pasaporte);
    public int actualizar(String _idConductor,String _nombre,String _apePat,String _apeMat,String _dni,
                       String _tipoLicencia,String _n_licencia,String _estado,String _tipoConductor,
                       String _nacionalidad,String _pasaporte);
    public List listarId(String _idConductor);
    public int eliminar(String _idConductor);
}
