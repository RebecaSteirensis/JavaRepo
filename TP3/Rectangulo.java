
/**
 * Write a description of class Rectangulo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangulo
{
    private Punto origen;
    private double ancho;
    private double alto;

    public Rectangulo(Punto p_origen, double p_ancho, double p_alto)
    {
        this.setPunto(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);     
    }

    public Rectangulo (double p_ancho, double p_alto)
    {
        Punto punto1 = new Punto();
        
        this.setPunto(punto1);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    private void setPunto(Punto p_origen){
        this.origen = p_origen;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    public double getAlto(){
        return this.alto;
    }
    
    public Punto getPunto(){
        return this.origen;
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getPunto().desplazar(p_dx, p_dy);
    }
    
    public void caracteristicas(){
        System.out.println("***** Rectangulo *****");
        System.out.println("Origen: (" + this.getPunto().coordenadas() + ") - Alto: " + this.getAlto() + " - Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
    public double perimetro(){
        return 2 * (this.getAlto() + this.getAncho());
    }
    
    public double superficie(){
        return this.getAncho() * this.getAlto();
    }
    
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getPunto().distanciaA(otroRectangulo.getPunto());
    }
    
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        } else {
            return otroRectangulo;
        }
    }
}