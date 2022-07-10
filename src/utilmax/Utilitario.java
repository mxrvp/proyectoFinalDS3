/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilmax;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author admin
 */
public class Utilitario {
    
    public static boolean esNumero(String cadena){
     try{
         Double.parseDouble(cadena);
           return true;
     }catch(Exception e){
             return false;
     }
   
    }
    
   
    public static boolean estanVacias(String val[]){
     
      int counter=0;
      
      for(int i=0;i<=val.length-1;i++){
        if(val[i].isBlank()|| val[i].isEmpty() ){
            counter++;
        }
      }
      
      if(counter>0){
          return true;
      }
      else{
         return false;
      }
      
    }
    
    
     public static boolean estaVacia(String val){
     
    
         
      if(val.isBlank()|| val.isEmpty() ){
        return true;
      }
     return false; 
     
      
    }
 
    public static boolean esEntero(String cadena){
       try{
         Integer.parseInt(cadena);
           return true;
     }catch(Exception e){
             return false;
     }
    
    
    }
    

      public static void exi(String msg,JFrame jd){
     JOptionPane.showMessageDialog(jd,msg,"exito",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void erro(String msg,JFrame jd){
     JOptionPane.showMessageDialog(jd,msg,"error",JOptionPane.ERROR_MESSAGE);
    }
    
    
    
}
