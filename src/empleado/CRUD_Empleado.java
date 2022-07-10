
package empleado;

import java.sql.*;
import proyectofinalds3.Conexion;


public class CRUD_Empleado {
    private String cedula;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellio;
    private String segundoApellido;
    private String fechaNacimiento;
    private String direccion;
    private String telefono;

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public CRUD_Empleado() {
    }

    public CRUD_Empleado(String cedula, String primerNombre, String segundoNombre, String primerApellio, String segundoApellido, String fechaNacimiento, String direccion, String telefono) {
        this.cedula = cedula;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellio = primerApellio;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellio() {
        return primerApellio;
    }

    public void setPrimerApellio(String primerApellio) {
        this.primerApellio = primerApellio;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public boolean InsertarEmpleado(){
        try {
            con = Conexion.getConnection();
            ps = con.prepareCall("call sp_insert_empleado(?,?,?,?,?,?,?,?)");
            ps.setString(1, this.cedula);
            ps.setString(2, this.primerNombre);
            ps.setString(3, this.segundoNombre);
            ps.setString(4, this.primerApellio);
            ps.setString(5, this.segundoApellido);
            ps.setString(6, this.fechaNacimiento);
            ps.setString(7, this.direccion);
            ps.setString(8, this.telefono);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                this.primerNombre = rs.getString("nombre1");
                con.close();
                return true;
            }
            con.close();
            return false;
            
        } catch (SQLException e) {
            return false;
        }
    }
    
    
    public boolean BuscarEmpleado() {
        try {
            con = Conexion.getConnection();
            ps = con.prepareCall("call sp_select_empleado_por_id(?)");
            ps.setString(1, this.cedula);

            rs = ps.executeQuery();
            if (rs.next()) {
                this.cedula = rs.getString("cedula");
                this.primerNombre = rs.getString("nombre1");
                this.segundoNombre = rs.getString("nombre2");
                this.primerApellio = rs.getString("apellido1");
                this.segundoApellido = rs.getString("apellido2");
                this.fechaNacimiento = rs.getString("fechanacimeinto");
                this.direccion = rs.getString("direccion");
                this.telefono = rs.getString("telefono");
                con.close();
                return true;
            }
            con.close();
            return false;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean ActualizarEmpleado(){
        try {
            con = Conexion.getConnection();
            ps = con.prepareCall("call sp_update_empleado(?,?,?,?,?,?,?,?)");
            ps.setString(1, this.cedula);
            ps.setString(2, this.primerNombre);
            ps.setString(3, this.segundoNombre);
            ps.setString(4, this.primerApellio);
            ps.setString(5, this.segundoApellido);
            ps.setString(6, this.fechaNacimiento);
            ps.setString(7, this.direccion);
            ps.setString(8, this.telefono);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                this.primerNombre = rs.getString("nombre1");
                con.close();
                return true;
            }
            con.close();
            return false;
        } catch (SQLException e) {
            return false;
        }
    }
}
