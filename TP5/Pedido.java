import java.util.ArrayList;
/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Pedido {
    private ArrayList<Renglon> renglones;

    /**
     * Constructor que inicializa un pedido con un solo renglón.
     *
     * @param p_renglon Renglón a agregar al pedido.
     */
    public Pedido(Renglon p_renglon){
        this.setRenglones(new ArrayList<Renglon>());
        this.agregarRenglon(p_renglon);
    }

    /**
     * Constructor que inicializa un pedido con una lista de renglones.
     *
     * @param p_renglones Lista de renglones a agregar al pedido.
     */
    public Pedido(ArrayList<Renglon> p_renglones) {
        this.setRenglones(p_renglones);
    }
    //accessors

    /**
     * Obtiene la lista de renglones del pedido.
     *
     * @return Lista de renglones.
     */
    public ArrayList<Renglon> getRenglones() {
        return this.renglones;
    }

    /**
     * Establece la lista de renglones del pedido.
     *
     * @param p_renglones Lista de renglones.
     */
    private void setRenglones(ArrayList<Renglon> p_renglones) {
        this.renglones = p_renglones;
    }

    //metodos

    /**
     * Agrega un nuevo renglón al pedido.
     *
     * @param p_renglon Renglón a agregar.
     */
    public void agregarRenglon(Renglon p_renglon){
        this.getRenglones().add(p_renglon);
    }

    /**
     * Quita un renglón del pedido.
     *
     * @param p_renglon Renglón a quitar.
     * @return true si el renglón fue eliminado, false de lo contrario.
     */
    public boolean quitarRenglon(Renglon p_renglon){
        return this.getRenglones().remove(p_renglon);
    }

    /**
     * Muestra la información del pedido, incluyendo cada renglón,
     * su precio y el total del pedido.
     */
    public void mostrar(){
        int i = 1;
        int cantidades = 0;
        double total= 0.0;
        System.out.println("Pedido:");
        System.out.println("Cantidad de items: " + this.getRenglones().size());
        for (Renglon unRenglon : this.getRenglones()){
            System.out.println("Item " + i + ": ");
            unRenglon.mostrar();
            System.out.println("Precio: $" + unRenglon.getItem().precio(unRenglon.getCantidad()));
            cantidades += unRenglon.getCantidad();
            total += unRenglon.getItem().precio(unRenglon.getCantidad());
            i ++;
        }
        System.out.println("Total pedido: " + cantidades + " Etiquetas por un importe total de: " + total);

    }
}
