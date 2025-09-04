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
    public Hombre(String nombre, String apellido, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estadoCivil = "Soltero";
        this.esposa = null;
    }
  
    public String datos() {
        return nombre + " " + apellido + " de " + edad + " años";
    }
    
    public void mostrarEstadoCivil(){
        System.out.println(datos() + " - " + estadoCivil);
    }
    
    public void casarseCon (Mujer m) {
        this.esposa = m;
        this.estadoCivil = "casado";
        m.setEsposo(this);
        m.setEstadoCivil("casada");
    }
    
    public void divorcio() {
        if (this.esposa != null) {
            this.esposa.setEsposo(null);
            this.esposa.setEstadoCivil("Divorciada");
            this.esposa = null;
        }
        this.estadoCivil = "Divorciado";
    }
    
    public void casadoCon() {
        if (esposa != null) {
            System.out.println(datos() + "está casado con " + esposa.datos());
        }
    }
    
    public void setEsposa(Mujer m) { this.esposa = m; }
    public void setEstadoCivil(String estado) { this.estadoCivil = estado; }
}