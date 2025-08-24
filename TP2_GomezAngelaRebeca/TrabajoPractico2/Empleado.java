/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Empleado - Trabajo Practico 2
 */

//Imports
import java.util.*;

public class Empleado
{
    /**
     * Atributos de la Clase Empleado (variables de instancia).
     */
    //Attributes
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    
    /**
     * Constructor con parametros, instancia un objeto de la clase.
     * @param p_cuil
     * @param p_apellido
     * @param p_nombre
     * @param p_importe
     * @param p_anio
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
    {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }
    
    //setters and getters
    /**
     * Mutador Setter, recibe un tipo de dato long y permite modificar el estado del atributo cuil. 
     * @param p_cuil
     */
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    
    /**
     * Mutador Setter, recibe un objeto de tipo String y permite modificar el estado del atributo apellido.
     * @param p_apellido
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Mutador Setter, recibe un objeto de tipo String y permite modificar el estado del atributo nombre.
     * @param p_nombre
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Mutador Setter, recibe un objeto de tipo coma flotante de doble precisión y permite modificar el estado 
     * del atributo sueldoBasico.
     * @param p_importe
     */
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    
    /**
     * Mutador Setter, recibe un tipo de dato entero y permite modificar el estado del atributo anioIngreso. 
     * @param p_anio
     */
    private void setAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo cuil.
     * @return retorna un tipo de dato long.
     */
    public long getCuil(){
        return this.cuil;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo apellido.
     * @return retorna un objeto de tipo String.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo nombre.
     * @return retorna un objeto de tipo String.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo sueldoBasico.
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo anioIngreso.
     * @return retorna un tipo de dato entero.
     */
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    
    //Methods
    /**
     * Método publico, instancia un objeto de tipo Calendar el cual se utiliza para asignar a la variable, 
     * local (temporal) al método, anioHoy el año actual, luego se utiliza el método getAnio para calcular 
     * la antiguedad restando el año actual con el año de Ingreso.
     * @return retorna un tipo de dato entero.
     */ 
    public int antiguedad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return anioHoy - getAnioIngreso();
        
    }
    
    /**
     * Método privado, utiliza el método getSueldo para calcular el descuento que se debe aplicar.
     * Cálculo del descuento = %2 del sueldo basico más $1500.
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
     private double descuento()
    {
        return getSueldoBasico() * 0.2 + 1500;
        
    }
    
    /**
     * Método privado, utiliza los métodos antiguedad y getSueldo para calcular el adicional que se debe 
     * aplicar en base a su antigüedad.
     * Cálculo del adicional=Si antigüedad es menor a 2 años corresponde 2% respecto al sueldo basico.
     *                       Si antigüedad es mayor o igual a 2 años pero menor a 10 años corresponde 4% respecto al sueldo basico.
     *                       Si antigüedad es mayor o igual a 10 años corresponde 6% respecto al sueldo basico.
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
     private double adicional()
    {
        if(antiguedad() < 2){
            return getSueldoBasico() * 0.2;
        }
        
        if(antiguedad() >= 2 && antiguedad() < 10){
            return getSueldoBasico() * 0.4;
        }
        
        else{
            return getSueldoBasico() * 0.6;
        }     
    }
    
    /**
     * Método publico, utiliza los métodos getSueldo, adicional y descuento para  calcular 
     * el sueldo neto, sumando el adicional al sueldo basico menos los descuentos.
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
     public double sueldoNeto()
    {
        return getSueldoBasico() + adicional() - descuento();
    }
    
    /**
     * Método publico, utiliza los métodos getNombre y getApellido para formar una única cadena de texto 
     * concatenando los atributos nombre y apellido.
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
    public String apeYNom(){
        return getApellido() + " " + getNombre();
    }
    
    /**
     * Método publico, utiliza el método nomYApe para formar una cadena de texto con su respectiva 
     * descripción junto al estado del objeto. 
     * Utiliza los métodos getCUIL y antigüedad para formar una cadena de texto con sus respectivas descripciones 
     * junto a los estados de los objetos. 
     * Utiliza el método sueldoNeto para formar una cadena de texto con su respectiva descripción junto al 
     * estado del objeto, se instancia un objeto de tipo DecimalFormat el cual se utiliza para darle formato de dos 
     * decimales al método sueldoNeto. 
     * Emplea 3 System.out.println para visualizar por consola las tres cadenas de texto.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("CUIL: " + getCuil() + " Antigüedad: " + antiguedad() + " años de servicio");
        System.out.println("Sueldo neto: $" + sueldoNeto());
    }
    
    /**
     * Método publico, utiliza los métodos getCUIL, getApellido y getNombre para formar una única cadena de texto 
     * concatenando los atributos cuil, apellido, nombre. Además se emplea el método sueldoNeto, se instancia un 
     * objeto de tipo DecimalFormat el cual se utiliza para darle formato de dos decimales a dicho método.
     * @return retorna un objeto de tipo String.
     */
    public String mostrarLinea(){
        return getCuil() + "\t" + apeYNom() + "......... $" + sueldoNeto(); 
    }
}