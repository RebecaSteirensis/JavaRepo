
/**
    9. Crear una clase denominada OrdenVector, que permita ingresar por teclado (Scanner) 4 elementos de tipo
    doble, y almacenarlos en un array. Determinar el menor elemento y mostrarlo. Ordenar los elementos del
    vector de menor a mayor. Mostrar los elementos ordenados, separados por un tabulador. Usar instrucción
    FOR para el ingreso de datos. Utilizar método de la Burbuja.
 */

//Imports
import java.util.Scanner;

//Class definition
public class OrdenVector
{
    //Main method
    public static void main(String[] args)
    {
        //Create a new instance of Scanner
        Scanner teclado = new Scanner(System.in);
        
        double[] numeros = new double[4];
        double menor = 0;
        
        System.out.println("Ingrese los 4 numeros");
        for(int i = 0; i < 4; i++){
            double numeroIngresado = teclado.nextDouble();
            
            numeros[i] = numeroIngresado;
        }
        
        //For loop to detterminate which number is the smallest
        menor = numeros[0];
        for(int i = 0; i < 4; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("El menor numero es: " + menor);

        //Bubble method to sort from smallest to largest
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4-1; j++){
                double actual = numeros[j];
                double siguiente = numeros[j+1];
                
                if(actual > siguiente){
                    numeros[j] = siguiente;
                    numeros[j+1] = actual;
                }
            }
        }
        
        for(int i = 0; i < 4; i++){
            System.out.print(numeros[i] + "\t");
        }
    }
}