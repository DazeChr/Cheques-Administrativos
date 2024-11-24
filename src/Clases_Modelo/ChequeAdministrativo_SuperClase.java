package Clases_Modelo;

public abstract class ChequeAdministrativo_SuperClase {

    // Atributos o Variables
    protected String nombreEmp;
    protected String deptoEmp;
    protected String puestoEmp;
    protected double sueldoDiarioEmp;

    //Constructor de default
    ChequeAdministrativo_SuperClase() {
    }

    //--------------------------------------
    // Manipulando el Constructor
    //--------------------------------------
    public ChequeAdministrativo_SuperClase(String nombreEmp, String deptoEmp, String puestoEmp, double sueldoDiarioEmp) {
        this.nombreEmp = nombreEmp;
        this.deptoEmp = deptoEmp;
        this.puestoEmp = puestoEmp;
        this.sueldoDiarioEmp = sueldoDiarioEmp;
    }

    //--------------------------------------
    // Metodos de entrada de datos -setters-
    //--------------------------------------
    //Preparando para implementar polimorfismo
    abstract void setSueldoDiario();

    public void setNombreEmp(String xNombre) {
        this.nombreEmp = xNombre;
    }

    public void setDeptoEmp(String xDepto) {
        this.deptoEmp = xDepto;
    }

    public void setPuestoEmp(String xPuesto) {
        this.puestoEmp = xPuesto;
    }

    //--------------------------------------
    // Metodos de acceso a los datos -getters-
    //--------------------------------------
    public String getNombreEmp() {
        return this.nombreEmp;
    }

    public String getDeptoEmp() {
        return this.deptoEmp;
    }

    public String getPuestoEmp() {
        return this.puestoEmp;
    }

    public double getSueldoDro() {
        return this.sueldoDiarioEmp;
    }
}
