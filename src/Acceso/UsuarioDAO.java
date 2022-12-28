
package Acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.UsuarioTO;
import Utils.Conexion;


public class UsuarioDAO {
   Conexion conectar = new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   
    public List Listar() {
        List<UsuarioTO> datosUsuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try {
            con = conectar.establecerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
               UsuarioTO usuario = new UsuarioTO();
               usuario.setAlias(rs.getString(1));
               usuario.setNombres(rs.getString(2));
               usuario.setApellidos(rs.getString(3));
               usuario.setEmail(rs.getString(4));
               usuario.setCelular(rs.getString(5));
               usuario.setContraseña(rs.getString(6));
               usuario.setNacimiento(rs.getString(7));
               
               datosUsuarios.add(usuario);
               
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage());
        }finally{
        return datosUsuarios;
        }
    }

    public int Agregar(UsuarioTO usuarioAgregar) {
        String sql = "INSERT INTO usuario(alias, nombres, apellidos, email, celular, contraseña, nacimiento) VALUES (?,?,?,?,?,?,?) ";
        try{
            con = conectar.establecerConexion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, usuarioAgregar.getAlias());
            ps.setString(2, usuarioAgregar.getNombres());
            ps.setString(3, usuarioAgregar.getApellidos());
            ps.setString(4, usuarioAgregar.getEmail());
            ps.setDouble(5, usuarioAgregar.getCelular());
            ps.setString(6, usuarioAgregar.getContraseña());
            ps.setString(7, usuarioAgregar.getNacimiento());
            
            ps.executeUpdate();
                   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage());
        }
        return 1;
    }
    public int Actualizar(UsuarioTO usuarioActualizar){
        int condicion=0;
        String sql = "UPDATE usuario SET nombres=?, apellidos=?, email=?, celular=?, contraseña=?, nacimiento=? where alias=?";
        try{
            con = conectar.establecerConexion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, usuarioActualizar.getNombres());
            ps.setString(2, usuarioActualizar.getApellidos());
            ps.setString(3, usuarioActualizar.getEmail());
            ps.setDouble(4, usuarioActualizar.getCelular());
            ps.setString(5, usuarioActualizar.getContraseña());
            ps.setString(6, usuarioActualizar.getNacimiento());
            ps.setString(7, usuarioActualizar.getAlias());
            
            condicion = ps.executeUpdate();
            
            if(condicion == 1){
                return 1;
            } else{
                return 0;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage());
        }
        return condicion;
    }
    public void Eliminar(String alias){
        String sql = "DELETE FROM usuario WHERE alias=?";
        try{
            con = conectar.establecerConexion();
            ps = con.prepareStatement(sql);   
            
            ps.setString(1, alias);
            
            ps.executeUpdate();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage());
        }
    }
}
