
/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Punto - Trabajo Practico 2
 */
public class Punto
{
    /**
     * Atributos de la Clase Punto (variables de instancia).
     */
    private double x;
    private double y;

    /**
     * Constructor, instancia un objeto origen de la clase Punto cuyos estados de los 
     * atributos x e y valen 0.
     * 
     */
    public Punto(){
        setX(0);
        setY(0);
    }
    
    /**
     * Constructor con parametros, instancia un objeto de la clase.
     * @param p_x
     * @param p_y
     */
    public Punto(double p_x, double p_y){
        setX(p_x);
        setY(p_y);
    }

    //Setters and Getters
    /**
     * Mutador Setter, recibe un tipo de dato coma flotante de doble precisión y permite modificar 
     * el estado del atributo x. 
     * @param p_x
     */
    private void setX(double p_x){
        this.x = p_x;
    }
    
    /**
     * Mutador Setter, recibe un tipo de dato coma flotante de doble precisión y permite modificar 
     * el estado del atributo y. 
     * @param p_y
     */
    private void setY(double p_y){
        this.y = p_y;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo x.
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
    public double getX(){
        return this.x;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo y.
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
    public double getY(){
        return this.y;
    }
    
    /**
     * Método publico, utiliza los métodos setX, setY, getX y getY, recibe por parametro 
     * datos de tipo coma flotante de doble precisión correspondientes a x e y.
     * Modifica los estados de los atributos mencionados mediante los setters, sumando los parametros con los estados actuales.
     */
    public void desplazar(double p_dx, double p_dy){
        setX(getX() + p_dx);
        setY(getY() + p_dy);
    }
    
    /**
     * Método publico, utiliza los métodos getX y getY para formar una cadena de texto con sus respectivas 
     * descripciones junto a los estados de los objetos.
     * Utiliza 1 System.out.println para visualizar por consola la cadena de texto.
     */
    public void mostrar()
    {
        System.out.println("Punto. X: " + getX() + ", Y: " + getY());
    }
    
    /**
     * Método publico, utiliza los métodos getX y getY para formar una única cadena de texto 
     * en formato de coordenadas (x,y). 
     * @return retorna un objeto de tipo String.
     */
    public String coordenadas(){
        return getX() + ", " + getY();
    }
}