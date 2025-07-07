import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;
    private List<Departamento> departamentos;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento d) {
        if (!departamentos.contains(d)) {
            departamentos.add(d);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
}