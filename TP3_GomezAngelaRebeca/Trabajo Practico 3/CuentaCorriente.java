/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase CuentaCorriente - Trabajo Practico 3
 */
public class CuentaCorriente
{
    /**
     * Atributos de la clase
    */
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;

    /**
    *Constructor con parametros, instancia un objeto
    *@param int p_nroCuenta
    *@param Persona p_titular
    */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setLimiteDescubierto(500);
    }
    
    /**
    *Constructor con parametros, instancia un objeto
    *@param int p_nroCuenta
    *@param Persona p_titular
    *@param double p_saldo
    */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
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
    *Setter, recibe una Persona y permite modificar el valor del atributo titular
    *@param Persona p_titular
    */
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    /**
    *Setter, recibe un double y permite modificar el valor del atributo limiteDescubierto
    *@param double p_limite
    */
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
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
    *Getter, retorna el valor del atributo limiteDescubierto
    *@return devuelve un double
    */
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
     * Metodo privado, comprueba si el cliente puede realizar extracciones
     *@param double p_importe
     *@return devuelve un booleano
    */
    private boolean puedeExtraer(double p_importe){
        if(p_importe < (this.getSaldo() + this.getLimiteDescubierto())){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Metodo privado, realiza la extraccion
     * @param double p_importe
    */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }

    /**
     * Metodo publico, cordina la operacion extraccion
     * @param double p_importe
    */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe) == true){
            this.extraccion(p_importe);
        }else{
            System.out.println("El importe de extraccion sobrepasa el limite de descubierto");
        }
    }
    
    /**
     * Metodo publico, recibe un importe por parametro para depositar
     * @param double p_importe
    */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }

    /**
     * Metodo publico, muestra por pantalla los datos de la caja de ahorro y de su titular
    */
    public void mostrar(){
        System.out.println("-\tCuenta Corriente\t-");
        System.out.println("Nro Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().ApeYNom());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}