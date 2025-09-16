import java.util.*;
/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empleado{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;


    /**
     * Constructor de la clase Empleado
     * @param p_cuil cuil
     * @param p_nombre nombre 
     * @param p_apellido apellido
     * @param p_anio anio
     * @param p_importe importe
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }

    /**
     * Constructor de la clase Empleado
     * @param p_cuil cuil
     * @param p_nombre nombre
     * @param p_apellido apellido
     * @param p_sueldoBasico sueldo basico
     * @param p_fechaIngreso fecha de ingreso
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, Calendar p_fechaIngreso) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_sueldoBasico);
        this.setFechaIngreso(p_fechaIngreso);
    }

    private void setCuil (long p_cuil){
        this.cuil = p_cuil;
    }

    /**
     * Devuelve el cuil
     * @return cuil
     */
    public long getCuil(){
        return this.cuil;
    }
    
    private void setApellido (String p_apellido){
        this.apellido = p_apellido;
    }

    /**
     * Devuelve el apellido
     * @return apellido
     */
    public String getApellido(){
        return this.apellido;
    }
    
    private void setNombre (String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Devuelve el nombre
     * @return nombre
     */
    public String getNombre(){
        return this.nombre;
    }
    
    private void setSueldoBasico (double p_importe){
        this.sueldoBasico = p_importe;
        }

    /**
     * Devuelve el sueldo basico
     * @return sueldo basico
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }

    private void setAnioIngreso(int p_anio){
        this.fechaIngreso = new GregorianCalendar(p_anio, 0, 1);
    }

    public int getAnioIngreso(){
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    /**
     * Devuelve la fecha de ingreso
     * @return fechaIngreso
     */
    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(Calendar p_fechaIngreso) {
        this.fechaIngreso = p_fechaIngreso;
    }

    /**
     * calcula la antiguedad del empleado restando el año actual con el año de ingreso
     */
    public int antiguedad (){
     Calendar fechaHoy = new GregorianCalendar();
      int anioHoy = fechaHoy.get(Calendar.YEAR);  
        
      return anioHoy - this.getFechaIngreso().get(Calendar.YEAR);
    }
    
    /**
     * devuelve el descuento de un 2% al sueldo mas 1500
     */
    private double descuento(){
        return this.getSueldoBasico() * 0.2 + 1500;
    }
    
    /**
     * calcula el adicional dependiendo de los años de antiguedad
     */
    private double adicional(){
        if (this.antiguedad() < 2){
            return this.getSueldoBasico()  * 1.02;
        }else if (this.antiguedad() >= 2 && this.antiguedad() <10){
            return this.getSueldoBasico() * 1.04;
        }else{
            return this.getSueldoBasico() * 1.06;
        }

    }
    
    /**
     * suma al sueldo basico el adicional y le resta el descuento
     */
    public double sueldoNeto(){
        return this.getSueldoBasico() + this.adicional() - this.descuento(); 
    }
    
    /**
     * devuelve un string de la concatenacion de nombre y apelliedo
     */
    public String nomYApe(){
        return this.getNombre() + ", " + this.getApellido();
    }
    
    /**
     * devuelve un string de la concatenacion de apellido y nombre
     */
    public String apeYNom(){
        return this.getApellido() + ", " + this.getNombre();
    }
    
    /**
     * muestra nombre, apellido, cuil, antiguedad, años de servicio y sueldo neto
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.apeYNom());
        System.out.println("CUIL: " + this.getCuil() + "\tAntiguedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: " + this.sueldoNeto());
    }
    
    /**
     * Devuelve cuil, nombre apellido y saldo como String
     */
    public String mostrarLinea(){
        return this.getCuil() + "\t" + this.nomYApe() + "................" + this.sueldoNeto();
    }

    /**
     * Devuelve true si la fecha actual es igual a la fecha de ingreso
     * @return true o false
     */
    public boolean esAniversario(){
        Calendar fechahoy = new GregorianCalendar();
        return fechahoy.get(Calendar.DAY_OF_MONTH) == this.getFechaIngreso().get(Calendar.DAY_OF_MONTH) &&
                fechahoy.get(Calendar.MONTH) == this.getFechaIngreso().get(Calendar.MONTH);
    }
}