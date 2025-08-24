/**
 * Clase ejecutable (main)
 */
public class AlumnoEjecutable
{
    public static void main(String[] args){
        Alumno alumno1 = new Alumno(40488634, "Rebeca", "Steirensis");
        
        alumno1.setNota1(7.5);
        alumno1.setNota2(9.0);
        
        alumno1.mostrar();
        
        Alumno alumno2 = new Alumno(40047821, "Fernandez", "Facundo");
        
        alumno2.setNota1(8.5);
        alumno2.setNota2(6.5);
        
        alumno2.mostrar();
    }
}