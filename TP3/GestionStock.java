public class GestionStock
{
    public static void main(String[] args){
        Laboratorio lab1 = new Laboratorio("Colgate S.A.", "Scalabrini Ortiz 5524", "54-11-4239-8447", 500, 15);
        Producto p1 = new Producto(1, "Perfumería", "Jabón Deluxe", 5.25, lab1);

        p1.ajuste(500);
        System.out.println(p1.mostrar());

        System.out.println("\nSe destruyen 200 productos...");
        p1.ajuste(-200);
        System.out.println(p1.mostrar());

        System.out.println("\nConsulta de precios:");
        System.out.println(p1.mostrarLinea());
        
        Laboratorio lab2 = new Laboratorio("Colgate S.A.", "Scalabrini Ortiz 5524", "54-11-4239-8447", 500, 15);
        Producto p2 = new Producto(1, "Perfumería", "Jabón Deluxe", 5.25, lab1);

        p2.ajuste(500);
        System.out.println(p2.mostrar());

        System.out.println("\nSe agregan 341 productos...");
        p2.ajuste(341);
        System.out.println(p1.mostrar());

        System.out.println("\nConsulta de precios:");
        System.out.println(p1.mostrarLinea());
    }
}