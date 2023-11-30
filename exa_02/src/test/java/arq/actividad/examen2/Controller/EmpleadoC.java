package arq.actividad.examen2.Controller;

import arq.actividad.examen2.Model.Empleado;
import arq.actividad.examen2.Service.EmpleadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoC {

    private EmpleadoService empleadoService;

    public EmpleadoC(EmpleadoService empleadoService){
        super();
        this.empleadoService = empleadoService;
    }

    @RequestMapping(value = "/empleados/guardar", method = RequestMethod.POST)
    @PostMapping
    public ResponseEntity<Empleado> guardarEmpleado(@RequestBody Empleado empleado){
        return new ResponseEntity<Empleado>(empleadoService.guardarEmpleado(empleado), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/empleados/ver", method = RequestMethod.GET)
    public List<Empleado> getAll(){
        return empleadoService.getAll();
    }

    @GetMapping(value = "/empleados/{id}")
    public ResponseEntity<Empleado> getEmpleadoID(@PathVariable("id") long empleadoId){
        return new ResponseEntity<Empleado>(empleadoService.getEmpleadoID(empleadoId), HttpStatus.OK);
    }

    @PutMapping(value = "/empleados/{id}")
    public ResponseEntity<Empleado> updateEmpleado(@PathVariable("id") long empleadoId, @RequestBody Empleado empleado){
        return new ResponseEntity<Empleado>(empleadoService.updateEmpleado(empleado, empleadoId), HttpStatus.OK);
    }

    @DeleteMapping(value = "/empleados/{id}")
    public ResponseEntity<String> deleteEmpleado(@PathVariable("id") long id){
        empleadoService.deleteEmpleado(id);
        return new ResponseEntity<String>("Empleado eliminado!", HttpStatus.OK);
    }
}
