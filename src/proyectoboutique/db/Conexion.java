/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoboutique.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private final String DRIVER="com.mysql.cj.jdbc.Driver";
    private final String URL="jdbc:mysql://localhost:3306/";
    private final String DB = "basededatos";
    private final String USER = "root";
    private final String PASSWORD = "2002";
    
    public Connection cadena;
    public static Conexion instancia;
    
    
    
    private Conexion(){
        this.cadena = null;
    }
    
    public Connection Conectar() throws ClassNotFoundException{
        
        try{
           Class.forName(DRIVER);
           this.cadena = DriverManager.getConnection(URL+DB, USER, PASSWORD);
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;
    }
    public void Desconectar(){
        try{
            this.cadena.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static Conexion getinstancia(){
        if(instancia == null)
            instancia=new Conexion();
        return instancia;
    }
}
