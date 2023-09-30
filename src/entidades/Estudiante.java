
package entidades;

public class Estudiante {

    public String getCodigoEst() {
        return codigoEst;
    }

    public void setCodigoEst(String codigoEst) {
        this.codigoEst = codigoEst;
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }
    private String codigoEst;
    private String nombreEst;

    public Estudiante (String nombreEst) {
        this.nombreEst = nombreEst;
    }
}
