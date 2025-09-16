
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class Persona
{
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;


    public Persona(int p_nroDni, String p_nombre, String p_apellido, int p_anio) {
        this.setDni(p_nroDni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(new GregorianCalendar(p_anio,0 , 1));
    }

    /**
     * Constructor de objetos para la clase Persona
     * @param p_dni el dni de la persona
     * @param p_nombre el nombre
     * @param p_apellido el apellido
     * @param p_fechaNacimiento el año de nacimiento
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fechaNacimiento)
    {
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fechaNacimiento);
    }

    //accessors
    private void setDni(int p_dni){
        this.nroDni = p_dni;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }

    private void setAnioNacimiento(int p_anio){
        this.fechaNacimiento = new GregorianCalendar(p_anio, 0 ,1);
    }


    /**
     * Devuelve el dni
     */
    public int getDni(){
        return this.nroDni;
    }
    /**
     * Devuelve el nombre
     */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * Devuelve el apelldio
     */
    public String getApellido(){
        return this.apellido;
    }
    /**
     * Devuelve el año de nacimiento
     */
    public int getAnioNacimiento(){
        return this.fechaNacimiento.get(Calendar.YEAR);
    }

    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    private void setFechaNacimiento(Calendar p_fechaNacimiento){
        this.fechaNacimiento = p_fechaNacimiento;
    }
    
    //metodos
    /**
     * Devuelve la edad restando el año actual al año de nacimiento
     */
    public int edad (){
        Calendar fecha = new GregorianCalendar();
        int anioHoy =  fecha.get(Calendar.YEAR);
        return anioHoy - this.getAnioNacimiento();
    }
    /**
     * Devuelve el nombre con el apellido
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    /**
     * Devuelve el apellido con el nombre
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    /**
     * Muestra nombre, apellido, dni y edad
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("DNI: " + this.getDni() + " Edad: " + this.edad() + " anios");
    }

    /**
     * Devuelve true si la fecha actual es igual a la fecha de nacimiento
     * @return true o false
     */
    public boolean esCumpleanios(){
        Calendar fecha = new GregorianCalendar();
        return fecha.get(Calendar.DATE) == getFechaNacimiento().get(Calendar.DATE);
    }

}