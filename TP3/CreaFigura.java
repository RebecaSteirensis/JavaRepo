import java.util.Random;

public class CreaFigura
{
   public static void main(String[] args){
       Random unNumero = new Random();
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
       
       Punto punto2 = new Punto(5.2, 0.5);
       Circulo circulo2 = new Circulo(radio2, punto2);
       
       circulo1.elMayor(circulo2).caracteristicas();
       
       System.out.println("La distancia entre el circulo 1 y el circulo 2 es: " + circulo1.distanciaA(circulo2));
       
       Punto punto3 = new Punto();
       Rectangulo rectangulo1 = new Rectangulo(punto3, ancho, alto);
       
       rectangulo1.desplazar(40, -20);
       rectangulo1.caracteristicas();
       
       Punto punto4 = new Punto(7.4, 4.5);
       Rectangulo rectangulo2 = new Rectangulo(punto4, ancho2, alto2);
       
       rectangulo1.elMayor(rectangulo2).caracteristicas();
       
       System.out.println("La distancia entre el rectangulo 1 y el rectangulo 2 es: " + rectangulo1.distanciaA(rectangulo2));
   }
}