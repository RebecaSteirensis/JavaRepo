/**
 * Clase ejecutable (main)
 */
public class ClienteEjecutable
{
    public static void main(String[] args){
        Cliente cliente1 = new Cliente(40047821, "Fernandez", "Facundo", 400.32);
        
        cliente1.mostrar();
        
        cliente1.agregarSaldo(400);
        cliente1.nuevoSaldo(40.21);
        
        cliente1.mostrar();
    }
}