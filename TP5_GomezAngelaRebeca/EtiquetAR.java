import java.util.*;

public class EtiquetAR
{
    public static void main(String[] args ){
        Premium etiquetaPremium = new Premium(200,10);
        Comun etiquetaComun = new Comun(100,100);
        Renglon unRenglon = new Renglon(7,200,etiquetaPremium);
        ArrayList<Renglon> listaPedido = new ArrayList();
        
        listaPedido.add(unRenglon);
        
        Pedido unPedido = new Pedido(listaPedido);    
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("Ingrese una opcion");
            System.out.println("1-Crear etiqueta comun, 2-Crear etiqueta premium,3-Mostrar Pedido");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el costo de la etiqueta:");
                    double costo = leer.nextDouble();
                    System.out.println("Ingrese el plus de la etiqueta:");
                    double plus = leer.nextDouble();
                    System.out.println("Ingrese la cantidad :");
                    int cantidad = leer.nextInt();
                    Renglon otroRenglon = new Renglon(cantidad,100,new Comun(costo,plus));
                    unPedido.agregarRenglon(otroRenglon);
                    break;
                case 2:
                    System.out.println("Ingrese el costo de la etiqueta:");
                    double costoEtiqueta = leer.nextDouble();
                    System.out.println("Ingrese la cantidad de colores:");
                    int colores = leer.nextInt();
                    System.out.println("Ingrese la cantidad :");
                    int cantidadEtiquetas = leer.nextInt();
                     Renglon tercerRenglon = new Renglon(cantidadEtiquetas,200,new Premium(costoEtiqueta,colores));
                     unPedido.agregarRenglon(tercerRenglon);
                    break;
                case 3:
                    unPedido.mostrar();
                    break;
            }
        }while(opcion != 0);
    }
}
