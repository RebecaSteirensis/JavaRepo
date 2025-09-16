import java.util.ArrayList;
import java.util.HashSet;

/**
 *Permite liquidar los sueldos de los empleados de un Banco.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Banco {
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleados;
    private ArrayList<CuentaBancaria> cuentasBancarias;

    
    //constructores
     /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nombre      String;
     * @param p_localidad   Localidad;
     * @param p_nroSucursal int;
     * @param p_empleados   Empleado;
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<Empleado>());
        this.agregarEmpleado(p_empleado);
        this.setCuentasBancarias(new ArrayList<CuentaBancaria>());
    }
    
    /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nombre      String;
     * @param p_localidad   Localidad;
     * @param p_nroSucursal int;
     * @param p_empleados   ArrayList<Empleado>;
     */

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(new ArrayList<CuentaBancaria>());
    }
    /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nombre      String;
     * @param p_localidad   Localidad;
     * @param p_nroSucursal int;
     * @param p_empleados   ArrayList<Empleado>;
     * @param p_cuentas     ArrayList<Cuenta Bnacaria>;
     */

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados, ArrayList<CuentaBancaria> p_cuentasBancarias) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(p_cuentasBancarias);
    }

    
    //accessors
    public ArrayList<Empleado> getEmpleados() {
        return this.empleados;
    }

    private void setEmpleados(ArrayList<Empleado> p_empleados) {
        this.empleados = p_empleados;
    }

    public Localidad getLocalidad() {
        return this.localidad;
    }

    private void setLocalidad(Localidad p_localidad) {
        this.localidad = p_localidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public int getNroSucursal() {
        return this.nroSucursal;
    }

    private void setNroSucursal(int p_nroSucursal) {
        this.nroSucursal = p_nroSucursal;
    }
    
    // Fin de Acessors

    /**
     * Agrega empleado recibido por parametro.
     * 
     * @param p_empleados Empleado;
     * @return true o false segun si el empleado fue agregado a la coleccion.
     */

    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
      /**
     * Quita al empleado recibido por parametro.
     * 
     * @param p_empleados Empleado;
     * @return true o false segun si el empleado fue removido de la coleccion.
     */

     public boolean quitarEmpleado(Empleado p_empleado) {
        if (this.getEmpleados().size() == 1) {
            System.out.println("\nNo se puede eliminar toda la lista!\n");
            return false;
        } else {
            return this.getEmpleados().remove(p_empleado);
        }
    }

    public ArrayList<CuentaBancaria> getCuentasBancarias() {
        return this.cuentasBancarias;
    }

    private void setCuentasBancarias(ArrayList<CuentaBancaria> p_cuentasBancarias) {
        this.cuentasBancarias = p_cuentasBancarias;
    }
    
    /**
     * Agrega la cuenta recibida por parametro.
     * 
     * @param p_cuenta CuentaBancaria;
     * @return true o false segun si la cuenta fue agregada a la coleccion.
     */
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuentaBancaria){
        return this.getCuentasBancarias().add(p_cuentaBancaria);
    }
    
    /**
     * Quita la cuenta recibida por parametro.
     * 
     * @param p_cuenta CuentaBancaria;
     * @return true o false segun si la cuenta fue removida de la coleccion.
     */

    public boolean quitarCuentaBancaria(CuentaBancaria p_cuentaBancaria){
        return this.getCuentasBancarias().remove(p_cuentaBancaria);
    }

    /**Metodo recorre el Array*/
    public void listarSueldos(){
        for (Empleado unEmpleado : this.getEmpleados()) { //for(int i = 0; i<this.getEmpleados().size().i++)
            System.out.println(unEmpleado.mostrarLinea()); //System.out.println(this.getEmpleados.get(i).mostrarlinea());
        }
    }
    
    /**Metodo que calcula los sueldos de los empreados*/
    public double sueldosAPagar(){
        double acumulador = 0.0;

        for (Empleado unEmpleado : this.getEmpleados()){
            acumulador += unEmpleado.sueldoNeto();
        }
        return acumulador;
    }
    
    /**Metodo mostrar*/
    public void mostrar(){
        System.out.println("Banco: " + this.getNombre() + "\tSucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "\tProvincia: " + this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.println("Total a Pagar: ............................................. $" + this.sueldosAPagar());
    }

    /**Muestra por pantalla las cuentas cuyos saldos esten en 0.
     */
    public void listarCuentasConSaldoCero(){
            System.out.println("Cuentas Sin Saldo:");
            System.out.println("--- Cuenta -------------------- Apellido y Nombre ---------------");
            for (CuentaBancaria unaCuenta: this.getCuentasBancarias()){

                if (unaCuenta.getSaldo() == 0) {
                    System.out.println(unaCuenta.getNroCuenta() + "\t\t\t" + unaCuenta.getTitular().apeYNom());
                }
            }
        }
    
     /**
     * Permite conocer cuantas cuentas tienen un saldo mayor a 0, estan activas.
     */
    public int cuentasSaldoActivo(){
        int cuentasActivas = 0;

        for (CuentaBancaria unaCuenta : this.getCuentasBancarias()){
            if (unaCuenta.getSaldo() > 0) {
                cuentasActivas++;
            }
        }
        return cuentasActivas;
    }
     /**Metodo que permite agregar nombres de titulares sin duplicados, sin un orden*/
    public HashSet<Persona> listaDeTitulares(){
        HashSet<Persona> titulares = new HashSet();
        for (CuentaBancaria unaCuenta : this.getCuentasBancarias()) {
             titulares.add(unaCuenta.getTitular());
        }
        return titulares;
    }
    
     /**
     * Muestra los datos del banco y un resumen de las cuentas bancarias.
     */
    public void mostrarResumen(){
        int cuentasSaldoCero = 0;
        System.out.println("Banco: " + this.getNombre() + "\t\t\tSucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "\t\tProvincia: " + this.getLocalidad().getProvincia());
        System.out.println( "************************************************************" +
                            "RESUMEN DE CUENTAS BANCARIAS" +
                            "************************************************************");
        for (CuentaBancaria unaCuenta: this.getCuentasBancarias()){
            if (unaCuenta.getSaldo() == 0) {
                cuentasSaldoCero++;
            }
        }
        System.out.println("Número total de Cuentas Bancarias: " + (cuentasSaldoCero + this.cuentasSaldoActivo()));
        System.out.println("Cuentas Activas: " + this.cuentasSaldoActivo());
        System.out.println("Cuentas Saldo Cero: " + cuentasSaldoCero);


        System.out.println("-------------------------------------------------------------------------------------------");
        this.listarCuentasConSaldoCero();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("Listado de clientes: " );

        for(Persona titular : this.listaDeTitulares()){
        System.out.println(titular.apeYNom()+ ";");
        }
    }

}
