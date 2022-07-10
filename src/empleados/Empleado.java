package empleados;

import java.util.Date;

public class Empleado {

    private String cedula;
    private String nombre;
    private String nombre2;
    private String apellido;
    private String apellido2;
    //la fecha debe estar en formato año/mes/dia
    private Date fechaNacimiento;
    private String direccion;
    private String telefono;
    private double horasTrabajadas;
    private double salarioHora;

    public Empleado() {
    }

    public Empleado(String cedula, String nombre, String nombre2, String apellido, String apellido2, Date vencimiento, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.fechaNacimiento = vencimiento;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    public Empleado(String cedula, String nombre, String nombre2, String apellido, String apellido2, Date vencimiento, String direccion, String telefono, double hT, double sH) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.fechaNacimiento = vencimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horasTrabajadas = hT;
        this.salarioHora = sH;

    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre2() {
        return this.nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fNac) {
        this.fechaNacimiento = fNac;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioHora() {
        return this.salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public boolean evalHoras() {

        if (this.horasTrabajadas < 4 || this.horasTrabajadas > 12) {
            return false;
        }
        return true;
    }

    public boolean evalSalario() {

        if (this.salarioHora < 5.00 || this.salarioHora > 20.00) {
            return false;
        }
        return true;
    }

}
