
/**
 * Write a description of class Lavarropas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lavarropas extends ArtefactoHogar{
    private int programas;
    private float kilos;
    private boolean automatico;

    /**
     * Constructor para inicializar una instancia de Lavarropas.
     *
     * @param p_marca      marca del lavarropas
     * @param p_precio     precio del lavarropas
     * @param p_stock      cantidad en stock
     * @param p_programas  cantidad de programas disponibles
     * @param p_kilos      capacidad en kilos de carga
     * @param p_automatico indica si el lavarropas es automático
     */
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos, boolean p_automatico) {
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }

    //accessors

    public int getProgramas() {
        return this.programas;
    }

    private void setProgramas(int p_programas) {
        this.programas = p_programas;
    }

    public float getKilos() {
        return this.kilos;
    }

    private void setKilos(float p_kilos) {
        this.kilos = p_kilos;
    }

    public boolean getAutomatico() {
        return this.automatico;
    }

    private void setAutomatico(boolean p_automatico) {
        this.automatico = p_automatico;
    }

    //metodos

    /**
     * Imprime los detalles del lavarropas, incluyendo sus atributos específicos como
     * programas, kilos de carga y si es automático.
     */
    @Override
    public void imprimir() {
        System.out.println("**** Lavarropas ****");
        super.imprimir();
        System.out.println("Programas: " + this.getProgramas());
        System.out.println("Kilos: " + this.getKilos());
        System.out.println("Automatico: " + (this.getAutomatico() ? "Si" : "No"));
    }

    /**
     * Calcula la cuota de crédito con un descuento si el lavarropas no es automático.
     * Si no es automático, se aplica un 20% de descuento a la cuota de crédito base.
     *
     * @param p_cuotas   número de cuotas
     * @param p_interes  porcentaje de interés aplicado
     * @return el costo de cada cuota, con el descuento si corresponde
     */
    @Override
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        float cuotaCredito = super.cuotaCredito(p_cuotas, p_interes);
        if (this.getAutomatico()){
            return cuotaCredito;
        }else {
            float descuento = cuotaCredito * 0.2f;
            return cuotaCredito - descuento;
        }
    }
}
