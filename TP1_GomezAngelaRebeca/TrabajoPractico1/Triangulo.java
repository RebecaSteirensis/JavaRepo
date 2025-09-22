
/**
 4. Crear clase ejecutable “Triangulo”, declarar las variables a, b y c de tipo double, que corresponden a los lados
    de un triángulo. Los valores deben ser ingresados por teclado como argumentos del método main(). Calcular y
    mostrar el semiperímetro y el área del triángulo.
    semiperimetro= (a+b+c)/2
    area= raíz cuadrada(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c))
*/

//Imports
import java.util.Scanner;

//Class definition
public class Triangulo
{
    //Main method
    public static void main(String[] args)
    {
        //Calculate the semiperimeter and area of the triangle with the values 
        //entered in the main method
        double a, b, c;
        
        System.out.println("Ingrese los valores de los lados del triangulo");
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        
        double semiperimetro = (a+b+c)/2;
        double area = Math.sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c));
        
        System.out.println("El semiperimetro del triangulo es: " + semiperimetro);
        System.out.println("El area del triangulo es: " + area);
        
    }
}