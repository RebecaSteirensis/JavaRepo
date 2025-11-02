/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Comercio - Trabajo Practico 5
 */

public class Comercio {
    public static void main(String[] args) {
        Cocina volcan = new Cocina("Volcan", 600,15,  4, 2000, "80*60*60cm");
        Heladera gafa = new Heladera("Gafa", 1200, 8, 11, 2, true);
        Lavarropas drean = new Lavarropas("Drean", 650, 10, 10, 40, false);

        volcan.imprimir();
        System.out.println("Valor Cuota: " + volcan.cuotaCredito(6, 2.53f));
        System.out.println("Valor Cuota Con Adicionales: " + volcan.creditoConAdicional(6, 2.53f));
        gafa.imprimir();
        System.out.println("Valor Cuota: " + gafa.cuotaCredito(6, 2.53f));
        System.out.println("Valor Cuota Con Adicionales: " + gafa.creditoConAdicional(6, 2.53f));
        drean.imprimir();
        System.out.println("Valor Cuota: " + drean.cuotaCredito(6, 2.53f));
        System.out.println("Valor Cuota Con Adicionales: " + drean.creditoConAdicional(6, 2.53f));
    }
}