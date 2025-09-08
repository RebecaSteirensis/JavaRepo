import java.util.*;

public class RegistroCivil {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int continuar = 0;
        
        do{
            System.out.println("Nombre Mujer");
            String womanName = teclado.nextLine();
            System.out.println("Apellido Mujer");
            String womanLastname = teclado.nextLine();
            System.out.println("Edad Mujer");
            int womanAge = teclado.nextInt();
            
            Mujer m1 = new Mujer(womanName, womanLastname, womanAge);
            
            System.out.println("Nombre Hombre");
            String manName = teclado.nextLine();
            System.out.println("Apellido Hombre");
            String manLastname = teclado.nextLine();
            System.out.println("Edad Hombre");
            int manAge = teclado.nextInt();
            
            Hombre h1 = new Hombre(manName, manLastname, manAge);
            
            m1.mostrarEstadoCivil();
            h1.mostrarEstadoCivil();

            System.out.println("\n--- Se casan ---");
            m1.casarseCon(h1);
            h1.casarseCon(m1);

            m1.mostrarEstadoCivil();
            h1.mostrarEstadoCivil();
        
            m1.casadaCon();
            h1.casadoCon();
        
            System.out.println("\n--- Se divorcian ---");
            m1.divorcio();
            h1.divorcio();
            m1.mostrarEstadoCivil();
            h1.mostrarEstadoCivil();
            
            System.out.println("Desea agregar otro matrimonio? 0-NO 1-SI");
            continuar = teclado.nextInt();

        } while(continuar == 1);
    }
}