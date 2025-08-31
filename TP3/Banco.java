public class Banco
{
    public static void main(String[] args){
        Persona persona1 = new Persona(40047821, "Facundo", "Fernandez", 1996);
        
        CajaDeAhorro caja1 = new CajaDeAhorro(2135, persona1, 155.25);
        CuentaCorriente cuenta1 = new CuentaCorriente(1735, persona1, 1500);
        
        caja1.mostrar();
        cuenta1.mostrar();
    }
}