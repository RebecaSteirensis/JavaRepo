
/**
 * Write a description of class Mujer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Mujer {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    /**
     * Constructor for objects of class Mujer
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad) {
        this.nombre = p_nombre;
        this.apellido = p_apellido;
        this.edad = p_edad;
        this.estadoCivil = "Soltera";
        this.esposo = null;
    }
    
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.nombre = p_nombre;
        this.apellido = p_apellido;
        this.edad = p_edad;
        this.estadoCivil = "Soltera";
        this.esposo = p_esposo;
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
    
    public Hombre getEsposo() { 
        return this.esposo; 
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
    
    private void setEsposo(Hombre p_hombre) { 
        this.esposo = p_hombre; 
    }
    
    private void setEstadoCivil(String p_estadoCivil) { 
        this.estadoCivil = p_estadoCivil; 
    }
    
    public String datos() {
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }

    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.estadoCivil);
    }
    
    public void casarseCon(Hombre p_hombre) {
        this.setEsposo(p_hombre);
        this.setEstadoCivil("Casada");
    }
    
    public void divorcio() {
        if (this.esposo != null) {
            this.setEsposo(null);
            this.setEstadoCivil("Divorciada");
        }
    }
    
    public void casadoCon() {
        if (this.esposo != null) {
            System.out.println(this.datos() + " está casada con " + this.getEsposo().datos());
        }
    }

}