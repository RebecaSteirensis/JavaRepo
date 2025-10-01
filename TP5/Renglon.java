/**
 * Write a description of class Renglon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Renglon {
    private int cantidad;
    private double importe;
    private Etiqueta item;

    /**
     * Constructor que inicializa un renglón con la cantidad,
     * el importe y la etiqueta.
     *
     * @param p_cantidad Cantidad de etiquetas.
     * @param p_item Etiqueta correspondiente a este renglón.
     */
    public Renglon(int p_cantidad, Etiqueta p_item) {
        this.setCantidad(p_cantidad);
        this.setItem(p_item);
        this.setImporte(p_item.getCosto());
    }

    //accessors

    /**
     * Obtiene la cantidad de etiquetas en este renglón.
     *
     * @return Cantidad de etiquetas.
     */
    public int getCantidad() {
        return this.cantidad;
    }

    /**
     * Establece la cantidad de etiquetas en este renglón.
     *
     * @param p_cantidad Cantidad de etiquetas.
     */
    private void setCantidad(int p_cantidad) {
        this.cantidad = p_cantidad;
    }

    /**
     * Obtiene el importe total de las etiquetas en este renglón.
     *
     * @return Importe total.
     */
    public double getImporte() {
        return this.importe;
    }

    /**
     * Establece el importe total de las etiquetas en este renglón.
     *
     * @param p_importe Importe total.
     */
    private void setImporte(double p_importe) {
        this.importe = p_importe;
    }

    /**
     * Obtiene la etiqueta correspondiente a este renglón.
     *
     * @return Etiqueta del renglón.
     */
    public Etiqueta getItem() {
        return this.item;
    }

    /**
     * Establece la etiqueta correspondiente a este renglón.
     *
     * @param p_item Etiqueta del renglón.
     */
    private void setItem(Etiqueta p_item) {
        this.item = p_item;
    }
    //metodos

    /**
     * Muestra la información de este renglón, incluyendo la
     * cantidad y detalles de la etiqueta.
     */
    public void mostrar(){
        System.out.println(this.getCantidad() + "Etiquetas de " + this.getItem().toString());
    }
}
