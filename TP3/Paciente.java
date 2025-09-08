/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Paciente - Trabajo Practico 3
 */
public class Paciente
{
    /**
    *Atributos de la Clase 
    */
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;

    /**
    *Constructor con parametros, instancia un objeto
    *@param int p_historia
    *@param String p_nombre
    *@param String p_domicilio
    *@param Localidad p_localidadNacido
    *@param Localidad p_localidadVive
    */
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }
    
    /**
    *Getter, permite obtener el valor del atributo historiaClinica
    *@return devuelve un int
    */
    public int getHistoriaClinica(){
        return this.historiaClinica;
    }
    
    /**
    *Setter, recibe un int y permite modificar el valor del atributo historiaClinica
    *@param int p_historia
    */
    private void setHistoriaClinica(int p_historiaClinica){
        this.historiaClinica = p_historiaClinica;
    }
    
    /**
    *Getter, permite obtener el valor del atributo nombre
    *@return devuelve un String
    */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo nombre
    *@param String p_nombre
    */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
    *Getter, permite obtener el valor del atributo domicilio
    *@return devuelve un String
    */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo domicilio
    *@param String p_domicilio
    */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }

    /**
    *Setter, recibe una Localidad y permite modificar el valor del atributo localidadNacido
    *@param Localidad p_nacido
    */
    private void setNacido(Localidad p_nacido){
        this.localidadNacido = p_nacido;
    }
    
    /**
    *Setter, recibe un Localidad y permite modificar el valor del atributo localidadVive
    *@param Localidad p_vive
    */
    private void setVive(Localidad p_vive){
        this.localidadVive = p_vive;
    }
    
    /**
    *Getter, permite obtener el valor del atributo localidadNacido
    *@return devuelve una Localidad
    */
    public Localidad getNacido(){
        return this.localidadNacido;
    }
    
    /**
    *Getter, permite obtener el valor del atributo localidadVive
    *@return devuelve una Localidad
    */
    public Localidad getVive(){
        return this.localidadVive;
    }
    
    /**
     * Metodo publico,muestra por pantalla los datos del paciente
    */
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: " + this.getNombre() + "\tHistroria Clinica: " + this.getHistoriaClinica() + "\tDomicilio: " + this.getDomicilio());
        System.out.println("Localidad: " + this.getVive().getNombre() + "\tProvincia: " + this.getVive().getProvincia());
    }
    
    /**
     * Metodo publico,forma una cadena con los datos del paciente
     * @return devuelve un String
    */
    public String cadenaDeDatos(){
        return this.getNombre() + "....." + this.getHistoriaClinica() + "....." + this.getDomicilio() + "....." + this.getVive().getNombre() + "-" + this.getVive().getProvincia();
    }
    
}