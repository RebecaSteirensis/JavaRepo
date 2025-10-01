
/**
 * Write a description of class Premiun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Premium extends Etiqueta{
    private int colores;

    /**
     * Constructor que inicializa la etiqueta premium con un costo
     * específico y un número de colores.
     *
     * @param p_costo Costo de la etiqueta.
     * @param p_colores Número de colores de la etiqueta.
     */
    public Premium(double p_costo, int p_colores) {
        super(p_costo);
        this.setColores(p_colores);
    }

    //accessors

    /**
     * Obtiene el número de colores de la etiqueta premium.
     *
     * @return Número de colores.
     */
    public int getColores() {
        return this.colores;
    }

    /**
     * Establece el número de colores de la etiqueta premium.
     *
     * @param p_colores Número de colores.
     */
    private void setColores(int p_colores) {
        this.colores = p_colores;
    }

    //metodos

    /**
     * Calcula el precio total de la etiqueta premium según la cantidad
     * solicitada, considerando un costo adicional basado en el número de colores.
     *
     * @param q Cantidad de etiquetas.
     * @return Precio total de las etiquetas.
     */
    @Override
    public double precio(int q) {

        return  (this.getCosto() + this.adicional())  * q;
    }

    /**
     * Calcula el costo adicional basado en el número de colores.
     *
     * @return Costo adicional.
     */
    private double adicional(){

        int colores = this.getColores();
        double costo = this.getCosto();

        if (colores < 2) {

            return 0;

        } else if (colores == 2) {

            return costo * 0.05;

        } else if (colores == 3) {

            return costo * 0.07;

        } else {
            return costo * 0.03 * this.getColores();
        }
    }

    /**
     * Devuelve el tipo de etiqueta como una cadena.
     *
     * @return Tipo de etiqueta.
     */
    @Override
    protected String tipo() {
        return "Premium";
    }

    /**
     * Devuelve una representación en cadena de la etiqueta premium.
     *
     * @return String que describe la etiqueta premium.
     */
    @Override
    public String toString() {
        return super.toString() + " - Colores: " + this.getColores();
    }
}
