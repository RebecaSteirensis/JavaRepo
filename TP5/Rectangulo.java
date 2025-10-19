/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Rectangulo - Trabajo Practico 5
 */
public class Rectangulo extends FiguraGeometrica
{
    /**
    *Atributos de la Clase 
    */
    private Punto origen;
    private double ancho;
    private double alto;

    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param Punto p_origen
    *@param double p_ancho
    *@param double p_alto
    */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto)
    {
        super(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);     
    }

    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param double p_ancho
    *@param double p_alto
    */
    public Rectangulo (double p_ancho, double p_alto)
    {   
        super(new Punto());
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    /**
    *Setter,recibe un double y permite modificar el valor de el atributo ancho
    *@param double p_ancho
    */
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    /**
    *Setter,recibe un double y permite modificar el valor de el atributo alto
    *@param double p_alto
    */
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    /**
    *Setter,recibe un Punto y permite modificar el valor de el atributo origen
    *@param Punto p_origen
    */
    private void setPunto(Punto p_origen){
        this.origen = p_origen;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo ancho
    *@return devuelve un double
    */
    public double getAncho(){
        return this.ancho;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo alto
    *@return devuelve un double
    */
    public double getAlto(){
        return this.alto;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo origen
    *@return devuelve un Punto
    */
    public Punto getPunto(){
        return this.origen;
    }
    
    /**
    *Metodo publico,recibe 2 parametros y los utiliza para desplazar las coordenadas del origen del rectangulo
    */
    public void desplazar(double p_dx, double p_dy){
        this.getPunto().desplazar(p_dx, p_dy);
    }
    
    /**
    *Metodo publico,muestra por pantalla las caracteristicas del rectangulo
    */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Origen: (" + this.getPunto().coordenadas() + ") - Alto: " + this.getAlto() + " - Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
    /**
    *Metodo publico,calcula el perimetro del rectangulo
    *@return devuelve un double
    */
    public double perimetro(){
        return 2 * (this.getAlto() + this.getAncho());
    }
    
    /**
    *Metodo publico,calcula la superficie del rectangulo
    *@return devuelve un double
    */
    public double superficie(){
        return this.getAncho() * this.getAlto();
    }
    
    /**
    *Metodo publico,recibe un rectangulo por parametro y lo compara con el que ejecuto la accion para saber la distancia entre estos
    *@param Rectangulo otroRectangulo
    *@return devuelve un double
    */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getPunto().distanciaA(otroRectangulo.getPunto());
    }
    
    /**
    * Metodo publico,recibe un rectangulo por parametro y lo compara con el que ejecuto la accion para saber cual es el mayor
    * @param Rectangulo otroRectangulo
    * @return devuelve un Rectangulo
    */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        } else {
            return otroRectangulo;
        }
    }
    
    public String nombreFigura(){
        return "***** Rectangulo *****";
    }
}