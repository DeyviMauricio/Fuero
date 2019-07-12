
package Modelo;



public class Conductor {
    private String idConductor;
    private String nombre;
    private String apePat;
    private String apeMat;
    private String dni;
    private String tipoLicencia;
    private String n_licencia;
    private String estado;
    private String tipo_conductor;
    private String nacionalidad;
    private long pasaporte;

    public Conductor() {
    }

    public Conductor(String idConductor, String nombre, String apePat, String apeMat, String dni, String tipoLicencia, String  n_licencia, String estado, String tipo_conductor, String nacionalidad, long pasaporte) {
        this.idConductor = idConductor;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.dni = dni;
        this.tipoLicencia = tipoLicencia;
        this.n_licencia = n_licencia;
        this.estado = estado;
        this.tipo_conductor = tipo_conductor;
        this.nacionalidad = nacionalidad;
        this.pasaporte = pasaporte;
    }
    
    public String getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(String idConductor) {
        this.idConductor = idConductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public String getN_licencia() {
        return n_licencia;
    }

    public void setN_licencia(String n_licencia) {
        this.n_licencia = n_licencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_conductor() {
        return tipo_conductor;
    }

    public void setTipo_conductor(String tipo_conductor) {
        this.tipo_conductor = tipo_conductor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public long getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(long pasaporte) {
        this.pasaporte = pasaporte;
    }
    
}
