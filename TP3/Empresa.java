import java.util.*;

public class Empresa
{
    public static void main(String[] args){
        Calendar fechaIngreso1 = new GregorianCalendar(2017, 6, 12);
        
        Empleado empleado1 = new Empleado(203534385, "Perez", "Juan", 3000, fechaIngreso1);
        
        if(empleado1.esAniversario() == true){
            System.out.println("Puedes retirarte 1hs antes");
        }else{
            System.out.println("No puedes retirarte temprano aun");
        }
    }
}