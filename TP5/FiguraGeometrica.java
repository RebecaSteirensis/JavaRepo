
/**
 * Write a description of class FiguraGeometrica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class FiguraGeometrica {
    private Punto origen;

    /**
     * Constructor de la clase FiguraGeometrica.
     *
     * @param p_origen el punto que representa el origen de la figura
     */
    public FiguraGeometrica(Punto p_origen){
        this.setOrigen(p_origen);
    }
    //accessors
    public Punto getOrigen() {
        return this.origen;
    }

    private void setOrigen(Punto p_origen) {
        this.origen = p_origen;
    }

    //metodos
    /**
     * Método abstracto que debe ser implementado por las subclases para retornar el nombre de la figura.
     *
     * @return el nombre de la figura geométrica
     */
    public abstract String nombreFigura();

    /**
     * Método abstracto que debe ser implementado por las subclases para calcular la superficie de la figura.
     *
     * @return la superficie de la figura geométrica
     */
    public abstract double superficie();

    /**
     * Muestra en pantalla el nombre de la figura y su superficie.
     */
    public void mostrarSuperficie(){
        System.out.println(this.nombreFigura());
        System.out.println(this.superficie());
    }
}