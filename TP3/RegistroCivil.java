
/**
 * Write a description of class RegistroCivil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegistroCivil {
    public static void main(String[] args) {
        Mujer m1 = new Mujer("María", "Gómez", 28);
        Hombre h1 = new Hombre("Pedro", "Leyes", 29);

        m1.mostrarEstadoCivil();
        h1.mostrarEstadoCivil();

        System.out.println("\n--- Se casan ---");
        m1.casarseCon(h1);

        m1.mostrarEstadoCivil();
        h1.mostrarEstadoCivil();
    }
}