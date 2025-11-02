/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Cargo - Trabajo Practico 5
 */

import java.util.*;

public class Cargo
{
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;
    
    public Cargo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia){
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDeDocencia(p_horasDeDocencia);
    }
    
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    
    public int getHorasDeDocencia(){
        return this.horasDeDocencia;
    }
    
    private void setNombreCargo(String p_nombreCargo){
        this.nombreCargo = p_nombreCargo;
    }
    
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    
    private void setAnioIngreso(int p_anioIngreso){
        this.anioIngreso = p_anioIngreso;
    }
    
    private void setHorasDeDocencia(int p_horasDeDocencia){
        this.horasDeDocencia = p_horasDeDocencia;
    }
    
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return anioHoy - this.getAnioIngreso();
    }
    
    private double adicionalXAntiguedad(){
        if(this.antiguedad() == 0){
            return this.getSueldoBasico();
        } else{
            return this.getSueldoBasico() * 0.01 * this.antiguedad();
        }
    }
    
    public double sueldoDelCargo(){
        return this.getSueldoBasico() + this.adicionalXAntiguedad();
    }
    
    public void mostrarCargo(){
        System.out.println(this.getNombreCargo() + " - Sueldo Basico: " + this.getSueldoBasico() + " - Sueldo Cargo: " + this.sueldoDelCargo() + " - Antiguedad: " + this.antiguedad());
        System.out.println("Horas Docencia: " + this.getHorasDeDocencia());
    }
}