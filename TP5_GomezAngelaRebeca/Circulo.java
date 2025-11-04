/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Circulo - Trabajo Practico 5
 */
public class Circulo extends Elipse
{
    /**
     * Constructor de la clase Circulo
     * @param p_radio radio
     * @param p_centro centro
     */
    public Circulo(double p_radio, Punto p_centro){
        super(p_radio, p_radio, p_centro);
    }

    /**
     * Constructor de la clase Circulo
     */
    public Circulo(){
        super(0.0, 0.0, new Punto( 0.0, 0.0));
    }

    //metodos
    /**
     * Devuelve un String de "***** Circulo *****"
     * @return el nombre de la figura
     */
    public String nombreFigura(){
        return "***** Circulo *****";
    }
    /**
     * Imprime las caracteristicas del Circulo
     */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro: " + super.getOrigen().coordenadas() + " - Radio: " + super.getEjeMayor());
        System.out.println("Superficie: " + super.superficie());
    }
}
