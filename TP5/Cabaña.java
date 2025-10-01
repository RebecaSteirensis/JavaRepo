
/**
 * Write a description of class Cabaña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cabaña extends Alojamiento {
    private int nroHabitaciones;

    /**
     * Constructor para crear una instancia de Cabaña.
     *
     * @param p_nombre         Nombre de la cabaña.
     * @param p_precioBase     Precio base por día de alquiler.
     * @param p_diasAlquiler   Días de alquiler de la cabaña.
     * @param p_nroHabitaciones Número de habitaciones de la cabaña.
     */
    public Cabaña(String p_nombre, double p_precioBase, int p_diasAlquiler, int p_nroHabitaciones) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    // Accessors

    /**
     * Obtiene el número de habitaciones de la cabaña.
     *
     * @return número de habitaciones.
     */
    public int getNroHabitaciones() {
        return this.nroHabitaciones;
    }

    /**
     * Establece el número de habitaciones de la cabaña.
     *
     * @param p_nroHabitaciones número de habitaciones.
     */
    private void setNroHabitaciones(int p_nroHabitaciones) {
        this.nroHabitaciones = p_nroHabitaciones;
    }

    // Métodos

    /**
     * Calcula el costo total de la cabaña, incluyendo el precio base y un costo adicional
     * por la cantidad de habitaciones.
     *
     * @return costo total del alquiler de la cabaña.
     */
    @Override
    public double costo() {
        double costoXHabitaciones = this.getNroHabitaciones() * this.getDiasAlquiler() * 30;
        return super.costo() + costoXHabitaciones;
    }

    /**
     * Cuenta la cabaña si el nombre especificado coincide con el tipo "cabaña".
     *
     * @param p_alojamiento nombre o tipo de alojamiento a contar.
     * @return 1 si el nombre coincide con "cabaña", 0 en caso contrario.
     */
    @Override
    public int contar(String p_alojamiento) {
        if (p_alojamiento.toLowerCase().contains("cabaña")) return 1;
        return 0;
    }

    /**
     * Imprime el desglose de los costos del alquiler de la cabaña, incluyendo el costo de alquiler,
     * costo de servicios adicionales, y la cantidad de habitaciones.
     */
    @Override
    public void liquidar() {
        super.liquidar();
        System.out.println("Cabaña con " + this.getNroHabitaciones() + " habitaciones");
        System.out.println("Total: ------> $" + (this.costo() + this.costoServicios()));
    }
}

