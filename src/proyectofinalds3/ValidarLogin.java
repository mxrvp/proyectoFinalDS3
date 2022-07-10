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
public class ValidarLogin {
    public static String nombreUsuario;
    private String usuario;
    private String contrasena;
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public ValidarLogin(String usuario, String contrasena, Connection con, PreparedStatement ps, ResultSet rs) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.con = con;
        this.ps = ps;
        this.rs = rs;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public ValidarLogin(){}

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
   
    public boolean ValidarLogin(){
        boolean validacion = false;
        int valor = 0;
        try{
            con = Conexion.getConnection();
            ps = con.prepareCall("CALL sp_select_validar_usuario(?,?)");
            ps.setString(1, this.usuario);
            ps.setString(2, this.contrasena);
            rs = ps.executeQuery();
                        
            if (rs.next()){
               valor = Integer.valueOf(rs.getString("numero"));
               
               if(valor==1){
                   validacion = true;               
               }
               con.close();  
            }
            con.close();
            return validacion;
        }catch (SQLException e){
            return validacion;
        }
    }// Fin de validar usuario
    
    public String NombreUsuario(){
        
          String nombreUsuario = "xxx";
          JFrameInSesion obj = new JFrameInSesion();
    
          try{
            
            con = Conexion.getConnection();
            ps = con.prepareCall("CALL sp_select_nombreUsuario(?)");
            ps.setString(1, this.nombreUsuario);
            rs = ps.executeQuery();
                        
            if (rs.next()){
               nombreUsuario = (rs.getString("nombre"));
               con.close();
            }
            con.close();
            return nombreUsuario;
        }catch (SQLException e){
            return nombreUsuario;
        }

    }//NombreUsuario

}
