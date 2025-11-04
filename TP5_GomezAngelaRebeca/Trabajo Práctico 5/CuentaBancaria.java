/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase CuentaBancaria - Trabajo Practico 5
 */
public abstract class CuentaBancaria
{
    private int nroCuenta;
    private Persona titular;
    private double saldo;
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setTitular(p_titular);
    }
    
    public int getNroCuenta() {
        return this.nroCuenta;
    }

    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    public Persona getTitular() {
        return this.titular;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }
    
    public abstract boolean puedeExtraer(double p_importe);
    
    public boolean extraer(double p_importe){
        if(this.puedeExtraer(p_importe) == true){
            this.setSaldo(this.getSaldo() - p_importe);
            return true;
        }else{
            return false;
        }
    }
    
    public abstract String xQNoPuedeExtraer(double p_importe);
    
    public double depositar(double p_importe){
        if(p_importe > 0){
            this.setSaldo(this.getSaldo() + p_importe);
            return this.getSaldo();
        }else{
            System.out.println("Ingrese un importe mayor a cero");
            return this.getSaldo();
        }
    }
    
    public abstract void mostrar();
}