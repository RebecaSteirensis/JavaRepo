
/**
 * Write a description of class ArtefactoHogar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class ArtefactoHogar {
    private String marca;
    private float precio;
    private int stock;

    /**
     * Constructor de la clase ArtefactoHogar.
     *
     * @param p_marca marca del artefacto
     * @param p_precio precio del artefacto
     * @param p_stock cantidad disponible en stock
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock) {
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }

    //accessors
    public String getMarca() {
        return this.marca;
    }

    private void setMarca(String p_marca) {
        this.marca = p_marca;
    }

    public float getPrecio() {
        return this.precio;
    }

    private void setPrecio(float p_precio) {
        this.precio = p_precio;
    }

    public int getStock() {
        return this.stock;
    }

    private void setStock(int p_stock) {
        this.stock = p_stock;
    }
    //metodos
    /**
     * Imprime la información básica del artefacto, incluyendo marca, precio y stock.
     */
    public void imprimir(){
        System.out.println("Marca: " + this.getMarca() +
                            "\t-\t Precio: " + this.getPrecio() +
                            "\t-\t Stock: " + this.getStock());
    }
    
    /**
     * Calcula la cuota mensual para un crédito, considerando un número de cuotas y un interés.
     *
     * @param p_cuotas número de cuotas
     * @param p_interes porcentaje de interés aplicado
     * @return el monto de cada cuota
     */
    public float cuotaCredito(int p_cuotas, float p_interes){
        float valorDelInteres = this.getPrecio() * (p_interes / 100);
        float interesConCuotas = valorDelInteres * p_cuotas;
        return (this.getPrecio() + interesConCuotas) / p_cuotas;
    }

    /**
     * Calcula el crédito con un adicional específico, según las implementaciones concretas
     * de las clases que hereden de `ArtefactoHogar`.
     *
     * @param p_cuotas número de cuotas
     * @param p_interes porcentaje de interés aplicado
     * @return el costo total con adicionales
     */
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);
}
