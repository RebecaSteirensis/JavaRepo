/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Hombre - Trabajo Practico 3
 */
class Hombre
{
    /**
     * Atributos de la clase
    */
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    /**
    *Constructor con parametros, instancia un objeto
    *@param String p_nombre
    *@param String p_apellido
    *@param int p_edad
    */
    public Hombre(String p_nombre, String p_apellido, int p_edad)
    {
        this.nombre = p_nombre;
        this.apellido = p_apellido;
        this.edad = p_edad;
        this.estadoCivil = "Soltero";
        this.esposa = null;
    }
    
    /**
    *Constructor con parametros, instancia un objeto
    *@param String p_nombre
    *@param String p_apellido
    *@param int p_edad
    *@param Mujer p_esposa
    */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.nombre = p_nombre;
        this.apellido = p_apellido;
        this.edad = p_edad;
        this.estadoCivil = "Soltero";
        this.esposa = p_esposa;
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
    *Getter, retorna el valor del atributo esposa
    *@return devuelve una Mujer
    */
    public Mujer getEsposa() { 
        return this.esposa; 
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
    *Setter, recibe una Mujer y permite modificar el valor del atributo esposa
    *@param Mujer p_mujer
    */
    private void setEsposa(Mujer p_mujer) { 
        this.esposa = p_mujer; 
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo estadoCivil
    *@param String p_estadoCivil
    */
    private void setEstadoCivil(String p_estadoCivil) { 
        this.estadoCivil = p_estadoCivil; 
    }
    
    /**
     * Metodo publico, forma una cadena con los datos del hombre
     * @return devuelve un String
    */
    public String datos() {
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }

    /**
     * Metodo publico, muestra por pantalla los datos y el estado civil del hombre
    */
    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }
    
    /**
     * Metodo publico, recibe por parametro una Mujer y le asigna como esposa al Hombre
     * @param Mujer p_mujer
    */
    public void casarseCon(Mujer p_mujer) {
        this.setEsposa(p_mujer);
        this.setEstadoCivil("Casado");
    }
    
    /**
     * Metodo publico, divorcia a la pareja
    */
    public void divorcio() {
        if (this.esposa != null) {
            this.setEsposa(null);
            this.setEstadoCivil("Divorciado");
        }
    }
    
    /**
     * Metodo publico,muestra por pantalla los datos del hombre y con quien esta casado
    */
    public void casadoCon() {
        if (this.esposa != null) {
            System.out.println(this.datos() + " está casado con " + this.getEsposa().datos());
        }
    }
}