/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase EmpleadoConJefe - Trabajo Practico 3
 */

import java.util.*;

public class EmpleadoConJefe {
    /**
     * Atributos de la clase
    */
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param long p_cuil
    **@param String p_apellido
    *@param String p_nombre
    *@param double p_importe
    *@param Calendar p_fecha
    *@param EmpleadoConJefe p_jefe;
    */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe) {
        this.setCuil(p_cuil); 
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }

    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param long p_cuil
    *@param String  p_apellido
    *@param String p_nombre
    *@param double p_importe
    *@param Calendar p_fecha
    */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
        this.setCuil(p_cuil); 
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
    }

    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param long p_cuil
    *@param String  p_apellido
    *@param String p_nombre
    *@param double p_importe
    *@param int p_anio
    */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio) {
        this.setCuil(p_cuil); 
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(null);
    }
    
    /**
    *Setter,recibe un long por parametro y permite modificar el valor de el atributo cuil
    *@param double p_cuil
    */
    private void setCuil(long p_cuil) { 
        this.cuil = p_cuil; 
    }

    /**
    *Setter,recibe un String por parametro y permite modificar el valor de el atributo nombre
    *@param String p_nombre
    */
    private void setNombre(String p_nombre) { 
        this.nombre = p_nombre; 
    }
    
    /**
    *Setter,recibe un String por parametro y permite modificar el valor de el atributo apellido
    *@param String p_apellido
    */
    private void setApellido(String p_apellido) { 
        this.apellido = p_apellido; 
    }
    
    /**
    *Setter,recibe un double por parametro y permite modificar el valor de el atributo sueldoBasico
    *@param double p_importe
    */
    private void setSueldoBasico(double p_importe) { 
        this.sueldoBasico = p_importe; 
    }
    
    /**
    *Setter,recibe un int por parametro y permite modificar el valor de el atributo fechaIngreso
    *@param int p_anio
    */
    private void setAnioIngreso(int p_anio) { 
        Calendar admissionYear = new GregorianCalendar(p_anio, 1, 1);
        
        this.fechaIngreso = admissionYear;
    }

    /**
    *Setter,recibe un Calendar por parametro y permite modificar el valor de el atributo p_fecha
    *@param Calendar p_importe
    */
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    
    /**
    *Setter,recibe un EmpleadoConJefe por parametro y permite modificar el valor de el atributo p_jefe
    *@param EmpleadoConJefe p_importe
    */
    public void setJefe(EmpleadoConJefe p_jefe) { 
        this.jefe = p_jefe; 
    }
    
    /**
    *Getter, permite obtener el valor de el atributo cuil
    *@return devuelve un long
    */
    public long getCuil() { 
        return this.cuil; 
    }
   
    /**
    *Getter, permite obtener el valor de el atributo nombre
    *@return devuelve un String
    */
    public String getNombre() { 
        return this.nombre; 
    }

    /**
    *Getter, permite obtener el valor de el atributo apellido
    *@return devuelve un String
    */
    public String getApellido() { 
        return this.apellido; 
    }

    /**
    *Getter, permite obtener el valor de el atributo sueldoBasico
    *@return devuelve un double
    */
    public double getSueldoBasico() { 
        return this.sueldoBasico; 
    }

    /**
    *Getter, permite obtener el valor de el atributo fechaIngreso
    *@return devuelve un int
    */
    public int getAnioIngreso() { 
        return this.fechaIngreso.get(Calendar.YEAR); 
    }

    /**
    *Getter, permite obtener el valor de el atributo jefe
    *@return devuelve un EmpleadoConJefe
    */
    public EmpleadoConJefe getJefe() { 
        return this.jefe; 
    }
    
    /**
    *Getter, permite obtener el valor de el atributo fechaIngreso
    *@return devuelve un Calendar
    */
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }

    /**
    *Metodo publico, calcula la antiguedad del empleado
    *@return devuelve un int
    */
    public int antiguedad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return anioHoy - this.getAnioIngreso();
        
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
    *Metodo publico, muestra por pantalla los datos del empleado y el apellido y nombre del jefe si es que responde a alguno
    */
    public void mostrarPantalla(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("CUIL: " + getCuil() + " Antigüedad: " + antiguedad() + " años de servicio");
        System.out.println("Sueldo neto: $" + sueldoNeto());
        if(this.getJefe() == null){
            System.out.println("GERENTE GENERAL");
        }else{
            System.out.println("Responde a: " + this.getJefe()); 
        }
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
    
    /**
     * Calcula si el dia actual es el aniversario de ingreso del empleado
     * @return devuelve un booleano
    */
    public boolean esAniversario(){
        Calendar hoy = new GregorianCalendar();
        
        if(this.antiguedad() >= 1){
            return true;
        } else{
            return false;
        }
    }
}
