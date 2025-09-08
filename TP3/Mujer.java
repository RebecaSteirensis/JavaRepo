/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Mujer - Trabajo Practico 3
 */
class Mujer {
    /**
     * Atributos de la clase
    */
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    /**
    *Constructor con parametros, instancia un objeto
    *@param String p_nombre
    *@param String p_apellido
    *@param int p_edad
    */
    public Mujer(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }
    
    /**
    *Constructor con parametros, instancia un objeto
    *@param String p_nombre
    *@param String p_apellido
    *@param int p_edad
    *@param Hombre p_esposo
    */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(p_esposo);
    }
    
    /**
    *Getter, retorna el valor del atributo nombre
    *@return devuelve un String
    */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
    *Getter, retorna el valor del atributo apellido
    *@return devuelve un String
    */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
    *Getter, retorna el valor del atributo edad
    *@return devuelve un int
    */
    public int getEdad(){
        return this.edad;
    }
    
    /**
    *Getter, retorna el valor del atributo estadoCivil
    *@return devuelve un String
    */
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    /**
    *Getter, retorna el valor del atributo esposo
    *@return devuelve un Hombre
    */
    public Hombre getEsposo() { 
        return this.esposo; 
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo nombre
    *@param String p_nombre
    */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo apellido
    *@param String p_apellido
    */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
    *Setter, recibe un int y permite modificar el valor del atributo edad
    *@param int p_edad
    */
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    
    /**
    *Setter, recibe un Hombre y permite modificar el valor del atributo esposo
    *@param Hombre p_esposo
    */
    private void setEsposo(Hombre p_hombre) { 
        this.esposo = p_hombre; 
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo estadoCivil
    *@param String p_estadoCivil
    */
    private void setEstadoCivil(String p_estadoCivil) { 
        this.estadoCivil = p_estadoCivil; 
    }
    
    /**
     * Metodo publico, forma una cadena con los datos de la mujer
     * @return devuelve un String
    */
    public String datos() {
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }

    /**
     * Metodo publico, muestra por pantalla los datos y el estado civil de la mujer
    */
    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.estadoCivil);
    }
    
    /**
     * Metodo publico, recibe por parametro un Hombre y le asigna como esposo a la mujer
     * @param Hombre p_hombre
    */
    public void casarseCon(Hombre p_hombre) {
        this.setEsposo(p_hombre);
        this.setEstadoCivil("Casada");
    }
    
    /**
     * Metodo publico, divorcia a la pareja
    */
    public void divorcio() {
        if (this.esposo != null) {
            this.setEsposo(null);
            this.setEstadoCivil("Divorciada");
        }
    }
    
    /**
     * Metodo publico,muestra por pantalla los datos del hombre y con quien esta casado
    */
    public void casadaCon() {
        if (this.esposo != null) {
            System.out.println(this.datos() + " está casada con " + this.getEsposo().datos());
        }
    }

}