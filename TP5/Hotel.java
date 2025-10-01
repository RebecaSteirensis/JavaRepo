
/**
 * Write a description of class Hotel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Hotel extends Alojamiento {
    private String tipoHabitacion;

    /**
     * Constructor para crear una instancia de Hotel.
     *
     * @param p_nombre         Nombre del hotel.
     * @param p_precioBase     Precio base por día de alquiler.
     * @param p_diasAlquiler   Días de alquiler.
     * @param p_tipoHabitacion Tipo de habitación (e.g., "single", "doble").
     */
    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler, String p_tipoHabitacion) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    // Accessors

    /**
     * Obtiene el tipo de habitación del hotel.
     *
     * @return tipo de habitación.
     */
    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }

    /**
     * Establece el tipo de habitación del hotel.
     *
     * @param p_tipoHabitacion tipo de habitación.
     */
    private void setTipoHabitacion(String p_tipoHabitacion) {
        this.tipoHabitacion = p_tipoHabitacion;
    }

    // Métodos

    /**
     * Calcula el costo total del alojamiento en el hotel, que varía según el tipo de habitación.
     *
     * @return costo total de la estadía, incluyendo el costo adicional por tipo de habitación.
     */
    @Override
    public double costo() {
        double costoXDia = 0.0;

        if (this.getTipoHabitacion().toLowerCase().contains("single")) {
            costoXDia = this.getDiasAlquiler() * 20;
            return super.costo() + costoXDia;
        }

        if (this.getTipoHabitacion().toLowerCase().contains("doble")) {
            costoXDia = this.getDiasAlquiler() * 35;
            return super.costo() + costoXDia;
        }

        return super.costo();
    }

    /**
     * Cuenta el alojamiento si el tipo especificado coincide con "hotel".
     *
     * @param p_alojamiento tipo de alojamiento a contar.
     * @return 1 si el tipo coincide con "hotel", 0 en caso contrario.
     */
    @Override
    public int contar(String p_alojamiento) {
        if (p_alojamiento.toLowerCase().contains("hotel")) return 1;
        return 0;
    }

    /**
     * Imprime el desglose de costos del alojamiento en el hotel, incluyendo el costo por tipo de habitación
     * y el costo de servicios adicionales.
     */
    @Override
    public void liquidar() {
        super.liquidar();
        System.out.println("Habitacion " + this.getTipoHabitacion());
        System.out.println("Total: ------> $" + (this.costo() + this.costoServicios()));
    }
}

