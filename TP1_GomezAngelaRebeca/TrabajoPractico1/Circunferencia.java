
/**
    3. Crear una clase ejecutable denominada “Circunferencia”, en la que se calcule el perímetro de una
    circunferencia, ingresando el radio de tipo entero a través del argumento del main().
*/

//Imports
import java.util.Scanner;


//Class definition
public class Circunferencia
{
    //Main method
    public static void main(String[] args)
    {
        //Create new instance of Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Create a control variable and a while loop that calculate the perimeter of the circumference
        //only while de control variable is different to 0
        int sgte = 1;
        
        while(sgte != 0){
        System.out.println("Ingrese el radio de la circunferencia");
        int radio = teclado.nextInt();
        
        System.out.println("El perimetro de la circunferencia es: " + (2*Math.PI*radio));
        
        System.out.print("Desea calcular otra circunferencia? Ingrese un numero distinto a 0");
        sgte = teclado.nextInt();
        }
        
    }
}