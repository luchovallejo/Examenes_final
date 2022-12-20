/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Examenes_final.modelo.entidades;

/**
 *
 * @author Hillary alejandra
 */
public class Alumno extends Usuario {
    private int numeroMatricula;
    private String grupo;

    public Alumno() {
    }

    public Alumno(int numeroMatricula, String grupo, String nombre, String apellido) {
        super(nombre, apellido);
        this.numeroMatricula = numeroMatricula;
        this.grupo = grupo;
    }
    
    

    /**
     * @return the numeroMatricula
     */
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    /**
     * @param numeroMatricula the numeroMatricula to set
     */
    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
}
