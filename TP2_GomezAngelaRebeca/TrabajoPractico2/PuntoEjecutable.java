/**
 * Clase ejecutable (main)
 */
public class PuntoEjecutable
{
    public static void main(String[] args){
        Punto punto1 = new Punto();
        
        punto1.mostrar();
        punto1.desplazar(3, 6);
        punto1.mostrar();
        System.out.println(punto1.coordenadas());
        
        Punto punto2 = new Punto(3.4, 5.6);
        
        punto2.mostrar();
        punto2.desplazar(2.1, 7.8);
        System.out.println(punto2.coordenadas());
    }
}