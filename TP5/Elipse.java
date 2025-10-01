
/**
 * Write a description of class Elipse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Elipse extends FiguraGeometrica{

    private double sEjeMayor;
    private double sEjeMenor;

    /**
     * Constructor de la clase Elipse
     * @param p_sEjeMayor eje mayor
     * @param p_sEjeMenor eje menor
     * @param p_centro centro
     */
    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro){
        super(p_centro);
        this.setEjeMayor(p_sEjeMayor);
        this.setEjeMenor(p_sEjeMenor);

    }

    //accessors
    public double getEjeMayor() {
        return this.sEjeMayor;
    }

    private void setEjeMayor(double p_sEjeMayor) {
        this.sEjeMayor = p_sEjeMayor;
    }

    public double getEjeMenor() {
        return this.sEjeMenor;
    }

    private void setEjeMenor(double p_sEjeMenor) {
        this.sEjeMenor = p_sEjeMenor;
    }

    //metodos

    /**
     * Devuelve un String de "***** Elipse *****"
     * @return el nombre de la figura
     */
    public String nombreFigura(){
        return "***** Elipse *****";
    }

    /**
     * Imprime las caracteristicas de la Elipse
     */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro: " + this.getOrigen().coordenadas() + " - Semieje Mayor: " + this.getEjeMayor() + " - Semieje Menor: " + this.getEjeMenor());
        System.out.println("Superficie: " + this.superficie());
    }

    /**
     * Devuelve un double que calcula la superficie multiplicando pi * eje mayor * eje menor
     * @return superficie
     */
    public double superficie(){
        double r = this.getEjeMayor();
        double s = this.getEjeMenor();
        return Math.PI * r * s;
    }

    /**
     * Desplaza el centro de su posicion actual
     * @param p_dx X
     * @param p_dy Y
     */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }

    /**
     * Compara la distancia  con otra elipse pasada por parametro y devuelve su valor en double
     * @param otraElipse elipse
     * @return distancia
     */
    public double distanciaA(Elipse otraElipse){
        return this.getOrigen().distanciaA(otraElipse.getOrigen());
    }

    /**
     * Compara las superficie con otra elipse y devuelve el mayor de los 2 como un objeto
     * @param otraElipse elipse
     * @return Elipse
     */
    public Elipse elMayor(Elipse otraElipse){
        if(this.superficie() > otraElipse.superficie()){
            return this;
        }else {
            return otraElipse;
        }
    }

}
