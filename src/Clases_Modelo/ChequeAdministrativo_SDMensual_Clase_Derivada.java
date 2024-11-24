package Clases_Modelo;

public class ChequeAdministrativo_SDMensual_Clase_Derivada extends ChequeAdministrativo_SuperClase {

    // Datos de la clase
    private int DiasTrabajados;
    private double SueldoMensual;
    //private double sueldoQuincenal;

    //Constructor de default
    public ChequeAdministrativo_SDMensual_Clase_Derivada() {
    }

    //Manipulando el Constructor
    public ChequeAdministrativo_SDMensual_Clase_Derivada(String nombreEmp, String deptoEmp, String puestoEmp, double sueldoDiarioEmp, int DiasTrabajados) {
        super(nombreEmp, deptoEmp, puestoEmp, sueldoDiarioEmp);
        this.DiasTrabajados = DiasTrabajados;
    }

    //--------------------------------------
    // Metodos de entrada de datos -setters-
    //--------------------------------------

    public void SetDiasTrabajados(int xDiasTrabajados) {
        this.DiasTrabajados = xDiasTrabajados;
    }

    //Implementando polimorfismo
    public void setSueldoDiario() {
        this.sueldoDiarioEmp = this.sueldoDiarioEmp * this.DiasTrabajados;
    }

    public void setClosed(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
