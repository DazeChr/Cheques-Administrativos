
package Clases_Modelo;

public class ChequeAdministrativo_HorasExtras_Clase_Derivada extends ChequeAdministrativo_SuperClase {
    private double HorasExtras, PorHoras, variable_TH;
    private int Horas;
    
    public ChequeAdministrativo_HorasExtras_Clase_Derivada() {
    }
    
   public ChequeAdministrativo_HorasExtras_Clase_Derivada(String nombreEmp, String deptoEmp, String puestoEmp, double sueldoDiarioEmp, int xHoras) {
        super(nombreEmp, deptoEmp, puestoEmp, sueldoDiarioEmp);
        this.Horas = xHoras;
    }

    public void SetHoras(int xHoras){
        this.Horas = xHoras;
    }
    
    public void SetPorHorasExtras(){
        this.PorHoras = sueldoDiarioEmp/8;
    }
    
    public void SetHorasExtras(){
        if(Horas >= 1 && Horas <= 9){
            HorasExtras = PorHoras*2;
        }else{
            if(Horas > 9){
                HorasExtras = PorHoras*3;
            }
        }
    }
    
    public void setSueldoDiario(){
       this.sueldoDiarioEmp = HorasExtras * Horas;
    }
}
