import java.util.*;

/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Banco - Trabajo Practico 4
 */
public class Banco {
    /**
    *Atributos de la Clase 
    */
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
    /**
    *Getter, permite obtener el valor de el atributo empleados
    *@return devuelve un ArrayList<Empleado>
    */
    public ArrayList<Empleado> getEmpleados() {
        return this.empleados;
    }

    /**
    *Setter,recibe un ArrayList<Empleado> y permite modificar el valor de el atributo empleados
    *@param ArrayList<Empleado> p_empleados
    */
    private void setEmpleados(ArrayList<Empleado> p_empleados) {
        this.empleados = p_empleados;
    }

    /**
    *Getter, permite obtener el valor de el atributo localidad
    *@return devuelve una Localidad
    */
    public Localidad getLocalidad() {
        return this.localidad;
    }

    /**
    *Setter,recibe un Localidad y permite modificar el valor de el atributo localidad
    *@param Localidad p_localidad
    */
    private void setLocalidad(Localidad p_localidad) {
        this.localidad = p_localidad;
    }

    /**
    *Getter, permite obtener el valor de el atributo nombre
    *@return devuelve un String
    */
    public String getNombre() {
        return this.nombre;
    }

    /**
    *Setter,recibe un String y permite modificar el valor de el atributo nombre
    *@param String p_nombre
    */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
    *Getter, permite obtener el valor de el atributo nroSucursal
    *@return devuelve un int
    */
    public int getNroSucursal() {
        return this.nroSucursal;
    }

    /**
    *Setter,recibe un int y permite modificar el valor de el atributo nroSucursal
    *@param Localidad p_nroSucursal
    */
    private void setNroSucursal(int p_nroSucursal) {
        this.nroSucursal = p_nroSucursal;
    }

    /**
    *Getter, permite obtener el valor de el atributo cuentasBancarias
    *@return devuelve un ArrayList<CuentaBancaria>
    */
    public ArrayList<CuentaBancaria> getCuentasBancarias() {
        return this.cuentasBancarias;
    }

    /**
    *Setter,recibe un ArrayList<CuentaBancaria> y permite modificar el valor de el atributo cuentasBancarias
    *@param ArrayList<CuentaBancaria> p_cuentas
    */
    private void setCuentasBancarias(ArrayList<CuentaBancaria> p_cuentasBancarias) {
        this.cuentasBancarias = p_cuentasBancarias;
    }
    
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

    /**
     * Metodo publico, lista los datos del empleado y el total a pagar
    */
    public void listarSueldos(){
        for (Empleado unEmpleado : this.getEmpleados()) { //for(int i = 0; i<this.getEmpleados().size().i++)
            System.out.println(unEmpleado.mostrarLinea()); //System.out.println(this.getEmpleados.get(i).mostrarlinea());
        }
    }
    
    /**
     * Metodo publico, calcula la suma de sueldos de los empleados
    */
    public double sueldosAPagar(){
        double acumulador = 0.0;

        for (Empleado unEmpleado : this.getEmpleados()){
            acumulador += unEmpleado.sueldoNeto();
        }
        return acumulador;
    }
    
    /**
     * Muestra los datos de el banco
    */
    public void mostrar(){
        System.out.println("Banco: " + this.getNombre() + "\tSucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "\tProvincia: " + this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.println("Total a Pagar: ............................................. $" + this.sueldosAPagar());
    }

    /**
     * Metodo publico, Muestra los datos de las cuentas con saldo en 0
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
     * Metodo privado, devuelve la cantidad de cuentas con saldo positivo
     * @return devuelve un int
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
    
    /**
    * Metodo que permite agregar nombres de titulares sin duplicados, sin un orden
    */
    public HashSet<Persona> listaDeTitulares(){
        HashSet<Persona> titulares = new HashSet();
        for (CuentaBancaria unaCuenta : this.getCuentasBancarias()) {
             titulares.add(unaCuenta.getTitular());
        }
        return titulares;
    }
    
     /**
     * Metodo publico, Muestra el total de cuentas del banco
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
