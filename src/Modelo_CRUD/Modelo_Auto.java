
package Modelo_CRUD;

import java.sql.Date;

/**
 *
 * @author jefferson
 */
public class Modelo_Auto {
    
    private String cedula;
    private String nombre;
    private String telefono;
    private String tipo;
    private String marca;
    private String placa;
    private Date fecha_entrada;
    private Date fecha_salida;
    private double costo_reparacion;

    public Modelo_Auto() {
    }

    public Modelo_Auto( String cedula, String nombre, String telefono, String tipo, String marca, String placa, Date fecha_entrada, Date fecha_salida, double costo_reparacion) {
        
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipo = tipo;
        this.marca = marca;
        this.placa = placa;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.costo_reparacion = costo_reparacion;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the fecha_entrada
     */
    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    /**
     * @param fecha_entrada the fecha_entrada to set
     */
    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    /**
     * @return the fecha_salida
     */
    public Date getFecha_salida() {
        return fecha_salida;
    }

    /**
     * @param fecha_salida the fecha_salida to set
     */
    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    /**
     * @return the costo_reparacion
     */
    public double getCosto_reparacion() {
        return costo_reparacion;
    }

    /**
     * @param costo_reparacion the costo_reparacion to set
     */
    public void setCosto_reparacion(double costo_reparacion) {
        this.costo_reparacion = costo_reparacion;
    }
    
            
    
    
    
}
