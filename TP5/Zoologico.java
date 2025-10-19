import java.util.*;

/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Zoologico - Trabajo Practico 5
 */

public class Zoologico{
    /**
     * Atributos de la clase
     */
    private String nombre;
    private ArrayList<Visitante> visitantes;
    private HashSet<Persona> personas;

    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombre
    */
    Zoologico(String p_nombre){
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<>());
        this.setPersonas(new HashSet<>());  
    }
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombre
    *@param ArrayList<Visitante> p_visitantes
    */
    
    Zoologico(String p_nombre,ArrayList<Visitante> p_visitantes){
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes); 
    }
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombre
    *@param ArrayList<Visitante> p_visitantes
    *@param HashSet<Persona> p_personas
    */
    Zoologico(String p_nombre,ArrayList<Visitante> p_visitantes,HashSet<Persona> p_personas){
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes); 
        this.setPersonas(p_personas);
    }
    
    /**
    *Setter,recibe un String y permite modificar el valor de el atributo nombre
    *@param String p_nombre
    */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
     private void setPersonas(HashSet<Persona> p_persona){
         this.personas = p_persona;
     }
    /**
    *Setter,recibe un ArrayList y permite modificar el valor de el atributo visitantes
    *@param ArrayList<Visitante> p_visitantes
    */
    private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    public String getNombre(){
        return this.nombre;
    }
    public HashSet<Persona> getPersonas(){
        return this.personas;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo visitantes
    *@return devuelve un ArrayList
    */
    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    }
    
    /**
     * Metodo publico, permite agregar un visitante a la lista de visitantes
     * @param Visitante p_visitante
     * @return devuelve un boolean
    */
    public boolean agregarVisitante(Visitante p_visitante){
        return this.getVisitantes().add(p_visitante);
    }
    
    /**
     * Metodo publico, permite quitar un visitante de la lista de visitantes
     * @param Visitante p_visitante
     * @return devuelve un boolean
    */
    public boolean quitarVisitante(Visitante p_visitante){
        return this.getVisitantes().remove(p_visitante);
    }
    public void nuevoVisitante(Visitante p_visitante){
        if(agregarVisitante(p_visitante) == true){
            System.out.println("Se agrego un nuevo visitante");
        }
    }
    
    /**
     * Metodo publico,muestra por pantalla los datos del visitante
    */
    public void listaTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante) { 
        for (Visitante visitante : this.getVisitantes()) {
            if (visitante.tipoVisitante() == p_tipoVisitante && p_fecha.equals(visitante.getFechaVisita())) { 
                 visitante.mostrar(); 
            } 
         } 
    }
    
    /**
     * Metodo publico,muestra por pantalla los datos del visitante con respecto a la fecha de la visita
    */
    public void listaVisitantePorFecha(Calendar p_fecha,String p_tipoVisitante) {
        System.out.format("Visitantes que asistierón en la fecha %s/%s/%s\n", p_fecha.get(Calendar.DAY_OF_MONTH),
        p_fecha.get(Calendar.MONTH) + 1, p_fecha.get(Calendar.YEAR));
        for (Visitante visitante : this.getVisitantes()){
            visitante.listarPorFecha(p_fecha,p_tipoVisitante);
        } 
    }
    
     /**
     * Metodo publico, devuelve la recaudacion total
     * @param Calendar p_fechaDesde
     * @param Calendar p_fechaHasta
     * @return devuelve un double
    */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta) {
        double recaudacion = 0;
        for (Visitante visitante : this.getVisitantes()) {
            int posteriorFecha = visitante.getFechaVisita().compareTo(p_fechaDesde);
            int anteriorFecha = visitante.getFechaVisita().compareTo(p_fechaHasta);
            if (posteriorFecha >= 0 && anteriorFecha <= 0) {
                if (visitante.getClass().getName() == "Delegacion") {
                    Delegacion Delegacion = (Delegacion) visitante;
                    recaudacion += Delegacion.entrada();
                } else {
                    recaudacion += visitante.entrada();
                }
            } 
        } 
        return recaudacion; 
    }
    
    public HashSet<Persona> listarPersonasQueVisitaronElZoo(){
        for(Persona personas:this.getPersonas()){
            personas.mostrar();
        }
        return personas;
    }  
}
