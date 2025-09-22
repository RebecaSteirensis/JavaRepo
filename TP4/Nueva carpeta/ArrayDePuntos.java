import java.util.*;

public class ArrayDePuntos
{
    public static void main(String[] args){
        Punto[] puntos = new Punto[6];
        Scanner teclado = new Scanner(System.in);
                
        for(int i = 0; i < 6; i++){
            System.out.println("Ingrese el valor de x");
            double x = teclado.nextDouble();
            
            System.out.println("Ingrese el valor de y");
            double y = teclado.nextDouble();
            
            Punto punto1 = new Punto(x, y);
            
            puntos[i] = punto1;
        }
        
        for(int i = 0; i < 6; i++){
            puntos[i].mostrar();
        }
        
        for(int i = 1; i < 6; i++){
            System.out.println("La distancia del punto " + i + " al punto " + (i+1) + " es: " + puntos[i].distanciaA(puntos[i+1]));
        }
    }
}