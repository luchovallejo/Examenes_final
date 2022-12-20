/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Examenes_final.modelo.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hillary alejandra
 */
public class Institucion {
    public DefaultTableModel mostrarAlumnos()
    {
        String [] nombresColumnas = {"Matricula","Nombre","Apellido","Grupo","Realizo","Fecha","Profesor","Nota"};
        String [] registros = new String[8];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM alumno";
        
        Connection cone = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cone = Conexion.conectar();
            
            pst = cone.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("matricula");
                
                registros[1] = rs.getString("nombre");
                
                registros[2] = rs.getString("apellido");
                
                registros[3] = rs.getString("grupo");
                
                registros[4] = rs.getString("realizo");
                
                registros[5] = rs.getString("fecha");
                
                registros[6] = rs.getString("profesor");
                
                registros[7] = rs.getString("nota");
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cone != null) cone.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    }
    
}
