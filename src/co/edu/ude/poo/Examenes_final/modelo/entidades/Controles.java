/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Examenes_final.modelo.entidades;

/**
 *
 * @author Hillary alejandra
 */
public class Controles {
    private String numerocontrol;
    private String fechac;
    private double notac;

    public Controles() {
    }

    public Controles(String numerocontrol, String fechac, double notac) {
        this.numerocontrol = numerocontrol;
        this.fechac = fechac;
        this.notac = notac;
    }
    
    
    /**
     * @return the numerocontrol
     */
    public String getNumerocontrol() {
        return numerocontrol;
    }

    /**
     * @param numerocontrol the numerocontrol to set
     */
    public void setNumerocontrol(String numerocontrol) {
        this.numerocontrol = numerocontrol;
    }

    /**
     * @return the fechac
     */
    public String getFechac() {
        return fechac;
    }

    /**
     * @param fechac the fechac to set
     */
    public void setFechac(String fechac) {
        this.fechac = fechac;
    }

    /**
     * @return the notac
     */
    public double getNotac() {
        return notac;
    }

    /**
     * @param notac the notac to set
     */
    public void setNotac(double notac) {
        this.notac = notac;
    }
    
}
