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
        
        Calendar fechaIngreso2 = new GregorianCalendar(2016, 9, 26);
        
        EmpleadoConJefe jefe = new EmpleadoConJefe(204004780, "Facundo", "Fernandez", 4500, fechaIngreso1);
        EmpleadoConJefe empleado2 = new EmpleadoConJefe(243564385, "Roberto", "Caceres", 2500, fechaIngreso2, jefe);
        if(empleado2.esAniversario() == true){
            System.out.println("Puedes retirarte 1hs antes autorizado por: " + empleado2.getJefe().apeYNom());
        }else{
            System.out.println("No puedes retirarte temprano aun");
        }
    }
}