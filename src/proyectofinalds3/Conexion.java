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
public class Conexion {
    
    public static Connection getConnection(){
        Connection con;
        String userName = "root";
        String password = "";
        String url = "jdbc:mysql://localhost/planilla?useUnicode=true&characterEncoding=utf-8";
        
         try{
             try{
                 Class.forName("com.mysql.jdbc.Driver");
             }catch (ClassNotFoundException e){
                 return null;
             }
               con = DriverManager.getConnection(url, userName, password);
               return con;
         }catch(SQLException e){
             return null;
         }
    }
    
}
