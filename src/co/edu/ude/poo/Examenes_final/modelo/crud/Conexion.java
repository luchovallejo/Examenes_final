/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.Examenes_final.modelo.crud;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hillary alejandra
 */
public class Conexion {
    public static Connection getConnection()
    {
        Connection con = null;
        
        String bd = "examenes";
        String url = "jdbc:mysql://localhost:3306/"+bd;
        String user = "root";// el usuario que ustedes tienen
        String pass = " root";// la clave que uestedes tienen
        
        try
        {
            Class.forName("org.gjt.mm.mysql.Driver");
            
            con = (Connection)DriverManager.getConnection(url, user, pass);
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
        return con;
    }
   private static java.sql.Connection cone;
    
    private static boolean conectado = false;

    public static java.sql.Connection conectar()
    {
        
        try 
        {
            
            if (conectado == false)
            {               
                //ResourceBundle rb = ResourceBundle.getBundle("jdbc");
                
                //String driver = rb.getString("diver");
                String bd = "examenes";
                String url = "jdbc:mysql://localhost:3306/"+bd;
                String user = "root";// el usuario que ustedes tienen
                String pass = " root";// la clave que uestedes tienen
                               
                Class.forName("org.gjt.mm.mysql.Driver");
            
                cone = (com.mysql.jdbc.Connection)DriverManager.getConnection(url, user, pass); 
             
            }

            return cone; 
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Error al crear la conexión "+e.getMessage());
            
            throw new RuntimeException("Error al crear la conexión");
        }
    }
    
    
    
}
