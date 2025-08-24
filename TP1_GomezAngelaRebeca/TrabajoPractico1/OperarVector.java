
/**
    8. Crear una clase denominada OperarVector que permita ingresar por teclado (Scanner) 5 notas de alumnos, las
    que serán almacenadas en un array de enteros. Calcular el promedio y determinar la mayor nota. El promedio
    debe permitir resultado con decimales (aplicar cast a los elementos enteros cuando sea necesario para obtener
    dicho resultado). Mostrar los elementos ingresados, separados por un tabulador. Mostrar el promedio y la
    mayor nota con el mensaje respectivo. 
*/

//Import
import java.util.Scanner;

//Class definition
public class OperarVector
{
    //Main method
    public static void main (String[] args)
    {
        //Create a new instance of Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Create an array to almacenate the grade points
        int[] notasAlumnos = new int[5];
        int suma = 0;
        
        System.out.println("Ingrese las cinco notas:");
        
        for(int i = 0; i < 5; i++){
            notasAlumnos[i] = teclado.nextInt();
            
            suma += notasAlumnos[i];
        }
        
        int mayor = 0;
        
        //Print all grade points and determinate which is the greatter
        for(int i = 0; i < 5; i++){
            System.out.print(notasAlumnos[i] + "\t");
            
            if(notasAlumnos[i] > mayor){
                mayor = notasAlumnos[i];
            }
        }
        
        float promedio = (float) (suma / 5F);
        
        //Print the final average grade point and the greatter grade point
        System.out.println("\n El promedio final es: " + promedio);
        System.out.println("La nota mayor es: " + mayor);
    }
}