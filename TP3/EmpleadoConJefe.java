import java.util.*;

public class EmpleadoConJefe {
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    // Constructor con jefe explícito
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe) {
        this.setCuil(p_cuil); 
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }

    // Constructor sin jefe (Gerente General)
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
        this.setCuil(p_cuil); 
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
    }

    // Constructor por año de ingreso (Gerente General sin jefe)
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio) {
        this.setCuil(p_cuil); 
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(null);
    }
    
    private void setCuil(long p_cuil) { 
        this.cuil = p_cuil; 
    }

    private void setNombre(String p_nombre) { 
        this.nombre = p_nombre; 
    }
     
    private void setApellido(String p_apellido) { 
        this.apellido = p_apellido; 
    }
    
    private void setSueldoBasico(double p_importe) { 
        this.sueldoBasico = p_importe; 
    }
    
    private void setAnioIngreso(int p_anio) { 
        Calendar admissionYear = new GregorianCalendar(p_anio, 1, 1);
        
        this.fechaIngreso = admissionYear;
    }
    
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    
    public void setJefe(EmpleadoConJefe p_jefe) { 
        this.jefe = p_jefe; 
    }
    
    public long getCuil() { 
        return this.cuil; 
    }
   
    public String getNombre() { 
        return this.nombre; 
    }

    public String getApellido() { 
        return this.apellido; 
    }

    public double getSueldoBasico() { 
        return this.sueldoBasico; 
    }

    public int getAnioIngreso() { 
        return this.fechaIngreso.get(Calendar.YEAR); 
    }

    public EmpleadoConJefe getJefe() { 
        return this.jefe; 
    }

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
     * Método publico, utiliza el método nomYApe para formar una cadena de texto con su respectiva 
     * descripción junto al estado del objeto. 
     * Utiliza los métodos getCUIL y antigüedad para formar una cadena de texto con sus respectivas descripciones 
     * junto a los estados de los objetos. 
     * Utiliza el método sueldoNeto para formar una cadena de texto con su respectiva descripción junto al 
     * estado del objeto, se instancia un objeto de tipo DecimalFormat el cual se utiliza para darle formato de dos 
     * decimales al método sueldoNeto. 
     * Emplea 3 System.out.println para visualizar por consola las tres cadenas de texto.
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
    
    public boolean esAniversario(){
        Calendar hoy = new GregorianCalendar();
        
        if(this.antiguedad() >= 1){
            return true;
        } else{
            return false;
        }
    }
}
