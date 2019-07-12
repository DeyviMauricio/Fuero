
package Modelo;


public class Comisiones {
    
    private String id_soli;
    private String area;
    private String nombre;
    private String lugar ;
    private String fechaSolicitada;
    private String tiempo_uso;
    private String hora_salida;
    private int n_pasajeros;
    private String descripcion;

    public Comisiones(String id_soli, String area, String nombre, String lugar, String fechaSolicitada, String tiempo_uso, String hora_salida, int n_pasajeros, String descripcion) {
        this.id_soli = id_soli;
        this.area = area;
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaSolicitada = fechaSolicitada;
        this.tiempo_uso = tiempo_uso;
        this.hora_salida = hora_salida;
        this.n_pasajeros = n_pasajeros;
        this.descripcion = descripcion;
    }

    public Comisiones() {
    }

    public String getId_soli() {
        return id_soli;
    }

    public void setId_soli(String id_soli) {
        this.id_soli = id_soli;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFechaSolicitada() {
        return fechaSolicitada;
    }

    public void setFechaSolicitada(String fechaSolicitada) {
        this.fechaSolicitada = fechaSolicitada;
    }

    public String getTiempo_uso() {
        return tiempo_uso;
    }

    public void setTiempo_uso(String tiempo_uso) {
        this.tiempo_uso = tiempo_uso;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public int getN_pasajeros() {
        return n_pasajeros;
    }

    public void setN_pasajeros(int n_pasajeros) {
        this.n_pasajeros = n_pasajeros;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
