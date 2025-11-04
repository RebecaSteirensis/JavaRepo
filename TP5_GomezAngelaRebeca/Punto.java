/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Punto - Trabajo Practico 5
 */

public class Punto
{
    private double x;
    private double y;
    /**
     * Constructor de objetos para la clase Punto
     */

    public Punto(){
       this.setX(0.0);
       this.setY(0.0);
    }
    
    /**
     * Constructor de objetos para la clase Punto
     * @param p_x x
     * @param p_y y
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    
    private void setX(double p_x){
        this.x = p_x;
    }
    
    private void setY(double p_y){
        this.y = p_y;
    }
    
    /**
     * Devuelve x
     * @return x
     */
    public double getX(){
        return this.x;
    }
    /**
     * Devuelve y
     * @return y
     */
    public double getY(){
        return this.y;
    }
    
    //metodos

    /**
     * Devuelve la distancia entre este objeto de clase Punto junto con otro de la misma clase
     * @param p_ptoDistante objeto de clase Punto
     * @return distancia
     */
    public double distanciaA(Punto p_ptoDistante){
        double d = Math.pow(p_ptoDistante.getX() - this.getX(), 2) + Math.pow(p_ptoDistante.getY() - this.getY(), 2);
        return Math.sqrt(d);
    }
    /**
     * Suma a X e Y los valores pasados por parametros
     * @param p_dx el numero que vamos a sumar a X
     * @param p_dy el numero que vamos a sumar a Y
     */
    public void desplazar(double p_dx, double p_dy){
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    /**
     * Muestra a X e Y
     */
    public void mostrar(){
        System.out.println("Punto. X:" + this.getX() + ", Y: " + this.getY());
    }
    
    /**
     * Devuelve como string solo los numeros de X e Y
     * @return x, y
     */
    public String coordenadas(){
        return "(" + String.valueOf(this.getX())+ ", " + String.valueOf(this.getY()) + ")";
    }
}
