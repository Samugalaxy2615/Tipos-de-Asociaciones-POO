public class GeneradorReporte {
    public static void generar(Curso curso) throws Exception {
        if (curso == null) throw new Exception("Curso no válido");
        System.out.println("Reporte del curso: " + curso.getNombre());
        if (curso.getProfesor() != null) {
            System.out.println("Profesor: " + curso.getProfesor().getNombre());
        }
        System.out.println("Estudiantes inscritos:");
        for (Estudiante e : curso.getEstudiantes()) {
            System.out.println("- " + e.getNombre() + " (" + e.getCodigo() + ")");
        }
    }
}