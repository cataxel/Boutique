/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoboutique.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    private final String DRIVER="com.mysql.cj.jdbc.Driver";
    private final String DB="tiendaropa"; //esto es debatible
    private final String URL="jdbc:mysql://localhost:3307/" + DB;//el numero de puerto se va a cambiar para cada quien
    private final String USER="root";
    private final String PASSWORD="";
    private Connection con = null;
    public static Conexion instancia;
            
    public Connection getConexion()
    {
        try
        {
            Class.forName(DRIVER);
            this.con = DriverManager.getConnection(URL,USER,PASSWORD);
            
        }catch(ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.con;
    }
    
    public void Desconectar()
    {
        try
        {
         this.con.close();
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
