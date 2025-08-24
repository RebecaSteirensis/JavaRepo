
/**
 * 1. Crear la clase ejecutable “Operador”, que contenga el método main(). En él declarar las variables a y b de tipo
    entero. Inicializarlas con los valores 8 y 3 respectivamente. Realizar y mostrar por pantalla las siguientes
    operaciones aritméticas: suma, resta, multiplicación, división y resto.
 */

//Class definition
public class Operador
{
    //Main method
    public static void main(String[] args)
    {
        
        //Definition of two variables and print the differents math calculus
        int a, b;
        
        a = 8;
        b = 3;
        
        System.out.println("Suma: " + (a+b));
        System.out.println("Resta: " + (a-b));
        System.out.println("Division: " + (a / b));
        System.out.println("Multiplicacion: " + (a*b));
        
    }
}