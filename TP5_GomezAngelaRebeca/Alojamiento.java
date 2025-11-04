/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Abstracta Alojamiento - Trabajo Practico 5
 */

import java.util.ArrayList;
public abstract class Alojamiento {
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;

    /**
     * Constructor que inicializa un alojamiento sin servicios.
     *
     * @param p_nombre       Nombre del alojamiento.
     * @param p_precioBase   Precio base por día de alquiler.
     * @param p_diasAlquiler Días de alquiler del alojamiento.
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(new ArrayList<Servicio>());
    }

    /**
     * Constructor que inicializa un alojamiento con servicios.
     *
     * @param p_nombre       Nombre del alojamiento.
     * @param p_precioBase   Precio base por día de alquiler.
     * @param p_diasAlquiler Días de alquiler del alojamiento.
     * @param p_servicios    Lista de servicios adicionales disponibles.
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(p_servicios);
    }

    // Accessors

    /**
     * Obtiene el nombre del alojamiento.
     *
     * @return nombre del alojamiento.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del alojamiento.
     *
     * @param p_nombre nombre del alojamiento.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Obtiene el precio base por día de alquiler.
     *
     * @return precio base.
     */
    public double getPrecioBase() {
        return this.precioBase;
    }

    /**
     * Establece el precio base por día de alquiler.
     *
     * @param p_precioBase precio base.
     */
    private void setPrecioBase(double p_precioBase) {
        this.precioBase = p_precioBase;
    }

    /**
     * Obtiene la cantidad de días de alquiler.
     *
     * @return días de alquiler.
     */
    public int getDiasAlquiler() {
        return this.diasAlquiler;
    }

    /**
     * Establece la cantidad de días de alquiler.
     *
     * @param p_diasAlquiler días de alquiler.
     */
    private void setDiasAlquiler(int p_diasAlquiler) {
        this.diasAlquiler = p_diasAlquiler;
    }

    /**
     * Obtiene la lista de servicios adicionales disponibles.
     *
     * @return lista de servicios.
     */
    public ArrayList<Servicio> getServicios() {
        return this.servicios;
    }

    /**
     * Establece la lista de servicios adicionales.
     *
     * @param p_servicios lista de servicios adicionales.
     */
    private void setServicios(ArrayList<Servicio> p_servicios) {
        this.servicios = p_servicios;
    }

    // Métodos

    /**
     * Agrega un servicio adicional al alojamiento.
     *
     * @param p_servicio servicio a agregar.
     * @return true si se agregó exitosamente, false en caso contrario.
     */
    public boolean agregarServicio(Servicio p_servicio) {
        return this.getServicios().add(p_servicio);
    }

    /**
     * Quita un servicio adicional del alojamiento.
     *
     * @param p_servicio servicio a quitar.
     * @return true si se quitó exitosamente, false en caso contrario.
     */
    public boolean quitarServicio(Servicio p_servicio) {
        return this.getServicios().remove(p_servicio);
    }

    /**
     * Método abstracto que contará alojamientos según un criterio específico definido
     * en clases derivadas.
     *
     * @param p_alojamiento criterio de conteo.
     * @return cantidad de alojamientos según el criterio.
     */
    public abstract int contar(String p_alojamiento);

    /**
     * Calcula el costo del alquiler del alojamiento sin servicios.
     *
     * @return costo total del alquiler.
     */
    public double costo() {
        return this.getPrecioBase() * this.getDiasAlquiler();
    }

    /**
     * Muestra los servicios adicionales y sus precios.
     */
    public void listarServicios() {
        for (Servicio unServicio : this.getServicios()) {
            System.out.println(unServicio.getDescripcion() + ": $" + unServicio.getPrecio());
        }
    }

    /**
     * Calcula el costo total de todos los servicios adicionales.
     *
     * @return costo total de los servicios.
     */
    public double costoServicios() {
        double total = 0.0;
        for (Servicio unServicio : this.getServicios()) {
            total += unServicio.getPrecio();
        }
        return total;
    }

    /**
     * Imprime el desglose del costo total del alojamiento, incluyendo el costo de alquiler
     * y de cada servicio adicional.
     */
    public void liquidar() {
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + " días: $" + this.costo() + " alquiler");
        this.listarServicios();
    }
}

