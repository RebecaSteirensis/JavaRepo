
/**
 * Write a description of class CarreraMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class CarreraMenu
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Curso curso = new Curso("Programacion Orientada a Objetos");

        int opcion;
        int lu;

        do{
            System.out.println("\n\t***** Curso ****" +
                    "\n1- Inscribir Alumno." +
                    "\n2- Mostrar alumnos. " +
                    "\n3- Eliminar un Alumno. " +
                    "\n4- Buscar Alumno" +
                    "\n5- Ingresar Notas" +
                    "\n6- Promedio" +
                    "\n7- Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("\nIngrese el numero de Libreta Universitaria: ");
                    lu = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el apellido: ");
                    String apellido = teclado.nextLine();
                    Alumno elalumno = new Alumno(lu, nombre, apellido);
                    curso.inscribirAlumno(elalumno);

                    System.out.println("\n\tEl alumno " + curso.buscarAlumno(lu).apeYNom() + " se inscribio correctamente!\n");
                    break;

                case 2:
                    if (!curso.getAlumnos().isEmpty()){
                        curso.mostrarInscriptos();
                    }else{
                        System.out.println("\n\t No hay ningun alumno inscripto\n");
                    }
                    break;

                case 3:
                    System.out.println("\nIngrese el LU del alumno que desea eliminar");
                    lu = teclado.nextInt();
                        if (curso.estaInscripto(lu)){
                            Alumno alumnoquitar = curso.quitarAlumno(lu);
                            System.out.println("\n\t ****-- Se da de baja a " + alumnoquitar.nomYApe() + " porque abandona el curso --****");
                            System.out.println("Esta\t"+alumnoquitar.nomYApe()+"\tinscripto?"+ curso.estaInscripto(lu));
                        }else{
                            System.out.println("\n\t Ese Alumno no existe\n");
                        }
                    break;

                case 4:
                    System.out.println("\nIngrese el LU del alumno que desea buscar: ");
                    lu = teclado.nextInt();
                        if (curso.estaInscripto(lu)){
                            curso.buscarAlumno(lu).mostrar();
                        }else {
                            System.out.println("\n\t Ese alumno no esta inscripto en el curso\n");
                        }
                    break;

                case 5:
                    System.out.println("\nIngrese el LU del alumno que desea subir las notas: ");
                    lu = teclado.nextInt();
                    if(curso.estaInscripto(lu)){
                        System.out.println("Nota 1:");
                        curso.buscarAlumno(lu).setNota1(teclado.nextDouble());
                        System.out.println("Nota 2: ");
                        curso.buscarAlumno(lu).setNota2(teclado.nextDouble());
                        System.out.println("\n\tNotas Ingresadas Correctamente!\n");
                    }else {
                        System.out.println("\n\t Ese alumno no existe\n");
                    }
                    break;

                case 6:
                    System.out.println("\nIngrese el Lu del alumno que desea ver su promedio: ");
                    lu = teclado.nextInt();
                        if (curso.estaInscripto(lu)){
                            curso.imprimirPromedioDelAlumno(lu);
                        }else {
                            System.out.println("\n\t Alumno no existe en el curso\n");
                        }
                    break;

                case 7:
                    break;
                default: System.out.println("\n\t Opcion incorrecta \n");
                    break;
            }
        }while(opcion != 7);
    }
}
