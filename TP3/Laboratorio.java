/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Laboratorio - Trabajo Practico 3
 */
public class Laboratorio
{
    /**
     * Atributos de la Clase Laboratorio (variables de instancia).
     */
    // Attributes
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor con parametros, instancia un objeto de la clase.
     * @param p_nombre
     * @param p_domicilio
     * @param p_telefono
     * @param p_compraMin
     * @param p_diaEnt
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }
    
    /**
     * Constructor con parametros, instancia un objeto de la clase.
     * @param p_nombre
     * @param p_domicilio
     * @param p_telefono
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
    }
    
    //Setters and Getters
    /**
     * Mutador Setter, recibe un objeto de tipo String y permite modificar el estado del atributo nombre.
     * @param p_nombre
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Mutador Setter, recibe un objeto de tipo String y permite modificar el estado del atributo domicilio.
     * @param p_domicilio
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    /**
     * Mutador Setter, recibe un objeto de tipo String y permite modificar el estado del atributo telefono.
     * @param p_telefono
     */
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    
    /**
     * Mutador Setter, recibe un tipo de dato entero y permite modificar el estado del atributo compraMinima. 
     * @param p_compraMin
     */
    private void setCompraMinima(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    
    /**
     * Mutador Setter, recibe un tipo de dato entero y permite modificar el estado del atributo diaEntrega. 
     * @param p_diaEnt
     */
    private void setDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    
    /**
     * Accesor Getter, permite obtener el estado del atributo nombre.
     * @return retorna un objeto de tipo String.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Accesor Getter, permite obtener el estado del atributo domicilio.
     * @return retorna un objeto de tipo String.
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * Accesor Getter, permite obtener el estado del atributo telefono.
     * @return retorna un objeto de tipo String.
     */
    public String getTelefono(){
        return this.telefono;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo compraMinima.
     * @return retorna un tipo de dato entero.
     */
    public int getCompraMinima(){
        return this.compraMinima;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo compraMinima.
     * @return retorna un tipo de dato entero.
     */
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    
    //Methods
    /**
     * Método publico, recibe por parametro un tipo de dato entero y utiliza el método setCompraMinima para 
     * modificar el estado del atributo compraMinima por el estado recibido por parametro. 
     * @param p_compraMin
     */
    public void nuevaCompraMinima(int p_compraMin)
    {
        this.setCompraMinima(p_compraMin);
    }
    
    /**
     * Método publico, recibe por parametro un tipo de dato entero y utiliza el método setDiaEntrega para 
     * modificar el estado del atributo diaEntrega por el estado recibido por parametro. 
     * @param p_diaEnt
     */
    public void nuevoDiaEntrega(int p_diaEnt){
        this.setDiaEntrega(p_diaEnt);
    }
    
    /**
     * Método publico, utiliza los métodos getNombre, getDomicilio y getTelefono para formar una cadena de texto 
     * con sus respectivas descripciones junto a los estados de los objetos.
     * @return retorna un objeto de tipo String.
     */
    public String mostrar(){
        return "Laboratorio: " + this.getNombre() + "\nDomicilio: " + this.getDomicilio() + " - Telefono: " + this.getTelefono();
    }
}