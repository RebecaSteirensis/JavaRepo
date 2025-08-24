
/**
 * Write a description of class Ecuacion here.
    5. Crear una clase denominada “Ecuación” que calcule las raíces reales de una ecuación de segundo grado. Los
    valores de los coeficientes a, b y c se ingresarán por teclado como argumentos del método main(). Considerar
    que si el discriminante > 0 se deben calcular las 2 raíces, si el discriminante = 0 se debe calcular una sola raíz,
    especificando por pantalla que x1 = x2. En caso de ser negativo, mostrar un mensaje indicando que se
    encuentra frente a una solución compleja (numero imaginario).
    Nota: probar con a= -1; b=500; c=-62500;
 */

//Class definition
public class Ecuacion
{
    //Main method
    public static void main(String[] args)
    {   
        //Calculate the different roots of the equation with the values entered in the main method
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        
       double discriminante = Math.pow(b, 2)-(4*a*c);
       
       if(discriminante < 0){
           System.out.println("La solucion es compleja (numero imaginario)");
       }
       
       if(discriminante == 0){
           double resultado = (-b + (Math.sqrt(discriminante))) / (2*a);
           
           System.out.println("El resultado de la ecuacion es: " + resultado + " es una sola raiz ya que x1 = x2");
       }
       
       if(discriminante > 0){
           double resultado1 = (-b + (Math.sqrt(discriminante))) / (2*a);
           double resultado2 = (-b - (Math.sqrt(discriminante))) / (2*a);
           
           
           System.out.println("La primera raiz es: " + resultado1 + " y la segunda raiz es: " + resultado2);
       }
    }
}