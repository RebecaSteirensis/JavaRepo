import java.util.*;

public class AplicacionBanco {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calendar fechaIngreso = Calendar.getInstance();
        fechaIngreso.set(2000,1,1);
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(2000,10,5);
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

        int opcion = 0;
       
       do{
           System.out.println("1-Contratar Empleado, 2-Despedir Empleado,3-Listar Sueldos,4-Agregar Cuentas,5-Resumen Cuentas,6-Quitar Cuenta,7-Listar titulares");
           System.out.println("Ingrese una opcion: ");
           opcion = Integer.parseInt(teclado.next());
           
           switch(opcion){
               case 1:
                   System.out.println("Ingrese el nombre:");
                   String nombre = teclado.next();
                   System.out.println("Ingrese el apellido:");
                   String apellido = teclado.next();
                   System.out.println("Ingrese el sueldo:");
                   double sueldo = Double.parseDouble(teclado.next());
                   System.out.println("Ingrese el cuil:");
                   long cuil = teclado.nextInt();
                   unBanco.agregarEmpleado(new Empleado(cuil,apellido,nombre,sueldo,fechaIngreso = Calendar.getInstance()));
                   break;
               case 2:
                   System.out.println("Ingrese el cuil del empleado a despedir:");
                   long cuilEmpleado = teclado.nextInt();
                   for(int i = 0; i < unBanco.getEmpleados().size();i++){
                       if(unBanco.getEmpleados().get(i).getCuil() == cuilEmpleado){
                           unBanco.quitarEmpleado(unBanco.getEmpleados().get(i));
                       }
                   }
                   break;
               case 3:
                   unBanco.mostrar();
                   unBanco.listarSueldos();
                   break;
               case 4:
                   cuentas.add(new CuentaBancaria(12312, new Persona(123123, "perez", "juan", 1990)));
                   cuentas.add(new CuentaBancaria(2, new Persona(324523, "juan", "perez", 1991)));
                   cuentas.add(new CuentaBancaria(3, new Persona(4564, "maria", "jose", 1992), 123500));
                   cuentas.add(new CuentaBancaria(4, new Persona(34954545, "jose", "maria", 1966)));
                   break;
               case 5:
                   unBanco.mostrarResumen();
                   break;
               case 6:
                   System.out.println("Ingrese el nro de cuenta:");
                   int nroCuenta = teclado.nextInt();
                   for(int i = 0;i< unBanco.getCuentasBancarias().size();i++){
                       if(unBanco.getCuentasBancarias().get(i).getNroCuenta() == nroCuenta){
                           unBanco.quitarCuentaBancaria(unBanco.getCuentasBancarias().get(i));
                       }
                   }
                   break;
               case 7:
                   unBanco.listaDeTitulares();
           }
       }while(opcion !=0);
    }
}