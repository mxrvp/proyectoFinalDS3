package planilla;

import java.sql.*;



public class PlanillaModel{
  
private Connection conn;
private int lastInsert;
public  PreparedStatement ps;
public ResultSet rs;


public PlanillaModel(){
      
      this.connect();
    }

public int getLastInsert(){
    
       try {
        this.ps=this.conn.prepareStatement("CALL sp_select_last()");
        this.rs=this.ps.executeQuery();
        if(rs.next()){
             this.lastInsert=Integer.parseInt( this.rs.getString("id_planilla") );
        }
       
    } catch (SQLException e) {
       System.out.println(e.getMessage());
    }
        
        return this.lastInsert;

 }
public  ResultSet selectAll(){
   
    try {
        this.ps=this.conn.prepareStatement("CALL sp_select_totales_planilla()");
        this.rs=this.ps.executeQuery();
       
    } catch (SQLException e) {
       System.out.println(e.getMessage());
    }
    return this.rs;

 }


public  ResultSet selectDetalles(int id_planilla){
   
    try {
        this.ps=this.conn.prepareStatement("CALL sp_select_empleados_en_planilla(?)");
        this.ps.setString(1,String.valueOf(id_planilla));
        this.rs=this.ps.executeQuery();
       
    } catch (SQLException e) {
       System.out.println(e.getMessage());
    }
    return this.rs;

 }

public  int insert(String fecha){
    
    try {
        this.ps=this.conn.prepareStatement("CALL sp_insert_planilla(?)");
        this.ps.setString(1,fecha);
        this.rs=this.ps.executeQuery();
        
        if(this.rs.next()){
            
            this.lastInsert=Integer.parseInt(rs.getString("ultimo_id"));
            
             
        }
    
       
    } catch (SQLException e) {
       System.out.println(e.getMessage());
    }
  
return this.lastInsert;
}


public boolean insertDetalle(int planillaId,String ced,double horasT,double salarioH){
        //double salarioB,double seguroS,double seguroE,double salarioN
                
       if(evalHoras(horasT) && evalSalario(salarioH)){
           
           double salarioB=this.calcularSalarioBruto(horasT, salarioH);
            double seguroS=this.calcularSS(salarioB);
             double seguroE=this.calcularSE(salarioB);
             double salarioN=calcularSalarioNeto(salarioB, seguroS, seguroE);
                    
           try{
           this.ps=this.conn.prepareStatement("CALL sp_insert_detalle_planilla(?,?,?,?,?,?,?,?)");
            this.ps.setString(1,String.valueOf(planillaId));
             this.ps.setString(2,ced);
              this.ps.setString(3,String.valueOf(horasT));
               this.ps.setString(4,String.valueOf(salarioH));
                this.ps.setString(5,String.valueOf(salarioB));
                  this.ps.setString(6,String.valueOf(seguroS));
                      this.ps.setString(7,String.valueOf(seguroE));
                        this.ps.setString(8,String.valueOf(salarioN));
                          this.rs=this.ps.executeQuery();
            
                          return true;
          }
         catch(SQLException e){
             System.out.println(e.getMessage());
           
         }
                    
                    
        }
   
          return false;
   
         
        
} 


public ResultSet find(int id){
   
        
    try {
        this.ps=this.conn.prepareStatement("CALL sp_select_planilla_por_id(?)");
       this.ps.setString(1,String.valueOf(id));
        this.rs=ps.executeQuery();
        
         this.rs=ps.executeQuery();
    
       
    } catch (SQLException e) {
       System.out.println(e.getMessage());
    }
       
    return this.rs;
}


public boolean update(int idP,String ced,double horasT,double salarioH,double salarioB,double seguroS,double seguroE,double salarioN){
    
    
       
    
    return true;
    
}



public void connect(){
    
        try{ 
            try{
                 Class.forName("com.mysql.jdbc.Driver");
              
             
            
             
             }
             catch(ClassNotFoundException e){
                 System.out.println(e.getMessage());
             }
            
              this.conn=DriverManager.getConnection("jdbc:mysql://localhost/planilla?useUnicode=true&characterEncoding=utf-8", "root", "");
        }
        catch (SQLException e) {
       System.out.println(e.getMessage());
        }
}



   public void closeConn(){
    try {
        this.conn.close();
        } catch (SQLException e) {
       System.out.println(e.getMessage());
        }
     }
   
   
   
   
    public boolean evalHoras(double horasTrabajadas) {

        if (horasTrabajadas < 4 || horasTrabajadas > 12) {
            return false;
        }
        return true;
    }

    public boolean evalSalario(double salarioHora) {

        if (salarioHora < 5.00 || salarioHora > 20.00) {
            return false;
        }
        return true;
    }
   
   
   
   public double calcularSalarioBruto(double HT,double SxH) {

        double SalarioBruto = HT * SxH;
        return SalarioBruto;
    }

    public double calcularSS(double salarioBruto) {

        double SS = salarioBruto * 9.75 / 100;
        return SS;
    }

    public double calcularSE(double salarioBruto) {

        double SE =salarioBruto * 1.25 / 100;

        return SE;

    }

    public double calcularSalarioNeto(double salarioBruto,double SS,double SE) {

       double salarioNeto = salarioBruto - SS;
       salarioNeto -= SE;
        return salarioNeto;
    }
   
   
   
}
