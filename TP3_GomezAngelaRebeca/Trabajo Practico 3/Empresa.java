    import java.util.*;

public class Empresa
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int continuar = 0;
        
        do{
            System.out.println("Año de ingreso");
            int year = teclado.nextInt();
            System.out.println("Mes de ingreso");
            int month = teclado.nextInt();
            System.out.println("Dia de ingreso");
            int day = teclado.nextInt();
            
            Calendar fechaIngreso1 = new GregorianCalendar(year, month, day);
            
            System.out.println("DNI");
            int dni = teclado.nextInt();
            System.out.println("Nombre");
            String name = teclado.next();
            System.out.println("Apellido");
            String lastName = teclado.next();
            System.out.println("Sueldo");
            double income = teclado.nextDouble();
            
            EmpleadoConJefe empleado1 = new EmpleadoConJefe(dni, name, lastName, income, fechaIngreso1);
            
            System.out.println("DNI Jefe");
            int bossDni = teclado.nextInt();
            System.out.println("Nombre Jefe");
            String bossName = teclado.next();
            System.out.println("Apellido Jefe");
            String bossLastName = teclado.next();
            System.out.println("Sueldo Jefe");
            double bossIncome = teclado.nextDouble();
            
            System.out.println("Año de ingreso Jefe");
            int year1 = teclado.nextInt();
            System.out.println("Mes de ingreso Jefe");
            int month1 = teclado.nextInt();
            System.out.println("Dia de ingreso Jefe");
            int day1 = teclado.nextInt();
            
            Calendar fechaIngreso2 = new GregorianCalendar(year, month, day);

            
            EmpleadoConJefe jefe1 = new EmpleadoConJefe(bossDni, bossName, bossLastName, bossIncome, fechaIngreso2);

            
            if(empleado1.esAniversario() == true){
            System.out.println("Puedes retirarte 1hs antes autorizado por: " + empleado1.getJefe().apeYNom());
            }else{
            System.out.println("No puedes retirarte temprano aun");
            }

        } while(continuar == 1);
    }
}