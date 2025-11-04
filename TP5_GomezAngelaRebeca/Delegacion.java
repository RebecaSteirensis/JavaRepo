import java.util.*;

/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Delegacion - Trabajo Practico 5
 */

public class Delegacion extends Visitante
{
    /**
    *Atributos de la Clase 
    */
    private HashSet<Persona> persona;
    private ArrayList<Individuo> integrantes;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombre
    *@param Calendar p_fecha
    *@param ArrayList<Individuo> p_integrantes
    */
    public Delegacion(String p_nombre,Calendar p_fecha,ArrayList<Individuo> p_integrantes){
        super(p_nombre,p_fecha);
        this.setIntegrantes(p_integrantes);
    }
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombre
    *@param Calendar p_fecha
    *@param Individuo p_individuo
    */
    public Delegacion(String p_nombre,Calendar p_fecha,Individuo p_individuo){
        super(p_nombre,p_fecha);
        this.setIntegrantes(new ArrayList<Individuo>());
        this.inscribirIndividuo(p_individuo);
    }
    
    /**
    *Setter,recibe un ArrayList y permite modificar el valor de el atributo integrantes
    *@param ArrayList<Individuo> p_integrantes
    */
    private void setIntegrantes(ArrayList<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    
    
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
    *Getter, permite obtener el valor de el atributo integrantes
    *@return devuelve un ArrayList
    */
    public ArrayList<Individuo> getIntegrantes(){
        return this.integrantes;
    }
    
    /**
     * Metodo publico, permite agregar un individuo a la lista de individuo
     * @param Individuo p_individuo
    */
    public boolean agregarIndividuo(Individuo p_individuo){
        return this.getIntegrantes().add(p_individuo);
    }
    
    /**
     * Metodo publico, permite quitar un individuo a la lista de individuo
     * @param Individuo p_individuo
    */
    public boolean quitarIntegrante(Individuo p_individuo){
        if(this.cantidadDeIntegrantes() > 1){
            return this.getIntegrantes().remove(p_individuo);
        }
        return false;
    }
    
    /**
     * Metodo publico, devuelve la cantidad de integrantes
     * @return devuelve un int
    */
    public int cantidadDeIntegrantes(){
        return this.getIntegrantes().size();
    }
    
    /**
     * Metodo publico, muestra por pantalla los datos de la persona
    */
    public void mostrar(){
        this.listarPersonas();
    }
    
    /**
     * Metodo publico, inscribe un individuo a la delegacion
    */
    public void inscribirIndividuo(Individuo p_individuo){
        if(agregarIndividuo(p_individuo)){
            System.out.println("Se inscribio un nuevo integrante");
        }
    }
    
    /**
     * Metodo publico, calcula el valor de la entrada
     * @return devuelve un double
    */
     public double entrada(){
         double totalEntrada = 0;
         double descuento = totalEntrada * 0.10;
         
         for(Individuo individuos:this.getIntegrantes()){
             totalEntrada+= individuos.entrada() - descuento;
         }
         return totalEntrada;
     }
     
    /**
     * Metodo publico, Lista por fecha los visitantes
    */
     public void listarPorFecha(Calendar p_fecha,String p_visitante ){
       
          if(super.getFechaVisita().equals(p_fecha)&& p_visitante == this.tipoVisitante()){
              this.mostrar();
          }
     }
     
         /**
     * Metodo publico, Lista a las Personas
    */
     public HashSet<Persona> listarPersonas(){
         for(Persona persona: this.getPersona()){
            persona.mostrar();
         }
        return persona;
     }
      /**
     * Metodo publico,devuelve una cadena que indica que tipo de visitante es
     * @return devuelve un String
    */
     public String tipoVisitante(){
       return "Delegacion";         
     }    
}