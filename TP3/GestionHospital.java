import java.util.*;

public class GestionHospital
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int continuar = 0;
        
        do{
            System.out.println("Nombre del hospital");
            String hospitalName = teclado.nextLine();
            System.out.println("Direccion del hospital");
            String directorName = teclado.nextLine();
            
            Hospital hospital1 = new Hospital(hospitalName, directorName);

            System.out.println("Ingrese localidad donde vive");
            String localidad = teclado.nextLine();
            System.out.println("Ingrese provincia donde vive");
            String provincia = teclado.nextLine();
            
            Localidad localidadVive = new Localidad("Monte Caseros", "Corrientes");

            System.out.println("Ingrese localidad donde nacio");
            String localidadNacio = teclado.nextLine();
            System.out.println("Ingrese provincia donde nacio");
            String provinciaNacio = teclado.nextLine();
            
            Localidad localidadNacido = new Localidad(localidadNacio, provinciaNacio);

            System.out.println("Numero de historia clinica");
            int historiaClinica = teclado.nextInt();
            System.out.println("Nombre completo");
            String fullName = teclado.nextLine();
            System.out.println("Ingrese domicilio");
            String address = teclado.nextLine();
            
            Paciente paciente1 = new Paciente(historiaClinica, fullName, address, localidadNacido, localidadVive);

            System.out.println(localidadVive.mostrar());
            System.out.println(localidadNacido.mostrar());;
        
            paciente1.mostrarDatosPantalla();
            hospital1.consultaDatosFiliatorios(paciente1);
            
            paciente1.mostrarDatosPantalla();
            hospital1.consultaDatosFiliatorios(paciente1);
            
            System.out.println("Desea agregar otra escuela y docente? 0-NO 1-SI");
            continuar = teclado.nextInt();

        } while(continuar == 1);
    }
}