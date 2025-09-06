
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
    public Mujer(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estadoCivil = "Soltera";
        this.esposo = null;
    }

     public String datos() {
        return nombre + " " + apellido + " de " + edad + " años";
    }

    public void mostrarEstadoCivil() {
        System.out.println(datos() + " - " + estadoCivil);
    }
    
    public void casarseCon(Hombre h) {
        this.setEsposo(h);
        this.setEstadoCivil("Casada");
        h.confirmarMatrimonio(this); // delega al hombre
    }

    public void confirmarMatrimonio(Hombre h) {
        this.setEsposo(h);
        this.setEstadoCivil("Casada");
    }
    
    public void divorcio() {
        if (this.esposo != null) {
            Hombre ex = this.esposo;
            this.setEsposo(null);
            this.setEstadoCivil("Divorciada");
            ex.confirmarDivorcio(); // delega al hombre
        }
    }

    public void confirmarDivorcio() {
        this.setEsposo(null);
        this.setEstadoCivil("Divorciada");
    }
    
    public void casadoCon() {
        if (esposo != null) {
            System.out.println(datos() + " está casada con " + esposo.datos());
        }
    }

    public Hombre getEsposo() { return esposo; }
    
    private void setEsposo(Hombre h) { this.esposo = h; }
    private void setEstadoCivil(String estado) { this.estadoCivil = estado; }
}