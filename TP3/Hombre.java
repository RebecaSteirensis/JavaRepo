/**
 * Write a description of class Hombre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Hombre
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    /**
     * Constructor for objects of class Hombre
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad)
    {
        this.nombre = p_nombre;
        this.apellido = p_apellido;
        this.edad = p_edad;
        this.estadoCivil = "Soltero";
        this.esposa = null;
    }
    
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.nombre = p_nombre;
        this.apellido = p_apellido;
        this.edad = p_edad;
        this.estadoCivil = "Soltero";
        this.esposa = p_esposa;
    }
  
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    public Mujer getEsposa() { 
        return this.esposa; 
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    
    private void setEsposa(Mujer p_mujer) { 
        this.esposa = p_mujer; 
    }
    
    private void setEstadoCivil(String p_estadoCivil) { 
        this.estadoCivil = p_estadoCivil; 
    }
    
    public String datos() {
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }

    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }
    
    public void casarseCon(Mujer p_mujer) {
        this.setEsposa(p_mujer);
        this.setEstadoCivil("Casado");
    }
    
    public void divorcio() {
        if (this.esposa != null) {
            this.setEsposa(null);
            this.setEstadoCivil("Divorciado");
        }
    }
    
    public void casadoCon() {
        if (this.esposa != null) {
            System.out.println(this.datos() + " está casado con " + this.getEsposa().datos());
        }
    }
}