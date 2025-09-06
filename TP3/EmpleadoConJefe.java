
/**
 * Write a description of class EmpleadoConJefe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EmpleadoConJefe {
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    // Constructor con jefe explícito
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe) {
        this.cuil = p_cuil;
        this.apellido = p_apellido;
        this.nombre = p_nombre;
        this.sueldoBasico = p_importe;
        this.fechaIngreso = p_fecha;
        this.jefe = p_jefe;
    }

    // Constructor sin jefe (Gerente General)
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
        this(p_cuil, p_apellido, p_nombre, p_importe, p_fecha, null);
    }

    // Constructor por año de ingreso (Gerente General sin jefe)
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio) {
        this(p_cuil, p_apellido, p_nombre, p_importe, new GregorianCalendar(p_anio, Calendar.JANUARY, 1), null);
    }

    // Constructor por año con jefe
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio, EmpleadoConJefe p_jefe) {
        this(p_cuil, p_apellido, p_nombre, p_importe, new GregorianCalendar(p_anio, Calendar.JANUARY, 1), p_jefe);
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
        this.fechaIngreso.set(Calendar.YEAR, p_anio); 
    }
    
    public void setJefe(EmpleadoConJefe p_jefe) { 
        this.jefe = p_jefe; 
    }
    
    public long getCuil() { 
        return cuil; 
    }
   
    public String getNombre() { 
        return nombre; 
    }

    public String getApellido() { 
        return apellido; 
    }

    public double getSueldoBasico() { 
        return sueldoBasico; 
    }

    public int getAnioIngreso() { 
        return fechaIngreso.get(Calendar.YEAR); 
    }

    public EmpleadoConJefe getJefe() { 
        return jefe; 
    }

    public int antiguedad() {
        Calendar hoy = Calendar.getInstance();
        return hoy.get(Calendar.YEAR) - fechaIngreso.get(Calendar.YEAR);
    }

    public double descuento() {
        return 0; 
    }

    public double adicional() {
        return 0;
    }

    public double sueldoNeto() {
        return sueldoBasico + adicional() - descuento();
    }

    // Formateo de nombres
    public String nomYape() {
        return nombre + " " + apellido;
    }

    public String apeYnom() {
        return apellido + ", " + nombre;
    }

    // Método que devuelve la línea de información
    public String mostrarLinea() {
        String jefeStr = (jefe == null) ? "GERENTE GENERAL" : jefe.apeYnom();
        return "Nombre y Apellido: " + nomYape() + "\n" +
               "CUIL: " + cuil + " Antigüedad: " + antiguedad() + " años de servicio\n" +
               "Sueldo Neto: $ " + sueldoNeto() + "\n" +
               "Responde a: " + jefeStr + "\n";
    }

    public void mostrarPantalla() {
        System.out.println(mostrarLinea());
    }

    public void emitirPermisoSalida() {
        String firma = (jefe == null) ? "Firmado: GERENTE GENERAL" : "Firmado: " + jefe.nomYape();
        System.out.println("Permiso de salida otorgado a " + nomYape() + "\n" + firma);
    }
}
