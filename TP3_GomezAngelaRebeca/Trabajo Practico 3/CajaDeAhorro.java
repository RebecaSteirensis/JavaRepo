/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase CajaDeAhorro - Trabajo Practico 3
 */
public class CajaDeAhorro
{
    /**
     * Atributos de la clase
    */
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;

    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param int p_nroCuenta
    *@param Persona p_titular
    */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);
    }
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param int p_nroCuenta
    *@param Persona p_titular
    *@param double p_saldo
    */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
    }
    
    /**
    *Setter,recibe un entero y permite modificar el valor de el atributo nroCuenta
    *@param int p_nroCuenta
    */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
    *Setter,recibe un double y permite modificar el valor de el atributo saldo
    *@param double p_saldo
    */
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    /**
    *Setter,recibe un entero y permite modificar el valor de el atributo extracciones
    *@param int p_extraccionesPosibles
    */
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    
    /**
    *Setter,recibe una Persona y permite modificar el valor de el atributo titular
    *@param Persona p_titular
    */
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo nroCuenta
    *@return devuelve un valor entero
    */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo saldo
    *@return devuelve un valor double
    */
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo extraccionesPosibles
    *@return devuelve un valor entero
    */
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    /**
    *Getter, permite obtener el valor de el atributo titular
    *@return devuelve un valor Persona
    */
    public Persona getTitular(){
        return this.titular;
    }
    
    /**
     * Metodo privado,comprueba si el cliente puede realizar extracciones
     *@param double p_importe
     *@return devuelve un booleano
    */
    private boolean puedeExtraer(double p_importe){
        if((p_importe < this.getSaldo()) && (this.getExtraccionesPosibles() != 0)){
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
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    /**
     * Metodo publico, cordina la operacion extraccion
     * @param double p_importe
    */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe) == true){
            this.extraccion(p_importe);
        }else{
            if(this.getExtraccionesPosibles() == 0){
                System.out.println("No tiene habilitadas mas extracciones!");
            } else{
                System.out.println("No puede extraer mas que el saldo!");
            }
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
        System.out.println("Caja de ahorro-");
        System.out.println("Nro Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}