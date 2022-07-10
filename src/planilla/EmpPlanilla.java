package planilla;

import empleados.Empleado;

public class EmpPlanilla {

    private Empleado em;
    //horas trabajadas
    public double HT;
    //salario por hora
    private double SxH;

    private double SalarioBruto;
    //seguro social
    private double SS;
    //seguro educativo
    private double SE;
    private double SalarioNeto;

    public EmpPlanilla() {
    }

    public EmpPlanilla(Empleado em) {
        this.em = em;
        this.HT = em.getHorasTrabajadas();
        this.SxH = em.getSalarioHora();

    }

    public void setEmp(Empleado emp) {
        this.em = emp;
    }

    public Empleado getEmp() {
        return this.em;
    }

    public double calcularSalarioBruto() {

        this.SalarioBruto = this.HT * SxH;
        return this.SalarioBruto;
    }

    public double calcularSS() {

        this.SS = this.SalarioBruto * 9.75 / 100;
        return this.SS;
    }

    public double calcularSE() {

        this.SE = this.SalarioBruto * 1.25 / 100;

        return this.SE;

    }

    public double calcularSalarioNeto() {

        this.SalarioNeto = this.SalarioBruto - this.SS;
        this.SalarioNeto -= this.SE;
        return this.SalarioNeto;
    }

}
