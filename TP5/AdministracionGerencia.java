public class AdministracionGerencia {
    public static void main(String[] args) {
        Hotel guarani = new Hotel("Hotel Guarani", 70, 7, "DOBLE");
        guarani.agregarServicio(new Servicio("internet", 5));
        guarani.agregarServicio(new Servicio("lavanderia", 20));

        Cabaña alondra = new Cabaña("Cabañas La Alondra", 120, 5, 3);
        alondra.agregarServicio(new Servicio("lavanderia", 20));
        alondra.agregarServicio(new Servicio("auto", 100));
        Cabaña villas = new Cabaña("Cabañasas Villas", 100, 7, 5);

        Gerencia arroyos = new Gerencia("Gerencia Los Arroyos");
        arroyos.agregarAlojamiento(guarani);
        arroyos.agregarAlojamiento(alondra);
        arroyos.agregarAlojamiento(villas);

        arroyos.mostrarLiquidacion();

    }
}