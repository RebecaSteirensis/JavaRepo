/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Servicio - Trabajo Practico 5
 */

public class Servicio {
    private String descripcion;
    private double precio;

    public Servicio(String p_descripcion, double p_precio) {
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }

    //accessors

    public String getDescripcion() {
        return this.descripcion;
    }

    private void setDescripcion(String p_descripcion) {
        this.descripcion = p_descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    private void setPrecio(double p_precio) {
        this.precio = p_precio;
    }
}
