package arq.actividad.examen2.Service;

import arq.actividad.examen2.Model.Empleado;

import java.util.List;

public interface EmpleadoService {
    Empleado guardarEmpleado(Empleado empleado);

    List<Empleado> getAll();

    Empleado getEmpleadoID(long id);

    Empleado updateEmpleado(Empleado empleado, long id);

    void deleteEmpleado(long id);
}
