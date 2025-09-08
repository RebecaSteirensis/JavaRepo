import java.util.*;

public class CreaFigura
{
   public static void main(String[] args){
       Random unNumero = new Random();
       Scanner teclado = new Scanner(System.in);
       
       double radio = unNumero.nextDouble() * 100.0;
       double radio2 = unNumero.nextDouble() * 100.0;
       
       double ancho = unNumero.nextDouble() * 100.0;
       double alto = unNumero.nextDouble() * 100.0;
       
       double ancho2 = unNumero.nextDouble() * 100.0;
       double alto2 = unNumero.nextDouble() * 100.0;
       
       Punto punto1 = new Punto();
       Circulo circulo1 = new Circulo(radio, punto1);
       
       circulo1.caracteristicas();
       
       circulo1.desplazar(-240, -230);
       circulo1.caracteristicas();
       
       System.out.println("Ingrese el valor de la coordenada x:");
       double x = teclado.nextDouble();
       System.out.println("Ingrese el valor de la coordenada y:");
       double y = teclado.nextDouble();
       Punto punto2 = new Punto(x, y);
       Circulo circulo2 = new Circulo(radio2, punto2);
       
       circulo1.elMayor(circulo2).caracteristicas();
       
       System.out.println("La distancia entre el circulo 1 y el circulo 2 es: " + circulo1.distanciaA(circulo2));
       
       System.out.println("Ingrese el valor de la coordenada x:");
       double x1 = teclado.nextDouble();
       System.out.println("Ingrese el valor de la coordenada y:");
       double y1 = teclado.nextDouble();
       Punto punto3 = new Punto(x1, y1);
       Rectangulo rectangulo1 = new Rectangulo(punto3, ancho, alto);
       
       rectangulo1.desplazar(40, -20);
       rectangulo1.caracteristicas();
       
       System.out.println("Ingrese el valor de la coordenada x:");
       double x2 = teclado.nextDouble();
       System.out.println("Ingrese el valor de la coordenada y:");
       double y2 = teclado.nextDouble();
       Punto punto4 = new Punto(x2, y2);
       Rectangulo rectangulo2 = new Rectangulo(punto4, ancho2, alto2);
       
       rectangulo1.elMayor(rectangulo2).caracteristicas();
       
       System.out.println("La distancia entre el rectangulo 1 y el rectangulo 2 es: " + rectangulo1.distanciaA(rectangulo2));
   }
}