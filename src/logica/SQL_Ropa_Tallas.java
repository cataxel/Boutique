/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectoboutique.db.Conexion;

public class SQL_Ropa_Tallas extends Conexion{
    
    public boolean Agregar(Ropa_Tallas rt)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String consultaSQL = "INSERT INTO ropa_talla(idropa, idtalla,existencias)";
        consultaSQL += "VALUES(?,?,?) ;";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setInt(1, rt.getIdropa());
          ps.setInt(2, rt.getIdtalla());
          ps.setInt(3, rt.getExistencias());
          
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
    
    public boolean Modificar(Ropa_Tallas rt)
    {
        //ESTE CASI NO SE USA INCLUSO EN EL MODIFICAR NO SE USA XD
        PreparedStatement ps = null;
        Connection con = getConexion();
        String consultaSQL = "UPDATE ropa_talla SET idtalla=?, existencias=? WHERE idropa=?";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setInt(1, rt.getIdtalla());
          ps.setInt(2, rt.getExistencias());
          ps.setInt(3, rt.getIdropa());
          
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
    
    public boolean ExisteTalla(Ropa_Tallas rt)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String consultaSQL = "SELECT t.nombres FROM Tallas t INNER JOIN ropa_talla rt ON t.idtalla = rt.idtalla WHERE rt.idropa=? AND rt.idralla=?";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setInt(1, rt.getIdropa());
          ps.setInt(2, rt.getIdtalla());
          
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
    
    public boolean Eliminar(int id)
    {
        try
            {
                Connection con = Conexion.getCon();
                PreparedStatement ps = con.prepareStatement("DELETE FROM ropa_talla WHERE idropa=?");
                ps.setInt(1, id);
                ps.executeUpdate();
            }
            catch(SQLException e)
            {
                 Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,e);            
            }
        return false;
    }
    
    
}
