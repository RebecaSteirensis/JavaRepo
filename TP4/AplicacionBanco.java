
/**
 * Write a description of class AplicacionBanco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AplicacionBanco {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
        cuentas.add(new CuentaBancaria(12312, new Persona(123123, "perez", "juan", 1990)));
        cuentas.add(new CuentaBancaria(2, new Persona(324523, "juan", "perez", 1991)));
        cuentas.add(new CuentaBancaria(3, new Persona(4564, "maria", "jose", 1992), 123500));
        cuentas.add(new CuentaBancaria(4, new Persona(34954545, "jose", "maria", 1966), 560056));

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado(1232, "gomez", "juana", 12500, 1998));
        empleados.add(new Empleado(234, "gonzalez", "laura", 16500, 1995));
        empleados.add(new Empleado(45645, "zarate", "joaquin", 5500, 1999));

        Banco unBanco = new Banco("BBVA", new Localidad("Capital", "Corrientes"), 3, empleados, cuentas);

        unBanco.mostrarResumen();
    }
}