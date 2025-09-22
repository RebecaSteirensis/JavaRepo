import java.util.*;

/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Curso - Trabajo Practico 4
 */
public class Curso
{
    /**
     * Atributos de la clase
    */
   private String nombre;
   private HashMap <Integer, Alumno> alumnos;
   
   /**
     * Constructor que inicializa los atributos por parametro.
     * Y inicializa una coleccion con el HashMap
     * 
     * @param p_nombre String;
     */
   public Curso(String p_nombre){
       this.setNombre( p_nombre);
       this.setAlumnos(new HashMap<>());
   }
   
   /**
    * Constructor que inicializa los atributos por parametro.
    * 
    * @param p_nombre String;
    * @param p_alumno HashMap<Integer, Alumno>;
    */
   public Curso(String p_nombre, HashMap <Integer,  Alumno> p_alumnos){
       this.setNombre(p_nombre);
       this.setAlumnos(p_alumnos);
   }
   
   //accessors
   /**
    *Setter,recibe un String por parametro y permite modificar el valor de el atributo nombre
    *@param String p_nombre
    */
   private void setNombre(String p_nombre){
       this.nombre = p_nombre;
   }
   
   /**
    *Setter,recibe un HashMap por parametro y permite modificar el valor de el atributo alumnos
    *@param Hashmap<Integer,Alumno> p_alumnos
    */
   private void setAlumnos(HashMap p_alumnos){
       this.alumnos = p_alumnos;
   }
   
   /**
    *Getter, permite obtener el valor de el atributo nombre
    *@return devuelve un String
    */
   public String getNombre(){
       return this.nombre;
   }
   
   /**
    *Getter, permite obtener el valor de el atributo alumnos
    *@return devuelve un HashMap
    */
   public HashMap<Integer, Alumno> getAlumnos(){
       return this.alumnos;
   }
   
   
   //metodos
   /**
     * Metodo publico, agrega un alumno a la lista de alumnos
     * @param Alumno p_alumno
    */
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }
    
   /**
     * Metodo publico, quita un alumno de la lista de alumnos
     * @param int p_lu
     * @return devuelve un Alumno
    */
    public Alumno quitarAlumno(int p_lu){
        return this.getAlumnos().remove(p_lu);
    }
    
   /**
     * Metodo publico, devuelve la cantidad de alumnos
     * @return devuelve un entero
    */
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    
   /**
     * Metodo publico, averigua si un alumno esta inscripto
     * @param int p_lu
     * @return devuelve un boolean
    */
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    
   /**
     * Metodo publico, averigua si un alumno esta inscripto
     * @param Alumno p_alumno
     * @return devuelve un boolean
    */    public boolean estaInscripto(Alumno p_alumno){
        return  this.getAlumnos().containsValue(p_alumno);
    }
    
   /**
     * Metodo publico, busca un alumno
     * @param int p_lu
     * @return devuelve un Alumno
    */
    public Alumno buscarAlumno(int p_lu){
        return this.getAlumnos().get(p_lu);
    }
    
   /**
     * Metodo publico, imprime el promedio del alumno
     * @param int p_lu
    */
    public void imprimirPromedioDelAlumno(int p_lu){
        System.out.println("Promedio: " + this.getAlumnos().get(p_lu).promedio());
    }
    
   /**
     * Muestra por pantalla los datos de los alumnos inscriptos
    */
    public void mostrarInscriptos(){
        System.out.println("****-- Cantidad de inscriptos: " + this.cantidadDeAlumnos());
        for (Map.Entry<Integer, Alumno> entryAlumnos: this.getAlumnos().entrySet()){
            System.out.println(entryAlumnos.getKey() + "\t\t" + entryAlumnos.getValue().apeYNom());
        }
    }
   
}