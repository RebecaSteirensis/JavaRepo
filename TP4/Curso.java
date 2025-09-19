
/**
 * Permite manejar un registro de un curso.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.HashMap;
import java.util.Map;
public class Curso
{
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
   private void setNombre(String p_nombre){
       this.nombre = p_nombre;
   }
   
   private void setAlumnos(HashMap p_alumnos){
       this.alumnos = p_alumnos;
   }
   
   public String getNombre(){
       return this.nombre;
   }
   
   public HashMap<Integer, Alumno> getAlumnos(){
       return this.alumnos;
   }
   
   
   //metodos
   /**Metodo que permite inscribir un Alumno al curso*/
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }
    /**Metodo que permite quitar un Alumno  del curso*/
    public Alumno quitarAlumno(int p_lu){
        return this.getAlumnos().remove(p_lu);
    }
    /**Metodo que permite saber la cantidad de alumnos de la coleccion*/
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    /**Metodo retorna true si el numero de libreta del Alumno se encuentra en la coleccion*/
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    /**Metodo retorna true si el nombre de libreta del Alumno se encuentra en la coleccion*/
    public boolean estaInscripto(Alumno p_alumno){
        return  this.getAlumnos().containsValue(p_alumno);
    }
    /**Metodo busca si el numero de libreta del Alumno está en la coleccion*/
    public Alumno buscarAlumno(int p_lu){
        return this.getAlumnos().get(p_lu);
    }
    /**Metodo que imprime el promedio del alumno*/
    public void imprimirPromedioDelAlumno(int p_lu){
        System.out.println("Promedio: " + this.getAlumnos().get(p_lu).promedio());
    }
    /**Metodo imprime numero de libreta y nombre de alumnos*/
    public void mostrarInscriptos(){
        System.out.println("****-- Cantidad de inscriptos: " + this.cantidadDeAlumnos());
        for (Map.Entry<Integer, Alumno> entryAlumnos: this.getAlumnos().entrySet()){
            System.out.println(entryAlumnos.getKey() + "\t\t" + entryAlumnos.getValue().apeYNom());
        }
    }
   
}