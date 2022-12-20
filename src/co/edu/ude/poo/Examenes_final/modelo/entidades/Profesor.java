/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Examenes_final.modelo.entidades;

/**
 *
 * @author Hillary alejandra
 */
public class Profesor extends Usuario {
    private String DNI;

    public Profesor() {
    }

    public Profesor(String DNI, String nombre, String apellido) {
        super(nombre, apellido);
        this.DNI = DNI;
    }
    
    

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
}
