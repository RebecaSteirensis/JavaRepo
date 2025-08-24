/**
 * Clase ejecutable (main)
 */
public class EmpleadoEjecutable
{
     public static void main(String[] args){
         Empleado empleado1 = new Empleado(2040047821, "Fernandez", "Facundo", 1500, 2023);
         
         empleado1.mostrar();
         System.out.println(empleado1.mostrarLinea());
     }
}