
/**
 * Write a description of class Curso here.
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
   
   public Curso(String p_nombre){
       this.setNombre( p_nombre);
       this.setAlumnos(new HashMap<>());
   }
   
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
   
   
}