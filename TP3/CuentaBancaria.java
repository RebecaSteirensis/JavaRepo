public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    /**
     * Constructor for objects of class CuentaBancaria
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        
        return this.getSaldo();
    }

    public double extraer(double p_importe)
    {
        this.setSaldo(this.getSaldo() - p_importe);
        
        return this.getSaldo();
    }
    
    public void mostrar(){
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: " + this.getTitular().getNombre() + " " + this.getTitular().getApellido() + " (" + this.getTitular().edad() + " años)");
        System.out.println("Saldo: " + this.getSaldo());
    }
    
    public String toString(){
        return this.getNroCuenta() + "\t" + this.getTitular().getNombre() + " " + this.getTitular().getApellido() + "\t" + this.getSaldo();
    }
}