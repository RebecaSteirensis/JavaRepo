/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Localidad - Trabajo Practico 4
 */
public class Localidad
{
    /**
    *Atributos de la Clase 
    */
    private String nombre;
    private String provincia;

    /**
    *Constructor con parametros, instancia un objeto
    *@param String p_nombre
    *@param String p_provincia
    */
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo nombre
    *@param String p_nombre
    */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo provincia
    *@param String p_provincia
    */
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    /**
    *Getter, permite obtener el valor del atributo nombre
    *@return devuelve un String
    */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
    *Getter, permite obtener el valor del atributo provincia
    *@return devuelve un String
    */
    public String getProvincia(){
        return this.provincia;
    }

    /**
     * Metodo publico,forma una cadena con el nombre de la localidad y la provincia
     * @return devuelve un String
    */
    public String mostrar(){
        return "Localidad: " + this.getNombre() + "\tProvincia: " + this.getProvincia();
    }
}