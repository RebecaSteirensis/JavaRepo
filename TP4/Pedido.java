import java.util.*;

public class Pedido
{
    private Calendar fecha;
    private ArrayList<Producto> productos;
    private Cliente cliente;

    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_producto);
    }

    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    
    private void setProductos(ArrayList<Producto> p_productos){
        for(int i = 0; i < p_productos.size(); i++){
            Producto productoTemp = p_productos.get(i);
            
            this.productos.add(productoTemp);
        }
    }
    
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    
    public Calendar getFecha(){
        return this.fecha;
    }
    
    public ArrayList<Producto> getProductos(){
        return this.productos;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    
}