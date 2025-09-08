import java.util.*;

public class Secretaria
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int continuar = 0;
        
        do{
            System.out.println("Nombre de la escuela");
            String schoolName = teclado.nextLine();
            System.out.println("Direccion de la escuela");
            String address = teclado.nextLine();
            System.out.println("Nombre del director");
            String directorName = teclado.nextLine();
            
            Escuela escuela1 = new Escuela(schoolName, address, directorName);
            
            System.out.println("Nombre de el/la docente");
            String professorName = teclado.nextLine();
            System.out.println("Curso");
            String curseYear = teclado.nextLine();
            System.out.println("Sueldo basico");
            double income = teclado.nextDouble();
            System.out.println("Asignacion familiar");
            double familiarIncome = teclado.nextDouble();
            
            Docente docente1 = new Docente(professorName, curseYear, income, familiarIncome);
            
            escuela1.imprimirRecibo(docente1); 
            
            System.out.println("Desea agregar otra escuela y docente? 0-NO 1-SI");
            continuar = teclado.nextInt();

        } while(continuar == 1);
    }
}