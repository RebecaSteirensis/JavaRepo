import java.util.*;

public class Banco
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int continuar = 0;
        
        do{
            System.out.println("Año de nacimiento");
            int year = teclado.nextInt();

            
            System.out.println("DNI");
            int dni = teclado.nextInt();
            System.out.println("Nombre");
            String name = teclado.next();
            System.out.println("Apellido");
            String lastName = teclado.next();
        
            Persona persona1 = new Persona(dni, name, lastName, year);
            
            CajaDeAhorro caja1 = new CajaDeAhorro(2135, persona1, 155.25);
            CuentaCorriente cuenta1 = new CuentaCorriente(1735, persona1, 1500);
        
            caja1.mostrar();
            cuenta1.mostrar();
            
            System.out.println("Desea agregar otra persona? 0-NO 1-SI");
            continuar = teclado.nextInt();
        } while(continuar == 1);
    }
}