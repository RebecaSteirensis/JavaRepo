/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Circulo - Trabajo Practico 3
 */
public class Circulo
{
    /**
    *Atributos de la Clase 
    */
    private double radio;
    private Punto centro;

    /**
    *Constructor vacio, instancia un objeto de la clase
    */
    public Circulo()
    {
        Punto punto1 = new Punto();
        this.setRadio(0);
        this.setCentro(punto1);
    }
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param double p_radio
    *@param Punto p_centro
    */
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }

    /**
    *Setter,recibe un Punto y permite modificar el valor de el atributo centro
    *@param Punto p_centro
    */
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    /**
    *Setter,recibe un double y permite modificar el valor de el atributo radio
    *@param double p_radio
    */
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo centro
    *@return devuelve un Punto
    */
    public Punto getCentro(){
        return this.centro;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo radio
    *@return devuelve un double
    */
    public double getRadio(){
        return this.radio;
    }
    
    /**
     * Recibe 2 parametros y los utiliza como coordenadas para mover el centro del circulo
     * @param double p_dx
     * @param double p_dy
    */
    public void desplazar(double p_dx, double p_dy)
    {
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    /**
    *Metodo publico,muestra por pantalla las caracteristicas de un Circulo
    */
    public void caracteristicas(){
        System.out.println("***** Circulo *****");
        System.out.println("Centro: (" + this.getCentro().coordenadas() + ") - Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
    /**
    *Metodo publico,calcula el perimetro del circulo
    *@return devuelve un double
    */
    public double perimetro(){
        return Math.PI * 2 * this.getRadio();
    }
    
    /**
    *Metodo publico,calcula la superficie del circulo
    *@return devuelve un double
    */
    public double superficie(){
        return Math.PI * (Math.pow(this.getRadio(), 2));
    }
    
    /**
    *Recibe un circulo por parametro y lo compara con otro circulo para saber la distancia entre estos
    *@param Circulo otroCirculo
    *@return devuelve un double
    */
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    
    /**
    *Recibe un circulo y lo compara con el circulo que ejecuto la accion para saber cual es el mayor
    *@param Circulo otroCirculo
    *@return devuelve un Circulo
    */
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() > otroCirculo.superficie()){
            return this;
        } else {
            return otroCirculo;
        }
    }
}