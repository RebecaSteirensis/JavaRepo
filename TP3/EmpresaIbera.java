
/**
 * Write a description of class EmpresaIbera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class EmpresaIbera {
    public static void main(String[] args) {
        // Gerente General
        EmpleadoConJefe gerente = new EmpleadoConJefe(20123456789L, "Bulgheri", "Gregorio", 5000.0, 2000);

        // Empleados con jefe
        EmpleadoConJefe empleado1 = new EmpleadoConJefe(20351234385L, "Perez", "Juan", 3000.0, 2001, gerente);
        EmpleadoConJefe empleado2 = new EmpleadoConJefe(20351234567L, "Gomez", "Maria", 3200.0, 2005, gerente);

        // Mostrar información
        gerente.mostrarPantalla();
        empleado1.mostrarPantalla();
        empleado2.mostrarPantalla();

        // Emitir permiso de salida
        empleado1.emitirPermisoSalida();
        empleado2.emitirPermisoSalida();
    }
}
