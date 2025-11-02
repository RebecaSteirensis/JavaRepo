import java.util.ArrayList;
/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Gerencia - Trabajo Practico 5
 */

public class Gerencia {
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;

    /**
     * Constructor que inicializa la Gerencia con un nombre y una lista vacía de alojamientos alquilados.
     *
     * @param p_nombre Nombre de la gerencia.
     */
    public Gerencia(String p_nombre) {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList<Alojamiento>());
    }

    /**
     * Constructor que inicializa la Gerencia con un nombre y una lista de alojamientos alquilados.
     *
     * @param p_nombre               Nombre de la gerencia.
     * @param p_alojamientosAlquilados Lista de alojamientos alquilados.
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientosAlquilados) {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_alojamientosAlquilados);
    }

    // Accessors

    /**
     * Obtiene el nombre de la gerencia.
     *
     * @return Nombre de la gerencia.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre de la gerencia.
     *
     * @param p_nombre Nombre de la gerencia.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Obtiene la lista de alojamientos alquilados.
     *
     * @return Lista de alojamientos alquilados.
     */
    public ArrayList<Alojamiento> getAlojamientosAlquilados() {
        return this.alojamientosAlquilados;
    }

    /**
     * Establece la lista de alojamientos alquilados.
     *
     * @param p_alojamientosAlquilados Lista de alojamientos alquilados.
     */
    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alojamientosAlquilados) {
        this.alojamientosAlquilados = p_alojamientosAlquilados;
    }

    // Métodos

    /**
     * Agrega un alojamiento a la lista de alojamientos alquilados.
     *
     * @param p_alojamiento Alojamiento a agregar.
     * @return true si el alojamiento fue agregado exitosamente, false en caso contrario.
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento) {
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }

    /**
     * Elimina un alojamiento de la lista de alojamientos alquilados.
     *
     * @param p_alojamiento Alojamiento a eliminar.
     * @return true si el alojamiento fue eliminado exitosamente, false en caso contrario.
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento) {
        return this.getAlojamientosAlquilados().remove(p_alojamiento);
    }

    /**
     * Cuenta los alojamientos de un tipo específico en la lista de alojamientos alquilados.
     *
     * @param p_tipoAlojamiento Tipo de alojamiento a contar (e.g., "cabaña", "hotel").
     * @return Número de alojamientos del tipo especificado.
     */
    public int contarAlojamiento(String p_tipoAlojamiento) {
        int contador = 0;
        for (Alojamiento unAlojamiento : this.getAlojamientosAlquilados()) {
            contador += unAlojamiento.contar(p_tipoAlojamiento);
        }
        return contador;
    }

    /**
     * Realiza la liquidación de cada alojamiento, mostrando los costos individuales.
     */
    public void liquidar() {
        for (Alojamiento unAlojamiento : this.getAlojamientosAlquilados()) {
            unAlojamiento.liquidar();
            System.out.println();
        }
    }

    /**
     * Muestra el nombre de la gerencia, realiza la liquidación detallada de los alojamientos
     * y cuenta la cantidad de cada tipo de alojamiento.
     */
    public void mostrarLiquidacion() {
        System.out.println("Gerencia: " + this.getNombre());
        System.out.println("Liquidación-------------------");
        this.liquidar();
        System.out.println();
        System.out.println("Alojamiento tipo Cabaña ----> " + this.contarAlojamiento("cabaña"));
        System.out.println("Alojamiento tipo Hotel ----> " + this.contarAlojamiento("hotel"));
    }
}