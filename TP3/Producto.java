
//Imports
import java.util.*;

public class Producto
{
    // Atributos
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    // Constructor completo de consulta
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo,
                    double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
        this.setStock(0);
    }

    // Constructor alternativo
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setLaboratorio(p_lab);
        this.setStock(0);
    }

    // Setters privados
    private void setCodigo(int p_codigo){ 
        this.codigo = p_codigo; 
    }
    
    private void setRubro(String p_rubro){
        this.rubro = p_rubro; 
    }
    
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc; 
    }
    
    private void setCosto(double p_costo){
        this.costo = p_costo; 
    }
    
    private void setStock(int p_stock){
        this.stock = p_stock; 
    }
    private void setPorcPtoRepo(double p_porc){
        this.porcPtoRepo = p_porc; 
    }
    
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima; 
    }
    
    private void setLaboratorio(Laboratorio p_lab){
        this.laboratorio = p_lab; 
    }

    // Getters públicos
    public int getCodigo(){
        return this.codigo; 
    }
    
    public String getRubro(){
        return this.rubro; 
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public double getCosto(){
        return this.costo; 
    }
    
    public int getStock(){
        return this.stock; 
    }
    
    public double getPorcPtoRepo(){
        return this.porcPtoRepo; 
    }
    
    public int getExistMinima(){
        return this.existMinima; 
    }
    
    public Laboratorio getLaboratorio(){
        return this.laboratorio; }

    // Métodos públicos
    public void ajuste(int p_cantidad){
        this.setStock(this.getStock() + p_cantidad); 
    }

    public double stockValorizado(){
        return this.getStock() * this.getCosto() * 1.12; 
    }

    public double precioLista(){
        return this.getCosto() * 1.12; 
    }

    public double precioContado(){
        return this.precioLista() * 0.95; 
    }

    public void ajustarPtoRepo(double p_porc){
        this.setPorcPtoRepo(p_porc); 
    }

    public void ajustarExistMin(int p_cant){
        this.setExistMinima(p_cant); 
    }

    public String mostrar(){
        return this.getLaboratorio().mostrar() + "\n Domicilio: " + this.getLaboratorio().getDomicilio() + "\nRubro: " + this.getRubro() + "\nDescripción: " + this.getDescripcion() + "\nPrecio Costo: " + this.getCosto() + "\nStock: " + this.getStock() + " - Stock Valorizado: $" + this.stockValorizado();
    }

    public String mostrarLinea(){
        return this.getDescripcion() + " - Lista: $" + this.precioLista() + " - Contado: $" + this.precioContado();
    }
}