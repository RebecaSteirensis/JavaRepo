/** 
 * @author Fernandez Alejandro Facundo - Gomez Rebeca 
 * Clase Hospital - Trabajo Practico 3
 */
public class Hospital{
    /**
    *Atributos de la Clase 
    */
    private String nombreHospital;
    private String nombreDirector;

    /**
    *Constructor con parametros, instancia un objeto
    *@param String p_nombreHospital
    *@param String p_nombreDirector
    */
    public Hospital(String p_nombreHospital, String p_nombreDirector){
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }

    /**
    *Setter, recibe un String y permite modificar el valor del atributo nombreHospital
    *@param String p_nombreHospital
    */
    private void setNombreHospital(String p_nombreHospital){
        this.nombreHospital = p_nombreHospital;
    }
    
    /**
    *Setter, recibe un String y permite modificar el valor del atributo nombreDirector
    *@param String p_nombreDirector
    */
    private void setNombreDirector(String p_nombreDirector){
        this.nombreDirector = p_nombreDirector;
    }
    
    /**
    *Getter, permite obtener el valor del atributo nombreHospital
    *@return devuelve un String
    */
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    
    /**
    *Getter, permite obtener el valor del atributo nombreDirector
    *@return devuelve un String
    */
    public String getNombreDirector(){
        return this.nombreDirector;
    }
    
    /**
     * Metodo Publico,muestra por pantalla los datos del hospital y del paciente
     * @param Paciente p_paciente
    */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: " + this.getNombreHospital() + "\tDirector: " + this.getNombreDirector());
        System.out.println("--------------------------------------------");
        System.out.println("Paciente: " + p_paciente.getNombre() + "\tHistoria Clinica: " + p_paciente.getHistoriaClinica() + "\tDomicilio: " + p_paciente.getDomicilio());
        System.out.println("Localidad: " + p_paciente.getVive().getNombre() + "\tProvincia: " + p_paciente.getVive().getProvincia());
    }
}