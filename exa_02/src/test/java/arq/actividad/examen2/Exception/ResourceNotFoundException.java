package arq.actividad.examen2.Exception;
//Custom exception for no info found on DB

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String indicadorRecurso;
    private String nombreRecurso;
    private Object valorRecurso;
    public ResourceNotFoundException(String indicadorRecurso, String nombreRecurso, Object valorRecurso) {
        super(String.format("%s not found with %s = '%s'", indicadorRecurso, nombreRecurso, valorRecurso));
        this.indicadorRecurso = indicadorRecurso;
        this.nombreRecurso = nombreRecurso;
        this.valorRecurso = valorRecurso;
    }

    public String getIndicadorRecurso() {
        return indicadorRecurso;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }

    public Object getValorRecurso() {
        return valorRecurso;
    }
}
