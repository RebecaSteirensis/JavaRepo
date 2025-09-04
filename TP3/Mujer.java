
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
        this.esposo = h;
        this.estadoCivil = "Casada";
        h.setEsposa(this);
        h.setEstadoCivil("Casado");
    }

    public void divorcio() {
        if (this.esposo != null) {
            this.esposo.setEsposa(null);
            this.esposo.setEstadoCivil("Divorciada");
            this.esposo = null;
        }
        this.estadoCivil = "Divorciada";
    }

    public void casadoCon() {
        if (esposo != null) {
            System.out.println(datos() + " está casada con " + esposo.datos());
        }
    }

    // Setters auxiliares
    public void setEsposo(Hombre h) { this.esposo = h; }
    public void setEstadoCivil(String estado) { this.estadoCivil = estado; }
}