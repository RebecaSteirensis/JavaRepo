/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Profesor - Trabajo Practico 5
 */

import java.util.*;

public class Profesor extends Persona
{
    private String titulo;
    private ArrayList<Cargo> cargos;
    
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, ArrayList<Cargo> p_cargos){
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public ArrayList<Cargo> getCargos(){
        return this.cargos;
    }
    
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    
    private void setCargos(ArrayList<Cargo> p_cargos){
        this.cargos = p_cargos;
    }
    
    public boolean agregarCargo(Cargo p_cargo){
        if(this.getCargos().size() >= 3){
            return false;
        } else {
            return this.getCargos().add(p_cargo);
        }
    }
    
    public boolean removerCargo(Cargo p_cargo){
        if(this.getCargos().size() == 1){
            return false;
        } else {
            return this.getCargos().remove(p_cargo);
        }
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.getTitulo());
        this.listarCargos();
        System.out.println("** Sueldo total: " + this.sueldoTotal() + " **");
    }
    
    public void listarCargos(){
        System.out.println("***** Cargos Asignados *****");
        for(Cargo cargo: this.getCargos()){
            cargo.mostrarCargo();
            System.out.println("");
        }
    }
    
    public double sueldoTotal(){
        double sueldoTotal = 0;
        
        for(Cargo cargo: this.getCargos()){
            sueldoTotal += cargo.sueldoDelCargo();
        }
        
        return sueldoTotal;
    }
    
    public String mostrarLinea(){
         return this.getDNI() + " - " + this.nomYApe() + " - Sueldo total: " + this.sueldoTotal();
    }
}