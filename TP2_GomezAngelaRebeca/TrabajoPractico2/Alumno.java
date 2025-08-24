/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Alumno - Trabajo Practico 2
 */
public class Alumno
{
    // Attributes
    /**
     * Atributos de la Clase Alumno (variables de instancia).
     */
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;

    /**
     * Constructor con parametros, instancia un objeto de la clase.
     * @param p_lu
     * @param p_nombre
     * @param p_apellido
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido)
    {
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
    }
    
    //setters and getters
    /**
     * Mutador Setter, recibe un tipo de dato entero y permite modificar el estado del atributo lu. 
     * @param p_lu
     */
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    
    /**
     * Mutador Setter, recibe un objeto de tipo String y permite modificar el estado del atributo nombre.
     * @param p_nombre
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Mutador Setter, recibe un objeto de tipo String y permite modificar el estado del atributo apellido.
     * @param p_apellido
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Mutador Setter, recibe un tipo de dato coma flotante de doble precisión y permite modificar el estado 
     * del atributo nota1. 
     * @param p_nota1
     */
    public void setNota1(double p_nota1){
        this.nota1 = p_nota1;
    }
    
    /**
     * Mutador Setter, recibe un tipo de dato coma flotante de doble precisión y permite modificar el estado 
     * del atributo nota2. 
     * @param p_nota2
     */
    public void setNota2(double p_nota2){
        this.nota2 = p_nota2;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo lu.
     * @return retorna un tipo de dato entero.
     */
    public int getLu(){
        return this.lu;
    }
    
    /**
     * Accesor Getter, permite obtener el estado del atributo nombre.
     * @return retorna un objeto de tipo String.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Accesor Getter, permite obtener el estado del atributo apellido.
     * @return retorna un objeto de tipo String.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo nota1.
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
    public double getNota1(){
        return this.nota1;
    }
    
    /** 
     * Accesor Getter, permite obtener el estado del atributo nota2.
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
    public double getNota2(){
        return this.nota2;
    }
    
    //Methods
    /**
     * Método privado, utiliza los métodos promedio, getNota1 y getNota2 para comparar y evaluar condiciones 
     * establecidas, si se cumplen dichas condiciones el método retorna true si no se cumplen retorna false.
     * @return retorna un dato lógico.
     */
    private boolean aprueba()
    {
        if ((getNota1() >= 6 && getNota2() >= 6) && ((getNota1() + getNota2())/ 2.0 > 7 )){
            
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Método privado, utiliza el método aprueba y lo compara si la 
     * comparación es verdadera el método retorna la leyenda APROBADO, si la comparación es falsa
     * retorna la leyenda DESAPROBADO.
     * @return retorna un objeto de tipo String.
     */
    private String leyendaAprueba(){
        if(aprueba() == true){
            return "APROBADO";
        }else{
            return "DESAPROBADO";
        }
    }
     
    /**
     * Método publico, utiliza los métodos getNota1 y getNota2 para calcular el promedio, retornandolo directamente.
     * Cálculo del promedio = (nota1+nota2+...+notaN)/N.
     * @return retorna un tipo de dato coma flotante de doble precisión.
     */
    public double promedio(){
        return (getNota1() + getNota2()) / 2.0;
    }
    
    /**
     * Método publico, utiliza los métodos getNombre y getApellido para formar una única cadena de texto 
     * concatenando los atributos nombre y apellido.
     * @return retorna un objeto de tipo String.
     */
    public String nomYApe(){
        return getNombre() + " " + getApellido();
    }
    
    /**
     * Método publico, utiliza los métodos getApellido y getNombre para formar una única cadena de texto 
     * concatenando los atributos apellido y nombre.
     * @return retorna un objeto de tipo String.
     */
    public String apeYNom(){
        return getApellido() + " " + getNombre();
    }
    
    /**
     * Método publico, utiliza el método nomYApe para formar una cadena de texto con su respectiva descripción 
     * junto al estado del objeto.
     * Utiliza los métodos getLU, getNota1 y getNota2 formar una cadena de texto con sus respectivas 
     * descripciones junto a los estados de los objetos.
     * Utiliza los métodos promedio y leyendaAprueba formar una cadena de texto con sus respectivas 
     * descripciones junto a los estados de los objetos.
     * Emplea 3 System.out.println para visualizar por consola las tres cadenas de texto.
     */
    public void mostrar(){
        System.out.println("Nombre y apellido: " + nomYApe());
        System.out.println("LU: " + getLu() + "\t" + "Notas: " + getNota1() + " - " + getNota2());
        System.out.println("Promedio: " + promedio() + " - " + leyendaAprueba());
    }
    
}