/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase CajaDeAhorro - Trabajo Practico 5
 */
public class CajaDeAhorro extends CuentaBancaria
{

    /**
     * Atributos de la clase
    */
   private int extraccionesPosibles;
   
   /**
     * Constructor de la clase CajaDeAhorro
     * @param p_nroCuenta numero de cuenta
     * @param p_titular titular
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular) {
        super(p_nroCuenta, p_titular, 0.0);
        this.setExtraccionesPosibles(10);
    }

    /**
     * Constructor de la clase CajaDeAhorro
     * @param p_nroCuenta numero de cuenta
     * @param p_titular titular
     * @param p_saldo saldo
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo) {
        super(p_nroCuenta, p_titular, p_saldo);
        this.setExtraccionesPosibles(10);
    }

    //accessors

    /**
     * Devuelve las Extracciones posibles
     * @return extracciones posibles
     */
    public int getExtraccionesPosibles() {
        return this.extraccionesPosibles;
    }

    /**
     * Establece el número de extracciones posibles para la cuenta.
     *
     * @param p_extraccionesPosibles el número de extracciones permitidas a establecer
     */
    private void setExtraccionesPosibles(int p_extraccionesPosibles) {
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    
    /**
     * Metodo privado,comprueba si el cliente puede realizar extracciones
     *@param double p_importe
     *@return devuelve un booleano
    */
    public boolean puedeExtraer(double p_importe){
        if(p_importe <= super.getSaldo()){
            return true;
        } else{
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
            return "No puede extraer mas que el saldo";
        }else{
            return "Extraccion realizada con exito";
        }
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