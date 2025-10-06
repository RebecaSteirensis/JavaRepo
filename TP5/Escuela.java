
/**
 * Write a description of class Escuela here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Escuela
{
    public static void main (String[] args){
        Persona persona1 = new Persona(40047821, "Facundo", "Fernandez", 1996);
        
        persona1.mostrar();
        
        Alumno alumno1 = new Alumno(40047821, 2345, "Facundo", "Fernandez", 1996);
        
        alumno1.mostrar();
    }
}