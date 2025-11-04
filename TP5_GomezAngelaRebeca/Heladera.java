/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Heladera - Trabajo Practico 5
 */

public class Heladera extends ArtefactoHogar{
    private int pies;
    private int puertas;
    private boolean compresor;

    /**
     * Constructor para inicializar una instancia de Heladera.
     *
     * @param p_marca     marca de la heladera
     * @param p_precio    precio de la heladera
     * @param p_stock     cantidad en stock
     * @param p_pies      tamaño de la heladera en pies
     * @param p_puertas   número de puertas
     * @param p_compresor indica si la heladera tiene compresor
     */
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor) {
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }

    //accessors

    public int getPies() {
        return this.pies;
    }

    private void setPies(int p_pies) {
        this.pies = p_pies;
    }

    public int getPuertas() {
        return this.puertas;
    }

    private void setPuertas(int p_puertas) {
        this.puertas = p_puertas;
    }

    public boolean getCompresor() {
        return this.compresor;
    }

    private void setCompresor(boolean p_compresor) {
        this.compresor = p_compresor;
    }

    //metodos

    /**
     * Imprime los detalles de la heladera, incluyendo atributos específicos como pies, puertas y compresor.
     */
    @Override
    public void imprimir() {
        System.out.println("**** Heladera ****");
        super.imprimir();
        System.out.println("Pies: " + this.getPies());
        System.out.println("Puertas: " + this.getPuertas());

        System.out.println("Compresor: " + (this.getCompresor() ? "Si" : "No") );
    }

    /**
     * Calcula la cuota de crédito con un adicional si la heladera tiene compresor.
     * Si tiene compresor, se añade un seguro de $50 por cuota al valor de la cuota base.
     *
     * @param p_cuotas   número de cuotas
     * @param p_interes  porcentaje de interés aplicado
     * @return el costo de cada cuota, con el adicional si corresponde
     */
    @Override
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        float cuotaCredito = super.cuotaCredito(p_cuotas, p_interes);
        if (this.getCompresor()){
            float precioConInteres = cuotaCredito * p_cuotas;
            float seguro = 50 * p_cuotas;
            return (precioConInteres + seguro) / p_cuotas;

        }else {
            return cuotaCredito;
        }
    }
}
