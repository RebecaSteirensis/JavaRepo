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
    
    public void casarseCon(Mujer m) {
        this.setEsposa(m);
        this.setEstadoCivil("Casado");
        m.confirmarMatrimonio(this); // delega a la mujer
    }
    
    public void confirmarMatrimonio(Mujer m) {
        this.setEsposa(m);
        this.setEstadoCivil("Casado");
    }
    
    public void divorcio() {
        if (this.esposa != null) {
            Mujer ex = this.esposa;
            this.setEsposa(null);
            this.setEstadoCivil("Divorciado");
            ex.confirmarDivorcio(); // delega a la mujer
        }
    }
    
    public void confirmarDivorcio() {
        this.setEsposa(null);
        this.setEstadoCivil("Divorciado");
    }
    
    public void casadoCon() {
        if (esposa != null) {
            System.out.println(datos() + " está casado con " + esposa.datos());
        }
    }
    
    public Mujer getEsposa() { return esposa; }
    
    private void setEsposa(Mujer m) { this.esposa = m; }
    private void setEstadoCivil(String estado) { this.estadoCivil = estado; }
}