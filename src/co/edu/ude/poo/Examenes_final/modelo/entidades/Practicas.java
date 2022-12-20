/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Examenes_final.modelo.entidades;

/**
 *
 * @author Hillary alejandra
 */
public class Practicas {
    private String titulo;
    private String codigo;
    private String gradodificultad;
    private String fecha;
    private double notap;

    public Practicas() {
    }

    public Practicas(String titulo, String codigo, String gradodificultad, String fecha, double notap) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.gradodificultad = gradodificultad;
        this.fecha = fecha;
        this.notap = notap;
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the gradodificultad
     */
    public String getGradodificultad() {
        return gradodificultad;
    }

    /**
     * @param gradodificultad the gradodificultad to set
     */
    public void setGradodificultad(String gradodificultad) {
        this.gradodificultad = gradodificultad;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the notap
     */
    public double getNotap() {
        return notap;
    }

    /**
     * @param notap the notap to set
     */
    public void setNotap(double notap) {
        this.notap = notap;
    }
    
}
