/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Escuela - Trabajo Practico 3
 */
public class Escuela
{
    /**
    *Atributos de la Clase 
    */
    private String nombre;
    private String domicilio;
    private String director;

    /**
    *Constructor con parametros, instancia un objeto
    *@param String p_nombre
    *@param String p_domicilio
    *@param String p_director
    */
    public Escuela(String p_nombre, String p_domicilio, String p_director)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }

    /**
    *Setter, recibe un String y permite modificar el valor del atributo nombre
    *@param String p_nombre
    */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo domicilio
    *@param String p_domicilio
    */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo director
    *@param String p_director
    */
    private void setDirector(String p_director){
        this.director = p_director;
    }
    
    /**
    *Getter, permite obtener el valor del atributo nombre
    *@return devuelve un String
    */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
    *Getter, permite obtener el valor del atributo domicilio
    *@return devuelve un String
    */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
    *Getter, permite obtener el valor del atributo director
    *@return devuelve un String
    */
    public String getDirector(){
        return this.director;
    }
    
    /**
    *Metodo publico,muestra por pantalla los datos de la escuela y de el docente
    */
    public void imprimirRecibo(Docente p_docente)
    {
        System.out.println("Escuela: " + this.getNombre() + "\tDomicilio: " + this.getDomicilio() + "\tDirector: " + this.getDirector());
        System.out.println("-----------------------------------------------------");
        System.out.println("Docente: " + p_docente.getNombre() + 
                            "\nSueldo: ----------\t$" + p_docente.calcularSueldo() + 
                            "\nSueldo Basico: ----------\t$" + p_docente.getSueldoBasico() +
                            "\nAsignacion Familiar: ----------\t$" + p_docente.getAsignacionFamiliar());
    }
}