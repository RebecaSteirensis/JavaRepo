
/**
 * Write a description of class Etiqueta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class Etiqueta {
    private double costo;

    /**
     * Constructor que inicializa la etiqueta con un costo específico.
     *
     * @param p_costo Costo de la etiqueta.
     */
    public Etiqueta(double p_costo) {
        this.setCosto(p_costo);
    }

    //accessors

    /**
     * Obtiene el costo de la etiqueta.
     *
     * @return Costo de la etiqueta.
     */
    public double getCosto() {
        return this.costo;
    }

    /**
     * Establece el costo de la etiqueta.
     *
     * @param p_costo Costo de la etiqueta.
     */
    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }

    //metodos

    /**
     * Calcula el precio total de la etiqueta según la cantidad solicitada.
     *
     * @param q Cantidad de etiquetas.
     * @return Precio total.
     */
    public abstract double precio(int q);

    /**
     * Devuelve el tipo de etiqueta como una cadena.
     *
     * @return Tipo de etiqueta.
     */
    protected abstract String tipo();

    /**
     * Devuelve una representación en cadena de la etiqueta.
     *
     * @return String que describe la etiqueta.
     */
    public String  toString(){
        return "tipo " + this.tipo() + " - Costo: $" + this.getCosto();
    }
}
