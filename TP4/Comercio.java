import java.util.*;

/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Comercio - Trabajo Practico 4
 */
public class Comercio {
    /**
     * Atributos de la clase
    */
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

    /**
    *Getter, permite obtener el valor de el atributo nombre
    *@return devuelve un String
    */
    public String getNombre() {
        return this.nombre;
    }

    /**
    *Setter,recibe un String por parametro y permite modificar el valor de el atributo nombre
    *@param String p_nombre
    */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
    *Getter, permite obtener el valor de el atributo empleados
    *@return devuelve un HashMap
    */
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }

    /**
    *Setter,recibe un hashMap por parametro y permite modificar el valor de el atributo empleados
    *@param HashMap p_empleados
    */
    private void setEmpleados(HashMap<Long, Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    /**
     * Metodo publico, agrega un empleado a la lista de empleados
     * @param Empleado p_empleado
    */
    //recordamos que trabaja con clave,valor
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }
    
    /**
     * Metodo publico, quita un empleado de lista de empleados
     * @param long cuil
     * @return devuelve un Empleado
    */  
    public Empleado bajaEmpleado(long p_cuil){
        return this.getEmpleados().remove(p_cuil);
    }
    
    /**
     * Metodo publico, calcula la cantidad de empleados
     * @return devuelve un entero
    */
    public int cantidadEmpleado(){
        return this.getEmpleados().size();
    }
    
    /**
     * Metodo publico, averigua si la persona es empleado
     * @param long p_cuil
     * @return devuelve un boolean
    */
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    
    /**
     * Metodo publico, busca un empleado
     * @param long p_cuil
     * @return devuelve un Empleado
    */
    public Empleado buscarEmpleado(long p_cuil){
        return this.getEmpleados().get(p_cuil);
    }
    
    /**
     * Metodo publico, muestra el sueldo neto de el empleado
     * @param long p_cuil
    */
    public void sueldoNeto(long p_cuil){
        System.out.println(this.getEmpleados().get(p_cuil).sueldoNeto());
    }
 
    /**
     * Metodo publico, muestra la nomina de empleados
    */
    public void nomina(){
        System.out.println("**** Nomina de empleados de " + this.getNombre() + " ****");
        for (Map.Entry<Long, Empleado> entry : this.getEmpleados().entrySet()){
            Empleado unEmpleado = entry.getValue();
            System.out.println(unEmpleado.mostrarLinea());
        }
    }
}