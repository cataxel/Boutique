/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import proyectoboutique.db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author axellopez
 */
public class SQL_Usuario extends Conexion {
    public boolean Agregar(Usuario usr)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String consultaSQL = "INSERT INTO usuarios(usuario, contra, nombre, correo, id_tipo)";
        consultaSQL += "VALUES(?,?,?,?,?) ;";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, usr.getUsuario());
          ps.setString(2, usr.getContra());
          ps.setString(3, usr.getNombre());
          ps.setString(4, usr.getCorreo());
          ps.setInt(5, usr.getId_tipo());
          ps.execute();
          //ps.close();
          //con.close();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
    public boolean Modificar(Usuario usr)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String consultaSQL = "UPDATE usuario SET usuario = ?, contra = ?, nombre = ?,id_tipo = ? WHERE idusuario = ?";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, usr.getUsuario());
          ps.setString(2, usr.getContra());
          ps.setString(3, usr.getNombre());
          ps.setInt(4, usr.getId_tipo());
          
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
}
