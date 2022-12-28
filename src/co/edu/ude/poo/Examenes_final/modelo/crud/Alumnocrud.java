/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Examenes_final.modelo.crud;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Alumnocrud {
     public boolean registrar(int matricula, String nombre, String apellido, String grupo,String realizo,String fecha,String profesor,int nota)
    {
        String sql = "INSERT INTO alumno (matricula,nombre,apellido,grupo,realizo,fecha,profesor,nota) VALUES (?,?,?,?,?,?,?,?)";
        
        Connection conectar;
        PreparedStatement pst;
        
        try
        {
            conectar = Conexion.getConnection();
            
            pst = (PreparedStatement) conectar.prepareStatement(sql);
            
            pst.setInt(1,matricula);
            
            pst.setString(2, nombre);
            
            pst.setString(3, apellido);           
            
            pst.setString(4, grupo);
            
            pst.setString(5, realizo);
            
            pst.setString(6, fecha );
            
            pst.setString(7, profesor);
            
            pst.setInt(8, nota);
        
            int i = pst.executeUpdate();
            
            if (i != 0)
            {
                JOptionPane.showMessageDialog(null,"Los datos se han guardado satisfactoriamente");
                
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error en la transaccion");
                return false;
            }
            
        }
        catch(SQLException e)
        {            
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
}
