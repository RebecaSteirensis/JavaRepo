
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Triangulo extends  FiguraGeometrica{
    private double base;
    private double altura;

    /**
     * Constructor de la clase Triangulo.
     *
     * @param p_origen el punto de origen del triángulo
     * @param p_base la longitud de la base del triángulo
     * @param p_altura la longitud de la altura del triángulo
     */
    public Triangulo(Punto p_origen, double p_base, double p_altura) {
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }

    public double getBase() {
        return this.base;
    }

    private void setBase(double p_base) {
        this.base = p_base;
    }

    public double getAltura() {
        return this.altura;
    }

    private void setAltura(double p_altura) {
        this.altura = p_altura;
    }

    /**
     * Devuelve el nombre de la figura, que en este caso es "Triángulo".
     *
     * @return el nombre "****** Triángulo ******"
     */
    public String nombreFigura(){
        return "****** Triángulo ******";
    }

    /**
     * Calcula la superficie del triángulo usando la fórmula (base * altura) / 2.
     *
     * @return la superficie del triángulo
     */
    public double superficie(){
        return (this.getBase() * this.getAltura()) / 2;
    }
}
