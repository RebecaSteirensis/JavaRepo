/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Cocina - Trabajo Practico 5
 */

public class Cocina extends ArtefactoHogar{
    private int hornallas;
    private int calorias;
    private String dimensiones;

    /**
     * Constructor para inicializar una instancia de Cocina.
     *
     * @param p_marca       marca de la cocina
     * @param p_precio      precio de la cocina
     * @param p_stock       cantidad en stock
     * @param p_hornallas   número de hornallas de la cocina
     * @param p_calorias    cantidad de calorías de la cocina
     * @param p_dimensiones dimensiones de la cocina
     */
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones) {
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }
    //accessors
    public int getHornallas() {
        return this.hornallas;
    }

    private void setHornallas(int p_hornallas) {
        this.hornallas = p_hornallas;
    }

    public int getCalorias() {
        return this.calorias;
    }

    private void setCalorias(int p_calorias) {
        this.calorias = p_calorias;
    }

    public String getDimensiones() {
        return this.dimensiones;
    }

    private void setDimensiones(String p_dimensiones) {
        this.dimensiones = p_dimensiones;
    }
    //metodos

    /**
     * Imprime la información detallada de la cocina, incluyendo atributos específicos como
     * hornallas, calorías y dimensiones.
     */
    @Override
    public void imprimir() {
        System.out.println("**** Cocina ****");
        super.imprimir();
        System.out.println("Hornallas: " + this.getHornallas());
        System.out.println("Calorias: " + this.getCalorias());
        System.out.println("Dimensiones: " + this.getDimensiones());
    }

    /**
     * Calcula la cuota de crédito con un adicional específico para la cocina.
     *
     * @param p_cuotas   número de cuotas
     * @param p_interes  porcentaje de interés aplicado
     * @return el costo total de la cuota con intereses
     */
    @Override
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        return super.cuotaCredito(p_cuotas, p_interes);
    }
}
