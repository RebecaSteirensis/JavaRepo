
/**
 * Write a description of class Localidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Localidad {
    private String nombre;
    private String provincia;

    /**
     * Constructor de la clase Localidad
     */
    public Localidad() {

    }

    /**
     * Constructor de la clase Localidad
     * @param p_nombre nombre
     * @param p_provincia provincia
     */
    public Localidad(String p_nombre, String p_provincia) {
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }

    //accessors

    /**
     * Devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Devuelve la provincia
     * @return provincia
     */
    public String getProvincia() {
        return this.provincia;
    }

    private void setProvincia(String p_provincia) {
        this.provincia = p_provincia;
    }

    //metodos

    /**
     * Muestra un string con el nombre de la localidad y la provincia
     * @return nombre + provincia
     */
    public String mostrar(){
        return "Localidad: " + this.getNombre() + "\t" + "Provincia: " + this.getProvincia();
    }
}
