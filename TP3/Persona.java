
/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Persona - Trabajo Practico 2
 */

//Imports
import java.util.*;
import java.util.Calendar.*;
import java.util.GregorianCalendar.*;

public class Persona
{
    /**
     * Atributos de la Clase Persona (variables de instancia).
     */
    //Attributes
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaDeNacimiento;

    /**
     * Constructor con parametros, instancia un objeto de la clase.
     * @param p_dni
     * @param p_nombre
     * @param p_apellido
     * @param p_anio
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
       this.setDNI(p_dni);
       this.setNombre(p_nombre);
       this.setApellido(p_apellido);
       this.setAnioNacimiento(p_anio);
    }
    
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }

    //Setters and Getters
     /**
     * Mutador Setter, recibe un tipo de dato entero y permite modificar el estado del atributo nroDni. 
     * @param p_dni
     */
    private void setDNI(int p_dni)
    {
      this.nroDni = p_dni;
    }
    
    /** 
     * Mutador Setter, recibe un objeto de tipo String y permite modificar el estado del atributo nombre.
     * @param p_nombre
     */
    private void setNombre(String p_nombre)
    {
      this.nombre = p_nombre;
    }
    
    /**
     * Mutador Setter, recibe un objeto de tipo String y permite modificar el estado del atributo apellido.
     * @param p_apellido
     */
    private void setApellido(String p_apellido)
    {
      this.apellido = p_apellido;
    }
    
    /**
     * Mutador Setter, recibe un tipo de dato entero y permite modificar el estado del atributo anioNacimiento.
     * @param p_anio
     */
    private void setAnioNacimiento(int p_anio)
    {
        Calendar fecha = new GregorianCalendar(p_anio, 01, 01);
        this.fechaDeNacimiento = fecha;
    }
    
    private void setFechaNacimiento(Calendar p_fecha)
    {
        this.fechaDeNacimiento = p_fecha;
    }
    
    /**
     * Accesor Getter, permite obtener el estado del atributo nroDni.
     * @return retorna un tipo de dato entero. 
     */
    public int getDNI(){
        return this.nroDni;
    }
    
    /**
     * Accesor Getter, permite obtener el estado del atributo nombre.
     * @return retorna un objeto de tipo String.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo apellido.
     * @return retorna un objeto de tipo String.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo anioNacimiento.
     * @return retorna un tipo de dato entero.
     */
    public int getAnioNacimiento(){
        return this.fechaDeNacimiento.get(Calendar.YEAR);
    }
    
    public Calendar getFechaNacimiento(){
        return this.fechaDeNacimiento;
    }
    
    //Methods
    /**
     * Método publico, instancia un objeto de tipo Calendar el cual se utiliza para asignar a la variable, 
     * local al método (temporal), anioHoy el año actual, luego se utiliza el método getAnioNacimiento para calcular 
     * la edad de la persona mediante una resta entre el año actual y el año de nacimiento.
     * @return retorna un tipo de dato entero.
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return anioHoy - getAnioNacimiento();
    }
    
    /**
     * Método publico, utiliza los métodos getNombre y getApellido para formar una única cadena de texto 
     * concatenando nombre y apellido.
     * @return retorna un objeto de tipo String.
     */
    public String nomYApe(){
        return getNombre() + " " + getApellido();
    }
    
     /**
     * Método publico, utiliza los métodos getApellido y getNombre para formar una única cadena de texto 
     * concatenando los atributos apellido y nombre.
     * @return retorna un objeto de tipo String.
     */
    public String ApeYNom(){
        return getApellido() + " " + getNombre();
    }
    
    /**
     * Método publico, utiliza el método nomYApe para formar una cadena de texto con la descripción Nombre
     * y Apellido junto al estado del objeto.
     * Utiliza el método getDNI para formar una cadena de texto con la descripción DNI junto al estado del 
     * objeto.
     * Utiliza el método edad para formar una cadena de texto con la descripción Edad junto al estado del 
     * objeto.
     * Utiliza 1 System.out.println para visualizar por consola la primer cadena de texto.
     * Utiliza 1 System.out.print para visualizar por consola la segunda cadena de texto.
     * Utiliza 1 System.out.printl para visualizar por consola la tercer cadena de texto.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + getNombre() + " " + getApellido());
        System.out.println("DNI: " + getDNI() + "\t Edad: " + edad() + " años");
    }
    
    public boolean esCumpleanios() {
        Calendar hoy = new GregorianCalendar();
        
        if((hoy.get(Calendar.DAY_OF_MONTH) == this.fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) && hoy.get(Calendar.MONTH) == this.fechaDeNacimiento.get(Calendar.MONTH))){
            return true;
            } else {
                return false;
            }
    }
}