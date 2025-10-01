public class Gestioncomercio {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(30100623, "Gonzalez", "Juan", 1600, 1990);
        Empleado empleado2 = new Empleado(37045987, "Martinez", "Mercedes", 3300, 1999);
        Empleado empleado3 = new Empleado(32550096, "Gomez", "Virginia", 5550, 2000);

        Comercio unComercio = new Comercio("Avanti SRL");

        unComercio.altaEmpleado(empleado1);
        unComercio.altaEmpleado(empleado2);
        unComercio.altaEmpleado(empleado3);

        unComercio.nomina();

        unComercio.bajaEmpleado(30100623);

        unComercio.nomina();
    }
}
