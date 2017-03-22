/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Date;

/**
 *
 * @author JOSESTALIN
 */
public class Reserva {
    private String id_res;
    private String id_estudiante;
    private String id_bibliotecario;
    private  String id_doc;
    private String titulo_doc;
    private String isbn_doc;
    private String precio;
    private Date fecha_reserva;
    private Date fecha_prestamo;
    private Date fecha_entrega;
    private Date fecha_devolucion;
    private double subtotal;
    private double total;
    private double multa;   

    public Reserva() {
    }

    public Reserva(String id_res, String id_estudiante, String id_bibliotecario, String id_doc, String titulo_doc, String isbn_doc, String precio, Date fecha_reserva, Date fecha_prestamo, Date fecha_entrega, Date fecha_devolucion, double subtotal, double total, double multa) {
        this.id_res = id_res;
        this.id_estudiante = id_estudiante;
        this.id_bibliotecario = id_bibliotecario;
        this.id_doc = id_doc;
        this.titulo_doc = titulo_doc;
        this.isbn_doc = isbn_doc;
        this.precio = precio;
        this.fecha_reserva = fecha_reserva;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_entrega = fecha_entrega;
        this.fecha_devolucion = fecha_devolucion;
        this.subtotal = subtotal;
        this.total = total;
        this.multa = multa;
    }

    /**
     * @return the id_res
     */
    public String getId_res() {
        return id_res;
    }

    /**
     * @param id_res the id_res to set
     */
    public void setId_res(String id_res) {
        this.id_res = id_res;
    }

    /**
     * @return the id_estudiante
     */
    public String getId_estudiante() {
        return id_estudiante;
    }

    /**
     * @param id_estudiante the id_estudiante to set
     */
    public void setId_estudiante(String id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    /**
     * @return the id_bibliotecario
     */
    public String getId_bibliotecario() {
        return id_bibliotecario;
    }

    /**
     * @param id_bibliotecario the id_bibliotecario to set
     */
    public void setId_bibliotecario(String id_bibliotecario) {
        this.id_bibliotecario = id_bibliotecario;
    }

    /**
     * @return the id_doc
     */
    public String getId_doc() {
        return id_doc;
    }

    /**
     * @param id_doc the id_doc to set
     */
    public void setId_doc(String id_doc) {
        this.id_doc = id_doc;
    }

    /**
     * @return the titulo_doc
     */
    public String getTitulo_doc() {
        return titulo_doc;
    }

    /**
     * @param titulo_doc the titulo_doc to set
     */
    public void setTitulo_doc(String titulo_doc) {
        this.titulo_doc = titulo_doc;
    }

    /**
     * @return the isbn_doc
     */
    public String getIsbn_doc() {
        return isbn_doc;
    }

    /**
     * @param isbn_doc the isbn_doc to set
     */
    public void setIsbn_doc(String isbn_doc) {
        this.isbn_doc = isbn_doc;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the fecha_reserva
     */
    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    /**
     * @param fecha_reserva the fecha_reserva to set
     */
    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    /**
     * @return the fecha_prestamo
     */
    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    /**
     * @param fecha_prestamo the fecha_prestamo to set
     */
    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    /**
     * @return the fecha_entrega
     */
    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    /**
     * @param fecha_entrega the fecha_entrega to set
     */
    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    /**
     * @return the fecha_devolucion
     */
    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    /**
     * @param fecha_devolucion the fecha_devolucion to set
     */
    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the multa
     */
    public double getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(double multa) {
        this.multa = multa;
    }
    
    

}