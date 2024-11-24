package Clases_Modelo;

public class ChequeAdministrativo_Liquidacion_Clase_Derivada extends ChequeAdministrativo_SuperClase {

    private double PrimaVacacional, Aguinaldo, Liquidacion, variable_Indem, variable_PA;
    private int variableAT;

    public ChequeAdministrativo_Liquidacion_Clase_Derivada() {
    }

    public ChequeAdministrativo_Liquidacion_Clase_Derivada(String nombreEmp, String deptoEmp, String puestoEmp, double sueldoDiarioEmp, int xvariableAT, double xPrimaVacacional, double xAguinaldo) {
        super(nombreEmp, deptoEmp, puestoEmp, sueldoDiarioEmp);
        this.variableAT = xvariableAT;
        this.PrimaVacacional = xPrimaVacacional;
        this.Aguinaldo = xAguinaldo;
    }

    public void setPV(double xPrimaVacacional) {
        this.PrimaVacacional = xPrimaVacacional;
    }

    public void setAg(double xAguinaldo) {
        this.Aguinaldo = xAguinaldo;
    }

    public void SetYearsWorked(int xvariableAT) {
        this.variableAT = xvariableAT;
    }

    public void setVariable_PA() {
        if (variableAT >= 1) {
            if (sueldoDiarioEmp > 345.74) {
                variable_PA = 345.74 * (12 * variableAT);
            } else {
                variable_PA = sueldoDiarioEmp * (12 * variableAT);
            }
        }
    }

    public void SetIndem() {
        variable_Indem = sueldoDiarioEmp * 90;
    }

    public void setSueldoDiario() {
        this.sueldoDiarioEmp = variable_Indem + variable_PA + PrimaVacacional + Aguinaldo;
    }

}
