import java.util.HashMap;
import java.util.Map;

/**
 * Permite administrar los empleados de un comercio.
 * 
 * @author
 */

public class Comercio {
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    
    
     /**
     * Constructor que inicializa los atributos por parametro.
     * Y inicializa una coleccion con el HashMap
     * 
     * @param p_nombre String;
     */
    public Comercio(String p_nombre) {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }
    
    /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nombre String;
     * @param p_empleados HashMap<Long, Empleado>;
     */

    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }

    private void setEmpleados(HashMap<Long, Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    /**Metodo que permite el alta de un empleado*/
    //recordamos que trabaja con clave,valor
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }
    /**Metodo que permite quitar un empleado a traves del cuil*/
    public Empleado bajaEmpleado(long p_cuil){
        return this.getEmpleados().remove(p_cuil);
    }
     /**Metodo que permite saber la cantidad de empleados que hay en la coleccion*/
    public int cantidadEmpleado(){
        return this.getEmpleados().size();
    }
    /**Metodo retorna true si la clave se encuentra en la coleccion*/
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    /**Metodo permite buscar al empleado por si numero de cuil*/
    public Empleado buscarEmpleado(long p_cuil){
        return this.getEmpleados().get(p_cuil);
    }
    /**Metodo que imprime el sueldo Neto de un empleado*/
    public void sueldoNeto(long p_cuil){
        System.out.println(this.getEmpleados().get(p_cuil).sueldoNeto());
    }
 
    /**Metodo nomina recorre el HashMap e imprime el cuil, nombre y sueldo*/
    public void nomina(){
        System.out.println("**** Nomina de empleados de " + this.getNombre() + " ****");
        for (Map.Entry<Long, Empleado> entry : this.getEmpleados().entrySet()){
            Empleado unEmpleado = entry.getValue();
            System.out.println(unEmpleado.mostrarLinea());
        }
    }
}