/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Cliente - Trabajo Practico 4
 */
public class Cliente
{
    // Attributes
    /**
     * Atributos de la Clase Cliente (variables de instancia).
     */
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;

    /**
     * Constructor con parametros, instancia un objeto de la clase.
     * @param p_dni
     * @param p_apellido
     * @param p_nombre
     * @param p_importe
     */
    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe)
    {
        this.setNroDNI(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }
    
    //Setters and Getters
    /**
     * Mutador Setter, recibe un tipo de dato entero y permite modificar el estado del atributo nroDNI. 
     * @param p_dni
     */
    private void setNroDNI(int p_nroDNI){
        this.nroDNI = p_nroDNI;
    }
    
    /**
     * Mutador Setter, recibe un objeto de tipo String y permite modificar el estado del atributo apellido.
     * @param p_apellido
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Mutador Setter, recibe un objeto de tipo String y permite modificar el estado del atributo nombre.
     * @param p_nombre
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Mutador Setter, recibe un tipo de dato de coma flotante con doble precisión y permite modificar 
     * el estado del atributo saldo. 
     * @param p_saldo
     */
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo nroDNI.
     * @return retorna un tipo de dato entero.
     */
    public int getNroDNI(){
        return this.nroDNI;
    }
    
    /**
     * Accesor Getter, permite obtener el estado del atributo apellido.
     * @return retorna un objeto de tipo String.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Accesor Getter, permite obtener el estado del atributo nombre.
     * @return retorna un objeto de tipo String.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo saldo.
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
    public double getSaldo(){
        return this.saldo;
    }

    //Methods
    /**
     * Método publico, utiliza los métodos nomYape, getDNI para formar una cadena de texto con sus respectivas 
     * descripciones junto a los estados de los objetos.
     * Utiliza el método getSaldo para formar una cadena de texto con la descripción Saldo: junto al estado del 
     * objeto.
     * Utiliza 1 System.out.println para visualizar por consola el titulo Cliente.
     * Utiliza 2 System.out.println para visualizar por consola la primer cadena de texto.
     * Utiliza 3 System.out.println para visualizar por consola la segunda cadena de texto.
     */
    public void mostrar(){
        System.out.println("- Cliente -");
        System.out.println("Nombre y Apellido: " + getNombre() + " " + getApellido() + " (" + getNroDNI() + ")");
        System.out.println("Saldo: $" + getSaldo());
    }
    
    /**
     * Método publico, recibe por parametro un tipo de dato coma flotante de doble precisión y utiliza el 
     * método setSaldo para modificar (reemplazar) el estado del atributo saldo por el estado recibido por parametro. 
     * @param p_importe
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
    public double nuevoSaldo(double p_importe){
        setSaldo(p_importe);
        
        return getSaldo();
    }
    
    /**
     * Método publico, recibe por parametro un tipo de dato coma flotante de doble precisión y utiliza el método 
     * setSaldo para modificar el estado del atributo saldo mediante una variable local (temporal) al método donde se 
     * suman el estado actual del atributo, a través del método getSaldo, con el estado recibido por parametro.
     * @param p_importe
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
    public double agregarSaldo(double p_importe){
        setSaldo(getSaldo() + p_importe);
        
        return getSaldo();
    }
    
    /**
     * Método publico, utiliza los métodos getApellido y getNombre para formar una única cadena de texto 
     * concatenando los atributos apellido y nombre.
     * @return retorna un objeto de tipo String.
     */
    public String apeYnom(){
        return (getApellido() + " " + getNombre());
    }
    
    /**
     * Método publico, utiliza los métodos getNombre y getApellido para formar una única cadena de texto 
     * concatenando los atributos nombre y apellido.
     * @return retorna un objeto de tipo String.
     */
    public String nomYape(){
        return (getNombre() + " " + getApellido());
    }
        
}