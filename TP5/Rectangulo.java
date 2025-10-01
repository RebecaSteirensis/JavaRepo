
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo extends FiguraGeometrica
{
    private double ancho;
    private double alto;

    /**
     * costructor de la clase Rectangulo
     * @param p_origen origen
     * @param p_ancho ancho
     * @param p_alto alto
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto)
    {
        super(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    /**
     * costructor de la clase Rectangulo
     * @param p_ancho ancho
     * @param p_alto alto
     */
    public Rectangulo(double p_ancho, double p_alto)
    {
        super(new Punto(0.0, 0.0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    //accessors
    private void setAncho(double p_ancho)
    {
        this.ancho = p_ancho;
    }
    
    private void setAlto(double p_alto)
    {
        this.alto = p_alto;
    }

    /**
     * Devuelve el ancho
     * @return ancho
     */
    public double getAncho()
    {
        return this.ancho;
    }

    /**
     * Devuelve el Ato
     * @return alto
     */
    public double getAlto()
    {
        return this.alto;
    }


    //metodos

    /**
     * Desplaza el origen usaldo el metodo desplazar de clase Punto
     * @param p_dx dx
     * @param p_dy dy
     */
    public void desplazar(double p_dx, double p_dy)
    {
        this.getOrigen().desplazar(p_dx, p_dy);
    }

    /**
     * Muestra los datos del Rectangulo
     */
    public void caracteristicas()
    {
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen().coordenadas() + " -  Alto: " + this.getAlto() + " -  Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " -  Perimetro: " + this.perimetro());
    }

    /**
     * Calgula y devuelve el perimetro
     * @return alto + ancho
     */
    public double perimetro()
    {
        return (this.getAlto() +  this.getAncho()) * 2;
    }

    /**
     * Calcula y devuelve la superficie/area del rectangulo
     * @return ancho * alto
     */
    public double superficie()
    {
        return this.getAncho() * this.getAlto();
    }

    /**
     * Devuelve la distancia entre dos objetos de clase Rectangulo
     * @param otroRectangulo otro rectangulo
     * @return distancia
     */
    public double distanciaA(Rectangulo otroRectangulo)
    {
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }

    /**
     * Devuelve el objeto de clase Rectangulo que tenga mayor superficie
     * @param otroRectangulo otro rectangulo
     * @return objeto de clase rectangulo que sea mayor
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if (this.superficie() > otroRectangulo.superficie()){
            return this;
        }
        else{
            return otroRectangulo;
        }
    }

    public String nombreFigura(){
        return "***** Rectangulo *****";
    }
}
