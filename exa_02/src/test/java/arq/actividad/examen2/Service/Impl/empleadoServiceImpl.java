package arq.actividad.examen2.Service.Impl;

import arq.actividad.examen2.Exception.ResourceNotFoundException;
import arq.actividad.examen2.Model.Empleado;
import arq.actividad.examen2.Repository.EmpleadoR;
import arq.actividad.examen2.Service.EmpleadoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class empleadoServiceImpl implements EmpleadoService {

    private EmpleadoR empleadoR;

    public empleadoServiceImpl(EmpleadoR empleadoR) {
        super();
        this.empleadoR = empleadoR;
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoR.save(empleado);
    }

    @Override
    public List<Empleado> getAll() {
        return empleadoR.findAll();
    }

    @Override
    public Empleado getEmpleadoID(long id) {
        Optional<Empleado> empleado = empleadoR.findById(id);
        if(empleado.isPresent()){
            return empleado.get();
        }else{
            throw new ResourceNotFoundException("Empleado", "id", id);
        }
    }

    /*Alternativo
    public Empleado getEmpleadoID(long id) {
        return empleadoR.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Empleado", "id", id));
    }
    */

    @Override
    public Empleado updateEmpleado(Empleado empleado, long id) {
        //check
        Empleado isEmpleado = empleadoR.findById(id).orElseThrow(() -> new ResourceNotFoundException("Empleado", "Id", id));

        isEmpleado.setNombre(empleado.getNombre());
        isEmpleado.setPuesto(empleado.getPuesto());
        isEmpleado.setCorreo(empleado.getCorreo());
        empleadoR.save(isEmpleado);
        return isEmpleado;
    }

    @Override
    public void deleteEmpleado(long id) {
       //check
        empleadoR.findById(id).orElseThrow(() -> new ResourceNotFoundException("Empleado", "Id", id));
        empleadoR.deleteById(id);
    }

}
