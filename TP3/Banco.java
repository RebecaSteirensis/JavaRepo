import java.util.*;

public class Banco
{
    public static void main(String[] args){
        Calendar fechaNacimiento = new GregorianCalendar(1996, 8, 26);
        Persona persona1 = new Persona(40047821, "Facundo", "Fernandez", fechaNacimiento);
        
        CajaDeAhorro caja1 = new CajaDeAhorro(2135, persona1, 155.25);
        CuentaCorriente cuenta1 = new CuentaCorriente(1735, persona1, 1500);
        
        caja1.mostrar();
        cuenta1.mostrar();
        
        if(persona1.esCumpleanios()){
            System.out.println ("Fc");
        } else {
             System.out.println ("NO Fc");
        }

    }
}