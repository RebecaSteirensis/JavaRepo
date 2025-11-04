/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase CuentaCorriente - Trabajo Practico 5
 */
public class CuentaCorriente extends CuentaBancaria
{
    /**
     * Atributos de la clase
    */
    private double limiteDescubierto;
    
    /**
    *Constructor con parametros, instancia un objeto
    *@param int p_nroCuenta
    *@param Persona p_titular
    *@param double p_saldo
    */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        super(p_nroCuenta, p_titular, p_saldo);
        this.setLimiteDescubierto(500);
    }
    
    /**
    *Getter, retorna el valor del atributo limiteDescubierto
    *@return devuelve un double
    */
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
    *Setter, recibe un double y permite modificar el valor del atributo limiteDescubierto
    *@param double p_limite
    */
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
    }
    
    /**
     * Metodo privado, comprueba si el cliente puede realizar extracciones
     *@param double p_importe
     *@return devuelve un booleano
    */
    public boolean puedeExtraer(double p_importe){
        if(p_importe <= (super.getSaldo() + this.getLimiteDescubierto())){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Metodo publido, recibe un importe por parametro y devuelve un String del motivo
     * de la imposibilidad de la extraccion
     * @param double p_importe
     * @return String
    */
    public String xQNoPuedeExtraer(double p_importe){
        if(this.puedeExtraer(p_importe) == false){
            return "El importe es muy alto";
        }else{
            return "Extraccion realizada";
        }
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