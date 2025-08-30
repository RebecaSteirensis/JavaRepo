public class Secretaria
{
    public static void main(String[] args){
        Escuela escuela1 = new Escuela("Manuel Belgrano", "Irigoyen 1580", "Leopoldo Juez");
        Docente docente1 = new Docente("Elisa Sánchez", "Segundo", 1600, 1290);
        
        escuela1.imprimirRecibo(docente1); 
    }
}