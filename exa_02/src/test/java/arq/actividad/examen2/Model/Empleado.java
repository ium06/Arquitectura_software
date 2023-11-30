package arq.actividad.examen2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data //anotación para generar getters, setters, constructor, toString

@Entity
@Table(name="empleados")
public class Empleado {

    public static Empleado sav;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "puesto")
    private String puesto;

    @Column(name = "correo")
    private String correo;

}
