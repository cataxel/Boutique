/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import proyectoboutique.db.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SQL_Usuarios extends Conexion { //el Extends es importante
    
    public boolean Registrar(Usuario usr)
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
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }

    public int ExisteUsuario(String usuario)
    {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String consultaSQL = "SELECT count(idusuario) from usuarios WHERE usuario = ?";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, usuario);
          rs = ps.executeQuery();
          if(rs.next())
          {
              return rs.getInt(1);
          }
          return 1;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return 1;
        }
    }
    
    public boolean Login(Usuario usr)
    {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String consultaSQL = "SELECT u.idusuario, u.usuario, u.contra, u.nombre, u.id_tipo, t.nombre from usuarios AS u INNER JOIN tipo_usuarios AS t ON u.id_tipo = t.idtipo_usuarios WHERE usuario = ?";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, usr.getUsuario());
          rs = ps.executeQuery();
          if(rs.next())
          {
              if(usr.getContra().equals(rs.getString(3)))
              {
                  String consultaSQLUpdate = "UPDATE usuarios SET last_session = ? WHERE idusuario=?";
                  ps = con.prepareStatement(consultaSQLUpdate);
                  ps.setString(1, usr.getLast_session());
                  ps.setInt(2, rs.getInt(1));
                  ps.execute();
                  usr.setIdusuario(rs.getInt(1));
                  usr.setNombre(rs.getString(4));
                  usr.setId_tipo(rs.getInt(5));
                  usr.setNombre_tipo(rs.getString(6));
                  return true;
              }
              else
              {
                  return false;
              }
          }
          return false;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
    
    public int ExisteCorreo(String correo)
    {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String consultaSQL = "SELECT count(idusuario) from usuarios WHERE correo = ?";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, correo);
          rs = ps.executeQuery();
          if(rs.next())
          {
              return rs.getInt(1);
          }
          return 1;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return 1;
        }
    }
}
