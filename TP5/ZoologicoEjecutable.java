import java.util.*;

public class ZoologicoEjecutable
{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Zoologico unZoologico = new Zoologico("El Caribú");
        
        Calendar fechaDelegacion = Calendar.getInstance();
        fechaDelegacion.set(2024,Calendar.SEPTEMBER, 22); 
        
        Calendar diaVisita = Calendar.getInstance();
        diaVisita.set(2024,Calendar.SEPTEMBER,22);
        
        Persona unaPersona = new Persona(44542230, "Lautaro", "Gomez", 2002);
        Persona otraPersona = new Persona(45436643, "Axel", "Silva", 2003);
        HashSet<Persona> personas = new HashSet();
        ArrayList<Individuo> individuos = new ArrayList();
        
        Individuo Individuo1 = new Individuo ("Axel",diaVisita,personas);
        Individuo Individuo2 = new Individuo ("Lautaro",diaVisita,personas);
        Individuo Individuo3 = new Individuo ("Diego",diaVisita,personas);
        
        individuos.add(Individuo1);
        personas.add(unaPersona);
        personas.add(otraPersona);
        
        Delegacion pami = new Delegacion("PAMI", fechaDelegacion, individuos);
        pami.inscribirIndividuo(Individuo2);
        pami.inscribirIndividuo(Individuo3);
        
        
        int opcion = 0;
        do{
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("1-Inscribir un visitante, 2-Inscribir una delegacion,3-Listar visitantes del dia 22/09,4-Listar por delegacion,5-Recaudacion");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    Calendar fechaNacimiento = Calendar.getInstance();
                    System.out.println("Ingrese el nro de dni:");
                    int dni = leer.nextInt();
                    System.out.println("Ingrese el nombre del visitante:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el apellido del visitante:");
                    String apellido = leer.next();
                    System.out.println("Ingrese el año de nacimiento:");
                    int anio = leer.nextInt();
                    System.out.println("Ingrese el mes de nacimiento:");
                    int mes = leer.nextInt();
                    System.out.println("Ingrese el dia de nacimiento:");
                    int dia = leer.nextInt();
                    fechaNacimiento.set(anio,mes,dia);
                    Individuo unIndividuo = new Individuo(nombre,diaVisita,personas);
                    unZoologico.nuevoVisitante(unIndividuo);
                    break;
                case 2:
                    unZoologico.nuevoVisitante(pami);
                    break;
                case 3:
                    unZoologico.listaTipoVisitantePorFecha(diaVisita,"Individuo");
                    break;
                case 4:
                    unZoologico.listaTipoVisitantePorFecha(diaVisita,"Delegacion");
                    break;
                case 5:
                    System.out.println("Recaudación desde 1/09/2024 hasta 31/09/2024");
                    // * Fecha Desde para saber lo recaudado...
                    Calendar fechaDesde = Calendar.getInstance();
                    fechaDesde.set(2016, Calendar.SEPTEMBER, 1);
                    // * Fecha Hasta para saber lo recaudado...
                    Calendar fechaHasta = Calendar.getInstance();
                    fechaHasta.set(2016, Calendar.SEPTEMBER, 30);
                    System.out.println("Recaudacion: $"+unZoologico.recaudacion(fechaDesde,fechaHasta));
                    break;
            }
        }while(opcion != 0);
    }
}