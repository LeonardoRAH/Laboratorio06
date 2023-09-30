
package entidades;
import java.util.List;

public class Curso {
    
    private String codigoCur;
    private String nombreCur;
    private int creditosCur;
    
    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;
    
    public Curso(String codigo, String nombre, int creditos) {
        this.codigoCur = codigo;
        this.nombreCur = nombre;
        this.creditosCur = creditos;
    }
    
    public String getCodigoCur() {
        return codigoCur;
    }
    public void setCodigoCur(String codigoCur) {
        this.codigoCur = codigoCur;
    }
    
    
    public String getNombreCur() {
        return nombreCur;
    }
    public void setNombreCur(String nombreCur) {
        this.nombreCur = nombreCur;
    }
    
    
    public int getCreditosCur() {
        return creditosCur;
    }
    public void setCreditosCur(int creditosCur) {
        this.creditosCur = creditosCur;
    }
    
    
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void agregarEstudiante(Estudiante estudiante){
             if(this.estudiantes != null &&
                this.estudiantes.size()>=0){
            estudiantes.add(estudiante);
        }
    }  
    
    
    public List<Profesor> getProfesores() {
        return profesores;
    }
    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
    public void agregarProfesor(Profesor profe){
        
        if(this.profesores != null &&
                this.profesores.size()>=0){
            profesores.add(profe);
        }
    }
    
    
    public String getTextoCur(){
        return this.codigoCur + " | " + this.nombreCur + " | " + this.creditosCur; 
    }
 
}
