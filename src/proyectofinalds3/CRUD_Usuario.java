/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalds3;

/**
 *
 * @author efrai
 */
import java.sql.*;
public class CRUD_Usuario {
    String cedula;
    String userId;
    String contrasena;
    String nombre;
    String apellido;
    String direccion;
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    public CRUD_Usuario(String cedula, String userId, String contrasena, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.userId = userId;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
      
    }
    
    public CRUD_Usuario(){}

    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
     public boolean InsertarUsuario(){
        try{
            con = Conexion.getConnection();
            ps = con.prepareCall("call sp_insert_usuarios(?,?,?,?,?,?)" );
            ps.setString(1, this.cedula);
            ps.setString(2, this.userId);
            ps.setString(3, this.contrasena);
            ps.setString(4, this.nombre);
            ps.setString(5, this.apellido);
            ps.setString(6, this.direccion);
         
            rs = ps.executeQuery();
            if ( rs.next() ){
                this.nombre = rs.getString("nombre");
                con.close();
                return true;
            }
            con.close();
            return false;
        }catch (SQLException e){
            return false;
        }
    }
     
      public boolean BuscarUsuario(){
        try{
            con = Conexion.getConnection();
            ps = con.prepareCall("call sp_select_usuario(?)" );
            ps.setString(1, this.cedula);
         
            rs = ps.executeQuery();   
            if (rs.next()){
                this.userId = rs.getString("userid");
                this.contrasena = rs.getString("contrasenna");
                this.nombre = rs.getString("nombre");
                this.apellido = rs.getString("apellido");
                this.direccion = rs.getString("direccion");
                con.close();
                return true;
            }
            con.close();
            return false;
        }catch (SQLException e){
            return false;
        }
    }
     
       public boolean ActulizarUsuario(){
       try{
            con = Conexion.getConnection();
            ps = con.prepareCall("call sp_update_usuario(?,?,?,?,?,?)" );
            ps.setString(1, this.cedula);
            ps.setString(2, this.userId);
            ps.setString(3, this.contrasena);
            ps.setString(4, this.nombre);
            ps.setString(5, this.apellido);
            ps.setString(6, this.direccion);
         
            rs = ps.executeQuery();
            if ( rs.next() ){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
            }catch (SQLException e){
                return false;
            }
        }
       
        public boolean EliminarUsuario(){
            
        return false;
        }
}
