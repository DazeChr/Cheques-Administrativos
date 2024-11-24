package Clases_Modelo;

public class ChequeAdministrativo_PrimaVacacional_Clase_Derivada extends ChequeAdministrativo_SuperClase{
    
   private double PrimaVacacional;
    private int variableAT, Dias;
    
    public ChequeAdministrativo_PrimaVacacional_Clase_Derivada() {
    }
    
    //Manipulando el Constructor
    public ChequeAdministrativo_PrimaVacacional_Clase_Derivada(String nombreEmp, String deptoEmp, String puestoEmp, double sueldoDiarioEmp, int xvariableAT) {
        super(nombreEmp, deptoEmp, puestoEmp, sueldoDiarioEmp);
        this.variableAT = xvariableAT;
    }

    public void SetYearsWorked(int xvariableAT) {
        this.variableAT = xvariableAT;
    }
    
    public void setDias(){
        if(variableAT == 1){
            Dias = 6;
        }else{
            if(variableAT == 2){
                Dias = 8;
            }else{
                if(variableAT == 3){
                    Dias = 10;
                }else{
                    if(variableAT == 4){
                        Dias = 12;
                    }else{
                        if(variableAT >= 5 && variableAT <= 9){
                            Dias = 14;
                        }else{
                            if(variableAT >= 10 && variableAT <= 14){
                                Dias = 16;
                            }else{
                                if(variableAT >= 15 && variableAT <= 19){
                                    Dias = 18;
                                }else{
                                    if(variableAT >= 20 && variableAT <= 24){
                                        Dias = 20;
                                    }else{
                                        if(variableAT>= 25 && variableAT <= 29){
                                            Dias = 22;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void  setSueldoDiario(){
        this.sueldoDiarioEmp = sueldoDiarioEmp*(Dias*0.25);
    }    
}
