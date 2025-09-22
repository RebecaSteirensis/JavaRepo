
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CuentaBancaria {
    private int nroCuenta;
    private  double saldo;
    private Persona titular;

    /**
     * Constructor de la clase CuentaBancaria
     * @param p_titular titular
     * @param p_nroCuenta numero de cuenta
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular) {
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0.0);
    }

    /**
     *  Constructor de la clase CuentaBancaria
     * @param p_nroCuenta numero de cuenta
     * @param p_titular titular
     * @param p_saldo saldo
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);

    }
//accsessors

    /**
     * devuelve el numero de cuenta
     * @return numero de cuenta
     */
    public int getNroCuenta() {
        return this.nroCuenta;
    }

    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    /**
     * Devuelve el saldo
     * @return saldo
     */
    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    /**
     * Devuelve el titular que es de la clase Persona
     * @return titular
     */
    public Persona getTitular() {
        return this.titular;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    //metodos

    /**
     * Incrementa el saldo actual con el monto pasado como parametro
     * @param p_importe importe
     * @return el saldo
     */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }

    /**
     * Decrementa  el saldo actual
     * @param p_importe importe
     * @return el saldo
     */
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return this.getSaldo();
    }

    /**
     * Muestra el titular la edad y su saldo
     */
    public void mostrar(){

        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: " + this.getTitular().nomYApe() + " (" + this.getTitular().edad() + " años)");
        System.out.println("Saldo: " + this.getSaldo());
    }

    /**
     * Devuelve un string con numero de cuenta, nombre ya pellido del titular y el saldo
     * @return numero de cuenta nombre y apellido y saldo
     */
    public String toString() {
        return  this.getNroCuenta() + this.getTitular().nomYApe() + this.getSaldo();
    }
}