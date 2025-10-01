
/**
 * Write a description of class Jardin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

/**
 * Clase que representa un jardín compuesto por una lista de figuras geométricas.
 * Permite calcular el área total, la cantidad de litros de pintura necesarios y el
 * número de latas requeridas para cubrir el área.
 *
 * @author Mauro Gonzalez y Clara Gomez
 * @version 16/10/2024
 */
public class Jardin {
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;

    /**
     * Constructor de la clase Jardin que inicializa un jardín vacío.
     *
     * @param p_nombre el nombre del jardín
     */
    public Jardin(String p_nombre) {
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
    }


    /**
     * Constructor de la clase Jardin que inicializa un jardín con una lista de figuras.
     *
     * @param p_nombre el nombre del jardín
     * @param p_figuras lista de figuras geométricas que componen el jardín
     */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras) {
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }

    //accessors
    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public ArrayList<FiguraGeometrica> getFiguras() {
        return this.figuras;
    }

    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras) {
        this.figuras = p_figuras;
    }

    public boolean agregarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }

    public boolean quitarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }

    //metodos
    /**
     * Calcula la cantidad de litros de pintura necesarios para cubrir el área del jardín.
     *
     * @return la cantidad de litros de pintura necesarios
     */
    private double cuantosLitros(){
        return (this.cuantosMetros() /20) * 4;
    }

    /**
     * Calcula la cantidad de latas de pintura necesarias para cubrir el área del jardín,
     * redondeando hacia arriba.
     *
     * @return el número de latas de pintura necesarias
     */
    public int cuantasLatas(){
        return (int) Math.ceil(this.cuantosMetros() / 20);
    }

    /**
     * Calcula el área total (en metros cuadrados) de todas las figuras del jardín.
     *
     * @return el área total en metros cuadrados
     */
    public double cuantosMetros(){
        double metrosCuadrados = 0.0;
        for (FiguraGeometrica unaFigura: this.getFiguras()){
            metrosCuadrados += unaFigura.superficie();
        }
        return metrosCuadrados;
    }
    
    /**
     * Muestra los detalles de las figuras geométricas en el jardín,
     * incluyendo sus superficies y el cálculo del área total.
     */
    public void detalleFiguras(){
        System.out.println("Presupuesto: " + this.getNombre());
        System.out.println();
        for (FiguraGeometrica unafigura : this.getFiguras()){
            unafigura.mostrarSuperficie();
        }
        System.out.println("----------------------------------");
        System.out.println("\n\t Total a cubrir: " + this.cuantosMetros());
        System.out.println("\t Comprar " + this.cuantasLatas() + " latas");
    }
}
