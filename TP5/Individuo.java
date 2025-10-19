import java.util.*;

/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Individuo - Trabajo Practico 5
 */

public class Individuo extends Visitante
{
   /**
    *Atributos de la Clase 
    */
    private  HashSet<Persona> persona;

     /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param Calendar p_fecha
    *@param HashSet<Persona> p_persona
    */
    public Individuo(String p_nombre,Calendar p_fechaVisita,HashSet<Persona> p_persona)
    {
       super(p_nombre,p_fechaVisita);
       this.setPersona(p_persona);
    }
    
    /**
    *Setter,recibe una Persona y permite modificar el valor de el atributo persona
    *@param Persona p_persona
    */
    private void setPersona(HashSet<Persona> p_persona){
        this.persona = p_persona;
    }
    
     /**
    *Getter, permite obtener el valor de el atributo persona
    *@return devuelve una Persona
    */
    public HashSet<Persona> getPersona(){
        return this.persona;
    }
    
    
    /**
     * Metodo publico, muestra por pantalla los datos de la persona
    */
    public   void  mostrar(){
        this.listarPersonas();
    }
    
       /**
    *Metodo publico,devuelve el valor de la entrada
    *@return devuelve un double
    */
     public   double entrada(){
         return 10.00;
     }
     
       /**
     * Metodo publico, Lista por fecha los visitantes
    */
     public   void  listarPorFecha(Calendar p_fecha,String p_visitante ){
       
          if(super.getFechaVisita().equals(p_fecha)&& p_visitante == this.tipoVisitante()){
              this.mostrar();
          }
     }
      /**
     * Metodo publico,devuelve una cadena que indica que tipo de visitante es
     * @return devuelve un String
    */
     public  String tipoVisitante(){
       return "Individuo";         
     }
     
      
       /**
     * Metodo publico, Lista a las Personas
    */
     public   HashSet<Persona>  listarPersonas(){
         for(Persona persona: this.getPersona()){
            persona.mostrar();
         }
        return persona;
     }  
}