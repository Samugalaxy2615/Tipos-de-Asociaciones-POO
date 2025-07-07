import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Departamento> departamentos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(String nombre) {
        Departamento d = new Departamento(nombre);
        departamentos.add(d);
    }

    public void eliminarDepartamento(String nombre) {
        departamentos.removeIf(d -> d.getNombre().equals(nombre));
    }

    public List<Profesor> obtenerTodosProfesores() {
        List<Profesor> profesores = new ArrayList<>();
        for (Departamento d : departamentos) {
            profesores.addAll(d.getProfesores());
        }
        return profesores;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public String getNombre() {
        return nombre;
    }
}