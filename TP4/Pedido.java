/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Pedido - Trabajo Practico 4
 */
import java.util.*;

public class Pedido
{
    /**Atributos de la clase*/
    private Calendar fecha;
    private ArrayList<Producto> productos;
    private Cliente cliente;

    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param Calendar p_fecha
    *@param Cliente p_cliente
    *@param ArrayList<Producto> p_productos
    */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param Calendar p_fecha
    *@param Cliente p_cliente
    *@param Producto p_producto
    */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList<Producto>());
        this.agregarProducto(p_producto);
    }

    /**
    *Setter,recibe un Calendar por parametro y permite modificar el valor de el atributo fecha
    *@param Calendar p_fecha
    */
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    
    /**
    *Setter,recibe un ArrayList por parametro y permite modificar el valor de el atributo productos
    *@param ArrayList<Producto> p_productos
    */
    private void setProductos(ArrayList<Producto> p_productos){
        this.productos = p_productos;
    }
    
    /**
    *Setter,recibe un Cliente por parametro y permite modificar el valor de el atributo cliente
    *@param Cliente p_cliente
    */
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo fecha
    *@return devuelve un Calendar
    */
    public Calendar getFecha(){
        return this.fecha;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo productos
    *@return devuelve un ArrayList<Producto>
    */
    public ArrayList<Producto> getProductos(){
        return this.productos;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo cliente
    *@return devuelve un Cliente
    */
    public Cliente getCliente(){
        return this.cliente;
    }
    
    /** 
    * Metodo publico devuelve el total al contado
    * @return devuelve valor double
    */
    public double totalAlContado(){
        double total = 0;
        
        for(Producto producto: this.getProductos()){
            total += producto.precioContado();
        }
        
        return total;
    }
    
    /** 
    * Metodo publico devuelve el total financiado
    * @return devuelve valor double
    */
    public double totalFinanciado(){
        double total = 0;
        
        for(Producto producto: this.getProductos()){
            total += producto.precioLista();
        }
        
        return total;
    }
    
    /**
     * Metodo publico para agregar un producto a la lista de productos
     * @return devuelve un valor booleano
     */
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
    }
    
    /**
     * Metodo publico para quitar un producto a la lista de productos
     * @return devuelve un valor booleano
     */
    public boolean quitarProducto(Producto p_producto){
        if(this.getProductos().size() > 1){
            return this.getProductos().remove(p_producto);
        }else{
            return false;
        }
    }
    
    /** 
     * Metodo publico muestra por pantalla una descripcion de los productos y precios
     */
    public void mostrarPedido(){
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        System.out.println("****** Detalle del pedido ****** Fecha: " + this.getFecha().get(Calendar.DATE) + " de " + meses[this.getFecha().get(Calendar.MONTH)] + " de " + this.getFecha().get(Calendar.YEAR));
        System.out.println("Producto\tPrecio Lista\tPrecio Contado");
        System.out.println("---------------------------------------");
        for(Producto producto: this.getProductos()){
            System.out.println(producto.getDescripcion() + "\t" + producto.precioLista() + "\t" + producto.precioContado());
        }
        System.out.println("---------------------------------------");
        System.out.println("*** Total ------" + this.totalFinanciado() + "\t" + this.totalAlContado());
    }
}