package arq.actividad.examen2.Repository;

import arq.actividad.examen2.Model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

//No se requiere añadir anotación Repository porque ya viene dentro de JpaRepository
public interface EmpleadoR extends JpaRepository<Empleado, Long> {



}
