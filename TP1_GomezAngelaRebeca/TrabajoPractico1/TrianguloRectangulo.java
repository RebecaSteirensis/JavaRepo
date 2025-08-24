
/**
    6. Crear una clase denominada TrianguloRectangulo, en la que se determine si un triangulo es rectángulo
    (Teorema de Pitágoras → h2 = cateto12 + cateto22). Los lados se deben ingresar por teclado, utilizando el argumento del main().
    Nota: probar con hipotenusa = 5; cateto1 = 3; cateto2 = 4;
 */

//Class definition
public class TrianguloRectangulo
{
    //Main method
    public static void main(String[] args)
    {
        //Determinate if is a right triangle with the values entered in main method
        int hipotenusa = Integer.valueOf(args[0]);
        int cateto1 = Integer.valueOf(args[1]);
        int cateto2 = Integer.valueOf(args[2]);
        
        double suma = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        
        if(Math.pow(hipotenusa, 2) == suma){
            System.out.println("El triangulo es rectangulo");
        } else {
            System.out.println("El triangulo no es rectangulo");
        }
    }
}