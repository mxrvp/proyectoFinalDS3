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
    private String usuario;
    private String contrasena;
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public ValidarLogin(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
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
    }
}
