/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectoboutique.db.Conexion;
import logica.Ropa;

public class SQL_Ropa extends Conexion
{
    
    public boolean Agregar(Ropa ropa)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String consultaSQL = "INSERT INTO ropa(nombre, descripcion, precio, talla, genero, cantidad, marca, clase, tipo, activo)";
        consultaSQL += "VALUES(?,?,?,?,?,?,?,?,?,?) ;";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, ropa.getNombre());
          ps.setString(2, ropa.getDescripcion());
          ps.setDouble(3, ropa.getPrecio());
          ps.setString(4, ropa.getTalla());
          ps.setString(5, ropa.getGenero());
          ps.setInt(6, ropa.getCantidad());
          ps.setString(7, ropa.getMarca());
          ps.setString(8, ropa.getClase());
          ps.setString(9, ropa.getTipo());
          //ps.setBoolean(9, ropa.isActivo());
          ps.setBoolean(10, true);
          ps.executeUpdate();
          return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return false;
        }
    }
}
