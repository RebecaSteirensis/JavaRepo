/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Docente - Trabajo Practico 3
 */
public class Docente
{
    /**
    *Atributos de la Clase 
    */
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    /**
    *Constructor con parametros, instancia un objeto
    *@param String p_nombre
    *@param String p_grado
    *@param double p_sueldoBasico
    *@param double p_asignacionFamiliar
    */
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacionFamiliar)
    {
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacionFamiliar(p_asignacionFamiliar);
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo nombre
    *@param String p_nombre
    */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo grado
    *@param String p_grado
    */
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    
    /**
    *Setter, recibe un double y permite modificar el valor del atributo sueldoBasico
    *@param double p_sueldoBasico
    */
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    
    /**
    *Setter, recibe un double y permite modificar el valor del atributo asignacionFamiliar
    *@param double p_asignacionFamiliar
    */
    private void setAsignacionFamiliar(double p_asignacionFamiliar){
        this.asignacionFamiliar = p_asignacionFamiliar;
    }
    
    /**
    *Getter, permite obtener el valor del atributo nombre
    *@return devuelve un String
    */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
    *Getter, permite obtener el valor del atributo grado
    *@return devuelve un String
    */
    public String getGrado(){
        return this.grado;
    }
    
    /**
    *Getter, permite obtener el valor del atributo sueldoBasico
    *@return devuelve un double
    */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /**
    *Getter, permite obtener el valor del atributo asignacionFamiliar
    *@return devuelve un double
    */
    public double getAsignacionFamiliar(){
        return this.asignacionFamiliar;
    }

    /**
     * Metodo publico,calcula el sueldo de docente
    */
    public double calcularSueldo(){
        return getSueldoBasico() + getAsignacionFamiliar();
    }
}