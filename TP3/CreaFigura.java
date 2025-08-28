
/**
 * Write a description of class CreaFigura here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;

public class CreaFigura
{
   public static void main(String[] args){
       Random unNumero = new Random();
       double radio = unNumero.nextDouble() * 100.0;
       double radio2 = unNumero.nextDouble() * 100.0;
       
       Punto punto1 = new Punto();
       Circulo circulo1 = new Circulo(radio, punto1);
       
       circulo1.desplazar(-240, -230);
       circulo1.caracteristicas();
       
       Punto punto2 = new Punto(5.2, 0.5);
       Circulo circulo2 = new Circulo(radio2, punto2);
       
       circulo1.elMayor(circulo2).caracteristicas();
       
       System.out.println();
   }
}