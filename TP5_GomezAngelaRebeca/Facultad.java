/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Facultad - Trabajo Practico 5
 */

import java.util.*;

public class Facultad
{
    private String nombre;
    private ArrayList<Profesor> profesores;
    
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesores){
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }
    
    public Facultad(String p_nombre, Profesor p_profesor){
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList<Profesor>());
        this.agregarProfesor(p_profesor);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setProfesores(ArrayList<Profesor> p_profesores){
        this.profesores = p_profesores;
    }
    
    public boolean agregarProfesor(Profesor p_profesor){
        return this.getProfesores().add(p_profesor);
    }
    
    public boolean quitarProfesor(Profesor p_profesor){
        if(this.getProfesores().size() == 1){
            return false;
        } else {
            return this.getProfesores().remove(p_profesor);
        }
    }
    
    public void nominaProfesores(){
        System.out.println("************** Nomina Facultad: " + this.getNombre());
        System.out.println("------------------------");

        for(Profesor profesor: this.getProfesores()){
            System.out.println(profesor.mostrarLinea());
            
        }
        
        System.out.println("------------------------");
        System.out.println("Total a pagar: $" + this.totalAPagar());
    }
    
    public double totalAPagar(){
        double total = 0;
        
        for(Profesor profesor: this.getProfesores()){
            total += profesor.sueldoTotal();
        }
        
        return total;
    }
    
    public void listarProfesorCargos(){
        System.out.println("***** Detalle de Profesores y cargos de Facultad: " + this.getNombre() + " ******");
        
        for(Profesor profesor: this.getProfesores()){
            profesor.mostrar();
        }
        System.out.println("Hay " + this.getProfesores().size() + " profesores");
    }
}