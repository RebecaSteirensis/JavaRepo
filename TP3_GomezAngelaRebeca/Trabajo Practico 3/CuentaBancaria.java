/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase CuentaBancaria - Trabajo Practico 3
 */
public class CuentaBancaria
{
    /**
    *Atributos de la Clase 
    */
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    /**
    *Constructor con parametros, instancia un objeto
    *@param int p_nroCuenta
    *@param Persona p_titular
    */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }
    
    /**
    *Constructor con parametros, instancia un objeto
    *@param int p_nroCuenta
    *@param Persona p_titular
    *@param double p_saldo
    */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    /**
    *Setter, recibe un int y permite modificar el valor del atributo nroCuenta
    *@param int p_nroCuenta
    */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
    *Setter, recibe un double y permite modificar el valor del atributo saldo
    *@param double p_saldo
    */
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    /**
    *Setter, recibe un Persona y permite modificar el valor del atributo titular
    *@param Persona p_titular
    */
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    /**
    *Getter, retorna el valor del atributo nroCuenta
    *@return devuelve un entero
    */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    /**
    *Getter, retorna el valor del atributo saldo
    *@return devuelve un double
    */
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
    *Getter, retorna el valor del atributo titular
    *@return devuelve una Persona
    */
    public Persona getTitular(){
        return this.titular;
    }
    
    /**
    *Metodo publico,recibe un importe por parametro para depositar
    * @param double p_importe
    * @return devuelve un double
    */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        
        return this.getSaldo();
    }
    
    /**
    * Metodo publico,recibe un importe para extraer
    * @param double p_importe
    * @return devuelve un double
    */
    public double extraer(double p_importe)
    {
        this.setSaldo(this.getSaldo() - p_importe);
        
        return this.getSaldo();
    }
    
    /**
    *Metodo publico,muestra por pantalla los datos del titular 
    */
    public void mostrar(){
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: " + this.getTitular().getNombre() + " " + this.getTitular().getApellido() + " (" + this.getTitular().edad() + " años)");
        System.out.println("Saldo: " + this.getSaldo());
    }
    
    /**
    * Metodo publico,devuelde una cadena formada con los datos del titular
    * @return devuelve un String
    */
    public String toString(){
        return this.getNroCuenta() + "\t" + this.getTitular().getNombre() + " " + this.getTitular().getApellido() + "\t" + this.getSaldo();
    }
}