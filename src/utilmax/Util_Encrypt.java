package utilmax;
/*by Efraín*/
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Util_Encrypt {
    public String hashPass(String pass,String algo){
        //todo hash password
        //md5(5);
        //instanciamos el digest obj
        StringBuffer hexString = new StringBuffer();
       try{
       MessageDigest md = MessageDigest.getInstance(algo);
        //convertimos el pass a bytes
        md.update(pass.getBytes());
        //creamos el array digest 
        byte[] digest = md.digest();
        //convertimos a hexString
         
         
         for (int i = 0;i<digest.length;i++) {
         hexString.append(Integer.toHexString(0xFF & digest[i]));
         }
          
       }
       catch(NoSuchAlgorithmException e){
         e.getMessage();
       }
        return hexString.toString();
    }  
    
    public static String cifrar(String password){
        String pass = Base64.getEncoder().encodeToString(password.getBytes());
        return pass;
    }
}
