package empleados;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EmpleadosModel {

    //empleados
    //si el query type es 0 se hace busqueda,1insert,2 update y 3 delete
    public int queryType;
    private String path = "C:\\archivojavautp\\empleados.txt";
    private String delimiter = "|";
    private File db = new File(path);
    private FileWriter fw;
    private PrintWriter pw;

    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public EmpleadosModel() {
        if (!db.exists()) {
            try {
                db.createNewFile();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        //inicializar lector
        this.refreshModel();

    }

    public boolean insertar(Empleado em) {

        if (!this.empleados.add(em)) {
            return false;
        }

        try {
            fw = new FileWriter(path, true);
            pw = new PrintWriter(fw);

            String strDate = dateFormater("yyyy-MM-dd", em.getFechaNacimiento());

            pw.println(em.getCedula() + delimiter + em.getNombre() + delimiter + em.getNombre2() + delimiter + em.getApellido() + delimiter + em.getApellido2() + delimiter + strDate + delimiter + em.getDireccion() + delimiter + em.getTelefono() + delimiter + em.getHorasTrabajadas() + delimiter + em.getSalarioHora());

            fw.close();
        } catch (IOException e) {
            e.getMessage();
        }

        return true;
    }

    public ArrayList<Empleado> mostrar_todos() {
        return this.empleados;
    }

    public Empleado buscarEmpleado(int index) {
        return empleados.get(index);
    }

    public boolean modificar(int index, String nom, String nom2, String ape, String ape2, Date d, String dir, String tel, double hT, double sH) {
        //todo del update
        //la fecha debe estar formateada

        //primero guardamos en el arraylist y despues escribir al txt
        this.empleados.get(index).setNombre(nom);
        this.empleados.get(index).setNombre2(nom2);
        this.empleados.get(index).setApellido(ape);
        this.empleados.get(index).setApellido2(ape2);
        this.empleados.get(index).setFechaNacimiento(d);
        this.empleados.get(index).setDireccion(dir);
        this.empleados.get(index).setTelefono(tel);
        this.empleados.get(index).setHorasTrabajadas(hT);
        this.empleados.get(index).setSalarioHora(sH);
        this.refreshFile();
        return true;
    }

    public boolean modificar(int index, String nom, String nom2, String ape, String ape2, Date d, String dir, String tel) {
        //todo del update
        //la fecha debe estar formateada

        //primero guardamos en el arraylist y despues escribir al txt
        this.empleados.get(index).setNombre(nom);
        this.empleados.get(index).setNombre2(nom2);
        this.empleados.get(index).setApellido(ape);
        this.empleados.get(index).setApellido2(ape2);
        this.empleados.get(index).setFechaNacimiento(d);
        this.empleados.get(index).setDireccion(dir);
        this.empleados.get(index).setTelefono(tel);

        this.refreshFile();
        return true;
    }

    public boolean modificar(int index, double hT, double sH) {
        //todo del update
        //la fecha debe estar formateada

        //primero guardamos en el arraylist y despues escribir al txt
        this.empleados.get(index).setHorasTrabajadas(hT);
        this.empleados.get(index).setSalarioHora(sH);

        this.refreshFile();
        return true;
    }

    public boolean eliminar(int index) {
        //todo del insert 
        //mediante el index borrar del txt
        //overwrite del archivo con los registros actualizados
        this.empleados.remove(index);
        this.refreshFile();

        return true;
    }

    public int getNumEmpleados() {
        return this.empleados.size();
    }

    public boolean cedulaUnica(String ced) {
        String cedula = ced.trim();
        for (int i = 0; i <= this.getNumEmpleados() - 1; i++) {
            Empleado em = this.empleados.get(i);

            if (em.getCedula().equals(cedula)) {
                return false;
            }

        }

        return true;

    }

    public Empleado buscarCedula(String ced) {
        String cedula = ced.trim();
        Empleado empleado = null;
        for (int i = 0; i <= this.getNumEmpleados() - 1; i++) {
            Empleado em = this.empleados.get(i);

            if (em.getCedula().equals(cedula)) {
                return em;
            }

        }

        return empleado;
    }

    public int getQueryType() {
        return this.queryType;
    }

    public void setQueryType(int queryType) {
        this.queryType = queryType;
    }

    public void refreshFile() {

        try {
            fw = new FileWriter(path);
            pw = new PrintWriter(fw);

            for (int i = 0; i <= this.empleados.size() - 1; i++) {
                Empleado em = this.empleados.get(i);
                System.out.println(em.getApellido());
                System.out.println(em.getApellido2());
                String fechaVen = this.dateFormater("yyyy-MM-dd", em.getFechaNacimiento());
                pw.println(em.getCedula() + delimiter + em.getNombre() + delimiter + em.getNombre2() + delimiter + em.getApellido() + delimiter + em.getApellido2() + delimiter + fechaVen + delimiter + em.getDireccion() + delimiter + em.getTelefono() + delimiter + em.getHorasTrabajadas() + delimiter + em.getSalarioHora());

            }

            fw.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void refreshModel() {
        try {
            /**
             * *******ERROR CORREGIDO primero verificar si hay lineas ***********
             */

            Scanner lector = new Scanner(db);
            if (lector.hasNext()) {

                while (lector.hasNextLine()) {
                    String row[] = lector.nextLine().split("\\|");
                    //this.lastId=Integer.parseInt(row[0]);

                    try {
                        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                        Date fecha = formatter.parse(row[5]);
                        this.empleados.add(new Empleado(row[0], row[1], row[2], row[3], row[4], fecha, row[6], row[7], Double.parseDouble(row[8]), Double.parseDouble(row[9])));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                }

            }
            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public String dateFormater(String pattern, Date fecha) {

        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String strDate = formatter.format(fecha);
        return strDate;
    }

}
