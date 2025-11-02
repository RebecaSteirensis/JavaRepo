public class Empresa
{
   public static void main(String[] args){
       Persona persona1 = new Persona(40047821, "Facundo", "Fernandez", 1996);
       
       persona1.mostrar();
       
       Empleado empleado1 = new Empleado(40047821, 23456789, "Fernandez", "Facundo", 4000, 2023);
       
       empleado1.mostrar();
   }
}