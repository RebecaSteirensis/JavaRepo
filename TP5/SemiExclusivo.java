/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase SemiExclusivo - Trabajo Practico 5
 */
public class SemiExclusivo extends Cargo
{
   private int horasDeInvestigacion;
   
   public SemiExclusivo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia, int p_horasDeInvestigacion){
       super(p_nombreCargo, p_sueldoBasico, p_anioIngreso, p_horasDeDocencia);
       this.setHorasDeInvestigacion(p_horasDeInvestigacion);
   }
   
   public int getHorasDeInvestigacion(){
       return this.horasDeInvestigacion;
   }
   
   private void setHorasDeInvestigacion(int p_horasDeInvestigacion){
       this.horasDeInvestigacion = p_horasDeInvestigacion;
   }
   
   public void mostrarCargo(){
       super.mostrarCargo();
       System.out.println("---Cargo de caracter SemiExclusivo----");
       System.out.println("Horas de investigacion: " + this.getHorasDeInvestigacion());
   }
}