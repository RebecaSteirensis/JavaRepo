import java.util.*;

public class TomaPedido
{
   public static void main(String[] args){
       Scanner teclado = new Scanner(System.in);
       
       Laboratorio unLaboratorio = new Laboratorio("TecnoMovil","La Rioja y 9 de julio","3782475071");
       Producto unProducto = new Producto(4532,"Libro POO","Pendrive",45.68,unLaboratorio);
       Cliente unCliente = new Cliente(45095896,"Fernandez","Facundo",60000);
       Calendar fecha = new GregorianCalendar();
       
       Pedido unPedido = new Pedido(fecha, unCliente, unProducto);
       
       int opcion = 0;
       
       do{
           System.out.println("Que desea realizar: 1- Ingresar un producto. 2- Quitar un producto. 3- Mostrar pedido");
           opcion = Integer.parseInt(teclado.nextLine());
           
           switch(opcion){
               case 1:
                   System.out.println("Cuantos productos quiere agregar?: ");
                   int cantidad = Integer.parseInt(teclado.nextLine());
                   
                   for(int i = 0; i < cantidad; i++){
                       System.out.println("Ingrese el nombre del producto:");
                       String descripcion = teclado.nextLine();
                       System.out.println("Ingrese el rubro del producto:");
                       String rubro = teclado.nextLine();
                       System.out.println("Ingrese el costo del producto:");
                       double costo = Double.parseDouble(teclado.nextLine());
                       System.out.println("Ingrese el codigo del producto:");
                       int codigoProducto = Integer.parseInt(teclado.nextLine());
                       
                       unPedido.agregarProducto(new Producto(codigoProducto, rubro, descripcion, costo, unLaboratorio));
                   }
                   break;
                   
               case 2:
                   System.out.println("Ingrese el codigo del producto");
                   int codigo = Integer.parseInt(teclado.nextLine());
                   
                   for(Producto producto: unPedido.getProductos()){
                       if(producto.getCodigo() == codigo){
                           unPedido.quitarProducto(producto);
                       }
                   }
                   break;
                   
               case 3:
                   unPedido.mostrarPedido();
                   break;
           }
       }while(opcion != 0);
        
   }
}