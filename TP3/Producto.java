/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Producto - Trabajo Practico 3
 */
//Imports
import java.util.*;

public class Producto
{
    /**
     * Atributos de la clase
    */
    // Atributos
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param int p_codigo
    *@param String p_rubro
    *@param String p_desc
    *@param double p_costo
    *@param double p_porcPtoRepo
    *@param int p_existMinima
    *@param Laboratorio p_lab
    */
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
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param int p_codigo
    *@param String p_rubro
    *@param String p_desc
    *@param double p_costo
    *@param Laboratorio p_lab
    */
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
    /**
    *Setter,recibe un int y permite modificar el valor de el atributo codigo
    *@param int p_codigo
    */
    private void setCodigo(int p_codigo){ 
        this.codigo = p_codigo; 
    }
    
    /**
    *Setter,recibe un String y permite modificar el valor de el atributo rubro
    *@param String p_rubro
    */
    private void setRubro(String p_rubro){
        this.rubro = p_rubro; 
    }
    
    /**
    *Setter,recibe un String y permite modificar el valor de el atributo desc
    *@param String p_desc
    */
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc; 
    }
    
    /**
    *Setter,recibe un double y permite modificar el valor de el atributo costo
    *@param double p_costo
    */
    private void setCosto(double p_costo){
        this.costo = p_costo; 
    }
    
    /**
    *Setter,recibe un int y permite modificar el valor de el atributo stock
    *@param int p_stock
    */
    private void setStock(int p_stock){
        this.stock = p_stock; 
    }
    
    /**
    *Setter,recibe un double y permite modificar el valor de el atributo porcPtoRepo
    *@param double p_porc
    */
    private void setPorcPtoRepo(double p_porc){
        this.porcPtoRepo = p_porc; 
    }
    
    /**
    *Setter,recibe un int y permite modificar el valor de el atributo existMinima
    *@param int p_existMinima
    */
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima; 
    }
    
    /**
    *Setter,recibe un Laboratorio y permite modificar el valor de el atributo laboratorio
    *@param Laboratorio p_lab
    */
    private void setLaboratorio(Laboratorio p_lab){
        this.laboratorio = p_lab; 
    }

    // Getters públicos
    /**
    *Getter, permite obtener el valor de el atributo codigo
    *@return devuelve un int
    */
    public int getCodigo(){
        return this.codigo; 
    }
    
    /**
    *Getter, permite obtener el valor de el atributo rubro
    *@return devuelve un String
    */
    public String getRubro(){
        return this.rubro; 
    }
    
    /**
    *Getter, permite obtener el valor de el atributo descripcion
    *@return devuelve un String
    */
    public String getDescripcion(){
        return this.descripcion;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo costo
    *@return devuelve un double
    */
    public double getCosto(){
        return this.costo; 
    }
    
    /**
    *Getter, permite obtener el valor de el atributo stock
    *@return devuelve un int
    */
    public int getStock(){
        return this.stock; 
    }
    
    /**
    *Getter, permite obtener el valor de el atributo porcPtoRepo
    *@return devuelve un double
    */
    public double getPorcPtoRepo(){
        return this.porcPtoRepo; 
    }
    
    /**
    *Getter, permite obtener el valor de el atributo existMinima
    *@return devuelve un int
    */
    public int getExistMinima(){
        return this.existMinima; 
    }
    
    /**
    *Getter, permite obtener el valor de el atributo laboratorio
    *@return devuelve un Laboratorio
    */
    public Laboratorio getLaboratorio(){
        return this.laboratorio; 
    }

    // Métodos públicos
    /**
     *Metodo publico,Actualiza el stock utilizando el valor recibido por parametro
     *@param int p_cantidad
    */
    public void ajuste(int p_cantidad){
        this.setStock(this.getStock() + p_cantidad); 
    }

    /**
     *Metodo publico,Calcula el valor del stock
     *@return devuelve un double
    */
    public double stockValorizado(){
        return this.getStock() * this.getCosto() * 1.12; 
    }

    /**
     *Metodo publico,Calcula el precio de lista del producto
     *@return devuelve un double
    */
    public double precioLista(){
        return this.getCosto() * 1.12; 
    }

    /**
     *Metodo publico,Calcula el precio al contado del producto
     * @return devuelve un double
    */
    public double precioContado(){
        return this.precioLista() * 0.95; 
    }
    
    /**
     *Metodo publico,Actualiza el valor del porcentaje del punto de reposicion
     *@param double p_porc
    */
    public void ajustarPtoRepo(double p_porc){
        this.setPorcPtoRepo(p_porc); 
    }

    /**
     *Metodo publico,Actualiza el valor de la existencia minima del producto
     *@param int p_cantidad
    */
    public void ajustarExistMin(int p_cant){
        this.setExistMinima(p_cant); 
    }

    /**
     *Metodo publico,Muestra por pantalla los datos del laboratorio y del producto
    */
    public String mostrar(){
        return this.getLaboratorio().mostrar() + "\nRubro: " + this.getRubro() + "\nDescripción: " + this.getDescripcion() + "\nPrecio Costo: " + this.getCosto() + "\nStock: " + this.getStock() + " - Stock Valorizado: $" + this.stockValorizado();
    }

    /**
     *Metodo publico,Devuelve una cadena formada por la descripcion, el precio de lista
     *y el precio al contado del producto
     *@return devuelve un String
    */
    public String mostrarLinea(){
        return this.getDescripcion() + " - Lista: $" + this.precioLista() + " - Contado: $" + this.precioContado();
    }
}