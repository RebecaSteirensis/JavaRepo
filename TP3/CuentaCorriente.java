public class CuentaCorriente
{
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;

    public CuentaCorriente(int p_nroCuenta, Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setLimiteDescubierto(500);
    }
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
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
    
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
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
    
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    private boolean puedeExtraer(double p_importe){
        if(p_importe < (this.getSaldo() + this.getLimiteDescubierto())){
            return true;
        } else {
            return false;
        }
    }
    
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe) == true){
            this.extraccion(p_importe);
        }else{
            System.out.println("El importe de extraccion sobrepasa el limite de descubierto");
        }
    }
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }

    public void mostrar(){
        System.out.println("-\tCuenta Corriente\t-");
        System.out.println("Nro Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().ApeYNom());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}