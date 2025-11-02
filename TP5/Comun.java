/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Comun - Trabajo Practico 5
 */

public class Comun extends Etiqueta{
    private double plus;

    /**
     * Constructor que inicializa la etiqueta común con un costo
     * específico y un costo adicional.
     *
     * @param p_costo Costo de la etiqueta.
     * @param p_plus Costo adicional (plus) de la etiqueta.
     */
    public Comun(double p_costo, double p_plus) {
        super(p_costo);
        this.setPlus(p_plus);
    }

    //accessors

    /**
     * Obtiene el costo adicional (plus) de la etiqueta común.
     *
     * @return Costo adicional.
     */
    public double getPlus() {
        return this.plus;
    }

    /**
     * Establece el costo adicional (plus) de la etiqueta común.
     *
     * @param p_plus Costo adicional.
     */
    private void setPlus(double p_plus) {
        this.plus = p_plus;
    }

    //metodos

    /**
     * Calcula el precio total de la etiqueta común según la cantidad
     * solicitada, aplicando descuentos y sumando el costo adicional.
     *
     * @param q Cantidad de etiquetas.
     * @return Precio total de las etiquetas.
     */
    @Override
    public double precio(int q) {
        return (q * super.getCosto()) - this.descuento(q) + this.getPlus();
    }

    /**
     * Calcula el descuento basado en la cantidad de etiquetas solicitadas.
     *
     * @param q Cantidad de etiquetas.
     * @return Descuento aplicado al precio total.
     */
    private double descuento(int q){
        double precio = this.getCosto();

        if (q <= 10){

            return 0;

        }else if(q <= 50){

            return precio * 0.02;

        }else if(q <= 100){

            return precio * 0.05;

        }else {
            int porc = (int) q/10;
            return precio * porc * 0.01;
        }
    }

    /**
     * Devuelve el tipo de etiqueta como una cadena.
     *
     * @return Tipo de etiqueta.
     */
    @Override
    protected String tipo() {
        return "Comun";
    }

    /**
     * Devuelve una representación en cadena de la etiqueta común.
     *
     * @return String que describe la etiqueta común.
     */
    @Override
    public String toString() {
        return super.toString() + " - Diseño: " + this.getPlus();
    }
}
