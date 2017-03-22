/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author JOSESTALIN
 */
public class Documento {
    private String id_doc;
    private String isbn;
    private  String autor;
    private String editorial;
    private String titulo;
    private String area;      
    private String anio;
    private String tipo_doc;
    private String precio;      
    private String disponibles;

    public Documento() {
    }

    public Documento(String id_doc, String isbn, String autor, String editorial, String titulo, String area, String anio, String tipo_doc, String precio, String disponibles, String reservados) {
        this.id_doc = id_doc;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.titulo = titulo;
        this.area = area;
        this.anio = anio;
        this.tipo_doc = tipo_doc;
        this.precio = precio;
        this.disponibles = disponibles;
        this.reservados = reservados;
    }
    
    private String reservados;

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
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * @return the tipo_doc
     */
    public String getTipo_doc() {
        return tipo_doc;
    }

    /**
     * @param tipo_doc the tipo_doc to set
     */
    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
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
     * @return the disponibles
     */
    public String getDisponibles() {
        return disponibles;
    }

    /**
     * @param disponibles the disponibles to set
     */
    public void setDisponibles(String disponibles) {
        this.disponibles = disponibles;
    }

    /**
     * @return the reservados
     */
    public String getReservados() {
        return reservados;
    }

    /**
     * @param reservados the reservados to set
     */
    public void setReservados(String reservados) {
        this.reservados = reservados;
    }
    
}
