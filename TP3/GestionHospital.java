public class GestionHospital
{
    public static void main(String[] args){
        Hospital hospital1 = new Hospital("Garrahan", "Leonardo Ruiz");
        Localidad localidadVive = new Localidad("Monte Caseros", "Corrientes");
        Localidad localidadNacido = new Localidad("Corrientes", "Corrientes");
        Paciente paciente1 = new Paciente(578669, "Juan Manuel Ortigoza", "Bulevar 3 de Abril", localidadNacido, localidadVive);
        
        System.out.println(localidadVive.mostrar());
        System.out.println(localidadNacido.mostrar());;
        
        paciente1.mostrarDatosPantalla();
        hospital1.consultaDatosFiliatorios(paciente1);
    }
}