import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
            estudiante.agregarCurso(this);
        }
    }

    public void desinscribirEstudiante(String codigoEstudiante) {
        estudiantes.removeIf(e -> e.getCodigo().equals(codigoEstudiante));
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void generarReporte() {
        try {
            GeneradorReporte.generar(this);
        } catch (Exception ex) {
            System.out.println("Error al generar reporte: " + ex.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}