package Clases_Modelo;

public class ChequeAdministrativo_Aguinaldo_Clase_Derivada extends ChequeAdministrativo_SuperClase {

    // Datos de la clase
    private int DiasTrabajados;
    private double Aguinaldo, Dias;
    //private double sueldoQuincenal;

    //Constructor de default
    public ChequeAdministrativo_Aguinaldo_Clase_Derivada() {
    }

    //Manipulando el Constructor
    public ChequeAdministrativo_Aguinaldo_Clase_Derivada(String nombreEmp, String deptoEmp, String puestoEmp, double sueldoDiarioEmp, int DiasTrabajados) {
        super(nombreEmp, deptoEmp, puestoEmp, sueldoDiarioEmp);
        this.DiasTrabajados = DiasTrabajados;
    }

    public void setDiasTrabajados(int xDiasTrabajados) {
        this.DiasTrabajados = xDiasTrabajados;
    }

    public void setSueldoDiario() {

        if (DiasTrabajados <= 365) {
            Dias = Math.round(DiasTrabajados * 0.041);
        }

        this.sueldoDiarioEmp = Dias * sueldoDiarioEmp;
    }
}
